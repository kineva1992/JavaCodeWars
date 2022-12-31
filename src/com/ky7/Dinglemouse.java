package com.ky7;

public class Dinglemouse {
    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFullName() {
        if(firstName != "" && lastName != "")
            return (firstName + " " + lastName).trim();
        if(firstName == "" && lastName == "")
            return "";
        return firstName == "" ? lastName.trim() : firstName.trim();
    }
}
