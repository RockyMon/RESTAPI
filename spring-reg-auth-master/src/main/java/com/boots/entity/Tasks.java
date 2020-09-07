/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boots.entity;

/**
 *
 * @author Roman Kruchinin
 */
public class Tasks {

    private String name;
    private String descrpt;
    private String startDate;
    private String endDate;
    private String[] fileArray;
    private String status;
    private String[] userList;
    private String creationDate;
    private String updateDate;

    public Tasks() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrpt() {
        return this.descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getUserList() {
        return this.userList;
    }

    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void sethangeDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
