package entities;

public class Produto {
    // Atributos privados
    private double preco;
    private String nome;
    private Console console;
    private Notebook notebook;

    // Construtor
    public Produto(double preco, String nome, Console console, Notebook notebook) {
        this.preco = preco;
        this.nome = nome;
        this.console = console;
        this.notebook = notebook;
    }

    // Getter para preco
    public double getPreco() {
        return preco;
    }

    // Setter para preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para console
    public Console getConsole() {
        return console;
    }

    // Setter para console
    public void setConsole(Console console) {
        this.console = console;
    }

    // Getter para notebook
    public Notebook getNotebook() {
        return notebook;
    }

    // Setter para notebook
    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    // Método para mostrar informações
    public void mostraInfo() {
        System.out.println("Informações do Produto: ");
        System.out.println("Preço: " + getPreco());
        System.out.println("Nome: " + getNome());
        if (console != null) {
            System.out.println("Informações do Console:");
            console.mostraInfo();
        }
        if (notebook != null) {
            System.out.println("Informações do Notebook:");
            notebook.mostraInfo();
        }
    }
}
