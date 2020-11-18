package designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private final int employeeId;
    private final List<Person> nextOfKin;

    public Employee(String name, String surname, String phoneNumber, String address, int employeeId, List<Person> nextOfKin) {
        super(name, surname, phoneNumber, address);
        this.employeeId = employeeId;
        this.nextOfKin = nextOfKin;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public List<Person> getNextOfKin() {
        return nextOfKin;
    }

    @Override
    public String toString() {
        return "[Employee:" + this.getName() + "|" +
                 this.getSurname() + "|" +
                 this.getPhoneNumber() + "|" +
                 this.getAddress() + "|" +
                 this.getEmployeeId() + "]";
    }

    static class Builder {
        private int employeeId;
        private List<Person> nextOfKin;
        private String name;
        private String surname;
        private String phoneNumber;
        private String address;

        public Builder(String name, String surname, int employeeId) {
            this.name = name;
            this.surname = surname;
            this.employeeId = employeeId;
            nextOfKin = new ArrayList<>();
        }

        public Builder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder addNextOfKin(Person person) {
            this.nextOfKin.add(person);
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            return new Employee(name, surname, phoneNumber, address, employeeId, nextOfKin);
        }
    }
}
