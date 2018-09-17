
package PostoSaude;

public class Vacinacao {
    
    private String local;
    private Vacina vacinas;

    public Vacinacao(String local, Vacina vacinas) {
        this.local = local;
        this.vacinas = vacinas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Vacina getVacinas() {
        return vacinas;
    }

    public void setVacinas(Vacina vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Vacinacao{" + "local=" + local + ", " + vacinas + '}';
    }

    
    
    
    
    
    
}
