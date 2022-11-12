package com.example.demo.model;

public class employee {
    private long id;
    private String name;
    private String prename;
    private Integer age;
    private String login;
    private String password;

    public employee() {
    }

    public employee(long id,String name,String prename,Integer age,String login,String password) {
        this.id = id;
        this.name = name;
        this.prename = prename;
        this.age = age;
        this.login = login;
        this.password = password;
    }
    public employee(String name,String prename,Integer age,String login,String password) {
        this.name = name;
        this.prename = prename;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prename='" + prename + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
