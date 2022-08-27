package com.custom.events;
import com.custom.*;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Appeventhandlera implements ApplicationListener<Appevent1> {

    @Override
    public void onApplicationEvent(Appevent1 event) {

        Object source = event.getSource();
        if(source instanceof Eventsource) {
            Eventsource obj = (Eventsource)source;
            System.out.print(obj.getNotes());
        }
    }
}