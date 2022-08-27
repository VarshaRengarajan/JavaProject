package com.custom.events;
import org.springframework.context.ApplicationEvent;

public class Appevent1 extends ApplicationEvent  {

    public Appevent1(Object source) {
        super(source);
    }
}
