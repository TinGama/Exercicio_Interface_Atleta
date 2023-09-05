public class Pessoa {
    private String nome;

    public String getNome() {
            return nome;
    }

    public void setNome(String nome){
       this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kristian Blummenfelt");
        System.out.println("Nome: " + pessoa.getNome());
    }
}
