package src;

import models.Ebook;
import models.VideoDigital;
import data.DadosDoSistema;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Ebook> ebooks;
    private static List<VideoDigital> videos;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ebooks = DadosDoSistema.criarEbooks();
        videos = DadosDoSistema.criarVideos();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Visualizar Ebooks");
            System.out.println("2. Visualizar Vídeos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    visualizarEbooks();
                    break;
                case 2:
                    visualizarVideos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void visualizarEbooks() {
        if (ebooks.isEmpty()) {
            System.out.println("Não há ebooks cadastrados.");
            return;
        }
        System.out.println("\nLista de Ebooks:");
        for (int i = 0; i < ebooks.size(); i++) {
            System.out.println((i + 1) + ": " + ebooks.get(i).descricao());
        }
        System.out.print("Escolha um ebook para baixar (0 para voltar): ");
        int escolha = scanner.nextInt();
        if (escolha > 0 && escolha <= ebooks.size()) {
            ebooks.get(escolha - 1).baixar();
        }
    }

    private static void visualizarVideos() {
        if (videos.isEmpty()) {
            System.out.println("Não há vídeos cadastrados.");
            return;
        }
        System.out.println("\nLista de Vídeos:");
        for (int i = 0; i < videos.size(); i++) {
            System.out.println((i + 1) + ": " + videos.get(i).descricao());
        }
        System.out.print("Escolha um vídeo para baixar ou visualizar (0 para voltar): ");
        int escolha = scanner.nextInt();
        if (escolha > 0 && escolha <= videos.size()) {
            System.out.println("1. Baixar");
            System.out.println("2. Visualizar");
            System.out.print("Escolha uma opção: ");
            int acao = scanner.nextInt();
            if (acao == 1) {
                videos.get(escolha - 1).baixar();
            } else if (acao == 2) {
                videos.get(escolha - 1).visualizar();
            }
        }
    }
}
