package com.haicao.repository;


import com.haicao.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer>{
    @Query("select person from Person person where person.pid=?1 and person.pname=?2")
    public List<Person> selectDynamic(int id, String name);
}
