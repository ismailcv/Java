package Project;

import java.util.ArrayList;
import java.util.Scanner;


//hasta yatak rezervasyonu test s�n�f�
public class Test {

	//hastalar array list'imi patient class'�n� kullanarak olu�turdum.
	

	public static int entry(){
		//kalavyeden girilen de�eri almak i�in bunu olu�turduk.
		Scanner scan = new Scanner(System.in);
		
		//bunlar kulland���m de�i�kenlerim.
		String secretaryId1 = "hela";
		String password1 = "123456";
		String secretaryId2 ;
		String password2;
		int transition=5; // ge�i� i�in de�i�ken
		
		//buras� sekreter gir�i i�in �d ve parola k�sm�.
		while (true) {
			System.out.println("Sekreter giri�i i�in kullan�c� ad�n�z� giriniz:");
			secretaryId2 = scan.next();
			
			System.out.println("Sekreter giri�i i�in �ifrenizi giriniz:");
			password2 = scan.next();
			
			if (secretaryId1.equals(secretaryId2) && password1.equals(password2)){
				
				System.out.println("Kullan�c� ad� ve �ifre do�ru.\n");
				transition = 1;
				return transition;	
			}
			
			else if(secretaryId1.equals(secretaryId2) && (!password1.equals(password2))){
				System.out.println("�ifreniz yanl��.\n");
				transition = 0;
				return transition;
			}
			
			else if((!secretaryId1.equals(secretaryId2)) && password1.equals(password2)){
				System.out.println("Kullan�c� ad�n�z yanl��.\n");
				transition = 0;	
				return transition;
		    }
			else if(!(secretaryId1.equals(secretaryId2)) && !(password1.equals(password2))){
				System.out.println("Hem kullan�c� ad�n�z hemde �ifreniz yanl��.\n");
				transition = 0;	
				return transition;
			}
		}			
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//burada nesneler olu�turdum ve constructor olanlara de�erleri verdim.
		Doctor doctor = new Doctor();
		Secretary secretary = new Secretary(null, null, 0, null, null, null);

		// burada de�i�kenleri tan�mlad�m.
		String name;
		String surname;
		int age;
		String gender;
		String phoneNum;
		String disease = null;
		int x = 1;
		int z = 1;
		int m = 1;
        
		
		while (z == 1) {
			//y�ld�z boyutunu 55 sat�r yap�yorum.
			System.out.println("\n*******************************************************");
			System.out.println("*             ANA MEN�YE HO�GELD�N�Z                  *");
			System.out.println("*                                                     *");
			System.out.println("*Sekreter giri�i i�in 1'e bas�n�z.                    *");
			System.out.println("*Hasta i�lemleri giri�i i�in 2'ye bas�n�z.            *");
			System.out.println("*Sistemden ��kmak i�in 3'e bas�n�z.                   *");
			System.out.println("*******************************************************");
			System.out.println("Yapmak istedi�iniz i�lemi se�iniz:");
			
			
			//burada ana men�de hastan�n hangisini se�mek istedi�ini sordum
			int request = scan.nextInt();
			if (request==1){
			    if(entry() == 1){
				    //burada da sekreter i�lemleri men�s� i�lemlerini yapt�m.
			    	int y=1;
				    while (y == 1) {
                        System.out.println("\n*******************************************************");
				    	System.out.println("*       Sekreter ��lemleri Men�s�ne Ho�geldiniz.      *");
						System.out.println("*                                                     *");
				    	System.out.println("*Hasta eklemek i�in  1'e bas�n�z.                     *");
						System.out.println("*Hasta bilgilerini g�rmek i�in  2'e bas�n�z.          *");
						System.out.println("*Faturay� �deme i�lemleri i�in  3'e bas�n�z.          *");
						System.out.println("*Ana men�ye d�nmek i�in  4'e bas�n�z.                 *");
                        System.out.println("*******************************************************");
						
                        System.out.println("Yapmak istedi�iniz i�lemi se�iniz:");

						int secChoice = scan.nextInt();

						if (secChoice == 1) {

							System.out.println("\nAd�n�z� giriniz: ");
							name = scan.next();

							System.out.println("\nSoy ad�n�z� giriniz: ");
							surname = scan.next();

							System.out.println("\nYa��n�z� giriniz: ");
							age = scan.nextInt();

							System.out.println("\nCinsiyetinizi giriniz. Erkek i�in: 1 Kad�n i�in: 2 ");

							while (true) {
								int sayi = scan.nextInt();

								if (sayi == 1) {
									gender = "Erkek";
									break;
								} else if (sayi == 2) {
									gender = "Kad�n";
									break;
								} else {
									System.out
											.println("Yanl�� de�er girdiniz tekrar de�er giriniz.");
								}
							}

							System.out.println("\nTelefon numaras� giriniz: ");
							phoneNum = scan.next();

							System.out.println("\nHastal�k �e�itleri yazd�r�l�yor... ");
							doctor.diseasesType();

							System.out.println("Hastan�n hastal���n numaras�n� giriniz: ");
					
							x = 1;
							while (x == 1) {

								int a = scan.nextInt();
								if ((a < 1) || (a> 11)) {
									System.out.println("Yanl�� de�er girdiniz. Tekrar de�er giriniz.");
								}

								else {
									x = 0;
									switch (a) {
									case 1:
										System.out.println("Doktorunuz: " + doctor.doctors[1]);
										disease = doctor.diseases.get(0);
										break;

									case 2:
										System.out.println("Doktorunuz: " + doctor.doctors[1]);
										disease = doctor.diseases.get(1);
										break;

									case 3:
										System.out.println("Doktorunuz: " + doctor.doctors[1]);
										disease = doctor.diseases.get(2);
										break;

									case 4:
										System.out.println("Doktorunuz: " + doctor.doctors[0]);
										disease = doctor.diseases.get(3);
										break;

									case 5:
										System.out.println("Doktorunuz: " + doctor.doctors[2]);
										disease = doctor.diseases.get(4);
										break;

									case 6:
										System.out.println("Doktorunuz: " + doctor.doctors[3]);
										disease = doctor.diseases.get(5);
										break;

									case 7:
										System.out.println("Doktorunuz: " + doctor.doctors[3]);
										disease = doctor.diseases.get(6);
										break;

									case 8:
										System.out.println("Doktorunuz: " + doctor.doctors[1]);
										disease = doctor.diseases.get(7);
										break;

									case 9:
										System.out.println("Doktorunuz: " + doctor.doctors[3]);
										disease = doctor.diseases.get(8);
										break;

									case 10: 
										System.out.println("Doktorunuz: " + doctor.doctors[2]);
										disease = doctor.diseases.get(9);
										break;

									default:
										break;
									}  
								}
							}
							
							if (m == 1){
								doctor.addPatient();
								m = m+1;
							}
							
							
	//burada ald���m de�erleri psatient constructoruna g�nderdim.
							Patient patient = new Patient(name, surname, age, gender,phoneNum, disease);	
	// buradada constructora g�nderdi�im de�erleri hastalar array listesine ekledim.
							doctor.hastalar.add(patient);
							System.out.println("Oda numaran�z: "+ (doctor.hastalar.size() - 1) + "\n");
                            System.out.println("Sekreter men�s�ne d�n�yorsunuz...\n");						
						}

						else if (secChoice == 2) {
							secretary.showPatient();
						}

						else if (secChoice == 3) {
							System.out.println("�deyece�iniz fatura: " + secretary.calculate() + "TL");
							System.out.println("Sekreter i�lemleri men�s�ne d�n�l�yor...\n");
						}

						else if (secChoice == 4) {
							System.out.println("Sistemden ��k�l�yor. �yi g�nler...\n");
							y = 0;
						}

						else {
							System.out.println("Yanl�� de�er girdiniz.");
						}
					}
				}
			    else if(entry() == 0){
			    	System.out.println("Sistemden ��k�l�yor.");
			    } 
			}
	// burada hasta i�lemleri men�s�n� olu�turdum.			
			else if(request == 2){
				System.out.println("\n*******************************************************");
				System.out.println("*       Hasta ��lemleri Men�s�ne Ho�geldiniz.         *");
				System.out.println("*                                                     *");
				System.out.println("*AC�L DURUMLAR ���N 1'i SE��N�Z!!!                    *");
				System.out.println("*Telefon listesini g�rmek i�in 2'ye bas�n�z.          *");
				System.out.println("*Yemek saatleri i�in 3'e bas�n�z.                     *");
				System.out.println("*Doktor ile g�r��mek i�in 4'e bas�n�z.                     *");
				System.out.println("*��kmak i�in 5'e bas�n�z.                             *");
				System.out.println("*******************************************************");
				System.out.println("Se�iminizi yap�n�z: ");
				int k=1;
				int patientChoice = scan.nextInt();
				while(k==1){
					
					if(patientChoice == 1){
						System.out.println("Hem�ireniz odan�za y�nlendiriliyor!!!\n");
						
						k=0;
				    }
					
					else if(patientChoice == 2){
						
						System.out.println("Telefon listesi yazd�r�l�yor...");
						System.out.println("Temizlik�i i�in 1823 nolu numaray� telefondan aray�n�z.");
						System.out.println("G�velik i�in: 2716 nolu numaray� telefondan aray�n�z.");
						System.out.println("Sekreter i�in: 4512 nolu numaray� telefondan aray�n�z.\n");
						
						k=0;
					}
					
					else if(patientChoice == 3){
						System.out.println("��le yeme�i 11:30 - 13:30 saatleri aras�ndad�r.");
						System.out.println("Ak�am yeme�i 17:00 - 19:00 saatleri aras�ndad�r.");
						k=0;
					}
					
					else if(patientChoice == 4){
						System.out.println("Doktorlar�m�z ile 9:00-10:00 aras�nda g�r��ebilirsiniz.");
						k=0;
					}
					else if(patientChoice == 5){
						System.out.println("\nAna men�ye d�n�l�yor...\n");
						k=0;
					}
				}       		
			}
				
			else if(request == 3){
				System.out.println("Sistemden ��k�l�yor. �yi g�nler...\n");
				z=0;
				}
				
			else {
				System.out.println("Yanl�� de�er girdiniz, Tekrar de�er giriniz: ");
				z = scan.nextInt();	
				}	
		}  
	}
}