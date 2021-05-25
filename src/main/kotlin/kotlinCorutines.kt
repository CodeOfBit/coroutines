import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/* *************************** Note ***************************
*  1. Hare we see that we used the Thread.sleep() function into thread and also in the coroutine lamda function
* but here under the coroutine lamda function we used the delay() function it will more used full then Thread.sleep() function.
*
*
*
*
*
*
*
* */
@OptIn(DelicateCoroutinesApi::class)
fun main(){ // Execute in main thread

    println("Main program starts: ${Thread.currentThread().name}")

//     thread { // carets a background thread (worker thread)
//         println("Fake work stats: ${Thread.currentThread().name}")
//         Thread.sleep(1000)  //Pretend doing some work.. may be file upload
//         println("Fake work finished: ${Thread.currentThread().name}")
//     }

    GlobalScope.launch { // Create the background coroutine that runs on background thread
        println("Fake work stats: ${Thread.currentThread().name}")
        delay(1000)  //Pretend doing some work.. may be file upload
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    Thread.sleep(2000)
    println("Main program ends: ${Thread.currentThread().name}")
}