package com.haicao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    @Column(name = "pname",length = 20,nullable = true)
    private String pname;
    @Column
    private Date birth;
    @Column
    private java.util.Date join_time;



    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public java.util.Date getJoin_time() {
        return join_time;
    }

    public void setJoin_time(java.util.Date join_time) {
        this.join_time = join_time;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", birth=" + birth +
                ", join_time=" + join_time +
                '}';
    }
}
