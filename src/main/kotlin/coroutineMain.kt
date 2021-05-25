import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking{ // Create a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}") // Main Thread
    GlobalScope.launch { // Thread T1
        println("Fake work stats: ${Thread.currentThread().name}") // Thread T1
        delay(1000)  // Coroutine is suspended but Theread : T1 is free (not blocking)
        println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or some other thread
    }
    delay(2000) // main thread: wait for coroutine to finish (practically not a right way to witt)
    println("Main program ends: ${Thread.currentThread().name}") // Complete the amin Thread
}