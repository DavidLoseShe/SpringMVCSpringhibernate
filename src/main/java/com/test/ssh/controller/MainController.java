package com.test.ssh.controller;

import com.test.ssh.service.impl.PersonServiceImpl;
import com.test.ssh.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by XRog
 * On 2/1/2017.12:36 AM
 */
@Controller
public class MainController {
    @Autowired
    private TestServiceImpl testService;
    @Autowired
    private PersonServiceImpl personServiceImpl;
    @RequestMapping("test")
    public String test(){
        return 	testService.test();
    }
    @ResponseBody
    @RequestMapping("save")
    public String  savePerson(){
        System.out.println("===1==");
        personServiceImpl.savePerson();
        return "success";
    }

}
