package com.rdiego26

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 * Main entry point for the Kotlin Reactive Programming application
 * Demonstrates the use of kotlinx.coroutines for asynchronous programming
 */
suspend fun main() {
    println("🚀 Kotlin Reactive Programming Examples with Coroutines")
    println("=" .repeat(60))
    
    // Example 1: Basic Coroutines
    runBasicCoroutineExample()
    
    // Example 2: Concurrent Execution
    runConcurrentExample()
    
    // Example 3: Structured Concurrency
    runStructuredConcurrencyExample()
    
    println("\n✅ All examples completed successfully!")
}

/**
 * Example 1: Basic coroutine launch and delay
 */
suspend fun runBasicCoroutineExample() {
    println("\n📌 Example 1: Basic Coroutines")
    println("-" .repeat(60))
    
    coroutineScope {
        launch {
            delay(1000L)
            println("World!")
        }
        launch {
            println("Hello")
        }
    }
}

/**
 * Example 2: Demonstrates concurrent execution with async/await
 */
suspend fun runConcurrentExample() {
    println("\n📌 Example 2: Concurrent Execution with async/await")
    println("-" .repeat(60))
    
    val time = measureTimeMillis {
        coroutineScope {
            val one = async { doSomethingUsefulOne() }
            val two = async { doSomethingUsefulTwo() }
            println("The answer is ${one.await() + two.await()}")
        }
    }
    println("Completed in $time ms")
}

/**
 * Example 3: Structured concurrency with multiple coroutines
 */
suspend fun runStructuredConcurrencyExample() {
    println("\n📌 Example 3: Structured Concurrency")
    println("-" .repeat(60))
    
    coroutineScope {
        launch {
            repeat(3) { i ->
                delay(500L)
                println("Task A - iteration $i")
            }
        }
        
        launch {
            repeat(3) { i ->
                delay(700L)
                println("Task B - iteration $i")
            }
        }
    }
    println("All tasks completed")
}

// Helper functions simulating long-running operations
suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    println("Computing result 1...")
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    println("Computing result 2...")
    return 29
}
