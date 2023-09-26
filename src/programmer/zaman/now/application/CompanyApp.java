package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PZN");

        Company.Employee employee = company.new Employee();
        employee.setName("arif");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("belum ada");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("budi");
        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
