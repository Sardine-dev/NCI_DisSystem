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
import com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse;
import java.awt.*;
import javax.swing.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author hoon3
 */
public class MainWindow extends JFrame {
    private GrpcClient grpcClient;
    private JTextArea resultArea;
    private static Logger logger = Logger.getLogger(MainWindow.class.getName());

    public MainWindow() {
        grpcClient = new GrpcClient();

        setTitle("Recruitment System Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        try {
            FileHandler fh = new FileHandler("client-log.txt", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (Exception e) {
            System.err.println("Logger initialization failed: " + e.getMessage());
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));

        JButton btnGetScore = new JButton("Get Candidate Score");
        JButton btnAddAvailability = new JButton("Add Availability");
        JButton btnScheduleInterview = new JButton("Schedule Interview");
        JButton btnJobMatching = new JButton("Job Matching");
        JButton btnStreamScores = new JButton("Stream Candidate Scores");
        JButton btnBulkAvailability = new JButton("Bulk Add Availability");
        JButton btnStreamJobMatches = new JButton("Stream Job Matches");
        // 버튼 추가
        JButton btnSubmitMultipleResumes = new JButton("Submit Multiple Resumes");

        // 기존 버튼 패널에 추가
        panel.add(btnSubmitMultipleResumes);

        panel.add(btnStreamScores);
        panel.add(btnBulkAvailability);
        panel.add(btnStreamJobMatches);

        panel.add(btnGetScore);
        panel.add(btnAddAvailability);
        panel.add(btnScheduleInterview);
        panel.add(btnJobMatching);

        add(panel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);
        btnSubmitMultipleResumes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                grpcClient.submitMultipleResumes(Arrays.asList("candidate-1", "candidate-2", "candidate-3"));
                resultArea.append("Multiple resumes submitted.\n");
            } catch (Exception ex) {
              resultArea.append("Error submitting multiple resumes: " + ex.getMessage() + "\n");
            }
        }
        });
        btnGetScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double score = grpcClient.getCandidateScore("test-001");
                    String message = "Candidate Score: " + score;
                    resultArea.append(message + "\n");
                    logger.info(message);
                } catch (Exception ex) {
                    String error = "Error fetching candidate score: " + ex.getMessage();
                    resultArea.append(error + "\n");
                    logger.severe(error);
                }
            }
        });

        btnAddAvailability.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    grpcClient.addAvailability("candidate-123", "candidate", Arrays.asList("2025-04-14T10:00"));
                    grpcClient.addAvailability("interviewer-456", "interviewer", Arrays.asList("2025-04-14T11:00"));
                    String message = "Availability added for candidate and interviewer.";
                    resultArea.append(message + "\n");
                    logger.info(message);
                } catch (Exception ex) {
                    String error = "Error adding availability: " + ex.getMessage();
                    resultArea.append(error + "\n");
                    logger.severe(error);
                }
            }
        });

        btnScheduleInterview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time = grpcClient.scheduleInterview("candidate-123", "interviewer-456");
                    String message = "Interview scheduled at: " + time;
                    resultArea.append(message + "\n");
                    logger.info(message);
                } catch (Exception ex) {
                    String error = "Error scheduling interview: " + ex.getMessage();
                    resultArea.append(error + "\n");
                    logger.severe(error);
                }
            }
        });

        btnJobMatching.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JobMatchResponse response = grpcClient.matchJob("candidate-007", Arrays.asList("Java", "React", "Docker"), "Fullstack");
                    String message = "Matched Job:\n- ID: " + response.getMatchedJobId() + "\n- Title: " + response.getTitle() + "\n- Score: " + response.getMatchScore();
                    resultArea.append(message + "\n");
                    logger.info(message);
                } catch (Exception ex) {
                    String error = "Error matching job: " + ex.getMessage();
                    resultArea.append(error + "\n");
                    logger.severe(error);
                }
            }
        });
           
         btnStreamScores.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            java.util.List<String> candidateIds = Arrays.asList("test-001", "test-002", "test-003");
            grpcClient.streamCandidateScores(candidateIds, resultArea);
        } catch (Exception ex) {
            resultArea.append("Error streaming candidate scores: " + ex.getMessage() + "\n");
        }
    }
});      
         
         btnBulkAvailability.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            grpcClient.bulkAddAvailability(resultArea);
        } catch (Exception ex) {
            resultArea.append("Error bulk adding availability: " + ex.getMessage() + "\n");
        }
    }
});
         
         btnStreamJobMatches.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            grpcClient.streamJobMatches(Arrays.asList("Java", "Docker", "React"), resultArea);
        } catch (Exception ex) {
            resultArea.append("Error streaming job matches: " + ex.getMessage() + "\n");
        }
    }
});

        setVisible(true);
    }
    public static void main(String[] args) {
        // Launch the MainWindow
        new MainWindow();
    }
}
