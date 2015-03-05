package PhoneBook;

import java.util.Scanner;

public class PhoneBookClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Selamat Datang di Aplikasi Buku Telepon\n");
		System.out.println("Masukkan jumlah pelanggan : ");
		int jumlahPelanggan = scan.nextInt();

		String[][] daftarPhonebook = new String[jumlahPelanggan][3];
		String nama;
		String telepon;
		String alamat;

		for (int counterPelanggan = 0; counterPelanggan < jumlahPelanggan; counterPelanggan++) {
			System.out.println("Masukkan Nama Pelanggan ke "
					+ (counterPelanggan + 1) + ": ");
			nama = scan.next();
			daftarPhonebook[counterPelanggan][0] = nama;
			System.out.println("Nomor Telepon " + nama + ": ");
			telepon = scan.next();
			daftarPhonebook[counterPelanggan][1] = telepon;
			System.out.println("Alamat " + nama + ": ");
			alamat = scan.next();
			daftarPhonebook[counterPelanggan][2] = alamat;
		}
		System.out.println("\nDaftar Nama Pelanggan\n");
		System.out.println("No." + "\tNama" + "\t\tNo.Telepon");

		for (int no = 0; no < jumlahPelanggan; no++) {
			System.out.println((no + 1) + "\t" + daftarPhonebook[no][0]
					+ "\t\t" + daftarPhonebook[no][1]);
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
				for (int jumlahCounterPelanggan = 0; jumlahCounterPelanggan < jumlahPelanggan; jumlahCounterPelanggan++) {
					if (inputNama
							.equals(daftarPhonebook[jumlahCounterPelanggan][0])) {
						System.out.println((jumlahCounterPelanggan + 1) + "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][0]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][1]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][2]);
					}
				}
			}

				break;
			case 2: {
				System.out.println("Pencarian Pelanggan Berdasarkan Telepon");
				System.out.println("Masukkan Nomor Telepon yang mau dicari : ");
				inputTelepon = scan.next();
				System.out.println("Hasil Pencarian : ");
				for (int jumlahCounterPelanggan = 0; jumlahCounterPelanggan < jumlahPelanggan; jumlahCounterPelanggan++) {
					if (inputTelepon
							.equals(daftarPhonebook[jumlahCounterPelanggan][1])) {
						System.out.println((jumlahCounterPelanggan + 1) + "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][0]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][1]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][2]);
					}
				}
			}
				break;

			case 3: {
				System.out.println("Pencarian Pelanggan Berdasarkan Alamat");
				System.out.println("Masukkan Alamat yang mau dicari : ");
				inputAlamat = scan.next();
				System.out.println("Hasil Pencarian : ");
				for (int jumlahCounterPelanggan = 0; jumlahCounterPelanggan < jumlahPelanggan; jumlahCounterPelanggan++) {
					if (inputAlamat
							.equals(daftarPhonebook[jumlahCounterPelanggan][2])) {
						System.out.println((jumlahCounterPelanggan + 1) + "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][0]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][1]
								+ "\t"
								+ daftarPhonebook[jumlahCounterPelanggan][2]);
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
		System.out.println("\n TERIMA KASIH :>");
	}
}
