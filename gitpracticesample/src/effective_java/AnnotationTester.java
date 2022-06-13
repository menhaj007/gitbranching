package effective_java;

import java.lang.reflect.Method;

public class AnnotationTester {
    public static void main(String[] args) throws NoSuchMethodException {
        SharafClass sc = new SharafClass();
        sc.saySharaf();
        Method method = sc.getClass().getMethod("saySharaf");
        System.out.println(method);
        SharafAnnotation sharafAnnotation = method.getAnnotation(SharafAnnotation.class);
        System.out.println(sharafAnnotation.value());
    }
}
