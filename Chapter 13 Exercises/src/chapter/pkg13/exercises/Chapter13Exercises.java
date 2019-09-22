/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg13.exercises;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author ben_d
 */
public class Chapter13Exercises {
    
    private static Random r = new Random();
    private static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //exerciseOne();
            //exerciseTwo();
            //exerciseThree();
            //exerciseFour();
            //exerciseFive();
            //exerciseSix();
            //exerciseSeven();
            //exerciseEight();
            //exerciseNine();
            //exerciseTen();
            //exerciseEleven();
            chapterEightExerciseNine();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void exerciseOne(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        JTextField txtPurchase = new JTextField(10);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        JButton btnCalculate = new JButton("Calculate");
        JTextField txtTotal = new JTextField(10);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        //
        txtTotal.setEditable(false);
        btnCalculate.addActionListener(e -> {
            double purchase = Double.parseDouble(txtPurchase.getText());
            double tax = slider.getValue() / 100.0;
            txtTotal.setText(String.format("%,.2f", purchase + (tax * purchase)));
        });
        panel.add(new JLabel("Enter the purchase amount"));
        panel.add(txtPurchase);
        panel.add(new JLabel("Adjust the sales tax:"));
        panel.add(slider);
        panel.add(btnCalculate);
        panel.add(txtTotal);
        //
        frame.setSize(225, 250);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseTwo(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        JFileChooser chooser = new JFileChooser();
        JLabel lblImage = new JLabel();
        JButton button = new JButton("Choose Image");
        button.addActionListener(e -> {
            int action = chooser.showOpenDialog(frame);
            if(action == JFileChooser.APPROVE_OPTION){
                String filename = chooser.getSelectedFile().getPath();
                ImageIcon img = new ImageIcon(filename);
                lblImage.setIcon(img);
                frame.pack();
            }
        });
        //
        panel.add(new JLabel("Select an Image"));
        panel.add(lblImage);
        panel.add(button);
        //
        frame.setSize(225, 250);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseThree(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        String[] dormNames = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
        double[] dormPrices = {1500, 1600, 1200, 1800};
        String[] mealPlans = {"7 meals", "14 meals", "unlimited"};
        double[] mealPrices = {560, 1095, 1500};
        JComboBox dorms = new JComboBox(dormNames);
        JComboBox meals = new JComboBox(mealPlans);
        JButton button = new JButton("Calculate");
        JTextField result = new JTextField(10);
        button.addActionListener(e -> {
           int dormIndex = dorms.getSelectedIndex();
           int mealIndex = meals.getSelectedIndex();
           double total = dormPrices[dormIndex] + mealPrices[mealIndex];
           result.setText(String.format("$%,.2f", total));
        });
        //
        JPanel filler;
        panel.setLayout(new GridLayout(4, 2));
        filler = new JPanel();
        filler.add(new JLabel("Select your Dormitories"));
        panel.add(filler);
        filler = new JPanel();
        filler.add(new JLabel("Select your Dormitories"));
        panel.add(filler);
        filler = new JPanel();
        filler.add(dorms);
        panel.add(filler);
        filler = new JPanel();
        filler.add(meals);
        panel.add(filler);
        filler = new JPanel();
        filler.add(button);
        panel.add(filler);
        panel.add(new JLabel(""));
        filler = new JPanel();
        filler.add(result);
        panel.add(filler);
        panel.add(new JLabel(""));
        //
        frame.setSize(350, 200);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void addToGrid(JPanel panel, JComponent comp){
        JPanel filler = new JPanel();
        filler.add(comp);
        panel.add(filler);
    }
    //
    public static void exerciseFour(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        String[] deckitems = {"The Master Thrasher", "The Dictator", "The Street King"};
        double[] deckprices = {60.0, 45.0, 50.0};
        String[] assitems = {"7.75 inch axle", "8 inch axle", "8,5 inch axle"};
        double[] assprices = {35.0, 40.0, 45.0};
        String[] wheelitems = {"51mm", "55mm", "58mm", "61mm"};
        double[] wheelprices = {20.0, 22.0, 24.0, 28.0};
        String[] extraitems = {"Grip Tape", "Bearings", "Riser Pads", "Nuts & Bolts kit"};
        double[] extraprices = {10.0, 30.0, 2.0, 3.0};
        JComboBox decks = new JComboBox(deckitems);
        JComboBox assemblies = new JComboBox(assitems);
        JComboBox wheels = new JComboBox(wheelitems);
        JList extras = new JList(extraitems);
        JTextField txtSub = new JTextField(10);
        JTextField txtTax = new JTextField(10);
        JTextField txtTotal = new JTextField(10);
        JButton calculate = new JButton("Calculate");
        //
        panel.setLayout(new GridLayout(8,3));
        txtSub.setEditable(false);
        txtTax.setEditable(false);
        txtTotal.setEditable(false);
        extras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        extras.setVisibleRowCount(2);
        JScrollPane scroll = new JScrollPane(extras);
        calculate.addActionListener(e -> {
            double total = 0;
            int deckIndex = decks.getSelectedIndex();
            int assIndex = assemblies.getSelectedIndex();
            int wheelsIndex = wheels.getSelectedIndex();
            total += deckprices[deckIndex] + assprices[assIndex] + wheelprices[wheelsIndex];
            int[] selections = extras.getSelectedIndices();
            for(int i = 0; i < selections.length; i++){
                total += extraprices[selections[i]];
            }
            txtSub.setText(String.format("$%,.2f", total));
            txtTax.setText(String.format("$%,.2f", total * 0.06));
            txtTotal.setText(String.format("$%,.2f", total + (total * 0.06)));
        });
        addToGrid(panel, new JLabel("Decks"));
        addToGrid(panel, txtSub);
        addToGrid(panel, decks);
        addToGrid(panel, txtTax);
        addToGrid(panel, new JLabel("Trucks and Assemblies"));
        addToGrid(panel, txtTotal);
        addToGrid(panel, assemblies);
        addToGrid(panel, calculate);
        addToGrid(panel, new JLabel("Wheels"));
        addToGrid(panel, new JLabel(""));
        addToGrid(panel, wheels);
        addToGrid(panel, new JLabel(""));
        addToGrid(panel, new JLabel("Extras"));
        addToGrid(panel, new JLabel(""));
        addToGrid(panel, scroll);
        addToGrid(panel, new JLabel(""));
        //
        frame.setSize(350, 375);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseFive() throws FileNotFoundException{
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        ArrayList<String> books = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> incart = new ArrayList<String>();
        ArrayList<Double> cartprices = new ArrayList<Double>();
        File file = new File("BookPrices.txt");
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            String[] line = s.nextLine().split(", ");
            books.add(line[0]);
            prices.add(Double.parseDouble(line[1]));
        }
        JList store = new JList(books.toArray());
        JList cart = new JList();
        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");
        JButton buy = new JButton("Buy");
        JTextField txtSub = new JTextField(10);
        JTextField txtTax = new JTextField(10);
        JTextField txtTotal = new JTextField(10);
        txtSub.setEnabled(false);
        txtTax.setEnabled(false);
        txtTotal.setEnabled(false);
        store.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        cart.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add.addActionListener(e -> {
            int[] selections = store.getSelectedIndices();
            for(int i = 0; i < selections.length; i++){
                incart.add(books.get(selections[i]));
                cartprices.add(prices.get(selections[i]));
            }
            for(int i = selections.length-1; i >= 0; i--){
                books.remove(selections[i]);
                prices.remove(selections[i]);
            }
            store.setListData(books.toArray());
            cart.setListData(incart.toArray());
        });
        remove.addActionListener(e -> {
            int[] selections = cart.getSelectedIndices();
            for(int i = 0; i < selections.length; i++){
                books.add(incart.get(selections[i]));
                prices.add(cartprices.get(selections[i]));
            }
            for(int i = selections.length-1; i >= 0; i--){
                incart.remove(selections[i]);
                cartprices.remove(selections[i]);
            }
            store.setListData(books.toArray());
            cart.setListData(incart.toArray());
        });
        buy.addActionListener(e -> {
            double total = 0;
            for(int i = 0; i < cartprices.size(); i++){
                total += cartprices.get(i);
            }
            txtSub.setText(String.format("$%,.2f", total));
            txtTax.setText(String.format("$%,.2f", total * 0.06));
            txtTotal.setText(String.format("$%,.2f", total + (total * 0.06)));
        });
        //
        panel.setLayout(new GridLayout(2,2));
        JPanel storePanel = new JPanel();
        JPanel cartPanel = new JPanel();
        JPanel totalPanel = new JPanel();
        storePanel.add(new JLabel("Store:"));
        storePanel.add(store);
        storePanel.add(add);
        cartPanel.add(new JLabel("Cart:\n"));
        cartPanel.add(cart);
        cartPanel.add(remove);
        totalPanel.add(txtSub);
        totalPanel.add(txtTax);
        totalPanel.add(txtTotal);
        panel.add(storePanel);
        panel.add(cartPanel);
        addToGrid(panel, buy);
        panel.add(totalPanel);
        //
        frame.setSize(350, 450);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static void phoneTotal(JTextField pkg, JTextField phone, JTextField extras, JTextField result){
      double total = 0;
      total += Double.parseDouble(pkg.getText());
      total += Double.parseDouble(extras.getText());
      total += Double.parseDouble(phone.getText());
      result.setText(String.format("%,.2f", total));
    }
    //
    public static void exerciseSix(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception e) {
           // handle exception
        }
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        JMenuBar menu = new JMenuBar();
        JMenu packages = new JMenu("Packages");
        JTextField txtPackage = new JTextField(10);
        JTextField txtPhone = new JTextField(10);
        JTextField txtExtra = new JTextField(10);
        JTextField txtTotal = new JTextField(10);
        txtPackage.setText("45.00");
        txtPhone.setText("29.95");
        txtExtra.setText("0.00");
        txtPackage.setEnabled(false);
        txtPhone.setEnabled(false);
        txtExtra.setEnabled(false);
        txtTotal.setEnabled(false);
        
        JRadioButtonMenuItem threehundred = new JRadioButtonMenuItem("300 minutes per month", true);
        JRadioButtonMenuItem eighthundred = new JRadioButtonMenuItem("800 minutes per month");
        JRadioButtonMenuItem fifteenhundred = new JRadioButtonMenuItem("1500 minutes per month");
        threehundred.addActionListener(e -> {
            txtPackage.setText("45.00");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        eighthundred.addActionListener(e -> {
            txtPackage.setText("65.00");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        fifteenhundred.addActionListener(e -> {
            txtPackage.setText("99.00");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        ButtonGroup packagesGroup = new ButtonGroup();
        packagesGroup.add(threehundred);
        packagesGroup.add(eighthundred);
        packagesGroup.add(fifteenhundred);
        packages.add(threehundred);
        packages.add(eighthundred);
        packages.add(fifteenhundred);
        
        JMenu phones = new JMenu("Phones");
        JRadioButtonMenuItem model100 = new JRadioButtonMenuItem("Model 100", true);
        JRadioButtonMenuItem model110 = new JRadioButtonMenuItem("Model 110");
        JRadioButtonMenuItem model200 = new JRadioButtonMenuItem("Model 200");
        model100.addActionListener(e -> {
            txtPhone.setText("29.95");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        model110.addActionListener(e -> {
            txtPhone.setText("49.95");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        model200.addActionListener(e -> {
            txtPhone.setText("99.95");
            phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        ButtonGroup phonesGroup = new ButtonGroup();
        phonesGroup.add(model100);
        phonesGroup.add(model110);
        phonesGroup.add(model200);
        phones.add(model100);
        phones.add(model110);
        phones.add(model200);
        
        JMenu extras = new JMenu("Extras");
        JCheckBoxMenuItem voiceMail = new JCheckBoxMenuItem("Voice Mail");
        JCheckBoxMenuItem txtMessage = new JCheckBoxMenuItem("Text Messaging");
        voiceMail.addActionListener(e -> {
           double total = 0;
           if(voiceMail.isSelected()){
               total += 5;
           } 
           if(txtMessage.isSelected()){
               total += 10;
           }
           txtExtra.setText(String.format("%.2f", total));
           phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        txtMessage.addActionListener(e -> {
           double total = 0;
           if(voiceMail.isSelected()){
               total += 5;
           } 
           if(txtMessage.isSelected()){
               total += 10;
           }
           txtExtra.setText(String.format("%.2f", total));
           phoneTotal(txtPackage, txtPhone, txtExtra, txtTotal);
        });
        extras.add(voiceMail);
        extras.add(txtMessage);
        
        menu.add(packages);
        menu.add(phones);
        menu.add(extras);
        panel.add(new JLabel("Package:"));
        panel.add(txtPackage);
        panel.add(new JLabel("Phone:"));
        panel.add(txtPhone);
        panel.add(new JLabel("Extras:"));
        panel.add(txtExtra);
        panel.add(new JLabel("Total:"));
        panel.add(txtTotal);
        //
        frame.setJMenuBar(menu);
        frame.setSize(400, 125);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static void shadeTotal(JTextField pkg, JTextField phone, JTextField extras, JTextField result){
      double total = 50;
      total += Double.parseDouble(pkg.getText());
      total += Double.parseDouble(extras.getText());
      total += Double.parseDouble(phone.getText());
      result.setText(String.format("%,.2f", total));
    }
    //
    public static void exerciseSeven(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception e) {
           // handle exception
        }
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        JMenuBar menu = new JMenuBar();
        JTextField txtStyles = new JTextField(10);
        JTextField txtSizes = new JTextField(10);
        JTextField txtColors = new JTextField(10);
        JTextField txtTotal = new JTextField(10);
        txtStyles.setText("0.00");
        txtSizes.setText("0.0");
        txtColors.setText("5.00");
        txtStyles.setEnabled(false);
        txtSizes.setEnabled(false);
        txtColors.setEnabled(false);
        txtTotal.setEnabled(false);
        
        JMenu styles = new JMenu("Styles");
        JRadioButtonMenuItem regular = new JRadioButtonMenuItem("Regular Shades", true);
        JRadioButtonMenuItem folding = new JRadioButtonMenuItem("Folding Shades");
        JRadioButtonMenuItem roman = new JRadioButtonMenuItem("Roman Shades");
        regular.addActionListener(e -> {
            txtStyles.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        folding.addActionListener(e -> {
            txtStyles.setText("10.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        roman.addActionListener(e -> {
            txtStyles.setText("15.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        ButtonGroup stylesGroup = new ButtonGroup();
        stylesGroup.add(regular);
        stylesGroup.add(folding);
        stylesGroup.add(roman);
        styles.add(regular);
        styles.add(folding);
        styles.add(roman);
        
        JMenu sizes = new JMenu("Sizes");
        JRadioButtonMenuItem twentyfive = new JRadioButtonMenuItem("25 inches wide", true);
        JRadioButtonMenuItem twentyseven = new JRadioButtonMenuItem("27 inches wide");
        JRadioButtonMenuItem thirtytwo = new JRadioButtonMenuItem("32 inches wide");
        JRadioButtonMenuItem forty = new JRadioButtonMenuItem("40 inches wide");
        twentyfive.addActionListener(e -> {
            txtSizes.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        twentyseven.addActionListener(e -> {
            txtSizes.setText("2.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        thirtytwo.addActionListener(e -> {
            txtSizes.setText("4.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        forty.addActionListener(e -> {
            txtSizes.setText("6.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        ButtonGroup sizesGroup = new ButtonGroup();
        sizesGroup.add(twentyfive);
        sizesGroup.add(twentyseven);
        sizesGroup.add(thirtytwo);
        sizesGroup.add(forty);
        sizes.add(twentyfive);
        sizes.add(twentyseven);
        sizes.add(thirtytwo);
        sizes.add(forty);
        
        JMenu colors = new JMenu("Colors");
        JRadioButtonMenuItem natural = new JRadioButtonMenuItem("Natural");
        JRadioButtonMenuItem blue = new JRadioButtonMenuItem("Blue");
        JRadioButtonMenuItem teal = new JRadioButtonMenuItem("Teal");
        JRadioButtonMenuItem red = new JRadioButtonMenuItem("Red");
        JRadioButtonMenuItem green = new JRadioButtonMenuItem("Green");
        natural.addActionListener(e -> {
            txtColors.setText("5.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        blue.addActionListener(e -> {
            txtColors.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        teal.addActionListener(e -> {
            txtColors.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        red.addActionListener(e -> {
            txtColors.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        green.addActionListener(e -> {
            txtColors.setText("0.00");
            shadeTotal(txtStyles, txtSizes, txtColors, txtTotal);
        });
        ButtonGroup colorsGroup = new ButtonGroup();
        colorsGroup.add(natural);
        colorsGroup.add(blue);
        colorsGroup.add(teal);
        colorsGroup.add(red);
        colorsGroup.add(green);
        colors.add(natural);
        colors.add(blue);
        colors.add(teal);
        colors.add(red);
        colors.add(green);
        
        menu.add(styles);
        menu.add(sizes);
        menu.add(colors);
        panel.add(new JLabel("Style:"));
        panel.add(txtStyles);
        panel.add(new JLabel("Size:"));
        panel.add(txtSizes);
        panel.add(new JLabel("Color:"));
        panel.add(txtColors);
        panel.add(new JLabel("Total:"));
        panel.add(txtTotal);
        //
        frame.setJMenuBar(menu);
        frame.setSize(275, 125);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseEight(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception e) {
           // handle exception
        }
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        String[] items = {"Introduction to E-commerce", "The Future of the Web", "Advanced Java Programming", "Network Security"};
        double[] prices = {295, 295, 395, 395};
        panel.setLayout(new BorderLayout());
        JPanel north = new JPanel();
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(6,1));
        ButtonGroup regGroup = new ButtonGroup();
        JRadioButton rbtnGeneral = new JRadioButton("General", true);
        JRadioButton rbtnStudent = new JRadioButton("Student");
        regGroup.add(rbtnGeneral);
        regGroup.add(rbtnStudent);
        JCheckBox chxOpening = new JCheckBox("Opening Nigh Dinner");
        JPanel east = new JPanel();
        east.setLayout(new GridLayout(2,1));
        JList workshops = new JList(items);
        JButton calculate = new JButton("Calculate");
        workshops.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JPanel south = new JPanel();
        JTextField txtTotal = new JTextField(10);
        txtTotal.setEditable(false);
        calculate.addActionListener(e -> {
           double total = 0;
           if(rbtnGeneral.isSelected()){
               total += 895;
           }  else {
               total += 495;
           }
           if(chxOpening.isSelected()){
               total += 30;
           }
           int[] selections = workshops.getSelectedIndices();
           for(int i = 0; i < selections.length; i++){
               total += prices[selections[i]];
           }
           txtTotal.setText(String.format("$%,.2f", total));
        });
        //
        north.add(new JLabel("Conference Registration"));
        west.add(new JLabel("Registration type:"));
        west.add(rbtnGeneral);
        west.add(rbtnStudent);
        west.add(new JLabel(""));
        west.add(chxOpening);
        east.add(workshops);
        addToGrid(east, calculate);
        south.add(new JLabel("Total:"));
        south.add(txtTotal);
        panel.add(north, BorderLayout.NORTH);
        panel.add(west, BorderLayout.WEST);
        panel.add(east, BorderLayout.EAST);
        panel.add(south, BorderLayout.SOUTH);
        //
        frame.setSize(350, 275);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static ImageIcon getRandomIcon(){
      int num = r.nextInt(6) + 1;
      switch(num){
          case 1:
              return new ImageIcon("Dice/Die1.png");
          case 2:
              return new ImageIcon("Dice/Die2.png");
          case 3:
              return new ImageIcon("Dice/Die3.png");
          case 4:
              return new ImageIcon("Dice/Die4.png");
          case 5:
              return new ImageIcon("Dice/Die5.png");
          case 6:
              return new ImageIcon("Dice/Die6.png");
      }
      return new ImageIcon("Dice/Die1.png");
    }
    //
    public static void exerciseNine(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        JLabel img1 = new JLabel(getRandomIcon());
        JLabel img2 = new JLabel(getRandomIcon());
        JButton roll = new JButton("Roll the Dice");
        panel.add(img1);
        panel.add(img2);
        panel.add(roll);
        roll.addActionListener(e -> {
            img1.setIcon(getRandomIcon());
            img2.setIcon(getRandomIcon());
        });
        //
        frame.setSize(265, 190);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    //
    public static void exerciseTen(){
        String[] cards = new String[52];
        for(int i = 0; i < cards.length; i++){
            cards[i] = "none";
        }
        String[] suites = {"Clubs", "Hearts", "Diamonds", "Spades"};
        for(int i = 0; i < suites.length; i++){
            for(int j = 1; j <= 13; j++){
                String card;
                if(j == 13){
                    card = "Cards/King_" + suites[i] + ".jpg";
                } else if(j == 12){
                    card = "Cards/Queen_" + suites[i] + ".jpg";
                } else if(j == 11){
                    card = "Cards/Jack_" + suites[i] + ".jpg";
                } else if(j == 1){
                    card = "Cards/Ace_" + suites[i] + ".jpg";
                } else {
                    card = "Cards/" + j + "_" + suites[i] + ".jpg";
                }
                int num;
                String result;
                do{
                    num = r.nextInt(52);
                    result = cards[num]; 
                } while(!result.equals("none"));
                cards[num] = card;
            }
        }
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //
        Stack<String> deck = new Stack<String>();
        for(int i = 0; i < cards.length; i++){
            deck.push(cards[i]);
        }
        int index = 0;
        JLabel img1 = new JLabel(new ImageIcon("Cards/Backface_Blue.jpg"));
        JLabel img2 = new JLabel(new ImageIcon(deck.pop()));
        JButton deal = new JButton("Deal a Card");
        deal.addActionListener(e -> {
            if(!deck.empty()){
                ImageIcon icon = new ImageIcon(deck.pop());
                img2.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(null, "The Deck is empty.");
            }
        });
        panel.add(img1);
        panel.add(img2);
        panel.add(deal);
        //
        frame.setSize(400, 325);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static void ticTacToe(JLabel[][] labels){
        boolean xstart;
        if(r.nextInt(2) == 0){
            xstart = true;
        } else {
            xstart = false;
        }
        String[][] tacs = {{"n","n","n"},{"n","n","n"},{"n","n","n"}};
        for(int i = 0; i < 9; i++){
            String val;
            if(xstart){
                if(i % 2 == 0){
                    val = "X";
                } else {
                    val = "O";
                }
            } else {
                if(i % 2 == 0){
                    val = "O";
                } else {
                    val = "X";
                }
            }
            int fnum, snum;
            String x;
            do{
              fnum = r.nextInt(3);
              snum = r.nextInt(3);
              x = tacs[fnum][snum];
            } while(!x.equals("n"));
            tacs[fnum][snum] = val;
        }
        for(int i = 0; i < tacs.length; i++){
            for(int j = 0; j < tacs[i].length; j++){
                labels[i][j].setText(tacs[i][j]);
            }
        }
        String result;
        if(tacs[0][0].equals(tacs[0][1]) && tacs[0][1].equals(tacs[0][2])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[1][0].equals(tacs[1][1]) && tacs[1][1].equals(tacs[1][2])){
            result = tacs[1][0] + " Wins!";
        } else if(tacs[2][0].equals(tacs[2][1]) && tacs[2][1].equals(tacs[2][2])){
            result = tacs[2][0] + " Wins!";
        } else if(tacs[0][0].equals(tacs[1][0]) && tacs[1][0].equals(tacs[2][0])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[0][1].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][1])){
            result = tacs[0][1] + " Wins!";
        } else if(tacs[0][2].equals(tacs[1][2]) && tacs[1][2].equals(tacs[2][2])){
            result = tacs[0][2] + " Wins!";
        } else if(tacs[0][0].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][2])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[0][2].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][0])){
            result = tacs[0][2] + " Wins!";
        } else {
            result = "Cats Game";
        }
        JOptionPane.showMessageDialog(null, result);
    }
    //
    public static void exerciseEleven(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Font font = new Font("SansSerif", Font.BOLD, 50);
        //
        panel.setLayout(new BorderLayout());
        
        JPanel north = new JPanel();
        north.setLayout(new GridLayout(3,3));
        JLabel[][] tacs = new JLabel[3][3];
        for(int i = 0; i < tacs.length; i++){
            for(int j = 0; j < tacs[i].length; j++){
                JPanel p = new JPanel();
                tacs[i][j] = new JLabel("");
                tacs[i][j].setFont(font);
                p.add(tacs[i][j]);
                north.add(p);
            }
        }
        ticTacToe(tacs);
        JPanel south = new JPanel();
        JButton newgame = new JButton("New Game");
        JButton exit = new JButton("Exit");
        newgame.addActionListener(e -> {
           ticTacToe(tacs);
        });
        exit.addActionListener(e -> {
            System.exit(0);
        });
        south.add(newgame);
        south.add(exit);
        
        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        //
        frame.setSize(300, 325);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    //ch9
    private static JLabel imgView = new JLabel();
    private static JButton imgSelect = new JButton("Upload Images");
    private static JLabel lblInterval = new JLabel("Enter an interval:");
    private static JTextField txtInterval = new JTextField(5);
    private static JFileChooser file = new JFileChooser("C:\\Users\\ben_d\\OneDrive\\Pictures\\Album Artwork");
    private static Timer timer = new Timer(10000, null);
    private static JButton btnStart = new JButton("Start Slideshow");
    private static String[] files = {"none", "none", "none", "none", "none",
                        "none", "none", "none", "none", "none",};
    
    private static int index = 0;
    public static void slideshow(){
        System.out.println("sliding to pic " + (index+1));
        if(index < 9){
            System.out.println(files[index]);
            ImageIcon img = new ImageIcon(files[index]);
            imgView.setIcon(img);
            index++;
        } else {
            ImageIcon img = new ImageIcon(files[index]);
            imgView.setIcon(img);
            index = 0;
        }
    }
    
    public static void chapterEightExerciseNine(){
        
        JFrame frame = new JFrame();
        frame.setSize(550,400);
        frame.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,4));
        JPanel filler1 = new JPanel();
        JPanel filler2 = new JPanel();
        JPanel filler3 = new JPanel();
        JPanel filler4 = new JPanel();
        JPanel filler5 = new JPanel();
        txtInterval.setText("10");
        file.setMultiSelectionEnabled(true);
        imgSelect.addActionListener(e -> {
            int returnVal = file.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION){
                File[] selected = file.getSelectedFiles();
                if(selected.length > 10){
                    for(int i = 0; i < 10; i++){
                        files[i] = selected[i].getPath();
                    }
                } else {
                    for(int i = 0; i < 10; i++){
                        files[i] = "none";
                    }
                    for(int i = 0; i < selected.length; i++){
                        files[i] = selected[i].getPath();
                    }
                }
                timer.stop();
            }
        });
        btnStart.addActionListener(e -> {
            int interval = Integer.parseInt(txtInterval.getText());
            interval *= 1000;
            index = 0;
            slideshow();
            timer = new Timer(interval, ex -> {
                slideshow();
            });
            timer.start();
        });
        filler1.add(imgSelect);
        filler2.add(lblInterval);
        filler3.add(txtInterval);
        filler4.add(btnStart);
        bottom.add(filler1);
        bottom.add(filler2);
        bottom.add(filler3);
        bottom.add(filler4);
        filler5.add(imgView);
        frame.add(filler5, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
            
    }
    
}
