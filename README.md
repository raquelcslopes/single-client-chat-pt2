# Single Client Chat 2

Este projeto é um exemplo simples de comunicação via UDP em Java, implementando um cliente que envia e recebe mensagens de um servidor.

## Estrutura do Projeto

- `Main.java`: Classe principal para execução do cliente.
- `UdpClient.java`: Implementa a lógica de envio e recebimento de mensagens UDP.

## Como Executar

1. Compile os arquivos Java:
   ```sh
   javac src/*.java
   ```
2. Execute a classe principal:
   ```sh
   java -cp src Main
   ```

## Configuração

- O cliente está configurado para enviar mensagens para o endereço `127.0.0.1` na porta `8769`.
- O socket do cliente utiliza a porta local `6624`.

## Requisitos

- Java 8 ou superior

## Observações

- Certifique-se de que o servidor UDP esteja rodando e escutando na porta correta antes de executar o cliente.
- Este projeto é apenas para fins educacionais e demonstração de comunicação UDP.

