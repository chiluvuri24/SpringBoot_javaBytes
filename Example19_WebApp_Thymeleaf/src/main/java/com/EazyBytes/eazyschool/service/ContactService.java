package com.EazyBytes.eazyschool.service;

import com.EazyBytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.logging.Logger;
@Slf4j
@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {

    private int counter=0;

    public ContactService(){
        System.out.println(" Contact Service bean is initialized");
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        log.info(" Contact ::"+contact.toString());
        return true;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
