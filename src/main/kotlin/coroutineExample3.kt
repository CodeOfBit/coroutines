import kotlinx.coroutines.*

/*
*  ********************************* Note ***********************************
*   Hare we used coroutine scope function and join and job function
*   Best Tutorial - https://www.baeldung.com/kotlin/threads-coroutines
*/
fun main()= runBlocking{ // Create a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}") // Main Thread
    val job : Job = launch { // Thread T1
        println("Fake work stats: ${Thread.currentThread().name}") // Thread T1
        delay(1000)  // Coroutine is suspended but Theread : T1 is free (not blocking)
        println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or some other thread
    }

    job.join()
    println("Main program ends: ${Thread.currentThread().name}") // Complete the amin Thread
}