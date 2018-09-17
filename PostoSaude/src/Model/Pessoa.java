package Model;

public class Pessoa {
    // FAZER HERANÇA COM CIDADAO
    private String nome, sexo, telefone, dataNasc;

    public Pessoa(String nome, String sexo, String telefone, String dataNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + ", dataNasc=" + dataNasc + '}';
    }

}
