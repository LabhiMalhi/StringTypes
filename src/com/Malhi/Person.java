package com.Malhi;

public class Person {
   private int stNo;
   private String stName;
   private String city;
   private String country;
   private String zipCode;

    public Person() {
        this.stNo = 0;
        this.stName = "N/A";
        this.city = "N/A";
        this.country = "CANADA";
        this.zipCode = "N/A";
    }

    public Person(String city, String country) {
        this.city = city;
        this.country = country;
    }



    public Person(int stNo, String stName, String city, String country, String zipCode) {
        this.stNo = stNo;
        this.stName = stName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "stNo=" + stNo +
                ", stName='" + stName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
