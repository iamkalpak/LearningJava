package code.objectOrientedProgramming.ApnaCollege.bank;
class Account{
     public String name;
     protected String email;
     private String password;

     //Getters & Setters


    public String getPassword() {
        return this.password;
    }

//    public void setPassword(String pass) {
//        this.password = pass;
//    }
    private void setPassword(String pass) {
        this.password = pass;
    }
}
public class Bank{
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="Kalpak";
        acc1.email="workwithkalpak@gmail.com";

//        acc1.setPassword("abc");
        System.out.println(acc1.getPassword());

    }
}
