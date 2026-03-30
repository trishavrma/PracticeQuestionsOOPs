/*15. A ride booking application supports different types of rides. Each ride calculates
fare differently.
Question:
Create an abstract class Ride with:
 distance
 abstract method calculateFare()
Create subclasses:
 BikeRide → fare = ₹5 per km
 AutoRide → fare = ₹8 per km
 CarRide → fare = ₹12 per km
Store different rides in a Ride array and calculate fares using runtime
polymorphism.*/

abstract class Ride {
    double distance;

    public Ride(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();
}

class BikeRide extends Ride {
    public BikeRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return this.distance * 5;
    }
}

class AutoRide extends Ride {
    public AutoRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return this.distance * 8;
    }
}

class CarRide extends Ride {
    public CarRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return this.distance * 12;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Ride[] rides = new Ride[4];
        rides[0] = new BikeRide(10.5); 
        rides[1] = new AutoRide(5.2);  
        rides[2] = new CarRide(25.0);  
        rides[3] = new BikeRide(3.0); 

        for (Ride ride : rides) {
            System.out.println("Fare for the ride: ₹" + ride.calculateFare());
        }
    }
}
