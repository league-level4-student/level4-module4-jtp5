package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int d = 0;
		for (int i = 0; i < getPatients().size(); i++) {
			if (d >= getDoctors().size()) {
				d = 0;
			}
			getDoctors().get(d).assignPatient(getPatients().get(i));
			d++;
		}
	}

}
