package LW_03.Q3;

public class Main {
    public static void main(String[] args) {
        Owner owner= new Owner("Salik","03123131");
        Bicycle bicycle = new Bicycle(owner);
        System.out.println("The name of the owner is "+bicycle.getOwner().getOwnerName());
        System.out.println("Owner\'s phone number is "+bicycle.getOwner().getPhoneNo());

    }
}
