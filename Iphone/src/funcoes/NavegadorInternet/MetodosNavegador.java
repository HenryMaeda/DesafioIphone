package funcoes.NavegadorInternet;

public class MetodosNavegador implements Navegador {
    
    public void exibirPagina (String url ) {
        System.out.println("Url da pagina: " + url );
    } 
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

}
