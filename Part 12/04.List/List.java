/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class List<Type> {
 
    private Type[] values;
    private int firstFreeIndex;
 
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
 
    public void add(Type value) {
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; // same as this.firstFreeIndex = this.firstFreeIndex + 1;
    }
 
    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
 
        return false;
    }
 
    public int size() {
        return this.firstFreeIndex;
    }
 
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
 
        return this.values[index];
    }
 
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }
 
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
 
    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
 
        return -1;
    }
 
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
 
}
 
