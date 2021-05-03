package ru.hibernate.util;

import org.hibernate.Session;

public class Start {
    public static void main(String[] args) {
        Session session = HibernateSession.getSessionFactory().openSession();

        HibernateSession.getSessionFactory().close();

    }
}
