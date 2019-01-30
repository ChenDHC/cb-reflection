package com.cb.reflection.annotation;

import java.lang.annotation.Annotation;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Class myClass = MyClass.class;
        Annotation[] annotations = myClass.getAnnotations();
        for (Annotation annotation:annotations){
            if(annotation instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation)annotation;
                System.out.println(myAnnotation.name());
                System.out.println(myAnnotation.value());
            }
        }

        Annotation annotation = myClass.getAnnotation(MyAnnotation.class);
        if(annotation instanceof MyAnnotation){
            MyAnnotation myAnnotation = (MyAnnotation)annotation;
            System.out.println(myAnnotation.name());
            System.out.println(myAnnotation.value());
        }
    }
}
