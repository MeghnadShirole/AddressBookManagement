package com.exception;

/*
* Creating Custom Exception for Address Book System
*/
public class AddressBookException extends Exception{
    public AddressBookException(String message) {
        super(message);
        System.out.println(message);
    }
}
