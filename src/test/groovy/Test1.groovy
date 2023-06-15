import org.testng.annotations.Test


@Test
class Test1 {

    @Test (dependsOnMethods = "test2")
    void test(){
        println 1
    }


    @Test (priority = 10)
    void test2(){
        println 2
    }


    @Test (priority = 0)
    void test3(){
        println 3
    }


    @Test (priority = 1)
    void test4(){
        println 4
    }
}
