package com.ibokoko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Grid implements Big{

    Yammer yammer;

    public String show(){

       return this.yammer.test("lanre");
    }

    @Autowired
    public void setYammer(Yammer yammer){
        this.yammer = yammer;

    }
}
