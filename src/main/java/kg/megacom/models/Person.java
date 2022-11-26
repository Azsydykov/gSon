package kg.megacom.models;


import java.util.List;

public class Person {
    private Long id;
    private String fistName;
    private int age;
    private double salary;
    private List<Hobby> hobby;
    private Job job;

    public Person(Long id, String fistName, int age, double salary, List<Hobby> hobby, Job job) {
        this.id = id;
        this.fistName = fistName;
        this.age = age;
        this.salary = salary;
        this.hobby = hobby;
        this.job = job;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fistName='" + fistName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hobby=" + hobby +
                ", job=" + job +
                '}'+"\n";
    }
}
