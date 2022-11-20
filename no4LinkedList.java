import java.util.LinkedList;
import java.util.Scanner;

public class no4LinkedList {
    public static void main(String[]a){
        LinkedList data=new LinkedList<Mahasiswa>();
        Scanner data2=new Scanner(System.in);
        Scanner data3=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("INPUT DATA MAHASISWA");
            System.out.print("Masukan Id:");
            int inputid = data2.nextInt();

            System.out.print("Masukan Nama:");
            String inputNama = data3.nextLine();

            System.out.print("Masukan Kelas:");
            String inputKelas = data3.nextLine();

            System.out.print("Masukan Tanggal Masuk:");
            int inputTglMasuk = data2.nextInt();

            data.add(new Mahasiswa(inputid, inputNama, inputKelas, inputTglMasuk));
            System.out.println(data.get(i));
            System.out.println("=====================");
        }
        System.out.println("Data Linkdlist Saat Ini : ");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

        //hapus data mahasiswa pada kinlist
        data.remove(0);
        System.out.println("Hasil Data Setelah di hapus");
        //print data didalam link lsist
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
            data.get(i);
        }
    }
}
