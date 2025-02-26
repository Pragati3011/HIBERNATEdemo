package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration cfg =  new Configuration();
       cfg.configure("hibranate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

//   or     SessionFactory  factory = new Configuration().configure("hibranate.cfg.xml").buildSessionFactory();
        Session session= factory.openSession();

        Student s=new Student( 1,"pragati","ambajogai"); //seting values by constructor


        Student  s2=new Student();
        s2.setId(2);
        s2.setName(" Pragti");
        s2.setCity(" ");//we can set values by setter method  and constructor

        Transaction transaction= session.beginTransaction();
       // session.save(s);
        session.save(s2);
        transaction.commit();


        session.close();
       // System.out.println(factory);
       // System.out.println(factory.isClosed());
        factory.close();



    }
}