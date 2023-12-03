import java.util.Scanner;

interface Camera {
    void snap();
    void recordVideo();
}

interface ConnectWifi {
    void showAvailableNetworks();
    void connectToWifiFromAvailableNetworks(String network);
}

class Cellphone {
    String getImeiNumber(int imei) {
        return String.valueOf(imei);
    }

    String getModelName(String model) {
        return model;
    }

    void callByImeiNumber(String imei) {
        System.out.println("Called to IMEI " + imei);
    }
}

class Smartphone implements Camera, ConnectWifi {
    public void snap() {
        System.out.println("Picture clicked");
    }

    public void recordVideo() {
        System.out.println("Video Taken");
    }

    public void showAvailableNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Jio4G", "STUDENTS-N", "FACULTY-N"};
        for (String network : networkList) {
            System.out.println(network);
        }
    }

    public void connectToWifiFromAvailableNetworks(String network) {
        String[] networkList = {"Jio4G", "STUDENTS-N", "FACULTY-N"};
        if (isNetworkAvailable(network, networkList)) {
            System.out.println("Connected to Network: " + network);
        } else {
            System.out.println(network + " not available");
        }
    }

    private boolean isNetworkAvailable(String network, String[] networkList) {
        for (String availableNetwork : networkList) {
            if (availableNetwork.equals(network)) {
                return true;
            }
        }
        return false;
    }
   public static void main(String[] args) {
    Smartphone smartphone = new Smartphone();
    Scanner scanner = new Scanner(System.in);

    // Test the Camera interface methods
    smartphone.snap();
    smartphone.recordVideo();

    // Test the ConnectWifi interface methods
    smartphone.showAvailableNetworks();
    
    System.out.println("Enter the network name to connect:");
    String network = scanner.nextLine();
    smartphone.connectToWifiFromAvailableNetworks(network);
}
}
