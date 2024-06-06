package Equipamentos.Multifuncional;

import Equipamentos.Musica.ReprodutorMusical;
import Equipamentos.Navegador.NavegadorInternet;
import Equipamentos.Telefone.AparelhoTelefonico;

public class Multifuncional implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando 20Minutes - Veigh");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String select) {
        System.out.println("Selecionando " + select);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para a Gabrielle" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo minha namorada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina( String url) {
        System.out.println("Exibindo " + url);

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Abrindo uma nova aba");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Atualizando a página" );

    }
}
