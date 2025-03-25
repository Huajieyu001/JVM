import java.lang.reflect.Method;

public class BootForTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Test");
            Object object = clazz.newInstance();
            Method declaredMethod = clazz.getDeclaredMethod("testBoot");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(object);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("ForTest!!!!!!!!!");
    }
}
