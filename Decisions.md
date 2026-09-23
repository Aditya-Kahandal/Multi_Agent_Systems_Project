# ARES — Project Decisions

This document records important ARES design decisions and why they were made. It will be updated as the project evolves.

## Decision 1 — Start with a small simulation

**Decision:** Version 0.1 will simulate one emergency incident at a time.

**Reason:** This keeps the first implementation manageable while allowing the project to demonstrate autonomous agents, perceptions, actions, and communication. Multiple simultaneous incidents will be introduced later as a coordination challenge.

## Decision 2 — Use a location graph

**Decision:** The initial environment will use named locations connected by routes with fixed travel times.

Initial locations:

- Fire Station
- Incident Site
- Hospital

**Reason:** A location graph is simpler than a full grid/map, while still allowing agents to have locations and make travel-related decisions. Complex route-finding and traffic modelling are postponed.

## Decision 3 — Initial agent types

**Decision:** Version 0.1 will contain three agent types:

- Fire/Rescue Agent
- Ambulance Agent
- Hospital Agent

**Reason:** These agents have distinct responsibilities and must communicate to resolve the chosen emergency scenario. Police/traffic-control agents may be added later if they are justified by a coordination problem.

## Decision 4 — Agent roles and goals

**Decision:**

- The Fire/Rescue Agent responds to a fire, rescues or stabilises the patient, and requests an Ambulance.
- The Ambulance Agent responds to a request, checks Hospital availability, transports the patient, and reports its status.
- The Hospital Agent manages limited bed capacity, replies to availability requests, and admits patients.

**Reason:** The roles create interdependence: no single agent can resolve the incident alone.

## Decision 5 — Communication is necessary

**Decision:** The Ambulance must ask a Hospital about bed availability before transporting a patient there.

**Reason:** Hospital capacity is not automatically known by the Ambulance. This creates a clear, justified reason for agent-to-agent communication.

## Decision 6 — Private agent information

**Decision:** Agents initially know their own internal state, but other agents receive this information only through messages.

Examples:

- Ambulance: current location, availability, and current assignment.
- Hospital: available beds and admitted patients.
- Fire/Rescue: rescue progress and scene safety.

**Reason:** This supports genuine decentralised multi-agent behaviour. Agents cannot rely on complete global knowledge.

## Decision 7 — Definition of success

**Decision:** An incident is successfully resolved only when the patient reaches a Hospital and is admitted.

**Reason:** Fire/Rescue arrival or Ambulance dispatch alone does not complete the emergency-response process.

## Decision 8 — Version 0.1 scope limits

**Decision:** The following features are intentionally postponed:

- Police or traffic-control agents
- Traffic jams and route-finding
- Multiple simultaneous incidents
- Multiple Ambulances or Hospitals
- Agent failures
- Contract-Net coordination
- Learning
- GenAI integration
- Databases, microservices, and visual interfaces

**Reason:** Version 0.1 must first establish a small, working multi-agent simulation with meaningful interaction. Later features will be added only when supported by the module and justified by the project design.