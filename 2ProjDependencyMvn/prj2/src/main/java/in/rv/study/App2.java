package in.rv.study;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        System.out.println( "Hello App2 World!!" );
        callPrj1App1Dep();
    }

    private static void callPrj1App1Dep(){
        App1 app1 = new App1();
        System.out.println(app1.sayHi());
    }
}
