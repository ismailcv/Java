package Project;

import java.util.ArrayList;

public class Doctor {

	private int diseasesNumber;

	// Doktor listesi.
	String[] doctors = { "Emre AKKAYA", "Alper ASLAN", "Serap �AKIR","Nuriye DO�AN" };
	
	// hastal�klar dizi listesini tan�mlad�m.
	static ArrayList<String> diseases = new ArrayList<String>(); 
	
	static ArrayList<Patient> hastalar = new ArrayList<Patient>();
																	
    // burada hastal�k �e�itleri i�in fonksiyon olu�turdum ve bunlar� yazd�rd�m.
	public static void diseasesType() {
		diseases.add("Akdeniz ate�i"); // Dahiliye poliklini�i
		diseases.add("Ast�m"); // Dahiliye
		diseases.add("Hiper tansiyon"); // dahiliye
		diseases.add("Kalp krizi"); // Kardiyoloji
		diseases.add("Koah"); // G���s hastal�klar�
		diseases.add("Kolera"); // Enfeksiyon hastal�klar�
		diseases.add("Lejyoner"); // Enfeksiyon hastal�klar�
		diseases.add("Menenjit"); // Dahiliye
		diseases.add("Tifo"); // Enfeksiyon hastal�klar�
		diseases.add("Verem"); // G���s hastal�klar�

		for (int i = 1; i < 11; i++) {
			System.out.println(i + ". Hastal�k: " + diseases.get(i - 1));
		}

		System.out.println(" ");
	}
	
	
	
	public static void addPatient(){
		Patient patient1 = new Patient("Karl", "Benz", 84, "Erkek", "0500 000 00 00", Doctor.diseases.get(7));
		hastalar.add(patient1);
		
		Patient patient2 = new Patient("Bahar", "�elik", 25, "Kad�n", "0500 000 00 00", Doctor.diseases.get(2));
		hastalar.add(patient2);
		
		Patient patient3 = new Patient("Kadir", "Uzun", 18, "Erkek", "0500 000 00 00", Doctor.diseases.get(3));
		hastalar.add(patient3);
		
		Patient patient4 = new Patient("Berkant", "�al��kan", 5, "Erkek", "0500 000 00 00", Doctor.diseases.get(5));
		hastalar.add(patient4);
		
		Patient patient5 = new Patient("�brahim", "Salmanc�", 40, "Erkek", "0500 000 00 00", Doctor.diseases.get(4));
		hastalar.add(patient5);
		
		Patient patient6 = new Patient("Arife", "G�nd�z", 54, "Kad�n", "0500 000 00 00", Doctor.diseases.get(6));
		hastalar.add(patient6);
		
		Patient patient7 = new Patient("Davut", "Dal", 45, "Erkek", "0500 000 00 00", Doctor.diseases.get(7));
		hastalar.add(patient7);
		
		Patient patient8 = new Patient("Kane", "Hodder", 66, "Erkek", "0500 000 00 00", Doctor.diseases.get(8));
		hastalar.add(patient8);
		
		Patient patient9 = new Patient("Sarah", "Jio", 43, "Kad�n", "0500 000 00 00", Doctor.diseases.get(9));
		hastalar.add(patient9);
		
		Patient patient10 = new Patient("Selami", "g�m��", 35, "Erkek", "0500 000 00 00", Doctor.diseases.get(1));
		hastalar.add(patient10);		
	}
}
