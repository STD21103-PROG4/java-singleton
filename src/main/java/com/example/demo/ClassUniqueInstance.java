package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ClassUniqueInstance {
    INSTANCE(0);

    @Getter
    @Setter

    private int click;

    private ClassUniqueInstance(int click) {
        this.click = click;
    }

    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }
}
