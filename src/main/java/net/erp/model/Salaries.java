package net.erp.model;

import java.util.Date;

public class Salaries {
    private Long empNo,salary;
    private Date fromDate,toDate;

    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "empNo=" + empNo +
                ", salary=" + salary +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
