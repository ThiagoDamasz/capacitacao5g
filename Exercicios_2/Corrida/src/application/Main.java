package application;

import entities.Kart;
import entities.Pilot;

public class Main {
    public static void main(String[] args) {

        Pilot pilot1 = new Pilot("Rodrigo",true);
        Pilot pilot2 = new Pilot("Miguel",false);

        Kart kart1 = new Kart("Gol", pilot1, 260, "1000cc");
        Kart kart2 = new Kart("Uno com escada", pilot2, 9999999, "999999cc");

        pilot1.soltaSuperPoder();

        kart1.fazerDrift();
        kart2.pular();
        kart2.soltarTurbo();

        kart1.engine.mostraInfo();
        kart2.engine.mostraInfo();
    }
}