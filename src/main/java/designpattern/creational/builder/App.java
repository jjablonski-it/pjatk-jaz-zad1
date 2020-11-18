package designpattern.creational.builder;

public class App {
    public static void main(String[] args) {
        Employee jedrzej = new Employee.Builder("Jedrzej", "Bednarczyk", 123456)
                .setPhoneNumber("123-456")
                .setAddress("Gdynia")
                .build();

        Employee franek = new Employee.Builder("Franek", "Kimono", 654321)
                .build();

        System.out.println(jedrzej);
        System.out.println(franek);
    }
}
