package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ClassSingleton {
    private static ClassSingleton INSTANCE;

    private String description;

    private ClassSingleton(String description) {
        this.description = description;
    }

    public static ClassSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ClassSingleton("");
        }
        return INSTANCE;
    }
}
