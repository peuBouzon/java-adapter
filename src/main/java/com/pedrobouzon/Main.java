package com.pedrobouzon;

import com.pedrobouzon.legacy.ThirdPartyWorker;
import com.pedrobouzon.model.Employee;
import com.pedrobouzon.model.Developer;
import com.pedrobouzon.adapter.ThirdPartyWorkerAdapter;
import com.pedrobouzon.service.EmailService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        var developer = new Developer("Pedro", "pedro@email.com");
        employees.add(developer);

        var thirdPartyWorker = new ThirdPartyWorker("John", "john@email.com");
        employees.add(new ThirdPartyWorkerAdapter(thirdPartyWorker));

        employees.forEach(EmailService::sendEmail);
    }
}