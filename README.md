# Public Chat App

The **Public Chat App** is a real-time chat application built with **Spring Boot** for the backend and **React.js** for the frontend. The app allows users to join public chat rooms, send messages, and interact with others in a seamless, responsive environment.

## Features

- Real-time chat functionality with WebSockets.
- User authentication and session management.
- Support for multiple chat rooms.
- Message history persistence with MySQL.
- Responsive frontend built with React.js.

## Technologies Used

- **Backend**: Spring Boot (Java)
  - WebSocket for real-time communication.
  - MySQL database for storing user messages.
  - Spring Security for user authentication.

- **Frontend**: React.js
  - Responsive UI for smooth user experience.
  - Axios for API calls to backend.
  - React-Router for navigation.

- **Database**: MySQL
  - Stores user messages and chat history.
  
- **Deployment**: Google Cloud Platform
  - App Engine for deploying the Spring Boot application.
  - Google Cloud SQL for the MySQL database.

## Installation

### Prerequisites

- Java 11 or later
- Node.js and npm (for React.js frontend)
- MySQL 8.4 or later
- Google Cloud SDK (for deploying to Google Cloud)
  
### Steps to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/MuhammedNiyas2003/Public-Chat-App.git
   cd Public-Chat-App
