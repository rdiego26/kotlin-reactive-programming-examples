# kotlin-reactive-programming-examples

A Kotlin backend application showcasing reactive programming with kotlinx.coroutines.

## Features

This project demonstrates the use of Kotlin coroutines for asynchronous and reactive programming, including:

- **Basic Coroutines**: Simple coroutine launch and delay operations
- **Concurrent Execution**: Using async/await for parallel task execution
- **Structured Concurrency**: Managing multiple coroutines with proper lifecycle

## Requirements

- Java 17 or higher
- Gradle 9.2.0 or higher
- Kotlin 2.2.20

## Dependencies

The project uses the following kotlinx.coroutines dependencies:

- `kotlinx-coroutines-core:1.9.0` - Core coroutines functionality
- `kotlinx-coroutines-jdk8:1.9.0` - JDK8 integration for coroutines
- `kotlinx-coroutines-test:1.9.0` - Testing utilities for coroutines

## Building the Project

```bash
gradle build
```

## Running the Application

```bash
gradle run
```

This will execute the main application which demonstrates various coroutine examples.

## Running Tests

```bash
gradle test
```

## Project Structure

```
src/
├── main/
│   └── kotlin/
│       └── com/
│           └── rdiego26/
│               └── Main.kt           # Main application with coroutine examples
└── test/
    └── kotlin/
        └── com/
            └── rdiego26/
                └── CoroutinesTest.kt  # Unit tests for coroutines
```

## Examples Included

### Example 1: Basic Coroutines
Demonstrates simple coroutine launching with delays.

### Example 2: Concurrent Execution
Shows how to use `async` and `await` for concurrent task execution.

### Example 3: Structured Concurrency
Illustrates managing multiple coroutines with structured concurrency patterns.

## License

This project is licensed under the terms specified in the LICENSE file.