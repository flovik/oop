package com.Lab6.Task1.Organization;

import java.util.LinkedList;
import java.util.List;

public class Hospital {
    public String name;
    public Address address;
    public Phone phone;
    private List<Person> personList = new LinkedList<>();
    public List<Department> departments = new LinkedList<>();
}
