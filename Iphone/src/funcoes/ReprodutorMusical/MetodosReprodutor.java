package funcoes.ReprodutorMusical;

public class MetodosReprodutor implements ReprodutorMusical {
    public void tocar () {
        System.out.println("Musica tocando");
    }
    public void pausar ( ) {
        System.out.println("Musica pausada");
    }
    public void selecionarMusica ( String Musica ) {
        System.out.println("Musica tocando: " + Musica ); 
    }
}
