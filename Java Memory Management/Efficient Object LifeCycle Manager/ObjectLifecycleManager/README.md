# Java Object Lifecycle Manager

This is a simple educational Java application that demonstrates how to efficiently manage object lifecycle and memory usage in Java.

## 💡 Features
- Tracks heap memory usage using `MemoryMXBean`
- Simulates memory load with large objects
- Uses `PhantomReference` to detect GC eligibility
- Manually triggers garbage collection using `System.gc()`
- Demonstrates `AutoCloseable` with `try-with-resources` for safe cleanup

## 📦 Technologies
- Java SE 8+
- JMX (Java Management Extensions) for Memory Tracking.

## 🚀 How to Run
```bash
javac ObjectLifecycleManager.java
java ObjectLifecycleManager
