package com.User.userproject.Helperclasses;

public class Department {
    private Long departmentid;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department(Long departmentid, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentid = departmentid;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
