import java.util.ArrayList;

public class Perpustakaan {
    String nomor;
    String judul;
    String author;
    String penerbit;
    String kategori;
    String Tahun;

    Perpustakaan(String nomor, String judul, String author, String penerbit, String kategori, String Tahun){
        this.nomor = nomor;
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.Tahun = Tahun;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Perpustakaan>> perpustakaankuLists = new ArrayList();

        ArrayList<Perpustakaan> katTeknik = new ArrayList<Perpustakaan>();
        katTeknik.add(new Perpustakaan("1) ", " Organisasi & Arsitektur komputer ", " Maman Abdurrohman ", " Informatika Bandung ", " Teknik ", " 2015"));
        katTeknik.add(new Perpustakaan("2) ", " Rekayasa Perangkat Lunak ", " B.Ladjamudin ", " Al Bahra ", " Teknik ", " 2006 "));
        katTeknik.add(new Perpustakaan("3) ", " Pengenalan Komputer ", " Jogiyanto Hartono ", " ANDI ", " Teknik ", " 2000 "));

        ArrayList<Perpustakaan> katManajemen = new ArrayList<Perpustakaan>();
        //katManajemen.add(new Perpustakaan("4)", "Emotional Quality Manajement", "Anthony Dio Martin", "ARGA", "Manajemen", "2003"));

        ArrayList<Perpustakaan> katFiksi = new ArrayList<Perpustakaan>();
        katFiksi.add(new Perpustakaan("4) ", " Saksi Mata ", " Seno Gumira Ajidarma ", " Areksa ", " Fiksi ", " 2003 "));
        katFiksi.add(new Perpustakaan("5) ", " Dallergut ", " Lee Miye ", " baca ", " Fiksi ", " 2020 "));

        ArrayList<Perpustakaan> katAgama = new ArrayList<Perpustakaan>();
        katAgama.add(new Perpustakaan("6) ", " Khotbah Jum'at Sepanjang Masa ", " Ust. Mohammad farhad ", " Amelia ", " Agama ", " 2005 "));
        
        System.out.println("====================================================================================================================");
        System.out.println("    Daftar Buku -Perpustakaan Jerry- ");
        System.out.println("====================================================================================================================");
        System.out.println("No  Judul       Author      Penerbit        Tahun       Kategori");
        System.out.println("====================================================================================================================");
        
        for(Perpustakaan item : katTeknik){
            System.out.println( item.nomor + item.judul + item.author + item.penerbit + item.Tahun + item.kategori);
        }

        for(Perpustakaan item : katFiksi){
            System.out.println(  item.nomor + item.judul + item.author + item.penerbit + item.Tahun + item.kategori);
        }

        for(Perpustakaan item : katAgama){
            System.out.println( item.nomor + item.judul + item.author + item.penerbit + item.Tahun + item.kategori);
        }

        System.out.println("====================================================================================================================");
        System.out.println("Jumlah Buku : " + perpustakaankuLists.size());
        System.out.println("Jumlah Buku Teknik : " + katTeknik.size());
        System.out.println("Jumlah Buku Manajemen : " + katManajemen.size());
        System.out.println("Jumlah Buku Fiksi : " + katFiksi.size());
        System.out.println("Jumlah Buku Agama : " + katAgama.size());
        

    }

}
