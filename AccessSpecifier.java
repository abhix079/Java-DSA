public class AccessSpecifier {
    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        System.out.println(b.username);
        b.username = "mukesh";
        System.out.println(b.username);

        // b.pass= "random"; this is showing error because it is not accees outside the
        // class by its objects .. to access it wen have to make a public method inside
        // the class

        b.show();
        b.setPass("random");
        b.show();

    }

}

class BankAccount {
    public String username = "abhishek";
    private String pass = "abhi";

    public void setPass(String newPass) {
        pass = newPass;
    }

    public void show() {
        System.out.println(pass);
    }

}
