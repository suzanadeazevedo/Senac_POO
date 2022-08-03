public class Faculdade {
    public static void main(String[] args) {

        Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

    Aluno n1 = new Aluno();

    n1.setNome("Yoshi");
    n1.setCPF(369963369);
    n1.setEmail("yoshi@senac.com.br");

    System.out.println("CPF inserido: " + n1.getCPF() );
    System.out.println("Nome cadastrado: "+ n1.getNome());
    System.out.println("E-mail cadastrado: " + n1.getEmail());


    Professor p1 = new Professor();

    p1.setNome("Mario Bros");
    p1.setCPF(963699963);

    System.out.println("Nome cadastrado: "+ p1.getNome());
    System.out.println("CPF inserido: " + n1.getCPF() );




    }
}
