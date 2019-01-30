package com.cb.reflection.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public String name();
    public String value();
}
