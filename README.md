# Running the Stock Portfolio Backend Locally

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven 3.6.0 or higher
- Git

## Installation Steps

1. **Clone the repository**
    ```sh
    git clone https://github.com/yourusername/stock-portfolio-backend.git
    cd stock-portfolio-backend
    ```

2. **Install dependencies**
    ```sh
    mvn clean install
    ```

3. **Run the Spring Boot application**
    ```sh
    mvn spring-boot:run
    ```

4. **Access the application**
    Open your browser and navigate to `http://localhost:8080`

## Additional Commands

- **Run tests**
    ```sh
    mvn test
    ```

- **Build the project**
    ```sh
    mvn package
    ```

- **Clean the project**
    ```sh
    mvn clean
    ```

## Troubleshooting

- Ensure that your JDK and Maven versions meet the prerequisites.
- Check if the port `8080` is available or change the port in `application.properties`.
