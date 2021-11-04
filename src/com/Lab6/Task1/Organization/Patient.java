package com.Lab6.Task1.Organization;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Patient extends Person {
    protected String id;
    protected int age;
    protected Date accepted;
    protected History sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialReqs;
    protected List<OperationsStaff> operationsStaffList = new LinkedList<>();
}
