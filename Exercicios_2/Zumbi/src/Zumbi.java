public class Zumbi {

    private String name = "Ricardo";
    private double heigth = 1.82;
    private String gender = "Male";

    public Zumbi(){
        this.name = name;
        this.heigth = heigth;
        this.gender = gender;
    }

    public String toString(){
        return "Oh meu Deus, o "
                + getName()
                + " está comendo o cérebro dele!!!";
    }

    public String getName() {
        return name;
    }


}
