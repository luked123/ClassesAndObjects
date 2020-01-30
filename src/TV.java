public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    /** Default constructor */
    public TV(){
    }

    /** Turn on the tv */
    public void turnOn(){
        on = true;
    }

    /** Turn off the tv */
    public void turnOff(){
        on = false;
    }

    /** Set the channel of tv */
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    /** Set the volume of tv */
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >=1 && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        }
    }

    /** Increase channel */
    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }

    /** Decrease channel */
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }

    /** Increase volume */
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }

    /** Decrease channel */
    public void volumeDown(){
        if(on && volumeLevel > 0){
            volumeLevel--;
        }
    }
}
