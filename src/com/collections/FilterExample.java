package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rak", 32));
        list.add(new Employee(2, "Lao", 33));
        list.add(new Employee(3, "dsdw", 34));
        list.add(new Employee(4, "WWma", 22));
        list.add(new Employee(5, "Oiam", 12));
        System.out.println(list);
        System.out.println("================================");
        Employee e = list.stream().filter(p -> p.getId() == 3).collect(Collectors.toList()).get(0);
        System.out.println(e);
    }


}

class Employee {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}