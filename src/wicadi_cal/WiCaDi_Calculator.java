package wicadi_cal;

import formulator.Calculations;
import formulator.Differentiate;
import formulator.FormulaElement;
import formulator.MathHelper;
import Graphs.GraphEqn;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import  java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileSystemView;



public class WiCaDi_Calculator extends javax.swing.JFrame {
    
        private double input;
        private double answer;
        
        StringBuffer sb;
        
        Calculations cal;
        MathHelper mHelper;
        Core core;
        private int val1 = 5;
        double val2 = 0;
        Map<String, String> map;
        
        private int inMenue; //Which menu is clicked --- 0-Basic interface, 1- Scientific calculator, 2- Formulator
        
       
        
        DefaultListModel listModel = new DefaultListModel();
  
    public WiCaDi_Calculator() {
        
        initComponents();
        jPanel4.setVisible(false);
       
        getContentPane().setBackground(new java.awt.Color(52, 73, 94));
        setTitle("WiCaDi");
        
        sb = new StringBuffer();
        cal = new Calculations();
        mHelper = new MathHelper();
        core = new Core();
        
        map = new HashMap<String, String>();
        
    }
    
    public void setMenuColor(JLabel lbl){
        lbl.setForeground(new Color(255,23,68));
    }
    
    public void resetMenuColor(JLabel lbl){
        lbl.setForeground(new Color(0,0,0));
    }
    
    public void btnClickAnimation(JLabel lb) throws InterruptedException{
        lb.setForeground(new Color(255,51,51));
//        for(int i=0 ; i<100 ; i++);
//        lb.setForeground(new Color(255,255,255));

        new Timer().schedule(new TimerTask() {          
            @Override
            public void run() {
                lb.setForeground(new Color(255,255,255));
            }
            
        }, 500);    
    }

//    for save and clear btn
    public void btnClickAnimation2(JLabel lb) throws InterruptedException{
        lb.setForeground(new Color(255,255,255));


        new Timer().schedule(new TimerTask() {          
            @Override
            public void run() {
                lb.setForeground(new Color(255,51,51));
            }
            
        }, 500);    
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Scientific  ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 23, 68));
        jLabel2.setText("Standard  ");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Formulator");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CE");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("√");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("%");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1/x");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x²");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("/");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/backspace .png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("8");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("7");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("x");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("5");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("6");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("4");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("-");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("2");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("3");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("1");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 204, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("+");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("0");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(".");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("±");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 204, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("=");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Log");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Sin");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Cos");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("x^y");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("x!");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("x^2");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hex");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("x^3");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Mod");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("SAVE");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("(");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText(")");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 51, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("LOAD");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Tan");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("x2");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 51, 51));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("CLEAR");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("x^4");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Ans");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTextField2.setBackground(jPanel1.getBackground());
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(jPanel1.getBackground());
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(36, 47, 65));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("History");

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));

        jLabel58.setBackground(new java.awt.Color(58, 69, 88));
        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (3).png"))); // NOI18N
        jLabel58.setText("READ FROM FILE");
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(58, 69, 88));
        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (4).png"))); // NOI18N
        jLabel59.setText("WRITE TO FILE");
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        jLabel53.setBackground(new java.awt.Color(58, 69, 88));
        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (2).png"))); // NOI18N
        jLabel53.setText("DIFFERENTIATION");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(58, 69, 88));
        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage.png"))); // NOI18N
        jLabel54.setText("DRAW GRAPH");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(58, 69, 88));
        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (6).png"))); // NOI18N
        jLabel55.setText("CAL F(X)");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(58, 69, 88));
        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (1).png"))); // NOI18N
        jLabel56.setText("DEFINITE INTEGRAL");
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(58, 69, 88));
        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage (5).png"))); // NOI18N
        jLabel57.setText("X VARIABLE");
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(58, 69, 88));
        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 204, 204));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WiCaDi_Cal_img/Webp.net-resizeimage.png"))); // NOI18N
        jLabel64.setText("MANUAL GRAPH");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jList1.setBackground(new java.awt.Color(36, 47, 65));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("|");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("|");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("|");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Unit Convereter");
        jLabel63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60)
                        .addComponent(jLabel61)
                        .addComponent(jLabel62)))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Stanadard Calculator button
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        setMenuColor(jLabel2);
        resetMenuColor(jLabel1);
        resetMenuColor(jLabel3);
        resetMenuColor(jLabel63);
        
        this.setResizable(true);
        this.setSize(405, 585);
        this.setMinimumSize(new Dimension(405, 585));
        this.setPreferredSize(new Dimension(405, 585));
        
        
         jTextField2.setSize(new Dimension(0,35)); 
        jTextField1.setSize(new Dimension(0,35)); 
        
        jTextField2.setPreferredSize(new Dimension(0,35));
        jTextField1.setPreferredSize(new Dimension(0,35));
        
        jPanel4.setVisible(false);
        
        inMenue = 0; //indicate the user is in basic calculator view
        
    }//GEN-LAST:event_jLabel2MouseClicked

    //Scientific Calculator button
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        setMenuColor(jLabel1);
        resetMenuColor(jLabel2);
        resetMenuColor(jLabel3);
        resetMenuColor(jLabel63);
        
        this.setResizable(true);
        
        this.setSize(1064, 585);
        this.setMinimumSize(new Dimension(1064, 585));
        this.setPreferredSize(new Dimension(1064, 585));
//      this.setResizable(false);
        
        
        jTextField2.setSize(new Dimension(721,45)); 
        jTextField1.setSize(new Dimension(721,45)); 
        
        jTextField2.setPreferredSize(new Dimension(721,45));
        jTextField1.setPreferredSize(new Dimension(721,45));
       
        
        jPanel4.setVisible(false);
        
        inMenue = 1; //indicate the user is in scientific calculator view
    }//GEN-LAST:event_jLabel1MouseClicked

    //Formulator Calculator button
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        setMenuColor(jLabel3);
        resetMenuColor(jLabel2);
        resetMenuColor(jLabel1);
        resetMenuColor(jLabel63);
        
        this.setResizable(true);
        this.setSize(1064, 585);
        this.setMinimumSize(new Dimension(1064, 585));
        this.setPreferredSize(new Dimension(1064, 585));
//        this.setResizable(false);

        jTextField2.setSize(new Dimension(721,45)); 
        jTextField1.setSize(new Dimension(721,45)); 
        
        jTextField2.setPreferredSize(new Dimension(721,45));
        jTextField1.setPreferredSize(new Dimension(721,45));

        jPanel4.setVisible(true);
        
        inMenue = 3; //indicate the user is in formulator calculator view
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.setResizable(true);
        this.setSize(405, 585);
    }//GEN-LAST:event_formWindowActivated

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel14);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("7");
        jTextField2.setText(core.getStringInput());
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel6);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("%");
        jTextField2.setText(core.getStringInput());
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel5);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        input = Double.parseDouble(jTextField1.getText());
//        
//        answer = Math.sqrt(input);

        jTextField2.setText(mHelper.getSquareRoot(jTextField1.getText()));
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel9);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        

            jTextField2.setText(mHelper.getSquare(jTextField1.getText()));
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel8);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel11);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.removeCharacter();
        jTextField2.setText(core.getStringInput());
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel10);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("/");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel12);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("8");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel13);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("9");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel15);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("*");
        jTextField2.setText(core.getStringInput());
      
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel18);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("4");
        jTextField2.setText(core.getStringInput());

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel16);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("5");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel17);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("6");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel19);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("-");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel22);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("1");
        jTextField2.setText(core.getStringInput());
       
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel20);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("2");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel21);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("3");
        jTextField2.setText(core.getStringInput());
       
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel23);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("+");
        jTextField2.setText(core.getStringInput());
   
        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel26);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel24);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("0");
        jTextField2.setText(core.getStringInput());
      
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel25);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput(".");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel25MouseClicked

    
    //Equal function
    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel27);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         System.out.println("Equal clicked");
        
        String output_val = "";
        //        =
        try {
            
            System.out.println("Input text - "+this.jTextField2.getText());
            
            if(inMenue == 0 || inMenue == 1) { //for basic calculator and scientific calculator run this
                
                double d = mHelper.roundValue(cal.calculate(this.jTextField2.getText(), val2), val1);
                output_val = ""+d+"";
                
            }else{ //for formulator calculator
                
                    FormulaElement test_fe = new FormulaElement();
    
                    FormulaElement fe= test_fe.parseFormula(this.jTextField2.getText());


                    
                    System.out.println(fe.isFullyGrounded());
                    System.out.println(fe.evaluate());
                    
                    output_val = ""+fe.evaluate()+"";
                    
                    
                    fe = null;
                
            }
            

        } catch (Exception dd) {
            output_val = "ERROR";
           

        }
        String input = jTextField2.getText();
         jTextField1.setText(output_val); //displaying answer
         
         jTextField2.setText("");
         core.emptyInputs();
         
         
         
         listModel.addElement(input+" - "+output_val);
         jList1.setModel(listModel);
         
         

         
         
        
        
    
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel29);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("Log");
        jTextField2.setText(core.getStringInput());
      
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel30);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("Sin");
        jTextField2.setText(core.getStringInput());
       
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel31);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("Cos");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel47);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("Tan");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel35);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel37);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int i,fact=1;  
        int number=5;//It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }  
        
        jTextField1.setText(" "+fact+"");
            core.emptyInputs();
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel49);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel38);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        input = Double.parseDouble(jTextField2.getText());
        
        answer = input * input  ;
        
        if(answer > -100000000 && answer < 100000000){
            jTextField1.setText(Double.toString(answer));
        }
        else{
            jTextField1.setText("Error");
        }
        jTextField1.setText(mHelper.getCube(jTextField2.getText()));
        core.emptyInputs();
        
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation2(jLabel50);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        core.emptyInputs();
        
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel41);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        input = Double.parseDouble(jTextField2.getText());
        
        answer = input * input * input ;
        
        if(answer > -100000000 && answer < 100000000){
            jTextField1.setText(Double.toString(answer));
        }
        else{
            jTextField1.setText("Error");
        }

            jTextField1.setText(mHelper.getCube(jTextField2.getText()));
            core.emptyInputs();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel42);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation2(jLabel43);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
             
             String form = jTextField2.getText();
             
             int confirm = -1;
             
             if(!form.equals("")){
             
             String name = JOptionPane.showInputDialog("Enter the formula name");
             
             if(!name.equals("")){
                 
             
             for ( String key : map.keySet() ) {
                 
                
                 if(key.equals(name)){
                     
                     confirm  = JOptionPane.showConfirmDialog(null, "Do you want to override the formula?");
                    
                  }
             }
             
               if(confirm == 0){
                    map.put(name,form);
                    JOptionPane.showMessageDialog(null, "SAVED AS " + (name), "", 1);
               }
               if(confirm == -1){
                   map.put(name,form);
                   JOptionPane.showMessageDialog(null, "SAVED AS " + (name), "", 1);
               }
             }
             else{
                 jTextField1.setText("Error");
             }
               
             }
             else{
                 jTextField1.setText("Error");
             }
            
               
              
          } 
            catch (Exception e) {
                jTextField1.setText("Error");
          }

    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel44);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("(");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel45);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput(")");
        jTextField2.setText(core.getStringInput());
        
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel52);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput(jTextField1.getText());
        jTextField2.setText(jTextField1.getText());
        
    }//GEN-LAST:event_jLabel52MouseClicked

    //Load formulae click event
    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation2(jLabel46);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
                String name = JOptionPane.showInputDialog("Enter the formula name"); //get formulae name
                 for ( String key : map.keySet() ) {
                        if(key.equals(name)){
                            this.jTextField2.setText(map.get(name)); //setting the formalue
                         }
                        else{ //if no such formulae
                            this.jTextField2.setText("NO SUCH FORMULA");
                        }
                 }    
          }
          catch (Exception exception) {
              
            return;
            
          }

    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel54);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //        graph
            GraphEqn prf = new GraphEqn(this.jTextField2.getText());
        

    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel53);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //code here
        String ss = jTextField2.getText();
        
        Differentiate diff = new Differentiate();
        jTextField1.setText(diff.getResult(ss, val1, val2, core.getStringInput()));
         

    }//GEN-LAST:event_jLabel53MouseClicked

    //differentiation
    
    
    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel56);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //code here
        
        String ss = jTextField2.getText();
        
        formulator.Intergration ir = new formulator.Intergration();
        jTextField1.setText(ir.getResult(ss, val1));
        

    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel57);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        core.addInput("X");
        jTextField2.setText(core.getStringInput());
      
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel55);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        if(this.jTextField2.getText().equals("") || this.jTextField2.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid formulae!", "", 1);
        }else {

            

                this.startFXThread(this.jTextField2.getText());
                    
                    
        }





    }//GEN-LAST:event_jLabel55MouseClicked

    
    //thred Async
    private void startFXThread(String val)  
    { 
        
        String outVal;
  
        SwingWorker sw1 = new SwingWorker()  
        { 
            fx sVar;
  
            @Override
            protected String doInBackground() throws Exception  
            { 
                // define what thread will do here 
                 sVar =  new fx();
                 sVar.setVisible(true);
                 
                 while(sVar.getFlag() == 0) {
//                     System.out.println("flag is "+sVar.getFlag());
                     System.out.println(sVar.getFlag()); 
                 }
                  System.out.println("Done");
                String res = "Finished Execution"; 
                return res; 
            } 
  
    
  
            @Override
            protected void done()  
            { 
                // this method is called when the background  
                // thread finishes execution 
                try 
                { 
                    int count = sVar.getCount();
                    System.out.println("Count is "+count);
                    
                    
                    FormulaElement test_fe = new FormulaElement();
        

                    FormulaElement fe= test_fe.parseFormula(val);


                    
                    System.out.println(fe.isFullyGrounded());
                    
                    

        
                    for(int i = 0; i <= count ; i++) {
                        System.out.println("Variable name - "+i+" - "+sVar.getVarName(i));
                        System.out.println("Variable val - "+i+" - "+sVar.getVarValue(i));
                        
                        double varVal = Double.parseDouble(sVar.getVarValue(i));  
                        
                        System.out.println(fe);
                        fe.setVariableValue(sVar.getVarName(i), varVal);
                        System.out.println(fe.isFullyGrounded());
                        
                    }
                    
                    System.out.println(fe.evaluate());
                    
                    String output = " "+fe.evaluate()+" ";
                    
                    jTextField1.setText(output); //displaying answer
                    
                    fe = null; //freeing up memory
                    
                   
                      
                }  
                catch (Exception e)  
                { 
                    e.printStackTrace(); 
                }  
                
            } 
        }; 
          
        // executes the swingworker on worker thread 
        sw1.execute();  
    } 
    
    
    
    
    
    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel59);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            
          
        if(map.size() != 0){
          
          String file_name = JOptionPane.showInputDialog("Enter the file name");
          
          if(!file_name.equals("")){
              
             JFileChooser location = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
             
             location.setDialogTitle("Choose a directory to save your file: ");
             
             location.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
             
             int returnValue = location.showSaveDialog(null);
             
             if (returnValue == JFileChooser.APPROVE_OPTION) {
                 
                 if (location.getSelectedFile().isDirectory()) {
                     
                     
                     try{
                     
                           
                     String backslash = "\\"; 
                    FileWriter fw = new FileWriter(location.getSelectedFile()+backslash+file_name+".txt");    
           
                    fw.write(map.toString());  
                    
                    

                    fw.close();

                    JOptionPane.showMessageDialog(null, "Save to file successfully", "", 1);
           
                     } catch(Exception e){System.out.println(e);} 
                    
                 }
             }
        
              
           
          }
           
           
        }
           
        else{
              
          JOptionPane.showMessageDialog(null, "There is no formula, Please Enter a formula and SAVE it first", "", 2);
        }
            
          
        }
        catch(Exception e){
            
           jTextField2.setText("Error");
        }
        
        
    }//GEN-LAST:event_jLabel59MouseClicked

    //load from file
    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel58);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //code from here
        
         try{
             
           map.clear();
          
           File file = null;
          
           JFileChooser fileChooser = new JFileChooser();
         
          
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                
                  file = fileChooser.getSelectedFile();
                
            }
         
          
         
          FileReader fr=new FileReader(file);    
          int i;    
          while((i=fr.read())!=-1){
               sb = sb.append((char)i);           
          }  
          
          String formulas_fr_file = sb.toString();
          
          
          formulas_fr_file = formulas_fr_file.substring(1, formulas_fr_file.length()-1);//remove curly brackets
          
          String[] keyValuePairs = formulas_fr_file.split(",");//split the string to creat key-value pairs
          
          

          for(String pair : keyValuePairs)                        //iterate over the pairs
          {
              String[] entry = pair.split("=");                   //split the pairs to get key and value 
              map.put(entry[0].trim(), entry[1].trim());          //add them to the hashmap and trim whitespaces
          }
          
          
            String name = JOptionPane.showInputDialog("Enter the Formula name");
            
             for ( String key : map.keySet() ) {
                 
                
                        if(key.equals(name)){

                            this.jTextField2.setText(map.get(name));

                         }
                        else{
                            this.jTextField2.setText("NO SUCH FORMULA");
                        }
                 }
                
            
          
          fr.close();  
          
        }
        catch(Exception e){
            
                jTextField2.setText("NO FILE FOUND");
            }
    }                                         

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        try{
            
          
        if(map.size() != 0){
          
          String file_name = JOptionPane.showInputDialog("Enter the file name");
          
          if(!file_name.equals("")){
              
             JFileChooser location = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
             
             location.setDialogTitle("Choose a directory to save your file: ");
             
             location.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
             
             int returnValue = location.showSaveDialog(null);
             
             if (returnValue == JFileChooser.APPROVE_OPTION) {
                 
                 if (location.getSelectedFile().isDirectory()) {
                     
                    
                    FileWriter fw = new FileWriter(location.getSelectedFile()+file_name+".txt");    
           
                    fw.write(map.toString());    

                    fw.close();

                    JOptionPane.showMessageDialog(null, "Save to file successfully", "", 1);
           
                    
                 }
             }
        
              
           
          }
           
           
        }
           
        else{
              
          JOptionPane.showMessageDialog(null, "There is no formula", "", 2);
        }
            
          
        }
        catch(Exception e){
            
           jTextField2.setText("Error");
        }
        
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jTextField2.setText("0");
        jTextField1.setText("");
        
        sb.delete(0, sb.length());
        listModel.removeAllElements();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        String bcspc = null;
        sb.delete(0, sb.length());
        jTextField2.setText("0");
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            // Double-click detected
            int index = jList1.locationToIndex(evt.getPoint());
            String s = (String) jList1.getSelectedValue(); //get value if clicked element
            System.out.println("Double click detected - "+s);
            
            
            String[] parts = s.split("-");
            String part1 = parts[0]; // part 1 - Eqation
            part1 = part1.replaceAll("\\s+","");
            
            String part2 = parts[1]; // part 2 - Answer
            part2 = part2.replaceAll("\\s+","");
            
            jTextField2.setText(part1);
            sb.append(part1);
            jTextField1.setText(part2);
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
        setMenuColor(jLabel63);
        resetMenuColor(jLabel2);
        resetMenuColor(jLabel3);
        resetMenuColor(jLabel1);
        
        UnitConverter uc =  new UnitConverter();
        uc.setVisible(true);
        
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel54);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //        graph
            Graphs.Graph prf = new Graphs.Graph();
       
        prf.first();

       
 
        
        
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel51);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         input = Double.parseDouble(jTextField2.getText());
        
        answer = input * input * input * input ;
        
        if(answer > -100000000 && answer < 100000000){
            jTextField1.setText(Double.toString(answer));
        }
        else{
            jTextField1.setText("Error");
        }

            jTextField1.setText(mHelper.getCube(jTextField2.getText()));
            core.emptyInputs();
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel40);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel40MouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WiCaDi_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WiCaDi_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WiCaDi_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WiCaDi_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WiCaDi_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
