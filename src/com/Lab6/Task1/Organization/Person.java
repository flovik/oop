package com.Lab6.Task1.Organization;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected FullName name;
    protected Date birthDate;
    protected Gender gender;
    protected Address homeAddress;
    protected Phone phone;
    protected List<Hospital> hospitalList = new LinkedList<>();
}
