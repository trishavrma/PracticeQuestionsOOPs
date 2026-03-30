/*3. Define a class CARRENTAL with the following details:
 Class Members are: CarId of int type, CarType of string type and Rent of
float type.
 Define GetCar() method which accepts CarId and CarType.
 GetRent() method which return rent of the car on the basis of car type, i.e.
Small Car = 1000, Van = 800, SUV = 2500
 ShowCar() method which allow user to view the contents of cars i.e. id, type
and rent.*/

import java.util.Scanner;

class Q3 {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        this.CarId = id;
        this.CarType = type;
        this.Rent = GetRent();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            return 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            return 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            return 2500;
        } else {
            return 0;
        }
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}
