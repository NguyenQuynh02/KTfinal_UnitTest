package org.samsung;

public class Customer {
    private String name;
    private String number;
    private String email;

    public Customer(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number + ", Email: " + email;
    }
}
