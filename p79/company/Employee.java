package p79.company;

public class Employee{

    private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    void displayEmployeeDetails(){
        System.out.println(this.getName() + " is " + this.getAge() + " years old with salary " + this.getSalary());

    }


}
