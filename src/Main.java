import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("ASPIRIN", 10, 102, "23/11/2045");
        Pharmacy pharmacy2 = new Pharmacy("FLUDITEC", 4, 34, "11/01/2034");
        Pharmacy pharmacy3 = new Pharmacy("BABINI ZUBI", 34, 12, "24/08/2028");
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        printPharmacyWithLowerPriceThanFive(pharmacies);

    }
    public static void printPharmacyWithLowerPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for (Pharmacy p : pharmacies) {
            if(p.price > 5) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }
}