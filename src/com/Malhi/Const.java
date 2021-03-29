package com.Malhi;

public class Const {
    private String name;
    private int age;
    private final String DEFAULT_LANG ="English";
    private final static String DEFAULT_NAME = "Lovepreet";
    private Person person;
    public Const(){
        this(DEFAULT_NAME);
        person = new Person();
    }
    public Const(String name){
        this.name=name;
        person = new Person();
    }
    public Const(int age){
        this.age=age;
        person = new Person();

    }
    public Const(String name,int age){
        this(name);
        this.age=age;
        person = new Person();
    }

    public void speak(){
        speak(DEFAULT_LANG);
    }
    public void speak(String language){
        if(DEFAULT_LANG.equals(language)){
            System.out.println("hello");
        }
        System.out.println("Language => "+ language);
    }

    @Override
    public String toString() {
        return "Const{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + person +
                '}';
    }
}
