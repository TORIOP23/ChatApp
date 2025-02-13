# Chat Application

This is a simple chat application which is implemented in Spring Boot Reactive, Nest.JS and Fiber(I'm adding) Frameworks
with the support of WebSocket library. This application provides real-time messaging capabilities and uses monitoring
tools like Grafana and Prometheus to monitor the application's performance.

* In the below image there is a general architecture including servers, message brokers, databases, load balancers, gate
  services and monitoring tools

![ChatApplicationArchitecture](https://user-images.githubusercontent.com/48048893/236375735-f51c187e-d7ce-4256-9dfd-4acbdb7364f4.jpeg)

## Setup

### Prerequisites

* Java 21

### Environment

```shell
cp ./docker-compose/.env.example ./docker-compose/.env
```

### Run

```shell
./gradlew build
cd docker-compose
docker compose -p chat-app up -d
```

### Remove

```shell
cd docker-compose
docker compose -p chat-app down
```

### Non-functional requirements:

* Scalability: the application should be able to handle multiple simultaneous users and messages without slowing down.
* Security: the application should ensure the confidentiality, integrity, and availability of messages and user data.
* Reliability: the application should be available and responsive at all times, with minimal downtime or errors.
* Performance: the application should be fast and responsive, with low latency and high throughput.
* Responsive: Customer shouldn't wait for the whole data too much time
* Resilient: One failure of a server shouldn't break down whole system
* Message Driven: The application should be loosely coupled and should rely on asynchronous message passing

### Functional requirements:

* User registration and authentication: users should be able to create an account and log in securely.
* Chatroom creation and management: users should be able to create and join chatrooms, as well as manage their own
  chatrooms.
* Real-time messaging: users should be able to send and receive messages in real-time, with support for multimedia
  content such as images and files.
* Message history: users should be able to view and search for past messages in chatrooms.
* Notifications: users should be notified of new messages and other relevant events.
* Status: messages should have statuses like Read/Receipt/Typing/Seen/Sent to inform users more friendly

### Features

* Real-time messaging using WebSockets
* Monitoring of application metrics using Prometheus and Grafana
* Logging using Logstash, Elasticsearch, and Kibana
* Tracing and debugging using Zipkin

# Chat Application UI

# Login Page

![Login](https://github.com/halilbaydar/Chat-Application/assets/48048893/1c765312-2cde-41b4-bdd2-0b9f3389b872)

# Register Page

![Register](https://github.com/halilbaydar/Chat-Application/assets/48048893/24593b23-45f7-4a95-977a-d87ed8eb8445)

# Chat Page

![Chat](https://github.com/halilbaydar/Chat-Application/assets/48048893/da0a1a1f-1164-4f32-a3b0-d48bb87d384d)

### Backlog

* Kafka streams, analytics and kraft mode
* Golang support with one service
* Group messaging
* Video messaging with FTP server