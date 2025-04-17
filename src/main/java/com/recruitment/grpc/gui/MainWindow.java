/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.recruitment.grpc.gui;

import com.recruitment.grpc.GrpcClient;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.recruitment.grpc.job.JobMatchResponse;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author hoon3
 */
public class MainWindow extends JFrame {
    
    private GrpcClient grpcClient;
    private JTextArea resultArea;

    public MainWindow() {
        grpcClient = new GrpcClient();

        setTitle("Recruitment System Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        // Top Panel for Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));

        JButton btnGetScore = new JButton("Get Candidate Score");
        JButton btnAddAvailability = new JButton("Add Availability");
        JButton btnScheduleInterview = new JButton("Schedule Interview");
        JButton btnJobMatching = new JButton("Job Matching");

        panel.add(btnGetScore);
        panel.add(btnAddAvailability);
        panel.add(btnScheduleInterview);
        panel.add(btnJobMatching);

        add(panel, BorderLayout.NORTH);

        // Result Area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        // Action Listeners
        btnGetScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double score = grpcClient.getCandidateScore("test-001");
                    resultArea.append("Candidate Score: " + score + "\n");
                } catch (Exception ex) {
                    resultArea.append("Error fetching candidate score.\n");
                }
            }
        });

        btnAddAvailability.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    grpcClient.addAvailability("candidate-123", "candidate", Arrays.asList("2025-04-14T10:00"));
                    grpcClient.addAvailability("interviewer-456", "interviewer", Arrays.asList("2025-04-14T11:00"));
                    resultArea.append("Availability added for candidate and interviewer.\n");
                } catch (Exception ex) {
                    resultArea.append("Error adding availability.\n");
                }
            }
        });

        btnScheduleInterview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time = grpcClient.scheduleInterview("candidate-123", "interviewer-456");
                    resultArea.append("Interview scheduled at: " + time + "\n");
                } catch (Exception ex) {
                    resultArea.append("Error scheduling interview.\n");
                }
            }
        });

        btnJobMatching.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JobMatchResponse response = grpcClient.matchJob("candidate-007", Arrays.asList("Java", "React", "Docker"), "Fullstack");
                    resultArea.append("Matched Job:\n");
                    resultArea.append("- ID: " + response.getMatchedJobId() + "\n");
                    resultArea.append("- Title: " + response.getTitle() + "\n");
                    resultArea.append("- Score: " + response.getMatchScore() + "\n");
                } catch (Exception ex) {
                    resultArea.append("Error matching job.\n");
                }
            }
        });

        setVisible(true);
    }
        // <--- 이 부분 추가
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow();
        });
    }
}