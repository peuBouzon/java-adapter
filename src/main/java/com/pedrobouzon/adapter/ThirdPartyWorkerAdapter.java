package com.pedrobouzon.adapter;

import com.pedrobouzon.legacy.ThirdPartyWorker;
import com.pedrobouzon.model.Employee;

public class ThirdPartyWorkerAdapter implements Employee {

    private final ThirdPartyWorker thirdPartyWorker;

    public ThirdPartyWorkerAdapter(ThirdPartyWorker thirdPartyWorker) {
        this.thirdPartyWorker = thirdPartyWorker;
    }

    @Override
    public String name() {
        return thirdPartyWorker.name();
    }

    @Override
    public String email() {
        return thirdPartyWorker.emailAddress();
    }
}
