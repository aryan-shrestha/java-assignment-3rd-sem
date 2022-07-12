package AL.Order;

import DBL.HandleFile;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aryan
 */
public class Order {

    private String fileUrl = "./src/saveData/orders.txt";

    public void create(String orderId, String customerName, String total,
            String payment, String status, DefaultTableModel table) {

        HandleFile file = new HandleFile(fileUrl);

        String data = orderId + "," + customerName + "," + total
                + "," + payment + "," + status + "\n";

        file.appendStrToFile(data);
        String arr[][] = file.readFile();
        file.populateTable(table, arr);
    }

    public void update(DefaultTableModel table) {

        HandleFile file = new HandleFile(this.fileUrl);

        file.deleteData();

        for (int i = 0; i < table.getRowCount(); i++) {
            String orderId = (String) table.getValueAt(i, 0);
            String customerName = (String) table.getValueAt(i, 1);
            String total = (String) table.getValueAt(i, 2);
            String payment = (String) table.getValueAt(i, 3);
            String status = (String) table.getValueAt(i, 4);
            
            String data = orderId + "," + customerName + "," + total
                + "," + payment + "," + status + "\n";
            file.appendStrToFile(data);
        }
        
        String arr[][] = file.readFile();
        file.populateTable(table, arr);
        
    }
    
    public void delete(DefaultTableModel table){
            this.update(table);
    }

}
