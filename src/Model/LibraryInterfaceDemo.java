package Model;

import Interface.LibraryUser;

import java.util.Scanner;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {



       KidsUser kUser = new KidsUser( 10, "kids");
        kUser.registerAccount();
        kUser.requestBook();
        System.out.println("age : " + kUser.getAge() + " Book Type :" + kUser.getBookType());
        System.out.println();

        KidsUser kUser1 = new KidsUser(18,"Fiction");
        kUser1.registerAccount();
        kUser1.requestBook();
        System.out.println("age : " + kUser1.getAge() + " Book Type :" + kUser1.getBookType());
        System.out.println();

        adultUser aUser=new adultUser(23,"Fiction");
        aUser.registerAccount();
        aUser.requestBook();
        System.out.println("age : " + aUser.getAge() + " Book Type : " + aUser.getBookType());
        System.out.println();

        adultUser aUser1=new adultUser(5,"Kids");
        aUser1.registerAccount();
        aUser1.requestBook();
        System.out.println("age : " + aUser1.getAge() + " Book Type : " + aUser1.getBookType());

    }
}
