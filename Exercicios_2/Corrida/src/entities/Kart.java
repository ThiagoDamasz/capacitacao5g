package entities;

public class Kart {
    public String name;
    public Pilot pilot;

    public Engine engine;

    public Kart(String name, Pilot pilot, float maxSpeed, String power){
        this.name = name;
        this.pilot = pilot;
        this.engine = new Engine(power,maxSpeed);
    }

    public void pular() {
        System.out.println("O "+ this.name + "esta pulando...");
    }

    public void soltarTurbo() {
        System.out.println("O " + this.name + "ativou o Nitrox...");
    }

    public void fazerDrift() {
        System.out.println("O " + this.name + "Desliza na pista...");
    }
}
