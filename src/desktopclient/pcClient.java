
package desktopclient;
import java.awt.CardLayout;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;


public class pcClient extends javax.swing.JFrame {
    protected Socket socket = null;
    DataOutputStream output = null;
    DataInputStream input = null;
    CardLayout cLayout = new CardLayout();
    String menuCmd = "";
    String line = "";
    
    public pcClient(Socket c) {
        initComponents();
        this.socket = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        status = new javax.swing.JTextArea();
        searchBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        inputField = new javax.swing.JTextField();
        searchBtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginBtn2 = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        adminPanel2 = new javax.swing.JPanel();
        bookDbPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        tahunTerbit = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        penulis = new javax.swing.JTextField();
        stats = new javax.swing.JTextField();
        bookInput = new javax.swing.JButton();
        userDbPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        unameInput = new javax.swing.JTextField();
        pwdInput = new javax.swing.JPasswordField();
        idInput = new javax.swing.JButton();
        circPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        circEditBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tahunSirk = new javax.swing.JTextField();
        circBtn = new javax.swing.JButton();
        bookDbBtn = new javax.swing.JButton();
        userDbBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        menuPanel.setPreferredSize(new java.awt.Dimension(400, 415));

        status.setColumns(20);
        status.setRows(5);
        status.setPreferredSize(new java.awt.Dimension(159, 75));
        jScrollPane1.setViewportView(status);

        searchBtn.setText("Cari Buku");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        loginBtn.setText("Login Sebagai Admin");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Keluar");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn)
                    .addComponent(loginBtn)
                    .addComponent(searchBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        menuPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitBtn, jScrollPane1, loginBtn, searchBtn});

        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(searchBtn)
                .addGap(40, 40, 40)
                .addComponent(loginBtn)
                .addGap(40, 40, 40)
                .addComponent(exitBtn)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mainPanel.add(menuPanel, "card4");

        resultArea.setColumns(20);
        resultArea.setRows(5);
        jScrollPane2.setViewportView(resultArea);

        searchBtn2.setText("Cari");
        searchBtn2.setPreferredSize(new java.awt.Dimension(55, 25));
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Masukkan Kata Kunci");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputField, searchBtn2});

        mainPanel.add(searchPanel, "card2");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        loginBtn2.setText("LOGIN");
        loginBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(loginBtn2))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(uname))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {password, uname});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(loginBtn2)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, uname});

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, password});

        mainPanel.add(loginPanel, "card3");

        adminPanel2.setPreferredSize(new java.awt.Dimension(376, 345));
        adminPanel2.setLayout(new java.awt.CardLayout());

        jLabel4.setText("Judul");

        jLabel5.setText("ISBN");

        jLabel6.setText("Tahun terbit");

        jLabel7.setText("Penerbit");

        jLabel8.setText("Penulis");

        jLabel9.setText("Status buku");

        bookInput.setText("Input");
        bookInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookDbPanelLayout = new javax.swing.GroupLayout(bookDbPanel);
        bookDbPanel.setLayout(bookDbPanelLayout);
        bookDbPanelLayout.setHorizontalGroup(
            bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDbPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(52, 52, 52)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookInput)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookDbPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ISBN, judul, penerbit, penulis, stats, tahunTerbit});

        bookDbPanelLayout.setVerticalGroup(
            bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDbPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bookInput)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        adminPanel2.add(bookDbPanel, "card2");

        jLabel10.setText("Username");

        jLabel11.setText("Password");

        idInput.setText("Input");
        idInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userDbPanelLayout = new javax.swing.GroupLayout(userDbPanel);
        userDbPanel.setLayout(userDbPanelLayout);
        userDbPanelLayout.setHorizontalGroup(
            userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDbPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idInput)
                    .addComponent(pwdInput))
                .addContainerGap())
            .addGroup(userDbPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(unameInput)
                .addGap(12, 12, 12))
        );
        userDbPanelLayout.setVerticalGroup(
            userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDbPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(unameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(idInput)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        adminPanel2.add(userDbPanel, "card3");

        jLabel12.setText("Judul");

        jLabel13.setText("Status");

        circEditBtn.setText("Input");
        circEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circEditBtnActionPerformed(evt);
            }
        });

        jLabel14.setText("Tahun Terbit");

        javax.swing.GroupLayout circPanelLayout = new javax.swing.GroupLayout(circPanel);
        circPanel.setLayout(circPanelLayout);
        circPanelLayout.setHorizontalGroup(
            circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(49, 49, 49)
                        .addComponent(jTextField1))
                    .addGroup(circPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(circEditBtn)
                        .addGap(0, 245, Short.MAX_VALUE))
                    .addGroup(circPanelLayout.createSequentialGroup()
                        .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(14, 14, 14)
                        .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tahunSirk)
                            .addComponent(jTextField2))))
                .addContainerGap())
        );
        circPanelLayout.setVerticalGroup(
            circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tahunSirk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(circPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(circEditBtn)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        adminPanel2.add(circPanel, "card4");

        circBtn.setText("Sirkulasi");
        circBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circBtnActionPerformed(evt);
            }
        });

        bookDbBtn.setText("Database Buku");
        bookDbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDbBtnActionPerformed(evt);
            }
        });

        userDbBtn.setText("Database User");
        userDbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDbBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(bookDbBtn)
                .addGap(40, 40, 40)
                .addComponent(userDbBtn)
                .addContainerGap())
            .addComponent(adminPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circBtn)
                    .addComponent(bookDbBtn)
                    .addComponent(userDbBtn))
                .addGap(18, 18, 18)
                .addComponent(adminPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(adminPanel, "card5");

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        menuCmd ="cari,null";
        System.out.println(menuCmd);
        try{
            output = new DataOutputStream(socket.getOutputStream());
            
            output.writeUTF(menuCmd);
            cLayout = (CardLayout)mainPanel.getLayout();
            cLayout.show(mainPanel, "card2");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        menuCmd ="login,null";
        System.out.println(menuCmd);
        try{
            output = new DataOutputStream(socket.getOutputStream());
            menuCmd ="login,null";
            output.writeUTF(menuCmd);
            cLayout = (CardLayout)mainPanel.getLayout();
            cLayout.show(mainPanel, "card3");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed
        String keyword = inputField.getText();
        try{
            output =new DataOutputStream(socket.getOutputStream());
            output.writeUTF(keyword);
            
        }
        catch(Exception e){
             System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchBtn2ActionPerformed

    private void loginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn2ActionPerformed
        String username = uname.getText();
        String pwd = password.getText();
        try{
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(username);
            output.writeUTF(pwd);
            
            input = new DataInputStream(socket.getInputStream()); 
            String line = input.readLine();
            System.out.println(line);
            if (line.equals("sukses")){
                JOptionPane.showMessageDialog(null, "selamat datang");
                cLayout = (CardLayout)mainPanel.getLayout();
                cLayout.show(mainPanel, "card5");                
            }
            else{
                JOptionPane.showMessageDialog(null, "username atau password salah");
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_loginBtn2ActionPerformed

    private void circBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circBtnActionPerformed
       try{
            output = new DataOutputStream(socket.getOutputStream());
            menuCmd ="circulation";
            
            cLayout = (CardLayout)adminPanel2.getLayout();
            cLayout.show(adminPanel2, "card4");
            output.writeUTF(menuCmd);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_circBtnActionPerformed

    private void bookDbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDbBtnActionPerformed
       try{
            output = new DataOutputStream(socket.getOutputStream());
            menuCmd ="bookDb";
            
            cLayout = (CardLayout)adminPanel2.getLayout();
            cLayout.show(adminPanel2, "card2");
            output.writeUTF(menuCmd);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bookDbBtnActionPerformed

    private void userDbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDbBtnActionPerformed
        try{
            output = new DataOutputStream(socket.getOutputStream());
            menuCmd ="userDb";
            
            cLayout = (CardLayout)adminPanel2.getLayout();
            cLayout.show(adminPanel2, "card3");
            output.writeUTF(menuCmd);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_userDbBtnActionPerformed

    private void bookInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookInputActionPerformed
       String title = judul.getText();
       String isbn  = ISBN.getText();
       String year = tahunTerbit.getText();
       String publisher = penerbit.getText();
       String author = penulis.getText();
       String status = stats.getText();
       try{
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(title);
            output.writeUTF(isbn);
            output.writeUTF(year);
            output.writeUTF(publisher);
            output.writeUTF(author);
            output.writeUTF(status);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bookInputActionPerformed

    private void idInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputActionPerformed
        String username = unameInput.getText();
        String pwd = pwdInput.getText();
        try{
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(username);
            output.writeUTF(pwd);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_idInputActionPerformed

    private void circEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circEditBtnActionPerformed
        String title = "";
        int year = 0;
        String status = "";
        try{
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(title);
            output.writeInt(year);
            output.writeUTF(status);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_circEditBtnActionPerformed
        
    void searchRec(){
        try{
            System.out.println(menuCmd);                       
                    input =  new DataInputStream(socket.getInputStream());
                    line = input.readLine();
                    while(!line.equals("done")){
                    System.out.println(line);
                    resultArea.append( line+"\n");
                    line = input.readLine();
                }                                            
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    
    }
    
    void statusAppend(){
        status.append("Tersambung dengan Server");
    }
    /**
     * @param args the command line arguments
     */
    public void run() {
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
            java.util.logging.Logger.getLogger(pcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBN;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JPanel adminPanel2;
    private javax.swing.JButton bookDbBtn;
    private javax.swing.JPanel bookDbPanel;
    private javax.swing.JButton bookInput;
    private javax.swing.JButton circBtn;
    private javax.swing.JButton circEditBtn;
    private javax.swing.JPanel circPanel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton idInput;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField judul;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton loginBtn2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField penulis;
    private javax.swing.JPasswordField pwdInput;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField stats;
    private javax.swing.JTextArea status;
    private javax.swing.JTextField tahunSirk;
    private javax.swing.JTextField tahunTerbit;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField unameInput;
    private javax.swing.JButton userDbBtn;
    private javax.swing.JPanel userDbPanel;
    // End of variables declaration//GEN-END:variables
}
