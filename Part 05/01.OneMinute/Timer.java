/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class Timer {
 
    private ClockHand hun;
    private ClockHand sec;
 
    public Timer() {
        this.hun = new ClockHand(60);
        this.sec = new ClockHand(100);
    }
 
    public void advance() {
        this.sec.advance();
        if (this.sec.value() == 0) {
            this.hun.advance();
        }
    }
 
    public String toString() {
        return this.hun + ":" + this.sec;
    }
}
 
