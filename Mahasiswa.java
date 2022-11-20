public class Mahasiswa {

   private int id;
   String nama;
   String kelas;
   int tglmasuk;

   public Mahasiswa() {

   }

   public Mahasiswa(int id, String nama, String kelas, int tglmasuk) {
      this.id = id;
      this.nama = nama;
      this.kelas = kelas;
      this.tglmasuk = tglmasuk;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getKelas() {
      return kelas;
   }

   public void setKelas(String kelas) {
      this.kelas = kelas;
   }

   public int getTglmasuk() {
      return tglmasuk;
   }

   public void setTglmasuk(int tglmasuk) {
      this.tglmasuk = tglmasuk;
   }

   @Override
   public String toString() {
      return "Mahasiswa{" +
              "id=" + id +
              ", nama='" + nama + '\'' +
              ", kelas='" + kelas + '\'' +
              ", tglmasuk=" + tglmasuk +
              '}';
   }
}
