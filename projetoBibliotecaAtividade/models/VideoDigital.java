package models;
import interfaces.Baixavel;
import interfaces.Visualizavel;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private String descricaoAdicional;

    public VideoDigital(String titulo, String autor, String descricaoAdicional) {
        super(titulo, autor);
        this.descricaoAdicional = descricaoAdicional;
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + ", do autor " + getAutor() + ", " + descricaoAdicional;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando vídeo: " + getTitulo());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando vídeo: " + getTitulo());
    }
}
