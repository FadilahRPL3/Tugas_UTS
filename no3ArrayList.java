import java.util.ArrayList;

public class no3ArrayList {
    public static void main (String[]a){
        ArrayList data=new ArrayList<Mahasiswa>();
        data.add(new Mahasiswa(1,"Bobi","X",12));
        data.add(new Mahasiswa(2,"Boy","XI",12));
        data.add(new Mahasiswa(3,"Cristi","X",14));
        data.add(new Mahasiswa(4,"Anya","XII",12));
        data.add(new Mahasiswa(5,"Lolita","X",14));

        //ini print all
        System.out.println("Print all");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        //ini remove dan hasil remove
        System.out.println("Hasil setelah di remove");
        data.remove(0);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        //ini add data
        data.add(new Mahasiswa(7,"Angela","XII",14));
        System.out.println("Hasil setelah di tambahkan");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        //ini menghitung size
        System.out.println("Size dari data Arraylist: "+data.size() );
    }


}
