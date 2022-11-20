import java.util.Scanner;
public class no2SortingData {
    public static void main(String[] args) {
        int []dataAbsen=new int[10];
        int []dataAbsenGenap;
        int []dataAbsenGanjil;

        int pilihan, dataGanjil, dataGenap, indek1;
        Scanner input=new Scanner(System.in);
        System.out.println("PROGRAM SORTING DATA");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < dataAbsen.length; i++) {
            //input elemen array dengan scanner
            System.out.print("Masukan element ke "+(i+1)+" :");
            pilihan=input.nextInt();
            dataAbsen[i]=pilihan;

        }
        //Ini Sorting ganjil
        dataGanjil=0;
        System.out.println("Absen Ganjil");
        for (int i = 0; i < dataAbsen.length; i++) {
            if (dataAbsen[i]%2!=0){
                System.out.print(dataAbsen[i]+" ");
                dataGanjil++;
            }
        }
        //salinan ganjil
        dataAbsenGanjil=new int[(dataGanjil)];
        indek1=0;
        for (int i = 0; i < dataAbsen.length; i++) {
            if (dataAbsen[i]%2!=0){
                dataAbsenGanjil[indek1]=dataAbsen[i];
                indek1++;
            }
        }

        //Ini sorting genap
        dataGenap=0;
        System.out.println("\nAbsen Genap");
        for (int i = 0; i < dataAbsen.length; i++) {
            if (dataAbsen[i]%2==0) {
                System.out.print(dataAbsen[i] + " ");
                dataGenap++;
            }
        }
        dataAbsenGenap=new int[dataGenap];
        indek1=0;
        for (int i = 0; i < dataAbsen.length; i++) {
            if (dataAbsen[i] % 2 == 0){
                dataAbsenGenap[indek1] = dataAbsen[i];
                indek1++;
            }

        }

        //lakukan shorting ganjil genap
        //ganjiul
        for (int i = 0; i < (dataAbsenGanjil.length); i++) {
            for (int j = 0; j < (dataAbsenGanjil.length-1); j++) {
                if (dataAbsenGanjil[j]>dataAbsenGanjil[j+1]){
                    int temp=dataAbsenGanjil[j];
                    dataAbsenGanjil[j]=dataAbsenGanjil[(j+1)];
                    dataAbsenGanjil[(j+1)]=temp;
                }
            }
        }
        System.out.println("\n\nSort Absen Ganjil");
        for (int i = 0; i < dataAbsenGanjil.length; i++) {
            System.out.print(dataAbsenGanjil[i] + " ");
        }

        //genap
        for (int i = 0; i < (dataAbsenGenap.length); i++) {
            for (int j = 0; j < (dataAbsenGenap.length-1); j++) {
                if (dataAbsenGenap[j]>dataAbsenGenap[j+1]){
                    int temp=dataAbsenGenap[j];
                    dataAbsenGenap[j]=dataAbsenGenap[(j+1)];
                    dataAbsenGenap[(j+1)]=temp;
                }
            }
        }
        System.out.println("\nSort Absen Genap");
        for (int i = 0; i < dataAbsenGenap.length; i++) {
            System.out.print(dataAbsenGenap[i] + " ");
        }

    }
}