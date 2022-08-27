package com.custom.events;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.custom.Eventsource;

@Component
public class Appeventhandlerb implements ApplicationListener<Appevent1> {

    @Override
    public void onApplicationEvent(Appevent1 event) {
    	

        Object source = event.getSource();
        if(source instanceof Eventsource) {
            Eventsource es = (Eventsource)source;
            System.out.print(es.getNotes());
        }

    }
}
