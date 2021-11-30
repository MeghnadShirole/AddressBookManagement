package com.company;

import com.exception.AddressBookException;
import com.model.Helper;
import org.junit.Assert;
import org.junit.Test;

/*
* Test case for AddressBook management system*/
public class AddressBookTest {
//object of helper model
    Helper helper=new Helper();

    @Test
    public void whenContactCreatedAndAdded_ShouldReturnTrue() throws AddressBookException {
       String expectedResult="true";
       boolean actualResult = helper.createContact();
        Assert.assertTrue(expectedResult,actualResult);
    }
}
