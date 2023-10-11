# User Spring Boot Web Service: Encrypt and Decrypt Base64 Password

This Spring Boot web service provides endpoints for encrypting and decrypting passwords using Base64 encoding. It offers secure methods for password encryption, ensuring the safety of user credentials in your applications.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Example Requests](#example-requests)
- [Security Considerations](#security-considerations)
- [Contributing](#contributing)
- [License](#license)

## Features

- Encrypt plain passwords using BCrypt algorithm.
- Decode Base64 encoded passwords securely.
- Easy integration with existing Spring Boot applications.
- RESTful API endpoints for seamless communication.

## Prerequisites

Make sure you have the following installed before setting up the project:

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle build tool
- Your favorite IDE or code editor

## Installation

1. **Clone the repository:**

   ```bash
   git clone <repository_url>
   cd user-spring-boot-service
   ```

2. **Build the project:**

   If you are using Maven:

   ```bash
   mvn clean install
   ```

   If you are using Gradle:

   ```bash
   ./gradlew build
   ```

## Usage

1. **Run the application:**

   If you are using Maven:

   ```bash
   mvn spring-boot:run
   ```

   If you are using Gradle:

   ```bash
   ./gradlew bootRun
   ```

2. Access the API at `http://localhost:8080`.

## Endpoints

- **Encrypt Password:**

  ```
  POST /api/encrypt
  ```

  Encrypts a plain password using BCrypt algorithm and returns the encrypted password.

- **Decrypt Password:**

  ```
  POST /api/decrypt
  ```

  Decodes a Base64 encoded password and returns the decoded password.

## Example Requests

### Encrypt Password

**Request:**

```http
POST /api/encrypt
Content-Type: application/json

"myPlainTextPassword"
```

**Response:**

```json
"$2a$10$vgKThXgOAsQg9A65lrZrsu3TmZ6qgGpyMsXV3F76UR7nZK0K9tF6K"
```

### Decrypt Password

**Request:**

```http
POST /api/decrypt
Content-Type: application/json

"JTJGJTJGJTJGJTJGJTJGJTJGJTJGJTJG"
```

**Response:**

```json
"myBase64EncodedPassword"
```

## Security Considerations

- Always use secure connections (HTTPS) to communicate with the API endpoints.
- Store encryption keys and sensitive data securely. Consider using environment variables or a secure configuration management solution.
- Regularly update dependencies to patch security vulnerabilities.

## Contributing

Contributions are welcome! Fork the repository, make your changes, and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the [MIT License](LICENSE).