package com.custom.events;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Appeventpublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;  // instance to call publish method

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(Appevent1 appevent1) {  // calling Event object to publish it
        this.publisher.publishEvent(appevent1);
    }
}

