package com.demo.controller;

import com.demo.utils.Calc;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalcRest {
    @CrossOrigin(origins = "*")//解决跨域问题
    @RequestMapping(value = "calc/{id}", method = RequestMethod.GET)
    public String add(@PathVariable("id") Integer id)
    {
        return (id+"0");
    }
    @RequestMapping(value = "calc", method = RequestMethod.POST)
    public String add(HttpServletRequest request)
    {
        int x=Integer.parseInt(request.getParameter("x"));
        int y=Integer.parseInt(request.getParameter("y"));
        Calc myc=new Calc();
        return (myc.add(x,y)+"");
    }
    @RequestMapping(value = "calc", method = RequestMethod.DELETE)
    public String sub(HttpServletRequest request)
    {
        int x=Integer.parseInt(request.getParameter("x"));
        int y=Integer.parseInt(request.getParameter("y"));
        Calc myc=new Calc();
        return (myc.sub(x,y)+"");
    }
}
