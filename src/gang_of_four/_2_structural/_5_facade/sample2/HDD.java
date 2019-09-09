package structural.facade.sample2;

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
