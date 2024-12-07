package test;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
    DayOfWeek value() default "default str";
    int intValue() default 3;
}
