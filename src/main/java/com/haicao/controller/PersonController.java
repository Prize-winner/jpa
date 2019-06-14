package com.haicao.controller;


import com.haicao.entity.Person;
import com.haicao.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository pr;

    @RequestMapping("/delete")
    public void delete(){
        Person p = new Person();
        p.setPid(1);
        pr.delete(p);
    }

    @RequestMapping("/selectDinamic")
    public List<Person> selectDinamic(){
        List<Person> list = pr.selectDynamic(1,"aa");
        for (Person p:list) {
            System.out.println("----"+p);
        }
        return list;

    }
}
