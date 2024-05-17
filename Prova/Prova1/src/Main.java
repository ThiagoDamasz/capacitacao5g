import entities.Console;
import entities.Notebook;
import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Console console = new Console("2 geracao", "Microsoft");
        Notebook notebook = new Notebook("6 Geração", "Samsung");

        Produto produto1 = new Produto(350.00, "Xbox 360", console, notebook);
        Produto produto2 = new Produto(1000.00, "Samsung Odyssey", console, notebook);

        console.mostraInfo();
        console.jogar();

        notebook.mostraInfo();
        notebook.instalarAplicativo();

        produto1.mostraInfo();
        produto2.mostraInfo();
    }
}
