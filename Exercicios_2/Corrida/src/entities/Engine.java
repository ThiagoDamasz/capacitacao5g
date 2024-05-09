package entities;

public class Engine {

    public String power;
    public float maxSpeed;

    public Engine(String power, float maxSpeed) {
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public void mostraInfo(){
        System.out.println("Poder: ");
        System.out.println("Velocidade máxima: ");
    }
}
