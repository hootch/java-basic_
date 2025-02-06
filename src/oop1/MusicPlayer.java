package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn = false;



    void on(){
        isOn = true;
        System.out.println("Start");
    }
    void off(){
        isOn = false;
        System.out.println("Stop");
    }
    void volumeUp(){
        volume++;
        System.out.println(volume);
    }
    void volumeDown(){
        volume--;
        System.out.println(volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("on , volume : " + volume);
        } else {
            System.out.println("off");
        }
    }
}
