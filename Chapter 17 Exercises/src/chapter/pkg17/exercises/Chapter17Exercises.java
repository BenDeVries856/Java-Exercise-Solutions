/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg17.exercises;

import java.awt.Component;
import java.awt.GridLayout;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ben_d
 */
public class Chapter17Exercises {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/coffee";
    private static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection conn = DriverManager.getConnection(DB_URL, "root", "317793008");
            //exerciseOne(conn);
            //exerciseTwo(conn);
            //exerciseThree(conn);
            //exerciseFour(conn);
            //exerciseFive(conn);
            //exerciseSix(conn);
            //exerciseSeven(conn);
            //exerciseEight(conn);
            exerciseNine(conn);
            conn.close();
        }catch(Exception e){
            System.out.println("Error! " + e.getMessage());
        }
    }
    
    public static void exerciseOne(Connection conn) throws SQLException{
        String custno, name, address, city, state, zip;
        System.out.println("Enter a Customer Number:");
        custno = s.nextLine();
        System.out.println("Enter the Customers Name:");
        name = s.nextLine();
        System.out.println("Enter the Customers Address:");
        address = s.nextLine();
        System.out.println("Enter the Customers City:");
        city = s.nextLine();
        System.out.println("Enter the Customers State:");
        state = s.nextLine();
        System.out.println("Enter the Customers ZIP:");
        zip = s.nextLine();
        String insert = "INSERT INTO customer VALUES ('" + custno + 
                "', '" + name +  "', '" + address + "', '" + city + 
                "', '" + state + "', '" + zip + "')";
        Statement stmt = conn.createStatement();
        int rows = stmt.executeUpdate(insert);
        System.out.println(rows + " rows affected");
    }
    
    public static void exerciseTwo(Connection conn) throws SQLException{
        String name, selection, change;
        String query = "SELECT * FROM customer";
        Statement select = conn.createStatement();
        ResultSet result = select.executeQuery(query);
        ResultSetMetaData meta = result.getMetaData();
        int columns = meta.getColumnCount();
        System.out.println("Which customer would you like to edit:");
        while(result.next()){
            System.out.println(result.getString("Name"));
        }
        name = s.nextLine();
        System.out.println("What do you want to change:");
        for(int i = 1; i <= columns; i++){
            System.out.println(meta.getColumnName(i));
        }
        selection = s.nextLine();
        System.out.println("What do you want to change it to");
        change = s.nextLine();
        query = "UPDATE customer SET " + selection + " = '" + change + "' " +
                "WHERE Name = '" + name + "'";
        Statement update = conn.createStatement();
        int rows = update.executeUpdate(query);
        System.out.println(rows + " rows changed");
    }
    
    public static void exerciseThree(Connection conn) throws SQLException{
        double total = 0;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM unpaidorder");
        while(result.next()){
            total += result.getDouble("Cost");
        }
        System.out.printf("Total unpaid: $%,.2f \n", total);
    }
    
    public static void exerciseFour(Connection conn) throws SQLException{
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500,300);
        //
        ArrayList<String> names = new ArrayList<String>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT customer.Name, unpaidorder.CustomerNumber, " +
                "unpaidorder.ProdNum, unpaidorder.OrderDate, unpaidorder.Quantity, unpaidorder.Cost FROM unpaidorder, customer " + 
                "WHERE unpaidorder.CustomerNumber = customer.CustomerNumber");
        while(result.next()){
            String name = result.getString("Name");
            boolean contains = false;
            for(int i = 0; i < names.size(); i++){
                if(names.get(i).equals(name))
                    contains = true;
            }
            if(!contains)
                names.add(name);
        }
        String[] cols = {"Names"};
        String[][] data = new String[names.size()][1];
        for(int i = 0; i < names.size(); i++){
            data[i][0] = names.get(i);
        }
        JTable table = new JTable(data, cols);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                String name = table.getValueAt(table.getSelectedRow(), 0).toString();
                JFrame inner = new JFrame();
                JPanel p = new JPanel();
                frame.setSize(500,300);
                //
                try{
                    Connection conn = DriverManager.getConnection(DB_URL, "root", "317793008");
                    Statement stmt = conn.createStatement();
                    ResultSet result = stmt.executeQuery("SELECT customer.Name, unpaidorder.CustomerNumber, " +
                            "unpaidorder.ProdNum, unpaidorder.OrderDate, unpaidorder.Quantity, unpaidorder.Cost FROM unpaidorder, customer " + 
                            "WHERE unpaidorder.CustomerNumber = customer.CustomerNumber");
                    String[] cols = {"Customer Num", "Product Num", "Order Date", "Quantity", "cost"};
                    int order = 0;
                    result.beforeFirst();
                    while(result.next()){
                        if(result.getString("Name").equals(name))
                            order++;
                    }
                    String[][] data = new String[order][5];
                    result.beforeFirst();
                    int current = 0;
                    while(result.next()){
                        if(result.getString("Name").equals(name)){
                            data[current][0] = result.getString("CustomerNumber");
                            data[current][1] = result.getString("ProdNum");
                            data[current][2] = result.getString("OrderDate");
                            data[current][3] = result.getString("Quantity");
                            data[current][4] = result.getString("Cost");
                            current++;
                        }
                    }
                    JTable t = new JTable(data, cols);
                    JScrollPane scroll = new JScrollPane(t);
                    p.add(scroll);
                    conn.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                //
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        frame.add(panel);
        //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseFive(Connection conn) throws SQLException{
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500,330);
        //
        String plc = "";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM city ORDER BY Population");
        while(result.next()){
            plc += result.getString("CityName") + ", " + result.getDouble("Population") + "\n";
        }
        final String asc = plc;
        result = stmt.executeQuery("SELECT * FROM city ORDER BY Population DESC");
        plc = "";
        while(result.next()){
            plc += result.getString("CityName") + ", " + result.getDouble("Population") + "\n";
        }
        final String desc = plc;
        plc = "";
        result = stmt.executeQuery("SELECT * FROM city ORDER BY CityName");
        while(result.next()){
            plc += result.getString("CityName") + ", " + result.getDouble("Population") + "\n";
        }
        final String name = plc;
        result = stmt.executeQuery("SELECT SUM(Population) FROM city");
        result.next();
        final double total = result.getDouble(1);
        result = stmt.executeQuery("SELECT AVG(Population) FROM city");
        result.next();
        final double avg = result.getDouble(1);
        result = stmt.executeQuery("SELECT MAX(Population) FROM city");
        result.next();
        final double high = result.getDouble(1);
        result = stmt.executeQuery("SELECT MIN(Population) FROM city");
        result.next();
        final double low = result.getDouble(1);
        //
        JButton btnAscending = new JButton("Population Ascending");
        JButton btnDescending = new JButton("Population Descending");
        JButton btnName = new JButton("Name");
        JButton btnTotal = new JButton("Total Population");
        JButton btnAverage = new JButton("Average Population");
        JButton btnHighest = new JButton("Highest Population");
        JButton btnLowest = new JButton("Lowest Population");
        JTextArea txtArea = new JTextArea(10, 35);
        btnAscending.addActionListener(e -> {
            txtArea.setText(asc);
        });
        btnDescending.addActionListener(e -> {
            txtArea.setText(desc);
        });
        btnName.addActionListener(e -> {
            txtArea.setText(name);
        });
        btnTotal.addActionListener(e -> {
            txtArea.setText(String.valueOf(total));
        });
        btnAverage.addActionListener(e -> {
            txtArea.setText(String.valueOf(avg));
        });
        btnHighest.addActionListener(e -> {
            txtArea.setText(String.valueOf(high));
        });
        btnLowest.addActionListener(e -> {
            txtArea.setText(String.valueOf(low));
        });
        JScrollPane scroll = new JScrollPane(txtArea);
        panel.add(btnAscending);
        panel.add(btnDescending);
        panel.add(btnName);
        panel.add(btnTotal);
        panel.add(btnAverage);
        panel.add(btnHighest);
        panel.add(btnLowest);
        panel.add(scroll);
        //
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseSix(Connection conn) throws SQLException{
        String sql = "CREATE TABLE employee ( " + 
                        "employeeID INTEGER NOT NULL PRIMARY KEY," + 
                        "name CHAR(25)," + 
                        "position CHAR(25)," +
                        "payrate DOUBLE)";
        Statement stmt = conn.createStatement();
        int rows = stmt.executeUpdate(sql);
        rows += stmt.executeUpdate("INSERT INTO employee VALUES (0256, 'Bob', 'Manager', 25.00)");
        rows += stmt.executeUpdate("INSERT INTO employee VALUES (0257, 'Sue', 'PL', 21.00)");
        rows += stmt.executeUpdate("INSERT INTO employee VALUES (0258, 'Tom', 'Line Bitch', 18.00)");
        rows += stmt.executeUpdate("INSERT INTO employee VALUES (0259, 'Dean', 'Line Bitch', 18.00)");
        rows += stmt.executeUpdate("INSERT INTO employee VALUES (0260, 'Sally', 'Line Bitch', 18.00)");
        if(rows == 5 || rows == 6){
            System.out.println("Success!");
        }else{
            System.out.println("Failure");
        }
    }
    
    public static void exerciseSeven(Connection conn) throws SQLException{
        Statement stmt = conn.createStatement();
        boolean insert = true;
            while(insert){
            String empno, name, pos, pay;
            empno = JOptionPane.showInputDialog("Enter the employee number:");
            name = JOptionPane.showInputDialog("Enter the employees name:");
            pos = JOptionPane.showInputDialog("Enter the employees position:");
            pay = JOptionPane.showInputDialog("Enter the employees hourly payrate:");
            String sql = "INSERT INTO employee VALUES (" + empno + ", '" + name + "', '" + pos + "', " + pay + ")";
            int rows = stmt.executeUpdate(sql);
            if(rows >= 1){
                JOptionPane.showMessageDialog(null, "Successfully inserted row.");
            }else{
                JOptionPane.showMessageDialog(null, "Something went wrong, row not inserted.");
            }
            insert = false;
            char c = JOptionPane.showInputDialog("Would you like to insert another row? (Y/N)").charAt(0);
            if(c == 'y' || c == 'Y')
                insert = true;
        } 
    }
    
    public static void addToPanel(Component c, JPanel p){
        JPanel panel = new JPanel();
        panel.add(c);
        p.add(panel);
    }
    //
    public static void exerciseEight(Connection conn) throws SQLException{
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(325,260);
        //
        panel.setLayout(new GridLayout(7,2));
        JLabel lblName = new JLabel("Enter an employees name:");
        JTextField txtName = new JTextField(10);
        JButton btnSearch = new JButton("Search");
        JButton btnSave = new JButton("Save");
        JLabel lblID = new JLabel("Employee ID:");
        JLabel lblPosition = new JLabel("Position:");
        JLabel lblPay = new JLabel("Hourly Pay:");
        JTextField txtID = new JTextField(10);
        JTextField txtPosition = new JTextField(10);
        JTextField txtPay = new JTextField(10);
        txtID.setEditable(false);
        btnSearch.addActionListener(e -> {
            String name = txtName.getText(); 
            try {
                Connection con = DriverManager.getConnection(DB_URL, "root", "317793008");
                Statement stmt = con.createStatement();
                ResultSet result = stmt.executeQuery("SELECT * FROM employee WHERE name = '" + name + "'");
                result.next();
                txtID.setText(String.valueOf(result.getInt("employeeID")));
                txtPosition.setText(result.getString("position"));
                txtPay.setText(String.valueOf(result.getDouble("payrate")));
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        });
        btnSave.addActionListener(e -> {
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String pos = txtPosition.getText();
            double pay = Double.parseDouble(txtPay.getText());
            try {
                Connection con = DriverManager.getConnection(DB_URL, "root", "317793008");
                Statement stmt = con.createStatement();
                String sql = "UPDATE employee SET name = '" + name + "', position = '" + pos + "', payrate = " + pay + 
                        " WHERE employeeID = '" + id + "'";
                int rows = stmt.executeUpdate(sql);
                if(rows >= 1){
                    JOptionPane.showMessageDialog(frame, "Successfully updated row");
                }else{
                    JOptionPane.showMessageDialog(frame, "Failed to update row");
                }
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        });
        //
        addToPanel(lblName, panel);
        addToPanel(btnSearch, panel);
        addToPanel(txtName, panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(lblID, panel);
        addToPanel(txtID, panel);
        addToPanel(lblPosition, panel);
        addToPanel(txtPosition, panel);
        addToPanel(lblPay, panel);
        addToPanel(txtPay, panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(btnSave, panel);
        //
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseNine(Connection conn) throws SQLException {
        //createPhoneDB(conn);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(325,225);
        //
        panel.setLayout(new GridLayout(5,2));
        JLabel lblName = new JLabel("Enter a name:");
        JTextField txtName = new JTextField(10);
        JButton btnSearch = new JButton("Search");
        JButton btnSave = new JButton("Save");
        JLabel lblNumber = new JLabel("Phone Number:");
        JTextField txtNumber = new JTextField(10);
        //
        btnSearch.addActionListener(e -> {
            String name = txtName.getText(); 
            try {
                Connection con = DriverManager.getConnection(DB_URL, "root", "317793008");
                Statement stmt = con.createStatement();
                ResultSet result = stmt.executeQuery("SELECT number FROM entries WHERE name = '" + name + "'");
                result.next();
                txtNumber.setText(result.getString("number"));
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        });
        btnSave.addActionListener(e -> {
            String name = txtName.getText();
            String num = txtNumber.getText();
            try {
                Connection con = DriverManager.getConnection(DB_URL, "root", "317793008");
                Statement stmt = con.createStatement();
                String sql = "UPDATE entries SET number = '" + num + "'" +
                        " WHERE name = '" + name + "'";
                int rows = stmt.executeUpdate(sql);
                if(rows >= 1){
                    JOptionPane.showMessageDialog(frame, "Successfully updated row");
                }else{
                    JOptionPane.showMessageDialog(frame, "Failed to update row");
                }
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        });
        //
        addToPanel(lblName, panel);
        addToPanel(txtName, panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(btnSearch, panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(lblNumber, panel);
        addToPanel(txtNumber, panel);
        addToPanel(new JLabel(""), panel);
        addToPanel(btnSave, panel);
        //
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    //
    public static void createPhoneDB(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String create = "CREATE TABLE entries ( " + 
                "name CHAR(25) NOT NULL PRIMARY KEY, " +
                "number CHAR(25))";
        int rows = stmt.executeUpdate(create);
        rows += stmt.executeUpdate("INSERT INTO entries VALUES ('Sue', '555-555-5555')");
        rows += stmt.executeUpdate("INSERT INTO entries VALUES ('Bob', '222-434-0598')");
        rows += stmt.executeUpdate("INSERT INTO entries VALUES ('Sally', '938-857-9583')");
        rows += stmt.executeUpdate("INSERT INTO entries VALUES ('Tim', '030-958-4972')");
        rows += stmt.executeUpdate("INSERT INTO entries VALUES ('Roger', '984-836-8623')");
    }
    
}
