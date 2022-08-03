public class Aluno {

    private String nome;
    private int CPF;
    private String email;
    private int turmaAno;
    private String materia;

    public int getCPF(){
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
}


