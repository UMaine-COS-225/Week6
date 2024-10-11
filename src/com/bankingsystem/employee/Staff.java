package com.bankingsystem.employee;

import Schedule;

abstract class Staff{

    private String bankID;
    private String position;
    private Schedule schedule;

    abstract public void updatePersonalInfo();

    abstract public void login();

    abstract public void logout();
}


    
