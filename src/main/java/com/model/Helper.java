package com.model;
import com.util.InputUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
* Helper Model to Perform Necessary Operations
*/
public class Helper {
    PersonInformation person = new PersonInformation();
    // Universal List to store a Person's Detail
    List<PersonInformation> contactList = new ArrayList<>();

    //Start of method createContact()
    public boolean createContact() {
        boolean found = false;
//Validations for First Name
        System.out.println("Enter First Name : ");
        String firstName = InputUtil.getStringValue();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(firstName);
        if (match.find() && match.group().equals(firstName)) {
            System.out.println("valid FirstName");
        }

        for (int j = 0; j < contactList.size(); j++) {

            List<String> names = contactList.stream().map(PersonInformation::getFirstName).collect(Collectors.toList());

            for (int k = 0; k < names.size(); k++) {
                if (names.get(j).equals(firstName)) {
                    found = true;
                    break;
                }
            }
        }
        String lastName;
        String city;
        String state;
        int zipCode;
        long mobileNumber;
        String address;

        //Throwing the custom Exception for already existing Contact
        if (found) {
            throw new ArithmeticException("person Name is already in the address book!");
        } else {
            //Validation For Last Name
            System.out.println("Enter Last Name : ");
            lastName = InputUtil.getStringValue();
            Pattern patternLastname = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matchLastname = patternLastname.matcher(lastName);
            if (matchLastname.find() && match.group().equals(lastName)) {
                System.out.println("valid LastName");
            }

            //Validation for Address
            System.out.println("Enter Address : ");
            address=InputUtil.getStringValue();
            Pattern patternAddress = Pattern.compile("^[A-Z][a-z]{50,}$");
            Matcher matchAddress = patternAddress.matcher(address);
            if (matchAddress.find() && match.group().equals(address)) {
                System.out.println("valid Address");
            }

            //Validation For City
            System.out.println("Enter City : ");
            city = InputUtil.getStringValue();
            Pattern patternCity = Pattern.compile("^[A-Z][a-z]{20,}$");
            Matcher matchcity = patternCity.matcher(city);
            if (matchcity.find() && match.group().equals(city)) {
                System.out.println("valid City");
            }

            //Validation for State
            System.out.println("Enter State : ");
            state = InputUtil.getStringValue();
            Pattern patternstate = Pattern.compile("^[A-Z][a-z]{20,}$");
            Matcher matchstate = patternstate.matcher(state);
            if (matchstate.find() && match.group().equals(state)) {
                System.out.println("valid State");
            }

            System.out.println("Enter ZipCode : ");
            zipCode = InputUtil.getIntValue();

            System.out.println("Enter Mobile Number : ");
            mobileNumber = InputUtil.getIntValue();
        }

        System.out.println("Enter EmailId : ");
        String emailId = InputUtil.getStringValue();
        Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
        Matcher matchEmail = patternEmail.matcher(emailId);
        if (matchEmail.find() && match.group().equals(emailId)) {
            System.out.println("valid Email");
        }

        person = new PersonInformation(firstName, lastName,address,city, state, zipCode, mobileNumber, emailId);
        return contactList.add(person);
    }
    //End of createContact() method
}

