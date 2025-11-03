package com.rdiego26

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class CoroutinesTest {
    
    @Test
    fun `test doSomethingUsefulOne returns correct value`() = runTest {
        val result = doSomethingUsefulOne()
        assertEquals(13, result)
    }
    
    @Test
    fun `test doSomethingUsefulTwo returns correct value`() = runTest {
        val result = doSomethingUsefulTwo()
        assertEquals(29, result)
    }
    
    @Test
    fun `test basic coroutine execution`() = runTest {
        // This test validates that coroutines can execute without errors
        runBasicCoroutineExample()
        // If we reach here without exceptions, the test passes
    }
}
