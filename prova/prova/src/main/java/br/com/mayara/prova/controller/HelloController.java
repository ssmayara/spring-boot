package br.com.mayara.prova.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ApiOperation(value= "Tela teste inicial")
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return  "Hello World!";
    }
}
