package lv.rvt;

public class Timer {
    private ClockHand secondssto;
    private ClockHand seconds;

public Timer(){
    this.secondssto = new ClockHand(100);
    this.seconds = new ClockHand(60);
}

public void advance(){
    this.secondssto.advance();
    if (this.secondssto.value() == 0) {
        this.seconds.advance();
    }
}
    public String toString() {
        return this.seconds +":"+ this.secondssto;
    }
}

