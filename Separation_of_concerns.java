

interface IPhone {
    void makePhoneCall(String number);
    void encryptOutgoingSound();
    void decipherIncomingSound();
}

interface ICamera {
    void takePhoto();
    void savePhoto();
    void cameraFlash();
}

class TraditionalPhone implements IPhone {
    
    public void makePhoneCall(String number) {
        System.out.println("[TraditionalPhone] Dialing " + number + "...");
    }

   
    public void encryptOutgoingSound() {
        System.out.println("[TraditionalPhone] Encrypting outgoing voice stream...");
    }

    
    public void decipherIncomingSound() {
        System.out.println("[TraditionalPhone] Deciphering incoming voice stream...");
    }
}

class FirstGenCamera implements ICamera {
    private boolean lastPhotoInMemory = false;

    
    public void takePhoto() {
        System.out.println("[FirstGenCamera] *click* Captured a photo.");
        lastPhotoInMemory = true;
    }

    
    public void savePhoto() {
        if (lastPhotoInMemory) {
            System.out.println("[FirstGenCamera] Saving photo to storage...");
            lastPhotoInMemory = false;
        } else {
            System.out.println("[FirstGenCamera] No new photo to save.");
        }
    }

    
    public void cameraFlash() {
        System.out.println("[FirstGenCamera] Flash fired 💡");
    }
}

class SmartPhone {
    private ICamera myCamera;
    private IPhone myPhone;

    SmartPhone(ICamera camera, IPhone phone) {
        this.myCamera = camera;
        this.myPhone = phone;
    }

    void call(String number) {
        myPhone.encryptOutgoingSound();
        myPhone.makePhoneCall(number);
        myPhone.decipherIncomingSound();
    }

    void snapAndSave() {
        myCamera.cameraFlash();
        myCamera.takePhoto();
        myCamera.savePhoto();
    }

    ICamera getCamera() { return myCamera; }
    IPhone getPhone() { return myPhone; }
}

public class Separation_of_concerns {
    public static void main(String[] args) {
        ICamera cam = new FirstGenCamera();
        IPhone ph = new TraditionalPhone();
        SmartPhone sp = new SmartPhone(cam, ph);

        System.out.println("== Phone Concern ==");
        sp.call("+92-300-1234567");

        System.out.println("\n== Camera Concern ==");
        sp.snapAndSave();

        System.out.println("\n== Direct Access to Concerns (optional) ==");
        sp.getCamera().takePhoto();
        sp.getCamera().savePhoto();
    }
}
