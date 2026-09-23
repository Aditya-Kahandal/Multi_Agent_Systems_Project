# ARES — Autonomous Response & Emergency Coordination System

## Project purpose

ARES is a multi-agent emergency-response simulation built for the COMP41400 Multi-Agent Systems individual project.

The project explores how autonomous emergency-service agents can coordinate limited resources to resolve incidents. The final system will use agents with their own goals, beliefs, actions, and communication capabilities rather than one central controller making every decision.

Version 0.1 will model one building-fire incident using three agent types:

- **Fire/Rescue Agent:** responds to a fire incident, rescues or stabilises a patient, and requests an Ambulance.
- **Ambulance Agent:** responds to the request, checks Hospital availability, transports the patient, and reports its status.
- **Hospital Agent:** manages a limited number of beds, replies to availability requests, and admits patients.

The initial environment is a small location graph containing a Fire Station, an Incident Site, and a Hospital. Routes use fixed travel times. An incident is successfully resolved when the patient reaches a Hospital and is admitted.

## Required tools

- Java Development Kit (JDK) 8 or newer
- Apache Maven 3.3 or newer
- ASTRA 1.4.1, managed through Maven
- Git
- Visual Studio Code or IntelliJ IDEA (recommended)

## Project structure

```text
src/main/astra/  ASTRA agent programs
src/main/java/   Java environment and supporting code
src/test/java/   JUnit tests
```

## Commands

Compile and run the ASTRA startup agent:

```bash
mvn clean compile astra:deploy
```

Run the JUnit tests:

```bash
mvn test
```

Build the project package:

```bash
mvn package
```

## Current status

Phase 0 setup is in progress. Maven, ASTRA, and JUnit have been configured successfully. The current ASTRA startup agent is used only to confirm that the agent environment can compile and run.