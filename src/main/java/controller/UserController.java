package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class UserController {


    @RequestMapping("/starter")
    public String starter(){
        System.out.println("拉拉");
        return "AdminLTE-2.4.1/starter.html";
    }
}
