package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@MyAnnotation
public class Main {
    @MyAnnotation
    private int a;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        @MyAnnotation
        Method[] methods = Main.class.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof MyAnnotation) {
                    Object returnMethodValue = method.invoke(new Main());
                    try {
                        String returnValueStr = (String) returnMethodValue;
                        if (returnValueStr == null || returnValueStr.isEmpty() || returnValueStr.isBlank() || returnValueStr.equalsIgnoreCase("null"))
                            System.out.println("deyer doghru oturulmeyib!!!!!!");
                        // }
                    } catch (ClassCastException ex) {
                        System.out.println("int deyer qayidir");
                    }
                }
            }

        }

    }

    @Deprecated
    public void deprec() {
        System.out.println("Annotation test");
    }

    @MyAnnotation()
    @Deprecated
    public String strReturnNull() {
        System.out.println("return null");
        return null;
    }

    @MyAnnotation()
    public String strReturnNullValue() {
        System.out.println("return null value");
        return "nUll";
    }

    @MyAnnotation()
    @Deprecated
    public String strReturnBlank() {
        System.out.println("return blank");
        return "   ";
    }

    @MyAnnotation()
    public String strReturnEmpty() {
        System.out.println("return empty");
        return "";
    }

    @MyAnnotation()
    public String strReturn() {
        System.out.println("return abc");
        return "abc";
    }

    @MyAnnotation()
    public int infgdsjkg() {
        System.out.println("int method");
        return 3;
    }
}
