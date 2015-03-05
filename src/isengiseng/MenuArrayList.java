package src.isengiseng;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuArrayList {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Selamat Datang di Aplikasi Buku Telepon\n");
		System.out.println("Masukkan jumlah pelanggan : ");
		int jumlahpelanggan = scan.nextInt();
		ArrayList<ArrayList<String>> daftarphonebook = new ArrayList<ArrayList<String>>();
		String nama;
		String telepon;
		String alamat;
		int a;
		int b;
		for (a = 0; a < jumlahpelanggan; a++) {
			ArrayList<String> daftarphonebook1 = new ArrayList<String>();
			daftarphonebook.add(daftarphonebook1);
			System.out.println("Masukkan Nama Pelanggan ke " + (a + 1) + ": ");
			daftarphonebook1.add(scan.next());
			System.out.println("Nomor Telepon " + daftarphonebook1.get(0)
					+ ": ");
			daftarphonebook1.add(scan.next());
			System.out.println("Alamat " + daftarphonebook1.get(0) + ": ");
			daftarphonebook1.add(scan.next());
		}
		System.out.println("\nDaftar Nama Pelanggan\n");
		System.out.println("No." + "\tNama" + "\t\tNo.Telepon");
		int no;
		for (no = 0; no < jumlahpelanggan; no++) {
			System.out.println((no + 1) + "\t" + daftarphonebook.get(no).get(0)
					+ "\t\t" + daftarphonebook.get(no).get(1));
		}

		int pilihan;
		String inputNama;
		String inputTelepon;
		String inputAlamat;
		String yn;
		do {
			System.out.println("Pencarian Berdasarkan : ");
			System.out.println("1. Nama");
			System.out.println("2. Telepon");
			System.out.println("3. Alamat\n");
			System.out.println("Pilihan Anda : ");
			pilihan = scan.nextInt();

			switch (pilihan) {
			case 1: {
				System.out.println("Pencarian Pelanggan Berdasarkan Nama");
				System.out.println("Masukkan Nama yang mau dicari : ");
				inputNama = scan.next();
				System.out.println("Hasil Pencarian : ");
				for (a = 0; a < jumlahpelanggan; a++) {
					if (inputNama.equals(daftarphonebook.get(a).get(0))) {
						System.out.println((a + 1) + "\t"
								+ daftarphonebook.get(a).get(0) + "\t"
								+ daftarphonebook.get(a).get(1) + "\t"
								+ daftarphonebook.get(a).get(2));
					}
				}
			}

				break;

			case 2: {
				System.out.println("Pencarian Pelanggan Berdasarkan Telepon");
				System.out.println("Masukkan Nomor Telepon yang mau dicari : ");
				inputTelepon = scan.next();
				System.out.println("Hasil Pencarian : ");
				for (a = 0; a < jumlahpelanggan; a++) {
					if (inputTelepon.equals(daftarphonebook.get(a).get(1))) {
						System.out.println((a + 1) + "\t"
								+ daftarphonebook.get(a).get(0) + "\t"
								+ daftarphonebook.get(a).get(1) + "\t"
								+ daftarphonebook.get(a).get(2));
					}
				}
			}

				break;

			case 3: {
				System.out.println("Pencarian Pelanggan Berdasarkan Alamat");
				System.out.println("Masukkan Alamat yang mau dicari : ");
				inputAlamat = scan.next();
				System.out.println("Hasil Pencarian : ");
				for (a = 0; a < jumlahpelanggan; a++) {
					if (inputAlamat.equals(daftarphonebook.get(a).get(2))) {
						System.out.println((a + 1) + "\t"
								+ daftarphonebook.get(a).get(0) + "\t"
								+ daftarphonebook.get(a).get(1) + "\t"
								+ daftarphonebook.get(a).get(2));
					}
				}
			}

				break;
			default:
				break;
			}
			System.out.println("Ulang Pencarian? <y/n>");
			yn = scan.next();
		} while (yn.equals("y"));
		System.out.println("\nTERIMA KASIH :>");
	}
}
