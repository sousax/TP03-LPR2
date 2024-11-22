//Aluno: Eduardo Miranda CB3026604
//Aluno: Cauã Barros - CB3025179 

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    static int kp;

    Pessoa(){
    kp++;
    }

    Pessoa(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        kp++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    static int getKp(){
        return kp;
    }




}
