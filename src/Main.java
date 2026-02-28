import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.services.Hospital;

public class Main {
	
	public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor("Ravi", 45, "Cardiology", 3);
        Patient p1 = new Patient("Arjun", 20, "Fever");

        hospital.addDoctor(d1);
        hospital.addPatient(p1);

        hospital.bookAppointment(d1.getId(), p1.getId(), "2026-03-01");
        hospital.bookAppointment(d1.getId(), p1.getId(), "2026-03-02");

//        hospital.processNextAppointment();
        
        hospital.searchDoctor(1);
        hospital.searchPatient(2);
    }
}
