package entities;

public class Pilot {
    public String name;

    public boolean vilan;

    public Pilot(String name, boolean vilan){
        this.name = name;
        this.vilan = vilan;
    }

    public void soltaSuperPoder(){
        System.out.println("Esta soltando super poder");
    }

}
