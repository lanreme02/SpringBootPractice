package com.ibokoko;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DemoController {

    //@Autowired
    //Grid grid;

    @GetMapping("/name")
    public String getname(){

        return " try lanre";
                // new ResultParam("lanre");
    }

}
