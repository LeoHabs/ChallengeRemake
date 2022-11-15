public class Waves {
    public static void chartAnalyser(String[] array) {
        String currentEvent = "";
        String previousEvent = array[0];
        int counter = 0;

        for (int i = 1; i < array.length; i++) {
            currentEvent = array[i];
            if (currentEvent.equals("~") && previousEvent.equals("-")) {
                counter += 1;
            }
            previousEvent = currentEvent;
        }

        double seaSickChange = (double) counter / array.length;

        seaSickChange = Math.floor(seaSickChange * 100);
        String cant = "You can't go :( Chance is " + seaSickChange + "%";
        String can = " You can go :) Chance is " + seaSickChange + "%";
        System.out.println(seaSickChange >= 30 ? cant : can);
    }
}
