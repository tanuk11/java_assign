package q1;

import java.util.Scanner;

public class UserRegistration {


    void registerUser(String name, String Country) throws InvalidCountryException
    {
        if (Country.equals("India"))
        {
            System.out.println("User registration done successfully");
        }else
        {
            System.out.println("User Outside India cannot be registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the country name");
        String cName=sc.next();

        UserRegistration u1=new UserRegistration();
        try {
            u1.registerUser(name,cName);
        } catch (InvalidCountryException e) {
            throw new RuntimeException(e);
        }
    }
}
