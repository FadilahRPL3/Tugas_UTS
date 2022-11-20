import java.util.ArrayList;

public class no1RandomArray {
    public static void main(String[]a){
        int [] data=new int[15];
        data[0]=45;
        data[1]=14;
        data[2]=55;
        data[3]=43;
        data[4]=12;
        data[5]=88;
        data[6]=72;
        data[7]=92;
        data[8]=33;
        data[9]=41;
        data[10]=21;
        data[11]=54;
        data[12]=83;
        data[13]=95;
        data[14]=78;
        ArrayList dataGanjil=new ArrayList<Integer>();
        ArrayList dataGenap=new ArrayList<Integer>();
        for (int i = 0; i <data.length ; i++) {
            if (data[i]%2==0){
                dataGenap.add(data[i]);
            }else {
                dataGanjil.add(data[i]);
            }
        }
            System.out.println("Data Ganjil");
        for (int i = 0; i < dataGanjil.size(); i++) {
            System.out.print(dataGanjil.get(i)+" ");
        }
            System.out.println("\nData Genap");
        for (int i = 0; i < dataGenap.size(); i++) {
            System.out.print(dataGenap.get(i)+" ");
        }
    }
}
