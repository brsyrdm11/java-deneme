// UcretRolu.java
public class UcretRolu {
    private int primGunu;
    private double primTL;
    private String Meslek;

    public UcretRolu(int primGunu, double primTL, String Meslek) {
        this.primGunu = primGunu;
        this.primTL = primTL;
        this.Meslek = Meslek;
    }

    public void setMaas(int primGunu, double primTL) {
        this.primGunu = primGunu;
        this.primTL = primTL;
        // Maaş hesaplama logicini buraya ekleyebilirsiniz
    }

    public void setMaasIsci() {
        if (primGunu > 5000 && primGunu <= 7500) {
            primTL = 5500 + (primGunu * 0.11);
        } else if (primGunu > 7500 && primGunu <= 10000) {
            primTL = 6750 + (primGunu * 0.13);
        }
    }

    public void setMaasMemur() {
        if (primGunu > 5200 && primGunu <= 7800) {
            primTL = 7500 - (primGunu * 0.03);
        } else if (primGunu > 7800 && primGunu <= 10400) {
            primTL = 8300 - (primGunu * 0.06);
        }
    }

    public double getPrimTL() {
        return primTL;
    }
}
