import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Ticket newTicket= new Ticket();
   // newTicket.getPassengerInfo();
        System.out.println(Rental.getRentalCost(0));
        System.out.println(Rental.getRentalCost(1));
        System.out.println(Rental.getRentalCost(2));
        System.out.println(Rental.getRentalCost(3));
        System.out.println(Rental.getRentalCost(4));
        System.out.println(Rental.getRentalCost(5));
        System.out.println(Rental.getRentalCost(6));
        System.out.println(Rental.getRentalCost(7));
        System.out.println(Rental.getRentalCost(8));

        ArrayList<Integer> array= new ArrayList<>();
        array.add(1);
        array.add(4);
        array.add(7);
        array.add(8);

        System.out.println(NumberBox.getMultipliedBoxDigits(array));

        String[] chart={"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"};
        Waves.chartAnalyser(chart);

}
}