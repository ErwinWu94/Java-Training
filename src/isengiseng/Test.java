package isengiseng;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		System.out.println("Selamat Datang di Aplikasi Restoran\n\n");
		
		Scanner scan = new Scanner(System.in);
		
		int jumlahmakanan;
		do{
		System.out.println("Masukkan Jumlah Makanan : ");
		jumlahmakanan = scan.nextInt();
		}while(jumlahmakanan>5);
		
		String[][] makanan = new String[jumlahmakanan][2];
		String makanan1;
		String hargamakanan;

		for (int b = 0; b < jumlahmakanan; b++) {
			System.out.println("Makanan ke " + (b + 1) + ": ");
			makanan1 = scan.next();
			makanan[b][0] = makanan1;
			System.out.println("Harga " + makanan1 + " :");
			hargamakanan = scan.next();
			makanan[b][1] = hargamakanan;
		}
		
		int jumlahminuman;
		do{
		System.out.println("Masukkan Jumlah Minuman : ");
		jumlahminuman = scan.nextInt();
		}while(jumlahminuman>5);
		
		String[][] minuman = new String[jumlahminuman][2];
		String minuman1;
		String hargaminuman;
		for (int c = 0; c < jumlahminuman; c++) {
			System.out.println("Minuman ke " + (c + 1) + ": ");
			minuman1 = scan.next();
			minuman[c][0] = minuman1;
			System.out.println("Harga " + minuman1 + " :");
			hargaminuman = scan.next();
			minuman[c][1] = hargaminuman;
		}

		System.out.println("List Makanan");
		System.out.println("************");
		System.out.println("No." + "\tNama Makanan" + "\tHarga");
		int no;
		for (no = 0; no < jumlahmakanan; no++) {
			System.out.println((no + 1) + "\t" + makanan[no][0] + "\t\t"
					+ makanan[no][1]);
		}
		System.out.println("List Minuman");
		System.out.println("************");
		System.out.println("No." + "\tNama Minuman" + "\tHarga");
		int nmr;
		for (nmr = 0; nmr < jumlahminuman; nmr++) {
			System.out.println((nmr + 1) + "\t" + minuman[nmr][0] + "\t\t"
					+ minuman[nmr][1]);
		}
		String banyakpesanmakanan;
		String banyakpesanminuman;
		String konfirmasi;
		int pesanmakanan;
		int pesanminuman;
		do {
			System.out.println("Nomor Pesan Makanan : ");
			pesanmakanan = scan.nextInt();
			System.out
					.println("Banyak " + makanan[pesanmakanan - 1][0] + " : ");
			banyakpesanmakanan = scan.next();
			System.out.println("Nomor Pesan Minuman : ");
			pesanminuman = scan.nextInt();
			System.out
					.println("Banyak " + minuman[pesanminuman - 1][0] + " : ");
			banyakpesanminuman = scan.next();

			String[][] listmenu = {
					{ makanan[pesanmakanan - 1][0], banyakpesanmakanan },
					{ minuman[pesanminuman - 1][0], banyakpesanminuman } };

			System.out.println("Konfirmasi : ");
			int nmr1;
			for (nmr1 = 0; nmr1 < 2; nmr1++) {
				System.out.println((nmr1 + 1) + "\t" + listmenu[nmr1][0]
						+ "\t\t" + listmenu[nmr1][1]);
			}

			System.out.println("Apakah Data Benar? <Y/N> : ");
			konfirmasi = scan.next();
		} while (konfirmasi.equals("n"));

		int totalbanyakpesananmakanan = Integer.parseInt(banyakpesanmakanan);
		int totalbanyakpesananminuman = Integer.parseInt(banyakpesanminuman);
		int totalhargamakanan = Integer.parseInt(makanan[pesanmakanan - 1][1]);
		int totalhargaminuman = Integer.parseInt(minuman[pesanminuman - 1][1]);
		int total = totalbanyakpesananmakanan * totalhargamakanan
				+ totalbanyakpesananminuman * totalhargaminuman;

		System.out.println("Total : " + total);
		System.out.println("Terima Kasih :>");
	}
}
