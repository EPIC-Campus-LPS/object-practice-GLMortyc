public class Automobile {
    private String make;
    private String model;
    private double mileage;
    private double fuelTank;
    private double fuel;

    public Automobile(String mk, String mdl, double m, double fT) {
        make = mk;
        model = mdl;
        mileage = m;
        fuelTank = fT;
    }

    public String getMake() {
        return make;
    }

    public double fillUp(double gallons){
        return fuel += gallons;
    }

    public double takeTrip(double miles){
       return fuel = fuelTank - (miles / 35);
    }
    public double reportFuel(){
        return fuel;
    }
}
