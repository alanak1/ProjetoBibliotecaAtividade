package data;

import models.Ebook;
import models.VideoDigital;
import java.util.ArrayList;
import java.util.List;

public class DadosDoSistema {
    public static List<Ebook> criarEbooks() {
        List<Ebook> ebooks = new ArrayList<>();
        ebooks.add(new Ebook("A Ordem do Tempo", "Carlo Rovelli", "Explorando a natureza complexa do tempo, este livro de Carlo Rovelli desafia nossa percepção tradicional, apresentando conceitos físicos e filosóficos de forma acessível."));
        ebooks.add(new Ebook("A Realidade não é o que parece", "Carlo Rovelli", "Uma jornada fascinante para as profundezas da física teórica, explorando as estruturas fundamentais do universo."));
        ebooks.add(new Ebook("Psiconautas", "Marcelo Leite", "Um mergulho nas fronteiras da pesquisa psicodélica, combinando ciência, história e narrativas pessoais para explorar o potencial terapêutico dos psicodélicos."));
        return ebooks;
    }

    public static List<VideoDigital> criarVideos() {
        List<VideoDigital> videos = new ArrayList<>();
        videos.add(new VideoDigital("Time Does Not Exist", "Carlo Rovelli - TEDx", "Carlo Rovelli apresenta uma palestra envolvente sobre a natureza ilusória do tempo, baseado em suas pesquisas e livros sobre física quântica."));
        videos.add(new VideoDigital("Fallout: Explorando o Futuro Pós-Apocalíptico", "Isabela Boscov", "Análise da série 'Fallout', explorando as representações de um mundo pós-apocalíptico e as implicações sociais e éticas destas narrativas."));
        videos.add(new VideoDigital("Eu preferia estar morta?", "Maria Homem", "Uma exploração do impacto da tecnologia e da modernidade na saúde mental e na percepção de realidade."));
        return videos;
    }
}
