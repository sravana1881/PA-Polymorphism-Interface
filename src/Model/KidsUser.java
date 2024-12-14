package Model;

import Interface.LibraryUser;

public class KidsUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidsUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {

        if(age<=11){
            System.out.println("You have successfully registered under a Kids Account");
        }else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {

        if(bookType=="kids"){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

    @Override
    public String toString() {
        return "KidsUser{" +
                "age=" + age +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
