//If we put default method in interface then we dont need to go and update the implementing class.
package Concepts;

public class DefaultMethods {
    public static void main(String[] args) {
        mySmartPhone nokia=new mySmartPhone();

        for(String items:nokia.availableNetworks())
        {
            System.out.println(items);
        }
    }
}

interface Camera{
    void takeSnap();
    default void recordVideo()
    {
        System.out.println("Recording video");
    }
}

interface Wifi{
    String[] availableNetworks();
    void connectNetwork();
}

class cellPhone{
    void CallNum(int number)
    {
        System.out.println("Calling "+number+"...");
    }
}

class mySmartPhone extends cellPhone implements Camera,Wifi{
    @Override
    public void takeSnap() {
        System.out.println("Capturing Snap");
    }

    @Override
    public String[] availableNetworks() {
        String[] networkList={"Network1","Network2","Network3"};
        return networkList;
    }

    @Override
    public void connectNetwork() {
        System.out.println("Connecting to Network1");
    }

    @Override
    void CallNum(int number) {
        super.CallNum(number);
    }
}