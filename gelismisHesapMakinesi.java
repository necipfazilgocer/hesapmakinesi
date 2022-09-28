package gelismisHesapMakinesi;
import java.util.Scanner;
public class gelismisHesapMakinesi {

	static int toplam(int n1,int n2) {	
		int  sonuc=n1+n2;
		System.out.println(n1+" ve "+ n2 +" sayılarının toplamı= "+sonuc);
		return sonuc;
		
	}
	static int cikartma(int n1,int n2) {	
		int  sonuc=n1-n2;
		System.out.println(n1+" v "+ n2 +" sayılarının farkı= "+sonuc);
		return sonuc;	
	}
	static int carpma(int n1,int n2) {	
		int  sonuc=n1*n2;
		System.out.println(n1+" ve "+ n2 +" sayılarının çarpımı = "+sonuc);
		return sonuc;	
	}
	static int bölme(int n1,int n2) {	
		int  sonuc=n1/n2;
		System.out.println(n1+" ve "+ n2 +" sayılarının bölümü = "+sonuc);
		return sonuc;	
	}
	
	
	public static void main(String[] args) {
		int sonuc=0;
		Scanner scanner=new Scanner(System.in);
		String menü="GELİŞMİŞ HESAP MAKİNESİNE HOŞGELDİNİZ.\n"
				+ "1-TOPLAMA\n"
				+ "2-ÇIKARTMA\n"
				+ "3-ÇARPMA\n"
				+ "4-BÖLME";
		System.out.println(menü);
		System.out.println("Lütfen yapmak istediğiniz işlemi giriniz.");
		int islem=scanner.nextInt();
		System.out.println("1.sayıyı giriniz.");
		int n1=scanner.nextInt();
		System.out.println("2.sayıyı giriniz.");
		int n2=scanner.nextInt();
		
			switch(islem) {
			case 1:{
				toplam(n1,n2);	
				
			break;
			}
			case 2:{
				cikartma(n1,n2);
				break;
			}
			case 3:{
				carpma(n1,n2);
				break;
			}
			case 4:{
				bölme(n1,n2);
			}
			}
			
			
		
		


	}

}
