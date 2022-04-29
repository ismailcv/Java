package Project;

import java.util.ArrayList;
import java.util.Scanner;


//hasta yatak rezervasyonu test sýnýfý
public class Test {

	//hastalar array list'imi patient class'ýný kullanarak oluþturdum.
	

	public static int entry(){
		//kalavyeden girilen deðeri almak için bunu oluþturduk.
		Scanner scan = new Scanner(System.in);
		
		//bunlar kullandýðým deðiþkenlerim.
		String secretaryId1 = "hela";
		String password1 = "123456";
		String secretaryId2 ;
		String password2;
		int transition=5; // geçiþ için deðiþken
		
		//burasý sekreter girþi için ýd ve parola kýsmý.
		while (true) {
			System.out.println("Sekreter giriþi için kullanýcý adýnýzý giriniz:");
			secretaryId2 = scan.next();
			
			System.out.println("Sekreter giriþi için þifrenizi giriniz:");
			password2 = scan.next();
			
			if (secretaryId1.equals(secretaryId2) && password1.equals(password2)){
				
				System.out.println("Kullanýcý adý ve þifre doðru.\n");
				transition = 1;
				return transition;	
			}
			
			else if(secretaryId1.equals(secretaryId2) && (!password1.equals(password2))){
				System.out.println("Þifreniz yanlýþ.\n");
				transition = 0;
				return transition;
			}
			
			else if((!secretaryId1.equals(secretaryId2)) && password1.equals(password2)){
				System.out.println("Kullanýcý adýnýz yanlýþ.\n");
				transition = 0;	
				return transition;
		    }
			else if(!(secretaryId1.equals(secretaryId2)) && !(password1.equals(password2))){
				System.out.println("Hem kullanýcý adýnýz hemde þifreniz yanlýþ.\n");
				transition = 0;	
				return transition;
			}
		}			
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//burada nesneler oluþturdum ve constructor olanlara deðerleri verdim.
		Doctor doctor = new Doctor();
		Secretary secretary = new Secretary(null, null, 0, null, null, null);

		// burada deðiþkenleri tanýmladým.
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
			//yýldýz boyutunu 55 satýr yapýyorum.
			System.out.println("\n*******************************************************");
			System.out.println("*             ANA MENÜYE HOÞGELDÝNÝZ                  *");
			System.out.println("*                                                     *");
			System.out.println("*Sekreter giriþi için 1'e basýnýz.                    *");
			System.out.println("*Hasta iþlemleri giriþi için 2'ye basýnýz.            *");
			System.out.println("*Sistemden çýkmak için 3'e basýnýz.                   *");
			System.out.println("*******************************************************");
			System.out.println("Yapmak istediðiniz iþlemi seçiniz:");
			
			
			//burada ana menüde hastanýn hangisini seçmek istediðini sordum
			int request = scan.nextInt();
			if (request==1){
			    if(entry() == 1){
				    //burada da sekreter iþlemleri menüsü iþlemlerini yaptým.
			    	int y=1;
				    while (y == 1) {
                        System.out.println("\n*******************************************************");
				    	System.out.println("*       Sekreter Ýþlemleri Menüsüne Hoþgeldiniz.      *");
						System.out.println("*                                                     *");
				    	System.out.println("*Hasta eklemek için  1'e basýnýz.                     *");
						System.out.println("*Hasta bilgilerini görmek için  2'e basýnýz.          *");
						System.out.println("*Faturayý ödeme iþlemleri için  3'e basýnýz.          *");
						System.out.println("*Ana menüye dönmek için  4'e basýnýz.                 *");
                        System.out.println("*******************************************************");
						
                        System.out.println("Yapmak istediðiniz iþlemi seçiniz:");

						int secChoice = scan.nextInt();

						if (secChoice == 1) {

							System.out.println("\nAdýnýzý giriniz: ");
							name = scan.next();

							System.out.println("\nSoy adýnýzý giriniz: ");
							surname = scan.next();

							System.out.println("\nYaþýnýzý giriniz: ");
							age = scan.nextInt();

							System.out.println("\nCinsiyetinizi giriniz. Erkek için: 1 Kadýn için: 2 ");

							while (true) {
								int sayi = scan.nextInt();

								if (sayi == 1) {
									gender = "Erkek";
									break;
								} else if (sayi == 2) {
									gender = "Kadýn";
									break;
								} else {
									System.out
											.println("Yanlýþ deðer girdiniz tekrar deðer giriniz.");
								}
							}

							System.out.println("\nTelefon numarasý giriniz: ");
							phoneNum = scan.next();

							System.out.println("\nHastalýk çeþitleri yazdýrýlýyor... ");
							doctor.diseasesType();

							System.out.println("Hastanýn hastalýðýn numarasýný giriniz: ");
					
							x = 1;
							while (x == 1) {

								int a = scan.nextInt();
								if ((a < 1) || (a> 11)) {
									System.out.println("Yanlýþ deðer girdiniz. Tekrar deðer giriniz.");
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
							
							
	//burada aldýðým deðerleri psatient constructoruna gönderdim.
							Patient patient = new Patient(name, surname, age, gender,phoneNum, disease);	
	// buradada constructora gönderdiðim deðerleri hastalar array listesine ekledim.
							doctor.hastalar.add(patient);
							System.out.println("Oda numaranýz: "+ (doctor.hastalar.size() - 1) + "\n");
                            System.out.println("Sekreter menüsüne dönüyorsunuz...\n");						
						}

						else if (secChoice == 2) {
							secretary.showPatient();
						}

						else if (secChoice == 3) {
							System.out.println("Ödeyeceðiniz fatura: " + secretary.calculate() + "TL");
							System.out.println("Sekreter iþlemleri menüsüne dönülüyor...\n");
						}

						else if (secChoice == 4) {
							System.out.println("Sistemden çýkýlýyor. Ýyi günler...\n");
							y = 0;
						}

						else {
							System.out.println("Yanlýþ deðer girdiniz.");
						}
					}
				}
			    else if(entry() == 0){
			    	System.out.println("Sistemden çýkýlýyor.");
			    } 
			}
	// burada hasta iþlemleri menüsünü oluþturdum.			
			else if(request == 2){
				System.out.println("\n*******************************************************");
				System.out.println("*       Hasta Ýþlemleri Menüsüne Hoþgeldiniz.         *");
				System.out.println("*                                                     *");
				System.out.println("*ACÝL DURUMLAR ÝÇÝN 1'i SEÇÝNÝZ!!!                    *");
				System.out.println("*Telefon listesini görmek için 2'ye basýnýz.          *");
				System.out.println("*Yemek saatleri için 3'e basýnýz.                     *");
				System.out.println("*Doktor ile görüþmek için 4'e basýnýz.                     *");
				System.out.println("*Çýkmak için 5'e basýnýz.                             *");
				System.out.println("*******************************************************");
				System.out.println("Seçiminizi yapýnýz: ");
				int k=1;
				int patientChoice = scan.nextInt();
				while(k==1){
					
					if(patientChoice == 1){
						System.out.println("Hemþireniz odanýza yönlendiriliyor!!!\n");
						
						k=0;
				    }
					
					else if(patientChoice == 2){
						
						System.out.println("Telefon listesi yazdýrýlýyor...");
						System.out.println("Temizlikçi için 1823 nolu numarayý telefondan arayýnýz.");
						System.out.println("Güvelik için: 2716 nolu numarayý telefondan arayýnýz.");
						System.out.println("Sekreter için: 4512 nolu numarayý telefondan arayýnýz.\n");
						
						k=0;
					}
					
					else if(patientChoice == 3){
						System.out.println("Öðle yemeði 11:30 - 13:30 saatleri arasýndadýr.");
						System.out.println("Akþam yemeði 17:00 - 19:00 saatleri arasýndadýr.");
						k=0;
					}
					
					else if(patientChoice == 4){
						System.out.println("Doktorlarýmýz ile 9:00-10:00 arasýnda görüþebilirsiniz.");
						k=0;
					}
					else if(patientChoice == 5){
						System.out.println("\nAna menüye dönülüyor...\n");
						k=0;
					}
				}       		
			}
				
			else if(request == 3){
				System.out.println("Sistemden çýkýlýyor. Ýyi günler...\n");
				z=0;
				}
				
			else {
				System.out.println("Yanlýþ deðer girdiniz, Tekrar deðer giriniz: ");
				z = scan.nextInt();	
				}	
		}  
	}
}