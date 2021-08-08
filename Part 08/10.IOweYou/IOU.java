
import java.util.HashMap;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class IOU {
 
    private HashMap<String, Double> iou;
 
    public IOU() {
        this.iou = new HashMap<>();
    }
 
    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }
 
    public double howMuchDoIOweTo(String toWhom) {
        if (!this.iou.containsKey(toWhom)) {
            return 0.0;
        }
        return this.iou.get(toWhom);
    }
}
 
