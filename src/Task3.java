public class Task3 {
    public static void someMethod() throws Exception {
        someMethod2();
    }

    public static void someMethod2() throws Exception {
        throw new Exception();
    }
}