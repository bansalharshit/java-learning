# Java Memory Monitoring Tool

A console-based tool to monitor **Heap** and **Non-Heap (Stack/Metaspace)** memory usage in real time using Java's `MemoryMXBean` and `GarbageCollectorMXBean`.

## Features
- Real-time monitoring of heap and non-heap memory.
- Logs Garbage Collection (GC) events, count, and collection time.
- Displays memory consumption trends periodically.
- Simulates workload to observe GC behavior.

## Technologies Used
- Java Management Extensions (JMX)
- `MemoryMXBean` and `GarbageCollectorMXBean`
- ScheduledExecutorService for periodic logging

## How It Works
1. Heap and non-heap memory usage is printed every **3 seconds**.
2. Garbage Collection statistics are printed every **10 seconds**.
3. The program simulates memory allocation to trigger GC events.

## Getting Started
### Prerequisites
- Java 8 or higher
- Any IDE or command-line setup

### Run the Application
```bash
javac MemoryMonitoringTool.java
java MemoryMonitoringTool
