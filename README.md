# NCI_DisSystem
# Recruitment System - How to Run

This document explains how to build and run the Recruitment System.

---

##  Server (gRPC Server)

1. Open the project in NetBeans.
2. Open `GrpcServer.java`.
3. Right-click → **Run File** (Shift+F6)  
   > Server will start listening on **localhost:50051**.

---

## ️ Client (Swing GUI)

1. Open the project in NetBeans.
2. Open `MainWindow.java`.
3. Right-click → **Run File** (Shift+F6).
4. The GUI window will appear.
5. Click the buttons to:
   - Get Candidate Score
   - Add Availability
   - Schedule Interview
   - Match Job
   - Submit Multiple Resumes (Streaming)
   - Bulk Add Availability (Streaming)
   - Stream Job Matches (Server Streaming)

---

## ️ Notes

- Server must be running before starting the client.
- Logs are saved:
  - Server: `server-log.txt`
  - Client: `client-log.txt`
- JWT authentication is handled automatically.

---

##  Requirements

- Java 11 or higher
- NetBeans 19 or higher
- Maven
- Protobuf Compiler (for .proto → Java generation)

---

##  GitHub Repository
https://github.com/Sardine-dev/NCI_DisSystem.git

