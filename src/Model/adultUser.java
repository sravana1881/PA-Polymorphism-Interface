package Model;

import Interface.LibraryUser;

public class adultUser implements LibraryUser {

    private int age;
    private String bookType;

    public adultUser(int age, String bookType) {
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

        if(age>=12){
            System.out.println("You have successfully registered under an Adult Account");
        }else {
            System.out.println("Sorry, age must be greater than 12 to register as a adult.");
        }
    }

    @Override
    public void requestBook() {

        if(bookType=="Fiction"){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only Adult fiction books");
        }
    }

    @Override
    public String toString() {
        return "adultUser{" +
                "age=" + age +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
