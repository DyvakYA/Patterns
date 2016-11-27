package facade;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class FacadeOne {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.copy();

    }
}

class Computer{
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}

class Power{
    void on(){
        System.out.println("On");
    }

    void off(){
        System.out.println("Off");
    }
}

class DVDRom{
    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Copy");
        }
        else{
            System.out.println("input disk");
        }
    }
}

