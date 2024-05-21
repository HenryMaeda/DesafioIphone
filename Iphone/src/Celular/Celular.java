package Celular;

import funcoes.AparelhoTelefonico.Aparelho;
import funcoes.NavegadorInternet.Navegador;
import funcoes.ReprodutorMusical.ReprodutorMusical;

public class Celular implements Navegador, Aparelho, ReprodutorMusical {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public static void main(String[] args) {
        Celular iphone = new Celular();
        iphone.atender();
        iphone.ligar("99938");
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Borboletas - Victor e Leo");
        iphone.exibirPagina("google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
