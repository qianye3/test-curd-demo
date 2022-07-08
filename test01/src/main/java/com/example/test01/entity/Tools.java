package com.example.test01.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author admin
 */
public class Tools {
    private Integer id;
    private String officeCode;
    private String officeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Tools() {

    }

    public Tools(Integer id, String officeCode, String officeName) {
        this.id = id;
        this.officeCode = officeCode;
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "id=" + id +
                ", officeCode='" + officeCode + '\'' +
                ", officeName='" + officeName + '\'' +
                '}';
    }
}
