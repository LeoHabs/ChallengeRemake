public class Rental {

    public static double getRentalCost(int days) {
        if (days < 3) {
            return days * 35;
        } else if (days >= 3 && days < 7) {
            return days * 35 - 10;
        }else{
            return days*35 -40;
        }
    }
}
