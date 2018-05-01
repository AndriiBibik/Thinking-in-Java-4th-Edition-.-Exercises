package chapter8_ex16;

public class SpaceShip {
    Alert alert = new AlertSTOP();
    public void changeAlert() {
        if (alert instanceof AlertSTOP)
            alert = new AlertWait();
        else if(alert instanceof AlertWait)
            alert = new AlertOK();
    }
    public void displayAlert() {
        alert.alert();
    }
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.displayAlert();
        spaceShip.changeAlert();
        spaceShip.displayAlert();
        spaceShip.changeAlert();
        spaceShip.displayAlert();
    }
    
}
