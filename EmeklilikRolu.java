// EmeklilikRolu.java
public class EmeklilikRolu {
    private int CalismaSuresi;
    private int SGK_GirisYil;
    private String Meslek;
    private String Cinsiyet;

    public EmeklilikRolu(int CalismaSuresi, int SGK_GirisYil, String Meslek, String Cinsiyet) {
        this.CalismaSuresi = CalismaSuresi;
        this.SGK_GirisYil = SGK_GirisYil;
        this.Meslek = Meslek;
        this.Cinsiyet = Cinsiyet;
    }

    public boolean emekliOlabilirMi() {
        if (Cinsiyet.equals("Kadin")) {
            if (Meslek.equals("4A")) {
                CalismaSuresi += CalismaSuresi * 0.15; // %15 artırım
            } else if (Meslek.equals("4B") || Meslek.equals("4C")) {
                // Doğrudan alınır, başka bir artırım yapmaya gerek yok
            }
            return CalismaSuresi > 5000 && SGK_GirisYil > 20;
        } else if (Cinsiyet.equals("Erkek")) {
            if (Meslek.equals("4A")) {
                CalismaSuresi += CalismaSuresi * 0.20; // %20 artırım
            } else if (Meslek.equals("4B") || Meslek.equals("4C")) {
                CalismaSuresi += CalismaSuresi * 0.07; // %7 artırım
            }
            return CalismaSuresi > 5500 && SGK_GirisYil > 25;
        }
        return false;
    }
}
