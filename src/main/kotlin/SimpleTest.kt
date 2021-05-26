import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {
    @Test
    fun myFristTest()= runBlocking {
        myOwnSuspendingFunc()
        Assert.assertEquals(10, 5+5)
    }
}