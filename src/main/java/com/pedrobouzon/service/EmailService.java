package com.pedrobouzon.service;

import com.pedrobouzon.model.Employee;

public class EmailService {

    public static void sendEmail(Employee employee) {
        System.out.printf("Sending email to %s at %s%n", employee.name(), employee.email());
    }
}
