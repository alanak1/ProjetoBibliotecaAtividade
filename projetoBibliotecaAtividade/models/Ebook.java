package models;
import interfaces.Baixavel;

/**
 * Classe que representa um Ebook, implementando a interface Baixavel.
 */
public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private String descricaoAdicional;

    public Ebook(String titulo, String autor, String descricaoAdicional) {
        super(titulo, autor);
        this.descricaoAdicional = descricaoAdicional;
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + ", do autor " + getAutor() + ", " + descricaoAdicional;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
    }
}
