package Project;

import java.util.ArrayList;

public class Doctor {

	private int diseasesNumber;

	// Doktor listesi.
	String[] doctors = { "Emre AKKAYA", "Alper ASLAN", "Serap ÇAKIR","Nuriye DOÐAN" };
	
	// hastalýklar dizi listesini tanýmladým.
	static ArrayList<String> diseases = new ArrayList<String>(); 
	
	static ArrayList<Patient> hastalar = new ArrayList<Patient>();
																	
    // burada hastalýk çeþitleri için fonksiyon oluþturdum ve bunlarý yazdýrdým.
	public static void diseasesType() {
		diseases.add("Akdeniz ateþi"); // Dahiliye polikliniði
		diseases.add("Astým"); // Dahiliye
		diseases.add("Hiper tansiyon"); // dahiliye
		diseases.add("Kalp krizi"); // Kardiyoloji
		diseases.add("Koah"); // Göðüs hastalýklarý
		diseases.add("Kolera"); // Enfeksiyon hastalýklarý
		diseases.add("Lejyoner"); // Enfeksiyon hastalýklarý
		diseases.add("Menenjit"); // Dahiliye
		diseases.add("Tifo"); // Enfeksiyon hastalýklarý
		diseases.add("Verem"); // Göðüs hastalýklarý

		for (int i = 1; i < 11; i++) {
			System.out.println(i + ". Hastalýk: " + diseases.get(i - 1));
		}

		System.out.println(" ");
	}
	
	
	
	public static void addPatient(){
		Patient patient1 = new Patient("Karl", "Benz", 84, "Erkek", "0500 000 00 00", Doctor.diseases.get(7));
		hastalar.add(patient1);
		
		Patient patient2 = new Patient("Bahar", "Çelik", 25, "Kadýn", "0500 000 00 00", Doctor.diseases.get(2));
		hastalar.add(patient2);
		
		Patient patient3 = new Patient("Kadir", "Uzun", 18, "Erkek", "0500 000 00 00", Doctor.diseases.get(3));
		hastalar.add(patient3);
		
		Patient patient4 = new Patient("Berkant", "Çalýþkan", 5, "Erkek", "0500 000 00 00", Doctor.diseases.get(5));
		hastalar.add(patient4);
		
		Patient patient5 = new Patient("Ýbrahim", "Salmancý", 40, "Erkek", "0500 000 00 00", Doctor.diseases.get(4));
		hastalar.add(patient5);
		
		Patient patient6 = new Patient("Arife", "Gündüz", 54, "Kadýn", "0500 000 00 00", Doctor.diseases.get(6));
		hastalar.add(patient6);
		
		Patient patient7 = new Patient("Davut", "Dal", 45, "Erkek", "0500 000 00 00", Doctor.diseases.get(7));
		hastalar.add(patient7);
		
		Patient patient8 = new Patient("Kane", "Hodder", 66, "Erkek", "0500 000 00 00", Doctor.diseases.get(8));
		hastalar.add(patient8);
		
		Patient patient9 = new Patient("Sarah", "Jio", 43, "Kadýn", "0500 000 00 00", Doctor.diseases.get(9));
		hastalar.add(patient9);
		
		Patient patient10 = new Patient("Selami", "gümüþ", 35, "Erkek", "0500 000 00 00", Doctor.diseases.get(1));
		hastalar.add(patient10);		
	}
}
