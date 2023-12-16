import java.util.Scanner;
public class kalkulatorSederhana {
        public static void main(String[] args) throws Exception {
            Scanner masukan = new Scanner(System.in);
            int angkaPertama, angkaKedua, hasil = 0;
            String operasi;
            System.out.println("Operasi Matematika");
            System.out.println("- penjumlahan (+)");
            System.out.println("- pengurangan (-)");
            System.out.println("- perkalian(*)");
            System.out.println("- pembagian(/)");
            System.out.println("- modulus (%)");
            System.out.println("====================");

            System.out.print("Angka Pertama: ");
            angkaPertama = masukan.nextInt();
            System.out.print("Angka Kedua: ");
            angkaKedua = masukan.nextInt();
            System.out.println("==============================");

            System.out.print("Masukan simbol operasi: ");
            operasi = masukan.next();
            System.out.println("==============================");

            switch (operasi)
            {
                case "+" : hasil = angkaPertama + angkaKedua; break;
                case "-" : hasil = angkaPertama - angkaKedua; break;
                case "/" : hasil = angkaPertama / angkaKedua; break;
                case "*" : hasil = angkaPertama * angkaKedua; break;
                case "%" : hasil = angkaPertama % angkaKedua; break;
                default : System.out.println("Harap periksa inputan ");
            }
            System.out.println("Hasil: " + hasil);
        }
    }

