package Equipamentos;

import Equipamentos.Multifuncional.Multifuncional;

public class Iphone {
    public static void main(String[] args) {
        Multifuncional mul = new Multifuncional();
        mul.tocarMusica();
        mul.pausar();
        mul.selecionarMusica(" Invísivel pt.2 - Veigh");

        mul.ligar(" (11) 93952-1611");
        mul.atender();
        mul.iniciarCorreioVoz();

        mul.exibirPagina(" https://www.bet365.com/hub/pt-br/");
        mul.adicionarNovaAba();
        mul.atualizarPagina();
    }
}
