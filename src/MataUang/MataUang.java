package MataUang;
import java.util.Scanner;
public class MataUang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  pilihan;
		  System.out.print("Masukkan nilai tukar USD ke Rp : ");
		  Scanner dolar = new Scanner(System.in);
		  int nilai_tukar = dolar.nextInt();
		  System.out.print("Masukkan 0 dan 1: ");
		  Scanner opsi = new Scanner(System.in);
		  pilihan = opsi.nextInt();

		   if (pilihan == 0) {
		   System.out.print("Masukkan Dollar yang ingin ditukar : ");
		   Scanner uang = new Scanner(System.in);
		   int nominal = uang.nextInt();
		   int USDtoRp = nominal * nilai_tukar;
		   System.out.println("USD $" + nominal
		     + " yang kamu tukar akan memperoleh Rp" + USDtoRp);
		  } else if (pilihan == 1) {
		   System.out.print("Masukkan Rupiah yang ingin ditukar: ");
		   Scanner uang = new Scanner(System.in);
		   double nominal1 = uang.nextDouble();
		   double RptoUSD = nominal1 / nilai_tukar;
		   System.out.println("Rp. " + nominal1
		     + " yang kamu tukar akan memperoleh USD $" + RptoUSD);
		  } else {
		   System.out.print("Nilai yang anda inputkan Salah");
		  }
		 }
}

