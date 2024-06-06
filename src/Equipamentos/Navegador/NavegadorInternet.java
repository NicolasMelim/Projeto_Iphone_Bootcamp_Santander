package Equipamentos.Navegador;

import Equipamentos.Musica.ReprodutorMusical;

public  interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
