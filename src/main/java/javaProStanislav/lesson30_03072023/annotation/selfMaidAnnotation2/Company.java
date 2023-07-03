package javaProStanislav.lesson30_03072023.annotation.selfMaidAnnotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {
    String name() default "ABC";
    String city() default "XYZ";
}
