package com.sasha.SE_02.Task6_7;

import java.lang.annotation.Documented;

/**
 * Created by Александра on 16.10.2016.
 */
public class Annotation {
    @Documented
    public @interface Information {
        String author() default "Александра";
        String data();
    }
}
