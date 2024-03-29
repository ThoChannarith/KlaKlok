/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klaklok;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**  
 *
 * @author User
 */
public class Index extends javax.swing.JFrame {

    
    public Index() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
//random
    private String[] image= {"image/1.jpg", "image/2.jpg", "image/3.jpg", "image/4.jpg", "image/5.jpg", "image/6.jpg"};
    Random rand = new Random();
    
    //set time for randoming
    Timer timer = new Timer(10, new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                int index1 = rand.nextInt(6);
                URL imageUrl1 = this.getClass().getResource(image[index1]);
                Image im1 = new ImageIcon(imageUrl1).getImage();
                ImageIcon icon1 = new ImageIcon(im1);
                lResult1.setIcon(icon1);
                lResult1.setText(image[index1]);
                
                int index2 = rand.nextInt(6);
                URL imageUrl2 = this.getClass().getResource(image[index2]);
                Image im2 = new ImageIcon(imageUrl2).getImage();
                ImageIcon icon2 = new ImageIcon(im2);
                lResult2.setIcon(icon2);
                lResult2.setText(image[index2]);
                
                int index3 = rand.nextInt(6);
                URL imageUrl3 = this.getClass().getResource(image[index3]);
                Image im3 = new ImageIcon(imageUrl3).getImage();
                ImageIcon icon3 = new ImageIcon(im3);
                lResult3.setIcon(icon3);
                lResult3.setText(image[index3]);
            }
    });
    
    
    public int Khla = 0;
    public int Klouk = 0 ;
    public int Morn = 0 ;
    public int Bongkong = 0;
    public int Kdam = 0;
    public int Trey = 0;
    public int Money;
    public int MainMoney = 5000;
    
    public void Calculate(){
        int khla = Integer.parseInt(txt1.getText());
        int klouk = Integer.parseInt(txt2.getText());
        int morn = Integer.parseInt(txt3.getText());
        int bongkong = Integer.parseInt(txt4.getText());
        int kdam = Integer.parseInt(txt5.getText());
        int trey = Integer.parseInt(txt6.getText());
        //int payMoney = khla + klouk + morn + bongkong + kdam + trey;
        int money = 0;
        int totalMoney = Integer.parseInt(txtMoney.getText()) + money;
        
        int result1 = Integer.parseInt(extractNumbers(lResult1.getText()));
        int result2 = Integer.parseInt(extractNumbers(lResult2.getText()));
        int result3 = Integer.parseInt(extractNumbers(lResult3.getText()));
        
        if(khla > 0){
            if(result1 == 1 && result2 == 1 && result3 == 1){
               
                money += (khla * 3);
                totalMoney += khla + money;
            }
            else if ((result1 == 1 && result2 == 1) || (result1 == 1 && result3 == 1) || (result2 == 1 && result3 == 1)){
                
                money += (khla * 2);
                totalMoney += khla + money;
            }
            else if (result1 == 1 || result2 ==1 || result3 == 1){
                
                money += khla;
                totalMoney += khla + money;
            }
            else{
                khla = 0;
                money += khla;
            }
        }
        if(klouk > 0){
            if(result1 == 2 && result2 == 2 && result3 == 2){
                
                money += (klouk * 3);
                totalMoney += klouk + money;
            }
            else if ((result1 == 2 && result2 == 2) || (result1 == 2 && result3 == 2) || (result2 == 2 && result3 == 2)){
                
                money += (klouk * 2);
                totalMoney += klouk + money;
            }
            else if (result1 == 2 || result2 == 2 || result3 == 2){
                
                money += klouk;
                totalMoney += klouk + money;
            }
            else{
                klouk = 0;
                money += klouk;
            }
        }
        if(morn > 0){
            if(result1 == 3 && result2 == 3 && result3 == 3){
                
                money += (morn * 3);
                totalMoney += morn + money;
            }
            else if ((result1 == 3 && result2 == 3) || (result1 == 3 && result3 == 3) || (result2 == 3 && result3 == 3)){
                
                money += (morn * 2);
                totalMoney += morn + money;
            }
            else if (result1 == 3 || result2 == 3 || result3 == 3){
                
                money += morn;
                totalMoney += morn + money;
            }
            else{
                morn = 0;
                money += morn;
            }
        }
        if(bongkong > 0){
            if(result1 == 4 && result2 == 4 && result3 == 4){
                
                money += (bongkong * 3);
                totalMoney += bongkong + money;
            }
            else if ((result1 == 4 && result2 == 4) || (result1 == 4 && result3 == 4) || (result2 == 4 && result3 == 4)){
                
                money += (bongkong * 2);
                totalMoney += bongkong + money;
            }
            else if (result1 == 4 || result2 == 4 || result3 == 4){
                
                money += bongkong;
                totalMoney += bongkong + money;
            }
            else{
                bongkong = 0;
                money += bongkong;
            }
        }
        if(kdam > 0){
            if(result1 == 5 && result2 == 5 && result3 == 5){
                
                money += (kdam * 3);
                totalMoney += kdam + money;
            }
            else if ((result1 == 5 && result2 == 5) || (result1 == 5 && result3 == 5) || (result2 == 5 && result3 == 5)){
                
                money += (kdam * 2);
                totalMoney += kdam + money;
            }
            else if (result1 == 5 || result2 == 5 || result3 == 5){
                
                money += kdam;
                totalMoney += kdam + money;
            }
            else{
                kdam = 0;
                money += kdam;
            }
        }
        if(trey > 0){
            if(result1 == 6 && result2 == 6 && result3 == 6){
                
                money += (trey * 3);
                totalMoney += trey + money;
            }
            else if ((result1 == 6 && result2 == 6) || (result1 == 6 && result3 == 6) || (result2 == 6 && result3 == 6)){
                
                money += (trey * 2);
                totalMoney += trey + money;
            }
            else if (result1 == 6 || result2 == 6 || result3 == 6){
                
                money += trey;
                totalMoney += trey + money;
            }
            else{
                trey = 0;
                money += trey;
            }
        }
        
        txtMoney.setText(String.valueOf(totalMoney));
        
        if(money == 0){
            lWin.setText("You Don't Receive Money!");
        }
        else{
            lWin.setText("You Receive : " + money);
        }
        
    }
    
    
    
    private String extractNumbers(String input) {
        return input.replaceAll("[^0-9]", "");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lKhla = new javax.swing.JLabel();
        lKlouk = new javax.swing.JLabel();
        lMorn = new javax.swing.JLabel();
        lBongkong = new javax.swing.JLabel();
        lKdam = new javax.swing.JLabel();
        lTrey = new javax.swing.JLabel();
        txt1 = new java.awt.TextField();
        txt2 = new java.awt.TextField();
        txt3 = new java.awt.TextField();
        txt6 = new java.awt.TextField();
        txt5 = new java.awt.TextField();
        txt4 = new java.awt.TextField();
        btnClear1 = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        btnClear3 = new javax.swing.JButton();
        btnClear4 = new javax.swing.JButton();
        btnClear5 = new javax.swing.JButton();
        btnClear6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lResult2 = new javax.swing.JLabel();
        lResult3 = new javax.swing.JLabel();
        lResult1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnPlayAgain = new javax.swing.JButton();
        lWin = new java.awt.Label();
        txtMoney = new java.awt.TextField();
        btnExit = new javax.swing.JButton();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        lKhla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/1.jpg"))); // NOI18N
        lKhla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lKhlaMouseClicked(evt);
            }
        });

        lKlouk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/2.jpg"))); // NOI18N
        lKlouk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lKloukMouseClicked(evt);
            }
        });

        lMorn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/3.jpg"))); // NOI18N
        lMorn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMornMouseClicked(evt);
            }
        });

        lBongkong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/4.jpg"))); // NOI18N
        lBongkong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lBongkongMouseClicked(evt);
            }
        });

        lKdam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/5.jpg"))); // NOI18N
        lKdam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lKdamMouseClicked(evt);
            }
        });

        lTrey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/6.jpg"))); // NOI18N
        lTrey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lTreyMouseClicked(evt);
            }
        });

        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt1.setEditable(false);
        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setText("0");
        txt1.setSelectionStart(-1);

        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt2.setText("0");

        txt3.setEditable(false);
        txt3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt3.setText("0");

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt6.setText("0");
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6KeyTyped(evt);
            }
        });

        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt5.setText("0");
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });

        txt4.setEditable(false);
        txt4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt4.setText("0");

        btnClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear1.setEnabled(false);
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnClear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear2.setEnabled(false);
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        btnClear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear3.setEnabled(false);
        btnClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear3ActionPerformed(evt);
            }
        });

        btnClear4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear4.setEnabled(false);
        btnClear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear4ActionPerformed(evt);
            }
        });

        btnClear5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear5.setEnabled(false);
        btnClear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear5ActionPerformed(evt);
            }
        });

        btnClear6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klaklok/image/back.jpg"))); // NOI18N
        btnClear6.setEnabled(false);
        btnClear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lKhla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBongkong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lKlouk, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lKdam, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMorn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTrey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lMorn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lKlouk, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lKhla)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lBongkong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lKdam, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTrey, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnStart.setText("START");
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("STOP");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnPlayAgain.setText("PLAY AGAIN");
        btnPlayAgain.setEnabled(false);
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });

        lWin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        txtMoney.setEditable(false);
        txtMoney.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtMoney.setText("5000");

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setText("Your Money");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPlayAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lWin, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lWin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addGap(33, 33, 33)
                .addComponent(btnPlayAgain)
                .addGap(168, 168, 168)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        timer.start();
        
        btnStop.setEnabled(true);
        
        btnClear1.setEnabled(false);
        btnClear2.setEnabled(false);
        btnClear3.setEnabled(false);
        btnClear4.setEnabled(false);
        btnClear5.setEnabled(false);
        btnClear6.setEnabled(false);
        
        lKhla.setEnabled(false);
        lKlouk.setEnabled(false);
        lMorn.setEnabled(false);
        lBongkong.setEnabled(false);
        lKdam.setEnabled(false);
        lTrey.setEnabled(false);
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
       timer.stop();
       btnPlayAgain.setEnabled(true);
       btnStart.setEnabled(false);
       btnStop.setEnabled(false);
       Calculate();
       MainMoney = Integer.parseInt(txtMoney.getText());
       
       
       
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int khla = Integer.parseInt(txt1.getText());
        int klouk = Integer.parseInt(txt2.getText());
        int morn = Integer.parseInt(txt3.getText());
        int bongkong = Integer.parseInt(txt4.getText());
        int kdam = Integer.parseInt(txt5.getText());
        int trey = Integer.parseInt(txt6.getText());
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
       char kla = evt.getKeyChar();
       if(!Character.isDigit(kla)){
           evt.consume();
       }
    }//GEN-LAST:event_txt5KeyTyped

    private void txt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyTyped
       char kla = evt.getKeyChar();
       if(!Character.isDigit(kla)){
           evt.consume();
       }
    }//GEN-LAST:event_txt6KeyTyped

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        btnStart.setEnabled(true);
        btnPlayAgain.setEnabled(false);
        btnStop.setEnabled(false);
        txt1.setText("0");
        txt2.setText("0");
        txt3.setText("0");
        txt4.setText("0");
        txt5.setText("0");
        txt6.setText("0");
        Khla = Klouk = Morn = Bongkong = Kdam = Trey = 0;
        
        lKhla.setEnabled(true);
        lKlouk.setEnabled(true);
        lMorn.setEnabled(true);
        lBongkong.setEnabled(true);
        lKdam.setEnabled(true);
        lTrey.setEnabled(true);
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    private void lKhlaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lKhlaMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Khla += 500;
            Money -= 500;
            if(Khla <= Money || Money >= 0){
                txt1.setText(String.valueOf(Khla));
                txtMoney.setText(String.valueOf(Money));
                btnClear1.setEnabled(true);
                
            }
            else{
                Khla -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lKhlaMouseClicked

    private void lKloukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lKloukMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Klouk += 500;
            Money -= 500;
            if(Klouk <= Money || Money >= 0){
                txt2.setText(String.valueOf(Klouk));
                txtMoney.setText(String.valueOf(Money));
                btnClear2.setEnabled(true);
            }
            else{
                Klouk -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lKloukMouseClicked

    private void lMornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMornMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Morn += 500;
            Money -= 500;
            if(Morn <= Money || Money >= 0){
                txt3.setText(String.valueOf(Morn));
                txtMoney.setText(String.valueOf(Money));
                btnClear3.setEnabled(true);
            }
            else{
                Morn -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lMornMouseClicked

    private void lBongkongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBongkongMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Bongkong += 500;
            Money -= 500;
            if(Bongkong <= Money || Money >= 0){
                txt4.setText(String.valueOf(Bongkong));
                txtMoney.setText(String.valueOf(Money));
                btnClear4.setEnabled(true);
            }
            else{
                Bongkong -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lBongkongMouseClicked

    private void lKdamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lKdamMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Kdam += 500;
            Money -= 500;
            if(Kdam <= Money || Money >= 0){
                txt5.setText(String.valueOf(Kdam));
                txtMoney.setText(String.valueOf(Money));
                btnClear5.setEnabled(true);
            }
            else{
                Kdam -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lKdamMouseClicked

    private void lTreyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTreyMouseClicked
        Money = Integer.parseInt(txtMoney.getText());
        try{
            Trey += 500;
            Money -= 500;
            if(Trey <= Money || Money >= 0){
                txt6.setText(String.valueOf(Trey));
                txtMoney.setText(String.valueOf(Money));
                btnClear6.setEnabled(true);
                
            }
            else{
                Trey -= 500;
                Money = 0;
                JOptionPane.showMessageDialog(this, "Hey! boss you have only " + MainMoney);
            }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_lTreyMouseClicked

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        try{
            Khla -= 500;
            Money += 500;
            
             if(Khla == 0){
                txt1.setText(String.valueOf(Khla));
                txtMoney.setText(String.valueOf(Money));
                btnClear1.setEnabled(false);
            }
            else if(Khla <= Money || Money >= 0){
                txt1.setText(String.valueOf(Khla));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        try{
            Klouk -= 500;
            Money += 500;
            
             if(Klouk == 0){
                txt2.setText(String.valueOf(Klouk));
                txtMoney.setText(String.valueOf(Money));
                btnClear2.setEnabled(false);
            }
            else if(Klouk <= Money || Money >= 0){
                txt2.setText(String.valueOf(Klouk));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear3ActionPerformed
        try{
            Morn -= 500;
            Money += 500;
            
             if(Morn == 0){
                txt3.setText(String.valueOf(Morn));
                txtMoney.setText(String.valueOf(Money));
                btnClear3.setEnabled(false);
            }
            else if(Morn <= Money || Money >= 0){
                txt3.setText(String.valueOf(Morn));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear3ActionPerformed

    private void btnClear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear4ActionPerformed
        try{
            Bongkong -= 500;
            Money += 500;
            
             if(Bongkong == 0){
                txt4.setText(String.valueOf(Bongkong));
                txtMoney.setText(String.valueOf(Money));
                btnClear4.setEnabled(false);
            }
            else if(Bongkong <= Money || Money >= 0){
                txt4.setText(String.valueOf(Bongkong));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear4ActionPerformed

    private void btnClear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear5ActionPerformed
        try{
            Kdam -= 500;
            Money += 500;
            
             if(Kdam == 0){
                txt5.setText(String.valueOf(Kdam));
                txtMoney.setText(String.valueOf(Money));
                btnClear5.setEnabled(false);
            }
            else if(Kdam <= Money || Money >= 0){
                txt5.setText(String.valueOf(Kdam));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear5ActionPerformed

    private void btnClear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear6ActionPerformed
        try{
            Trey -= 500;
            Money += 500;
            
             if(Trey == 0){
                txt6.setText(String.valueOf(Trey));
                txtMoney.setText(String.valueOf(Money));
                btnClear6.setEnabled(false);
            }
            else if(Trey <= Money || Money >= 0){
                txt6.setText(String.valueOf(Trey));
                txtMoney.setText(String.valueOf(Money));
            }  
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnClear6ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnClear4;
    private javax.swing.JButton btnClear5;
    private javax.swing.JButton btnClear6;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lBongkong;
    private javax.swing.JLabel lKdam;
    private javax.swing.JLabel lKhla;
    private javax.swing.JLabel lKlouk;
    private javax.swing.JLabel lMorn;
    private javax.swing.JLabel lResult1;
    private javax.swing.JLabel lResult2;
    private javax.swing.JLabel lResult3;
    private javax.swing.JLabel lTrey;
    private java.awt.Label lWin;
    private java.awt.Label label2;
    private java.awt.TextField txt1;
    private java.awt.TextField txt2;
    private java.awt.TextField txt3;
    private java.awt.TextField txt4;
    private java.awt.TextField txt5;
    private java.awt.TextField txt6;
    private java.awt.TextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
