package com.secondsession.beans;

public class Employee {
    private int empId;
    private String empName;
    private int empCode;
    private String empEmail;
    private int empSal;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public int getEmpCode() {
        return empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void display(){
        System.out.println("Employee Id : "+this.empId);
        System.out.println("Employee Code : "+this.empCode);
        System.out.println("Employee Name : "+this.empName);
        System.out.println("Employee Email : "+this.empEmail);
        System.out.println("Employee Salary : "+this.empSal);
        System.out.println("-------------------------------------------------------");
    }
}
