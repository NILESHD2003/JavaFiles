package Concepts;

public class Polymorphism {
    public static void main(String[] args) {
        Camera obj=new SmartPhone2();//This means only obj can access camera class i.e. that obj can implement only the
        // methods of interface camera
        obj.recordVideo();
        obj.takeSnap();
    }
}

class SmartPhone2 implements Wifi,Camera{

    @Override
    public void takeSnap() {
        System.out.println("Saving Snap...");
    }

    @Override
    public String[] availableNetworks() {
        return new String[0];
    }

    @Override
    public void connectNetwork() {
        System.out.println("Connecting Network...");
    }
}
