package OOP;

public class Employee {

    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;

    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
*/
    public void showInfos(){
        System.out.println("Bilgiler...");
        System.out.println("İsim : "+this.name);
        System.out.println("Maaş : "+this.salary);
        System.out.println("Bölüm : "+this.department);



    }













}
