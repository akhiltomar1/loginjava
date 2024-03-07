public class Main {
    public static void main(String[] args) {

        IDandPass idpass = new IDandPass();


        Loginpage loginpage = new Loginpage(idpass.getLogininfo());

    }
}