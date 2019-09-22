/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// btw exercise 9 is in the chapter 13 file

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import javax.swing.Timer;
import javafx.scene.control.Slider;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ben_d
 */
public class Chapter14Exercises extends JApplet{

    private static boolean ch1 = false;
    private static boolean ch2 = false;
    private static boolean ch3 = false;
    private static boolean ch4 = false;
    private static boolean ch5 = false;
    private static boolean ch6 = false;
    private static boolean ch7 = false;
    private static boolean ch8 = false;
    private static boolean ch9 = true;
    
    //ch1
    int mousex = getWidth() / 2;
    int mousey = getHeight() / 2;
    
    //ch2
    boolean houseClosed = false;
    
    //ch3
    int centerx = 500 / 2;
    int centery = 400 / 2;
    final int PUPIL_WIDTH = 15;
    int[] leftPupil = {centerx - 32, centery - 17};
    int[] rightPupil = {centerx + 18, centery - 17};
    
    //ch4
    ThermometerPanel drawPanel = new ThermometerPanel();
    int degrees = 0;
    
    //ch5
    int[] polyx = {0, 0, 0, 0, 0, 0};
    int[] polyy = {0, 0, 0, 0, 0, 0};
    int polyindex = 0;
    
    //ch6
    final int CELL_HEIGHT = 400 / 2;
    final int CELL_WIDTH = 500 / 2;
    boolean cell1 = false;
    boolean cell2 = false;
    boolean cell3 = false;
    boolean cell4 = false;
    
    //ch7
    JPanel dispenser = new JPanel();
    JPanel console = new JPanel();
    JButton lblCola = new JButton("Cola");
    JButton lblLemon = new JButton("Lemon Lime");
    JButton lblGrape = new JButton("Grape");
    JButton lblRootBeer = new JButton("Root Beer");
    JButton lblWater = new JButton("Bottled Water");
    JLabel instructions = new JLabel("Enter change and hit the pop you want");
    JTextField txtChange = new JTextField(10);
    JTextArea txaResult = new JTextArea();
    int[] bottles = {20, 20, 20, 20, 20};
    
    //ch8
    JLabel lblTime = new JLabel("0:00");
    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");
    int seconds = 0;
    int minutes = 0;
    Timer timer;
    
    public void init(){
        if(ch1){
            addMouseMotionListener(new FollowMeListener());
        }else if(ch2){
            addMouseListener(new HouseListener());
        }else if(ch3){
            addMouseMotionListener(new EyeRollerListener());
        }else if(ch4){
            setLayout(new BorderLayout());
            JSlider slider = new JSlider(-30, 30, 0);
            slider.setMajorTickSpacing(10);
            slider.setMinorTickSpacing(2);
            slider.setPaintTicks(true);
            slider.setPaintLabels(true);
            slider.addChangeListener(e -> {
                JSlider source = (JSlider) e.getSource();
                degrees = source.getValue();
                repaint();
            });
            add(slider, BorderLayout.NORTH);
            add(drawPanel, BorderLayout.CENTER);
        }else if(ch5){
            addMouseListener(new PolygonDrawerListener());
        }else if(ch6){
            addMouseListener(new GridFillerListener());
        }else if(ch7){
            
            setLayout(new BorderLayout());
            dispenser.setLayout(new GridLayout(1,5));
            dispenser.add(lblCola);
            dispenser.add(lblLemon);
            dispenser.add(lblGrape);
            dispenser.add(lblRootBeer);
            dispenser.add(lblWater);
            lblCola.addActionListener(new DispensorActionListener());
            lblLemon.addActionListener(new DispensorActionListener());
            lblRootBeer.addActionListener(new DispensorActionListener());
            lblGrape.addActionListener(new DispensorActionListener());
            lblWater.addActionListener(new DispensorActionListener());
            console.setLayout(new GridLayout(4,1));
            JPanel filler1 = new JPanel();
            JPanel filler2 = new JPanel();
            filler1.add(instructions);
            filler2.add(txtChange);
            console.add(new JLabel(""));
            console.add(filler1);
            console.add(filler2);
            console.add(txaResult);
            add(dispenser, BorderLayout.NORTH);
            add(console, BorderLayout.CENTER);
            
        }else if(ch8){
            
            setLayout(new GridLayout(6,1));
            JPanel filler1 = new JPanel();
            JPanel filler2 = new JPanel();
            JPanel filler3 = new JPanel();
            filler1.add(lblTime);
            filler2.add(btnStart);
            filler3.add(btnStop);
            add(new JLabel(""));
            add(filler1);
            add(filler2);
            add(filler3);
            add(new JLabel(""));
            add(new JLabel(""));
            timer = new Timer(100, e -> {
                if(seconds < 60){
                    seconds++;
                } else {
                    minutes++;
                    seconds = 0;
                }
                lblTime.setText(minutes + ":" + String.format("%02d", seconds));
            });
            btnStart.addActionListener(e -> {
               timer.start(); 
            });
            btnStop.addActionListener(e -> {
                timer.stop();
            });
            
        }else if(ch9){
            System.out.println("Exercise 9 is in the chapter 13 main file");
        }
    }
    
    @Override
    public void paint(Graphics g){
        //super.paint(g);
        if(ch1){
            
            g.setColor(Color.BLACK);
            g.setFont(new Font("Serif", Font.BOLD, 20));
            g.drawString("Hello", mousex, mousey);
            
        }else if(ch2){
            
            int[] roofx = {40, 410, 225};
            int[] roofy = {150, 150, 50};
            g.setColor(Color.BLACK);
            g.drawPolygon(roofx, roofy, 3);
            g.drawRect(50, 150, 350, 125);
            if(houseClosed){
                g.drawRect(70, 170, 85, 85);
                g.drawRect(295, 170, 85, 85);
                g.drawRect(185, 170, 85, 105); 
                //subwindows
                g.drawRect(70, 170, 42, 42);
                g.drawRect(112, 170, 43, 42);
                g.drawRect(70, 212, 42, 43);
                g.drawRect(112, 212, 43, 43);
                //subwindows
                g.drawRect(295, 170, 42, 42);
                g.drawRect(337, 170, 43, 42);
                g.drawRect(295, 212, 42, 43);
                g.drawRect(337, 212, 43, 43);
                //handle
                g.fillOval(255, 215, 10, 10);
            } else {
                g.fillRect(70, 170, 85, 85);
                g.fillRect(295, 170, 85, 85);
                g.fillRect(185, 170, 85, 105);
            }
            
        }else if(ch3){
            
            g.setColor(Color.BLACK);
            g.drawOval(centerx - 40, centery - 35, 30, 50);
            g.drawOval(centerx + 10, centery - 35, 30, 50);
            g.fillOval(leftPupil[0], leftPupil[1], PUPIL_WIDTH, PUPIL_WIDTH);
            g.fillOval(rightPupil[0], rightPupil[1], PUPIL_WIDTH, PUPIL_WIDTH);
            
        }else if(ch4){
            
            super.paint(g);
            
        }else if(ch5){
            
            g.clearRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.BLACK);
            g.fillPolygon(polyx, polyy, 6);
            
        }else if(ch6){
            
            g.clearRect(0, 0, getWidth(), getHeight());
            g.drawRect(0, 0, CELL_WIDTH, CELL_HEIGHT);
            g.drawRect(CELL_WIDTH-1, 0, CELL_WIDTH, CELL_HEIGHT);
            g.drawRect(0, CELL_HEIGHT-1, CELL_WIDTH, CELL_HEIGHT);
            g.drawRect(CELL_WIDTH-1, CELL_HEIGHT-1, CELL_WIDTH, CELL_HEIGHT);
            if(cell1){
                g.fillOval(0, 0, CELL_WIDTH, CELL_HEIGHT);
            }
            if(cell2){
                g.fillOval(CELL_WIDTH-1, 0, CELL_WIDTH, CELL_HEIGHT);
            }
            if(cell3){
                g.fillOval(0, CELL_HEIGHT-1, CELL_WIDTH, CELL_HEIGHT);
            }
            if(cell4){
                g.fillOval(CELL_WIDTH-1, CELL_HEIGHT-1, CELL_WIDTH, CELL_HEIGHT);
            }
            
        }else if(ch7){
            
            super.paint(g);
            
        }else if(ch8){
            
            super.paint(g);
            
        }else if(ch9){
            
            super.paint(g);
            
        }
    }
    
    private class FollowMeListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e){
            mousex = e.getX();
            mousey = e.getY();
            repaint();
        }
    }
    
    private class HouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            if(((x >= 70 && x <= 155) && (y >= 170 && y <= 255)) || 
                    ((x >= 295 && x <= 380) && (y >= 170 && y <= 255)) ||
                        ((x >= 185 && x <= 270) && (y >= 170 && y <= 275))){
                houseClosed = !houseClosed;
                repaint();
            }
        }
    }
    
    private class EyeRollerListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            if(x < centerx - 32){
                leftPupil[0] = centerx - 37;
                rightPupil[0] = centerx + 13;
            } else if(x > centerx + 30){
                leftPupil[0] = centerx - 27;
                rightPupil[0] = centerx + 23;
            }
            if(y < centery - 35){
                leftPupil[1] = centery - 27;
                rightPupil[1] = centery - 27;
            } else if(y > leftPupil[1] + 30){
                leftPupil[1] = centery - 5;
                rightPupil[1] = centery - 5;
            } else {
                leftPupil[1] = centery - 17;
                rightPupil[1] = centery - 17;
            }
            repaint();
        }
    }
    
    private class ThermometerPanel extends JPanel {
        @Override
        public void paint(Graphics g){
            g.clearRect(0,0,getWidth(), getHeight());
            double percent;
            if(degrees >= 0){
                percent = (degrees + 30) / 60.0; 
            } else {
                percent = 0.5 - ((degrees * -1) / 60.0);
            }
            int bottom = centery + 100;
            int height = (int) (200.0 * percent);
            int diameter = 40;
            g.setColor(Color.RED);
            g.fillRect(centerx - 7, (centery + 100) - height, 14, height);
            g.fillOval(centerx - (diameter / 2), centery + 100 - (diameter / 2), diameter, diameter);
        }
    }
    
    private class PolygonDrawerListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            polyx[polyindex] = x;
            polyy[polyindex] = y;
            polyindex++;
            if(polyindex == 6){
                polyindex = 0;
                repaint();
            }
        }
    }
    
    private class GridFillerListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            if(x < CELL_WIDTH && y < CELL_HEIGHT){
                cell1 = !cell1;
            } else if(x > CELL_WIDTH && y < CELL_HEIGHT){
                cell2 = !cell2;
            } else if(x < CELL_WIDTH && y > CELL_HEIGHT){
                cell3 = !cell3;
            } else if(x > CELL_WIDTH && y > CELL_HEIGHT){
                cell4 = !cell4;
            }
            repaint();
        }
    }
    
    private class DispensorActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String command = ((JButton) e.getSource()).getActionCommand();
            String output = "";
            double change = Double.parseDouble(txtChange.getText());
            if(change < 0.75){
                output += "Not enough change";
            } else {
                if(command.equals("Cola")){
                    if(bottles[0] > 0){
                        bottles[0]--;
                        output += "Coke left: " + bottles[0];
                        output += "\nChange: " + (change - 0.75);
                        txtChange.setText(String.format("%.02f", change - 0.75));
                    } else {
                        output += "Out of Coke";
                    }
                } else if(command.equals("Lemon Lime")){
                    if(bottles[1] > 0){
                        bottles[1]--;
                        output += "Lemon Lime left: " + bottles[1];
                        output += "\nChange: " + (change - 0.75);
                        txtChange.setText(String.format("%.02f", change - 0.75));
                    } else {
                        output += "Out of Lemon Lime";
                    }
                } else if(command.equals("Grape")){
                    if(bottles[2] > 0){
                        bottles[2]--;
                        output += "Grape left: " + bottles[2];
                        output += "\nChange: " + (change - 0.75);
                        txtChange.setText(String.format("%.02f", change - 0.75));
                    } else {
                        output += "Out of Grape";
                    }
                } else if(command.equals("Root Beer")){
                    if(bottles[3] > 0){
                        bottles[3]--;
                        output += "Root Beer left: " + bottles[3];
                        output += "\nChange: " + (change - 0.75);
                        txtChange.setText(String.format("%.02f", change - 0.75));
                    } else {
                        output += "Out of Root Beer";
                    }
                } else if(command.equals("Bottled Water")){
                    if(bottles[4] > 0){
                        bottles[4]--;
                        output += "Bottled Water left: " + bottles[4];
                        output += "\nChange: " + (change - 0.75);
                        txtChange.setText(String.format("%.02f", change - 0.75));
                    } else {
                        output += "Out of BottledWater";
                    }
                }
            }
            txaResult.setText(output);
        }
    }
    
}