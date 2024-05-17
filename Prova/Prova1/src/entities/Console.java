package entities;

public class Console {
    // Atributos privados
    private String geracao;
    private String marca;

    // Construtor
    public Console(String geracao, String marca) {
        this.geracao = geracao;
        this.marca = marca;
    }

    // Getter para geracao
    public String getGeracao() {
        return geracao;
    }

    // Setter para geracao
    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para mostrar informações
    public void mostraInfo() {
        System.out.println("Informações do Console:");
        System.out.println("Geração: " + getGeracao());
        System.out.println("Marca: " + getMarca());
    }

    // Método para jogar
    public void jogar() {
        System.out.println("Ele está jogando o " + getMarca());
    }
}
