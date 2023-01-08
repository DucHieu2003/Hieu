package BridgePseudocode;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    public boolean isEnable() {
        return on;
    }
    public void enable() {
        on = true;
    }
    public void disable() {
        on = false;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
