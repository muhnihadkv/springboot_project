package com.infosys.SportsPerfo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String department;
    private Integer mark;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public Integer getMark(){
        return mark;
    }

    public void setMark(Integer mark){
        this.mark = mark;
    }

}
