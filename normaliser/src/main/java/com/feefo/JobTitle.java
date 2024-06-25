package com.feefo;

import java.util.HashMap;
import java.util.Map;

public abstract class JobTitle {

    private static final Map<String, String> jobs = new HashMap<>();

    static {
        jobs.put("engineer", "Software engineer");
        jobs.put("accountant", "Accountant");
        jobs.put("architect", "Architect");
        jobs.put("surveyor", "Quantity surveyor");
    }

    protected static Map<String, String> getJobs() {
        return jobs;
    }

    abstract String normalise(String input);

}
