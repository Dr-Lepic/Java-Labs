package Test;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest m = new ExceptionTest();
        m.method3();
    }


    public void method1() throws NullPointerException {
        String  p1 = null;
        if (p1 == null) {
//
            throw new NullPointerException("It is NULL");
        }
    }

    public void method2() throws NullPointerException {
        method1();
    }

    public void method3() {
        try {
            method2();
        } catch (NullPointerException e) {
           e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}