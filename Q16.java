/*16. A hospital manages different types of staff.
Question:
Create a base class Staff with method work().
Create subclasses:

 Doctor
 Nurse
 Receptionist
Override work() to display different responsibilities.*/

class Staff {
    public void work() {
        System.out.println("Staff member performs general duties.");
    }
}

class Doctor extends Staff {
    @Override
    public void work() {
        System.out.println("Doctor diagnoses patients and prescribes treatment.");
    }
}

class Nurse extends Staff {
    @Override
    public void work() {
        System.out.println("Nurse administers medication and provides patient care.");
    }
}

class Receptionist extends Staff {
    @Override
    public void work() {
        System.out.println("Receptionist schedules appointments and manages records.");
    }
}

public class Q16 {
    public static void main(String[] args) {
        Staff doctor = new Doctor();
        Staff nurse = new Nurse();
        Staff receptionist = new Receptionist();
        
        System.out.println("Demonstrating polymorphism in hospital staff roles:");
        doctor.work();
        nurse.work();
        receptionist.work();
    }
}
