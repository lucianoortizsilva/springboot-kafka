### Stack
- Java 8+
- Spring Boot
- Kafka

### Pré-Requisito
- [Kafka instalado](https://kafka.apache.org/downloads)

### O que é ?
Aplicação de messageria,\
Como exemplo, envio 3 mensagens e recebo elas através de um @KafkaListener\
Ao inicializar a aplicação, irá também rodar automaticamente uma classe para testar essas mensagens: `InicializaTesteEnvio.java`\
Se tudo deu certo, irá aparecer um log semelhante a esse:

![](https://github.com/lucianoortizsilva/springboot-kafka/blob/main/src/main/resources/static/github/kafka-log.jpg)

### Como rodar ?

1º Inicialize o Zookeeper (O Zookeeper é usado principalmente para rastrear o status dos nós presentes no cluster Kafka e também para rastrear tópicos, mensagens, etc. do Kafka).
- "E:\dev\kafka2.6.0" - **`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`**

2º start o Kafka
- "E:\dev\kafka2.6.0" - **`.\bin\windows\kafka-server-start.bat .\config\server.properties`**

3º build
- Execute **`mvn clean package`**

4º Inicialize o projeto
- Execute **`mvn spring-boot:run`**
