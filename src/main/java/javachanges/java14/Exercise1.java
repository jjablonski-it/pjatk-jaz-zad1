package javachanges.java14;

record Car(String manufacturer, String yearOfProduction) {}

public class Exercise1 {

    //record
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "1999");

    }
}
