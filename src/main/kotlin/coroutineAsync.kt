import kotlinx.coroutines.*

fun main()= runBlocking{ // Create a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}") // Main Thread
    val jobDeferred : Deferred<Int> = async { // Thread T1
        println("Fake work stats: ${Thread.currentThread().name}") // Thread T1
        delay(1000)  // Coroutine is suspended but Theread : T1 is free (not blocking)
        println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or some other thread
        15
    }

    val num:Int = jobDeferred.await()
    println("Main program ends: ${Thread.currentThread().name}") // Complete the amin Thread
}