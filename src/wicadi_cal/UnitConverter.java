package wicadi_cal;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class UnitConverter extends javax.swing.JFrame {

   
    public UnitConverter() {
        initComponents();
        
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
    
    
    public void legnth(){
        
        String value = jTextField3.getText();
        String above = jComboBox3.getSelectedItem().toString();
        String below = jComboBox4.getSelectedItem().toString();
        
        //metre
        if( above == "metre" && below == "kilometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "metre" && below == "millimetre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "metre" && below == "micrometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
       
        
        
        //kilometre
        if( above == "kilometre" && below == "metre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "kilometre" && below == "millimetre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "kilometre" && below == "micrometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        
        //millimetre
        if( above == "millimetre" && below == "kilometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "millimetre" && below == "metre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "millimetre" && below == "micrometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        
        
        
        //micrometre
        if( above == "micrometre" && below == "kilometre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "micrometre" && below == "millimetre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "micrometre" && below == "metre"){
           double valuex = Double.parseDouble(value);
           double answer = valuex/1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField4.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        
    }
     public void temperature(){
        
        String value = jTextField5.getText();
        String above = jComboBox5.getSelectedItem().toString();
        String below = jComboBox6.getSelectedItem().toString();
          
        if( above == "Fahrenheit" && below == "Celsius"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex-32)*5/9;
           String finalAnswer = String.valueOf(answer);
           jTextField6.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Celsius" && below == "Fahrenheit"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex*1.8)+32;
           String finalAnswer = String.valueOf(answer);
           jTextField6.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
     }
     
     public void mass(){
        
        String value = jTextField7.getText();
        String above = jComboBox7.getSelectedItem().toString();
        String below = jComboBox8.getSelectedItem().toString();
        
        
          //kg
        if( above == "Kilogram(kg)" && below == "Gram(g)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Kilogram(kg)" && below == "Ton(t)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Kilogram(kg)" && below == "Pound(lb)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*2.2046;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Kilogram(kg)" && below == "Ounce(oz)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*35.27396;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        //gram
         if( above == "Gram(g)" && below == "Kilogram(kg))"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Gram(g)" && below == "Ton(t)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Gram(g)" && below == "Pound(lb)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*0.0022046;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Gram(g)" && below == "Ounce(oz)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*0.03527396;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //ton
         if( above == "Ton(t)" && below == "Kilogram(kg))"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ton(t)" && below == "Gram(g)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ton(t)" && below == "Pound(lb)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*2204.6226;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ton(t)" && below == "Ounce(oz)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*35273.96194;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //pound
         if( above == "Pound(lb)" && below == "Kilogram(kg)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/2.2046;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Pound(lb)" && below == "Gram(g)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/0.0022046;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Pound(lb)" && below == "Ton(t)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/2204.6;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Pound(lb)" && below == "Ounce(oz)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*16;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //ounce
        if( above == "Ounce(oz)" && below == "Kilogram(kg)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/35.274;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ounce(oz)" && below == "Gram(g)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*28.35;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ounce(oz)" && below == "Ton(t)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/35274;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Ounce(oz)" && below == "Pound(lb)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/16;
           String finalAnswer = String.valueOf(answer);
           jTextField8.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
     }
      public void volume(){
        
        String value = jTextField9.getText();
        String above = jComboBox9.getSelectedItem().toString();
        String below = jComboBox10.getSelectedItem().toString();
          
        //litre
        if( above == "Litre(l)" && below == "Millilitre(ml)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Litre(l)" && below == "Gallon(UK)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/3.785;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        if( above == "Litre(l)" && below == "Cubic metre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Litre(l)" && below == "Cubic centimetre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //ml
        if( above == "Millilitre(ml)" && below == "Litre(l)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Millilitre(ml)" && below == "Gallon(UK)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/3785;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Millilitre(ml)" && below == "Cubic metre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
         if( above == "Millilitre(ml)" && below == "Cubic centimetre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex);
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //gallon
         if( above == "Gallon(UK)" && below == "Litre(l)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*4.54609;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Gallon(UK)" && below == "Millilitre(ml)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*4546.09;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer"); 
        
     }
         if( above == "Gallon(UK)" && below == "Cubic metre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/264.172;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
         if( above == "Gallon(UK)" && below == "Cubic centimetre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*4546.09;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        // cubic metre
         if( above == "Cubic metre" && below == "Millilitre(ml)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Cubic metre" && below == "Gallon(UK)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*219.9692;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        if( above == "Cubic metre" && below == "Litre(l)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Cubic metre" && below == "Cubic centimetre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)*1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        //cubic centimetre
         if( above == "Cubic centimetre" && below == "Millilitre(ml)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex);
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Cubic centimetre" && below == "Gallon(UK)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/4546.09;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        
        if( above == "Cubic centimetre" && below == "Litre(l)"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
        if( above == "Cubic centimetre" && below == "Cubic metre"){
           double valuex = Double.parseDouble(value);
           double answer = (valuex)/1000000;
           String finalAnswer = String.valueOf(answer);
           jTextField10.setText(finalAnswer);
            System.out.println("finalAnswer");  
        }
      }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox9 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jComboBox10 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "metre", "kilometre", "Centimetre", "Millimetre", "Micrometre", "Nanometre", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(36, 47, 65));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0");
        jTextField3.setBorder(null);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kilometre", "metre", "Centimetre", "Millimetre", "Micrometre", "Nanometre", " ", " " }));

        jTextField4.setBackground(new java.awt.Color(36, 47, 65));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Convert");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Length", jPanel2);

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius" }));

        jTextField5.setBackground(new java.awt.Color(36, 47, 65));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0");
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(36, 47, 65));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(36, 47, 65));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Convert");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Temperature", jPanel3);

        jPanel8.setBackground(new java.awt.Color(36, 47, 65));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram(kg)", "Gram(g)", "Ton(t)", "Pound(lb)", "Ounce(oz)" }));

        jTextField7.setBackground(new java.awt.Color(36, 47, 65));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("0");
        jTextField7.setBorder(null);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gram(g)", "Kilogram(kg)", "Ton(t)", "Pound(lb)", "Ounce(oz)" }));

        jTextField8.setBackground(new java.awt.Color(36, 47, 65));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setBorder(null);

        jPanel9.setBackground(new java.awt.Color(36, 47, 65));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Convert");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Mass", jPanel4);

        jPanel10.setBackground(new java.awt.Color(36, 47, 65));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litre(l)", "Millilitre(ml)", "Gallon(UK)", "Cubic metre", "Cubic centimetre" }));

        jTextField9.setBackground(new java.awt.Color(36, 47, 65));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("0");
        jTextField9.setBorder(null);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Millilitre(ml)", "Litre(l)", "Gallon(UK)", "Cubic metre", "Cubic centimetre" }));

        jTextField10.setBackground(new java.awt.Color(36, 47, 65));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setBorder(null);

        jPanel11.setBackground(new java.awt.Color(36, 47, 65));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Convert");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addContainerGap())))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Volume", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(608, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel1);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        legnth();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel2);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        temperature();
    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel3);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mass();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         try {
            // TODO add your handling code here:
            btnClickAnimation(jLabel4);
        } catch (InterruptedException ex) {
            Logger.getLogger(WiCaDi_Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        volume();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
