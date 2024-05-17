package entities;

public class Notebook {
    // Atributos privados
    private String processador;
    private String memoria;

    // Construtor
    public Notebook(String processador, String memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    // Getter para processador
    public String getProcessador() {
        return processador;
    }

    // Setter para processador
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    // Getter para memoria
    public String getMemoria() {
        return memoria;
    }

    // Setter para memoria
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    // Método para mostrar informações
    public void mostraInfo() {
        System.out.println("Informações do Notebook:");
        System.out.println("Processador: " + getProcessador());
        System.out.println("Memoria: " + getMemoria());
    }

    // Método para instalar aplicativo
    public void instalarAplicativo() {
        System.out.println("Ele está instalando um aplicativo no notebook");
    }
}
