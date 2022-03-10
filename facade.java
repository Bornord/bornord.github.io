public class Facade {
    private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();
    public void addCompte(Compte c) {
    comptes.put(c.getNum(), c);
    }
    public Collection<Compte> consulterComptes() {
    return comptes.values();
    }
    public Compte consulterCompte(int num) throws RuntimeException {
    Compte c = comptes.get(num);
    if (c == null) throw new RuntimeException("Compte introuvable");
    return c;
    }

    public void debit(int num, int montant) throws RuntimeException {
        Compte c = consulterCompte(num);
        if (c.getSolde()<montant) throw new RuntimeException("Solde insuffisant");
        c.setSolde(c.getSolde()-montant);
        }
        public void credit(int num, int montant) {
        Compte c = consulterCompte(num);
        c.setSolde(c.getSolde()+montant);
        }
        public Facade() {
        addCompte(new Compte(1, "dan", 2000));
        addCompte(new Compte(2, "alain", 4000));
        addCompte(new Compte(3, "luc", 6000));
        }
       }