import java.util.Scanner;

public class Ticket {
    Scanner scanner= new Scanner(System.in);
    String name;
    String number;


    public void getPassengerInfo(){
        System.out.print("Name: ");
        this.name=scanner.next();
        System.out.print("Number: ");
        this.number= scanner.next();
    }
}
