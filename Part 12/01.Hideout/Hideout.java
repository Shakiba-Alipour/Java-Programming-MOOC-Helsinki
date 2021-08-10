/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class Hideout<T> {
 
    private T hide;
 
    public void putIntoHideout(T toHide) {
        this.hide = toHide;
    }
 
    public T takeFromHideout() {
        if (this.hide == null) {
            return null;
        }
        T take = this.hide;
        this.hide = null;
        return take;
    }
 
    public boolean isInHideout() {
        if (this.hide == null) {
            return false;
        }
        return true;
    }
}
 
