# Single Client Chat 2

This project is a simple example of UDP communication in Java, implementing a client that sends and receives messages from a server.

## Project Structure

- `Main.java`: Main class to run the client.
- `UdpClient.java`: Implements the logic for sending and receiving UDP messages.

## How to Run

1. Compile the Java files:
   ```sh
   javac src/*.java
   ```
2. Run the main class:
   ```sh
   java -cp src Main
   ```

## Configuration

- The client is set to send messages to address `127.0.0.1` on port `8769`.
- The client socket uses local port `6624`.

## Requirements

- Java 8 or higher

## Notes

- Make sure the UDP server is running and listening on the correct port before starting the client.
- This project is for educational purposes and demonstrates UDP communication.

