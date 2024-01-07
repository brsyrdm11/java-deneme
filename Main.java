// Main.java
public class Main {
    public static void main(String[] args) {
        // EmeklilikRolu sınıfının kullanımı
        EmeklilikRolu emeklilikRolu = new EmeklilikRolu(5000, 21, "4A", "Kadin");
        System.out.println("Emeklilik Rolu: " + emeklilikRolu.emekliOlabilirMi());

        // UcretRolu sınıfının kullanımı
        UcretRolu ucretRolu = new UcretRolu(7000, 0.0, "4A");
        ucretRolu.setMaasIsci();
        System.out.println("Ucret Rolu: " + ucretRolu.getPrimTL());

        // EYTSinifi sınıfının kullanımı
        EYTSinifi eytSinifi = new EYTSinifi();
        eytSinifi.kurucuOverloading();
        eytSinifi.kurucuOverloading("Özel mesaj");
    }
}
