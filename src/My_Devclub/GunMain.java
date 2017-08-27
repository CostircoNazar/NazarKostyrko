package My_Devclub;

public class GunMain {
    public static void main(String[] args) throws OutOfRoundsExeption, NotReadyExeption {
        Gun gun = new Gun("Beretta", 8);
        gun.reload();
        gun.prepare();
        gun.shoot();

        System.out.println("Amount of bullets left :" + gun.getAmount());
        System.out.println("I have done :" + gun.getTotalShots() + " shots");
    }
}

