public class SmarTv {
    private boolean power = false;
    private int volume = 25;
    private int channel = 55;

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    public boolean getPower() {
        return power;
    }

    public void changePower() {
        setPower(!power);
    }
    public void minusVolume() {
        if(volume - 1 < 0){
            setVolume(0);
        } else {
            setVolume(--volume);
        }
    }
    public void plusVolume() {
        if(volume + 1 > 100){
            setVolume(100);;
        } else {
            setVolume(++volume);
        }
    }
    public void changeChannel(int value) {
        setChannel(value);
    }
    public void minusChannel() {
        if(channel - 1 < 0){
            setChannel(0);
        } else {
            setChannel(--channel);
        }
    }
    public void plusChannel() {
        if(channel + 1 > 999){
            setChannel(1);
        } else {
            setChannel(++channel);
        }
    }
}
