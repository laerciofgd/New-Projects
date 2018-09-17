package PostoSaude;

public class Endereco {

    private String UF, cidade, bairro, rua;
    private int numResid;

    public Endereco(String UF, String cidade, String bairro, String rua, int numResid) {
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numResid = numResid;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumResid() {
        return numResid;
    }

    public void setNumResid(int numResid) {
        this.numResid = numResid;
    }

    @Override
    public String toString() {
        return "Endereco{" + "UF=" + UF + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numResid=" + numResid + '}';
    }

}
