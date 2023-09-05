public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {
 
    public Triatleta(String nome) {
            super();
    }

    @Override
    public void correr() {
        System.out.println(getNome() + "correndo muito");
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + "pedalando muito");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + "nadando muito");
    }

    @Override
    public void aquecer() {
        System.out.println(getNome() + "aquecendo muito");
    }

    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta( "Kristian Blummerfelt");

        triatleta.aquecer();
        triatleta.correr();
        triatleta.nadar();
        triatleta.pedalar();
    }

}
