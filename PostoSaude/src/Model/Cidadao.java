package Model;

import Model.Endereco;
import Model.Vacina;
import java.util.ArrayList;
import java.util.HashMap;

public class Cidadao {

    private String nome, sexo, nacionalidade, dataNasc;
    private float peso, altura;
    private ArrayList<Endereco> enderecos;
    private HashMap<Integer, Vacina> vacinas;

    public Cidadao(String nome, String sexo, String nacionalidade, String dataNasc, float peso, float altura, ArrayList<Endereco> enderecos, HashMap<Integer, Vacina> vacinas) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.altura = altura;
        this.enderecos = enderecos;
        this.vacinas = vacinas;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public HashMap<Integer, Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(HashMap<Integer, Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Cidadao{" + "nome=" + nome + ", sexo=" + sexo + ", nacionalidade=" + nacionalidade + ", dataNasc=" + dataNasc + ", peso=" + peso + ", altura=" + altura + ", enderecos=" + enderecos + ", vacinas=" + vacinas + '}';
    }

    

}
