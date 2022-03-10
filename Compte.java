public class Compte {
    public int num;
    public String nom;
    public int solde;
    public Compte() {}
    public Compte(int num, String nom, int solde) {
    this.num = num; this.nom = nom; this.solde = solde;
    }
    public String toString() {
    return "Compte [num="+num+", nom="+nom+", solde="+solde+"]";
    }
    // setters and getters
}