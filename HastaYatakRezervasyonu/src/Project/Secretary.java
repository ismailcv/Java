package Project;

import java.util.Scanner;

public class Secretary extends Patient {

	//burada patient �st class�ndan kal�t�m ald�m.
	public Secretary(String name, String surname, int age, String gender,
			String phoneNum, String disease) {
		super(name, surname, age, gender, phoneNum, disease);
		// TODO Auto-generated constructor stub
	}

	//burada �decenecek faturan�n hesaplanmas�n� sa�lad�m.
	public static int calculate() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\nHastalar�n bilgileri yaz�l�yor.");
		for (int j = 0; j < Doctor.hastalar.size(); j++) {
			System.out.println(j + ". odadaki hasta: " + Doctor.hastalar.get(j));
		}

		System.out.println("\nHangi odada kal�yorsan�z oda numaras�n� giriniz: ");
		int room = scan.nextInt();

		System.out.println("\nHastanede ka� g�n kald���n�z� giriniz: ");

		int days = scan.nextInt();
		int bill = days * 1250;

		Doctor.hastalar.remove(room);

		return bill;
	}

	// burada hastlar�n bilgilerini yazd�rd�m.
	public static void showPatient() {
		System.out.println("\nHastalar�n bilgileri yaz�l�yor...\n");

		for (int j = 0; j < Doctor.hastalar.size(); j++) {
			System.out.println(j + ". odadaki hasta " + Doctor.hastalar.get(j));
		}
	}

}