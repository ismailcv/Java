package Project;

import java.util.Scanner;

public class Secretary extends Patient {

	//burada patient üst classýndan kalýtým aldým.
	public Secretary(String name, String surname, int age, String gender,
			String phoneNum, String disease) {
		super(name, surname, age, gender, phoneNum, disease);
		// TODO Auto-generated constructor stub
	}

	//burada ödecenecek faturanýn hesaplanmasýný saðladým.
	public static int calculate() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\nHastalarýn bilgileri yazýlýyor.");
		for (int j = 0; j < Doctor.hastalar.size(); j++) {
			System.out.println(j + ". odadaki hasta: " + Doctor.hastalar.get(j));
		}

		System.out.println("\nHangi odada kalýyorsanýz oda numarasýný giriniz: ");
		int room = scan.nextInt();

		System.out.println("\nHastanede kaç gün kaldýðýnýzý giriniz: ");

		int days = scan.nextInt();
		int bill = days * 1250;

		Doctor.hastalar.remove(room);

		return bill;
	}

	// burada hastlarýn bilgilerini yazdýrdým.
	public static void showPatient() {
		System.out.println("\nHastalarýn bilgileri yazýlýyor...\n");

		for (int j = 0; j < Doctor.hastalar.size(); j++) {
			System.out.println(j + ". odadaki hasta " + Doctor.hastalar.get(j));
		}
	}

}