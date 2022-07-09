package AL.Order;

import DBL.HandleFile;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aryan
 */
public class Order {

    private String orderId, customerName, total, payment, status;
    
    private String fileUrl = "./src/saveData/orders.txt";
        
    public Order(String orderId, String customerName, String total,
            String payment, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.total = total;
        this.payment = payment;
        this.status = status;
    }
    
    public void addOrder() {
        
        HandleFile file = new HandleFile(fileUrl);
        
        String data = this.orderId + "," + this.customerName + "," + this.total 
                + "," + this.payment + "," + this.status + "\n";
        
        file.appendStrToFile(data);        
    }
    
}
