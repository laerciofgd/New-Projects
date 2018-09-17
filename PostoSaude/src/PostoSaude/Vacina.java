package PostoSaude;

public class Vacina {

    private int codVacina, periodicidade;
    private String tipoVacina, desc, observacao, dataVacina;

    public Vacina(int codVacina, int periodicidade, String tipoVacina, String desc, String observacao, String dataVacina) {
        this.codVacina = codVacina;
        this.periodicidade = periodicidade;
        this.tipoVacina = tipoVacina;
        this.desc = desc;
        this.observacao = observacao;
        this.dataVacina = dataVacina;
    }

    public int getCodVacina() {
        return codVacina;
    }

    public void setCodVacina(int codVacina) {
        this.codVacina = codVacina;
    }

    public int getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getTipoVacina() {
        return tipoVacina;
    }

    public void setTipoVacina(String tipoVacina) {
        this.tipoVacina = tipoVacina;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(String dataVacina) {
        this.dataVacina = dataVacina;
    }

    @Override
    public String toString() {
        return "Vacina{" + "codVacina=" + codVacina + ", periodicidade=" + periodicidade + ", tipoVacina=" + tipoVacina + ", desc=" + desc + ", observacao=" + observacao + ", dataVacina=" + dataVacina + '}';
    }

}
