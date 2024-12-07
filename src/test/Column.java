package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Column {
    String name() default "";
    boolean nullable() default false;
    int length();
}
