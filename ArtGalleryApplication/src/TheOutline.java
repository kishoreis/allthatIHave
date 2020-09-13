import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author krishna
 */
public class TheOutline extends javax.swing.JFrame {

    /**
     * Creates new form TheOutline
     */
    public TheOutline() {
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Hhome = new javax.swing.JLabel();
        hNew = new javax.swing.JLabel();
        hAdmin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hCust = new javax.swing.JLabel();
        hDeal = new javax.swing.JLabel();
        hArt = new javax.swing.JLabel();
        hArtist = new javax.swing.JLabel();
        hOrder = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        page2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        custOrDealer = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ohome2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        phoneErr = new javax.swing.JLabel();
        na = new javax.swing.JLabel();
        addres = new javax.swing.JLabel();
        ph = new javax.swing.JLabel();
        theId = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        idErr = new javax.swing.JLabel();
        done1 = new javax.swing.JLabel();
        adddeal = new javax.swing.JButton();
        addcust = new javax.swing.JButton();
        page3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        artOrArtist = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ohome3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        mrpp = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        artist_id = new javax.swing.JLabel();
        titleOrName = new javax.swing.JLabel();
        cap = new javax.swing.JLabel();
        toa = new javax.swing.JLabel();
        art_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addArtist = new javax.swing.JButton();
        artid = new javax.swing.JTextField();
        artistid = new javax.swing.JTextField();
        titleorname = new javax.swing.JTextField();
        typeofart = new javax.swing.JTextField();
        caption = new javax.swing.JTextField();
        mrp = new javax.swing.JTextField();
        bplace = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        artistph = new javax.swing.JTextField();
        deal1 = new javax.swing.JLabel();
        dealerid = new javax.swing.JTextField();
        addArt1 = new javax.swing.JButton();
        idErr1 = new javax.swing.JLabel();
        phoneErr1 = new javax.swing.JLabel();
        done2 = new javax.swing.JLabel();
        page6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        custOrDealer1 = new javax.swing.JLabel();
        ohome = new javax.swing.JLabel();
        ohome1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        title6 = new javax.swing.JLabel();
        addres2 = new javax.swing.JLabel();
        addres3 = new javax.swing.JLabel();
        addres4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        addres5 = new javax.swing.JLabel();
        addres1 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        artId = new javax.swing.JTextField();
        addnew = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addres6 = new javax.swing.JLabel();
        totprice = new javax.swing.JTextField();
        orderid = new javax.swing.JTextField();
        custid = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        addbill = new javax.swing.JButton();
        done3 = new javax.swing.JLabel();
        idErr2 = new javax.swing.JLabel();
        page6Err = new javax.swing.JLabel();
        phoneErr3 = new javax.swing.JLabel();
        idErr4 = new javax.swing.JLabel();
        page4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Aadmin = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        id5 = new javax.swing.JLabel();
        transtot1 = new javax.swing.JTextField();
        page5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Aadmin1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dealerTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        artTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        artistTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        transtot = new javax.swing.JLabel();
        transtotval = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.CardLayout());

        page1.setBackground(new java.awt.Color(255, 255, 255));
        page1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        Hhome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Hhome.setForeground(new java.awt.Color(204, 204, 204));
        Hhome.setText(" HOME PAGE");

        hNew.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        hNew.setForeground(new java.awt.Color(204, 204, 204));
        hNew.setText("NEW");

        hAdmin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        hAdmin.setForeground(new java.awt.Color(204, 204, 204));
        hAdmin.setText("ADMIN");
        hAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hAdminMouseClicked(evt);
            }
        });

        jLabel9.setFont(hCust.getFont());
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("home");

        hCust.setBackground(new java.awt.Color(255, 255, 255));
        hCust.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        hCust.setForeground(new java.awt.Color(204, 204, 204));
        hCust.setText("customer");
        hCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hCustMouseClicked(evt);
            }
        });

        hDeal.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        hDeal.setForeground(new java.awt.Color(204, 204, 204));
        hDeal.setText("dealer");
        hDeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hDealMouseClicked(evt);
            }
        });

        hArt.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        hArt.setForeground(new java.awt.Color(204, 204, 204));
        hArt.setText("art work");
        hArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hArtMouseClicked(evt);
            }
        });

        hArtist.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        hArtist.setForeground(new java.awt.Color(204, 204, 204));
        hArtist.setText("artist");
        hArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hArtistMouseClicked(evt);
            }
        });

        hOrder.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        hOrder.setForeground(new java.awt.Color(204, 204, 204));
        hOrder.setText("order");
        hOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hCust)
                            .addComponent(hNew, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hDeal)
                            .addComponent(hArt)
                            .addComponent(hArtist)
                            .addComponent(hOrder)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Hhome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Hhome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(hNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hCust, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hArt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(hAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        page1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shreya\\Desktop\\FullSizeRender+(10).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        page1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 750, 460));

        jLabel2.setFont(new java.awt.Font("Tarzan", 0, 36)); // NOI18N
        jLabel2.setText("ART GALLERY");
        page1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 280, 60));

        getContentPane().add(page1, "card2");

        page2.setBackground(new java.awt.Color(255, 255, 255));
        page2.setForeground(new java.awt.Color(204, 204, 204));
        page2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        custOrDealer.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        custOrDealer.setForeground(new java.awt.Color(204, 204, 204));
        custOrDealer.setText("CUSTOMER");

        jLabel11.setFont(hCust.getFont());
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("home");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        ohome2.setFont(hCust.getFont());
        ohome2.setForeground(new java.awt.Color(204, 204, 204));
        ohome2.setText("add new");
        ohome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ohome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ohome2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custOrDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ohome2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(custOrDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ohome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        page2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 510));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        title2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        title2.setText("enter the details");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        page2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 750, 90));

        phoneErr.setBackground(new java.awt.Color(51, 51, 51));
        phoneErr.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        phoneErr.setForeground(new java.awt.Color(204, 0, 0));
        phoneErr.setText("enter valid details");
        page2.add(phoneErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 20));

        na.setBackground(new java.awt.Color(51, 51, 51));
        na.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        na.setText("name");
        page2.add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 60, 20));

        addres.setBackground(new java.awt.Color(51, 51, 51));
        addres.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres.setText("address");
        page2.add(addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 60, 20));

        ph.setBackground(new java.awt.Color(51, 51, 51));
        ph.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        ph.setText("phone");
        page2.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 60, 20));

        theId.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page2.add(theId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 140, -1));

        name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 140, -1));

        address.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 210, -1));

        phone.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, -1));

        id.setBackground(new java.awt.Color(51, 51, 51));
        id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        id.setText("customer_id");
        page2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 90, 20));

        idErr.setBackground(new java.awt.Color(51, 51, 51));
        idErr.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        idErr.setForeground(new java.awt.Color(204, 0, 0));
        idErr.setText("id already exist!!");
        page2.add(idErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 140, 20));

        done1.setBackground(new java.awt.Color(51, 51, 51));
        done1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        done1.setForeground(new java.awt.Color(51, 255, 51));
        done1.setText("done successfully");
        page2.add(done1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 140, 20));

        adddeal.setBackground(new java.awt.Color(102, 102, 102));
        adddeal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        adddeal.setText("add");
        adddeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddealActionPerformed(evt);
            }
        });
        page2.add(adddeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 100, 30));

        addcust.setBackground(new java.awt.Color(102, 102, 102));
        addcust.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        addcust.setText("add");
        addcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustActionPerformed(evt);
            }
        });
        page2.add(addcust, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 100, 30));

        getContentPane().add(page2, "card3");

        page3.setBackground(new java.awt.Color(255, 255, 255));
        page3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(230, 510));

        artOrArtist.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        artOrArtist.setForeground(new java.awt.Color(204, 204, 204));
        artOrArtist.setText("ARTIST");

        jLabel10.setFont(hCust.getFont());
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        ohome3.setFont(hCust.getFont());
        ohome3.setForeground(new java.awt.Color(204, 204, 204));
        ohome3.setText("add new");
        ohome3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ohome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ohome3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(artOrArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ohome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(artOrArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ohome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        page3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 511));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        title3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        title3.setText("enter the details");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        page3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 750, 90));

        mrpp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        mrpp.setText("MRP");
        page3.add(mrpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 80, 20));

        amt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        amt.setText("amount");
        page3.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 70, 20));

        artist_id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        artist_id.setText("artist id");
        page3.add(artist_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 80, 20));

        titleOrName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        titleOrName.setText("title");
        page3.add(titleOrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, 20));

        cap.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cap.setText("caption");
        page3.add(cap, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 80, 20));

        toa.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        toa.setText("type of art");
        page3.add(toa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, 20));

        art_id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        art_id.setText("art id");
        page3.add(art_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setText("birthplace");
        page3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 80, 20));

        addArtist.setBackground(new java.awt.Color(51, 51, 51));
        addArtist.setForeground(new java.awt.Color(204, 204, 204));
        addArtist.setText("add");
        addArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArtistActionPerformed(evt);
            }
        });
        page3.add(addArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 80, 30));

        artid.setFont(titleOrName.getFont());
        page3.add(artid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, -1));

        artistid.setFont(titleOrName.getFont());
        page3.add(artistid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, -1));

        titleorname.setFont(titleOrName.getFont());
        page3.add(titleorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 220, -1));

        typeofart.setFont(titleOrName.getFont());
        page3.add(typeofart, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 150, -1));

        caption.setFont(titleOrName.getFont());
        page3.add(caption, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 150, -1));

        mrp.setFont(titleOrName.getFont());
        page3.add(mrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 150, -1));

        bplace.setFont(titleOrName.getFont());
        page3.add(bplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 160, -1));

        amount.setFont(titleOrName.getFont());
        page3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("phone");
        page3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 80, 20));

        artistph.setFont(titleOrName.getFont());
        page3.add(artistph, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 110, -1));

        deal1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        deal1.setText("dealer id");
        page3.add(deal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 70, 20));

        dealerid.setFont(titleOrName.getFont());
        page3.add(dealerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 150, -1));

        addArt1.setBackground(new java.awt.Color(51, 51, 51));
        addArt1.setForeground(new java.awt.Color(204, 204, 204));
        addArt1.setText("add");
        addArt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArt1ActionPerformed(evt);
            }
        });
        page3.add(addArt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 80, 30));

        idErr1.setBackground(new java.awt.Color(51, 51, 51));
        idErr1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        idErr1.setForeground(new java.awt.Color(204, 0, 0));
        idErr1.setText("id already exist!!");
        page3.add(idErr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 140, 20));

        phoneErr1.setBackground(new java.awt.Color(51, 51, 51));
        phoneErr1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        phoneErr1.setForeground(new java.awt.Color(204, 0, 0));
        phoneErr1.setText("enter valid details");
        page3.add(phoneErr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 130, 20));

        done2.setBackground(new java.awt.Color(51, 51, 51));
        done2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        done2.setForeground(new java.awt.Color(51, 255, 51));
        done2.setText("done successfully");
        page3.add(done2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 140, 20));

        getContentPane().add(page3, "card4");

        page6.setBackground(new java.awt.Color(255, 255, 255));
        page6.setForeground(new java.awt.Color(204, 204, 204));
        page6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        custOrDealer1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        custOrDealer1.setForeground(new java.awt.Color(204, 204, 204));
        custOrDealer1.setText("ORDER");

        ohome.setFont(hCust.getFont());
        ohome.setForeground(new java.awt.Color(204, 204, 204));
        ohome.setText("home");
        ohome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ohomeMouseClicked(evt);
            }
        });

        ohome1.setFont(hCust.getFont());
        ohome1.setForeground(new java.awt.Color(204, 204, 204));
        ohome1.setText("new bill");
        ohome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ohome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ohome1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custOrDealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ohome, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ohome1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(custOrDealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ohome1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(ohome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        page6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 510));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        title6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        title6.setText("enter the details");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        page6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 750, 90));

        addres2.setBackground(new java.awt.Color(51, 51, 51));
        addres2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres2.setText("order id");
        page6.add(addres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, 20));

        addres3.setBackground(new java.awt.Color(51, 51, 51));
        addres3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres3.setText("customer id");
        page6.add(addres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, 20));

        addres4.setBackground(new java.awt.Color(51, 51, 51));
        addres4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres4.setText("date");
        page6.add(addres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 60, 20));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addres5.setBackground(new java.awt.Color(51, 51, 51));
        addres5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres5.setText("art id");

        addres1.setBackground(new java.awt.Color(51, 51, 51));
        addres1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres1.setText("price");

        price.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N

        artId.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N

        addnew.setBackground(new java.awt.Color(102, 102, 102));
        addnew.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        addnew.setText("add new");
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addComponent(addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addres5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addres1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(artId))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addres5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addres1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        page6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 260, 140));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null,null}
            },
            new String [] {
                "id ", "Title", "price"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        page6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 390, 210));

        addres6.setBackground(new java.awt.Color(51, 51, 51));
        addres6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addres6.setText("TOTAL");
        page6.add(addres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 60, 30));

        totprice.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page6.add(totprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 170, 30));

        orderid.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page6.add(orderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 30));

        custid.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page6.add(custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, 30));

        date.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page6.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 30));

        addbill.setBackground(new java.awt.Color(102, 102, 102));
        addbill.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        addbill.setText("ADD BILL");
        addbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbillActionPerformed(evt);
            }
        });
        page6.add(addbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 130, -1));

        done3.setBackground(new java.awt.Color(51, 51, 51));
        done3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        done3.setForeground(new java.awt.Color(51, 255, 51));
        done3.setText("done successfully");
        page6.add(done3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 140, 20));

        idErr2.setBackground(new java.awt.Color(51, 51, 51));
        idErr2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        idErr2.setForeground(new java.awt.Color(204, 0, 0));
        idErr2.setText("id doesn't exist!!");
        page6.add(idErr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 140, 20));

        page6Err.setBackground(new java.awt.Color(51, 51, 51));
        page6Err.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        page6Err.setForeground(new java.awt.Color(204, 0, 0));
        page6Err.setText("Something went wrong!!!");
        page6.add(page6Err, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 180, 20));

        phoneErr3.setBackground(new java.awt.Color(51, 51, 51));
        phoneErr3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        phoneErr3.setForeground(new java.awt.Color(204, 0, 0));
        phoneErr3.setText("enter valid details");
        page6.add(phoneErr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 130, 20));

        idErr4.setBackground(new java.awt.Color(51, 51, 51));
        idErr4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        idErr4.setForeground(new java.awt.Color(204, 0, 0));
        idErr4.setText("id already exist!!");
        page6.add(idErr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 140, 20));

        getContentPane().add(page6, "card3");

        page4.setBackground(new java.awt.Color(255, 255, 255));
        page4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(230, 510));

        Aadmin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Aadmin.setForeground(new java.awt.Color(204, 204, 204));
        Aadmin.setText("ADMIN");

        jLabel12.setFont(hCust.getFont());
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("home");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Aadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Aadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        page4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 511));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        title4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        title4.setText("get the details");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        page4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 750, 90));

        id2.setBackground(new java.awt.Color(51, 51, 51));
        id2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        id2.setText("get list of");
        page4.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 90, -1));

        id3.setBackground(new java.awt.Color(51, 51, 51));
        id3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        id3.setText("get transaction  for ");
        page4.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 190, -1));

        id4.setBackground(new java.awt.Color(51, 51, 51));
        id4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        id4.setText("get profit of");
        page4.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, 30));

        jComboBox2.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customer", "dealer", "art", "artist" ,"orders"}));
        jComboBox2.setOpaque(false);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        page4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 130, 30));

        jComboBox3.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "this year", "this month", "this day" }));
        jComboBox3.setOpaque(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        page4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 140, 30));

        jComboBox4.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "month", "date" }));
        jComboBox4.setOpaque(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        page4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, 30));

        id5.setBackground(new java.awt.Color(51, 51, 51));
        id5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id5.setText("(enter valid data)");
        page4.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 160, 30));

        transtot1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        page4.add(transtot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 130, 30));

        getContentPane().add(page4, "card4");

        page5.setBackground(new java.awt.Color(255, 255, 255));
        page5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(230, 510));

        Aadmin1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Aadmin1.setForeground(new java.awt.Color(204, 204, 204));
        Aadmin1.setText("ADMIN");

        jLabel13.setFont(hCust.getFont());
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("back");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Aadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Aadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        page5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 511));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        title5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        title5.setText("following are the details ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title5)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        page5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 750, 90));

        customTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null,null}

            },
            new String [] {
                "id", "name", "phone", "address","total purchase"
            }
        ));
        customTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customTable.setGridColor(new java.awt.Color(255, 255, 255));
        customTable.setRowSelectionAllowed(false);
        customTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(customTable);

        page5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 740, 330));

        dealerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}

            },
            new String [] {
                "id", "name", "phone", "address"
            }
        ));
        jScrollPane2.setViewportView(dealerTable);

        page5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 740, 320));

        artTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null}

            },
            new String [] {
                "title","Artist name", "caption", "type", "year","MRP",
            }
        ));
        artTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        artTable.setGridColor(new java.awt.Color(255, 255, 255));
        artTable.setRowSelectionAllowed(false);
        artTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(artTable);

        page5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 740, 320));

        artistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null,null}

            },
            new String [] {
                "id", "name", "birthplace", "phone","Type of art"
            }
        ));
        artistTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        artistTable.setGridColor(new java.awt.Color(255, 255, 255));
        artistTable.setRowSelectionAllowed(false);
        artistTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(artistTable);

        page5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 740, 330));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null,null,null}

            },
            new String [] {
                "orderId", "customerId", "artId", "date","profit","price"
            }
        ));
        orderTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        orderTable.setGridColor(new java.awt.Color(255, 255, 255));
        orderTable.setRowSelectionAllowed(false);
        orderTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(orderTable);

        page5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 740, 320));

        transtot.setBackground(new java.awt.Color(51, 51, 51));
        transtot.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        transtot.setText("total transaction is");
        page5.add(transtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, -1));

        transtotval.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        page5.add(transtotval, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 180, 30));

        getContentPane().add(page5, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hCustMouseClicked
       emptyPage2();
        page2.setVisible(true);
       page1.setVisible(false);
       adddeal.setVisible(false);
       addcust.setVisible(true);
       id.setText("customer_id");
       custOrDealer.setText("CUSTOMER");done1.setVisible(false);
       idErr.setVisible(false);
       phoneErr.setVisible(false);
       
    }//GEN-LAST:event_hCustMouseClicked

    private void hDealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hDealMouseClicked
       emptyPage2();
        page2.setVisible(true);
       page1.setVisible(false);
       adddeal.setVisible(true);
       addcust.setVisible(false);
       id.setText("dealer_id");
       custOrDealer.setText("DEALER");done1.setVisible(false);
       idErr.setVisible(false);
       phoneErr.setVisible(false);
    }//GEN-LAST:event_hDealMouseClicked

    private void hArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hArtMouseClicked
      emptyPage3();
        page3.setVisible(true);
      page1.setVisible(false);
      titleOrName.setText("title");
      deal1.setVisible(true);
      dealerid.setVisible(true);
      jLabel8.setVisible(false);
      bplace.setVisible(false);
      jLabel3.setVisible(false);
      artistph.setVisible(false);
      art_id.setVisible(true);
      artid.setVisible(true);
      mrpp.setVisible(true);
      mrp.setVisible(true);
      amt.setVisible(true);
      amount.setVisible(true);
      caption.setVisible(true);
      cap.setVisible(true);
      addArt1.setVisible(true);
      addArtist.setVisible(false);
      artOrArtist.setText("ART work");done2.setVisible(false);
      idErr1.setVisible(false);
       phoneErr1.setVisible(false);
    }//GEN-LAST:event_hArtMouseClicked

    private void hArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hArtistMouseClicked
       emptyPage3();
        page3.setVisible(true);
      page1.setVisible(false);
      titleOrName.setText("name");
      deal1.setVisible(false);
      dealerid.setVisible(false);
      jLabel8.setVisible(true);
      bplace.setVisible(true);
      jLabel3.setVisible(true);
      artistph.setVisible(true);
      art_id.setVisible(false);
      artid.setVisible(false);
      mrpp.setVisible(false);
      mrp.setVisible(false);
      amt.setVisible(false);
      amount.setVisible(false);
      caption.setVisible(false);
      cap.setVisible(false);
      addArt1.setVisible(false);
      addArtist.setVisible(true);
      artOrArtist.setText("ARTIST");done2.setVisible(false);
      idErr1.setVisible(false);
       phoneErr1.setVisible(false);
    }//GEN-LAST:event_hArtistMouseClicked

    private void hOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hOrderMouseClicked
        i=0; tot=0;returns();emptyPage6();
        date.setText(additems.getDate("yyyy-MM-dd"));
        page6.setVisible(true);
       page1.setVisible(false);done3.setVisible(false);
      idErr2.setVisible(false);phoneErr3.setVisible(false);page6Err.setVisible(false);idErr4.setVisible(false);
    }//GEN-LAST:event_hOrderMouseClicked

    private void hAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hAdminMouseClicked
       page4.setVisible(true);
       page1.setVisible(false);
    }//GEN-LAST:event_hAdminMouseClicked

    private void adddealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddealActionPerformed
        returns(); try{
        int a=parseInt(gettingArt[art.ID.getName()]);
        long b = parseLong(gettingArt[art.CUSTPH.getName()]);
        if(!additems.check1(a,"dealer")){
        additems.addDealer(a,
                (String)gettingArt[art.NAME.getName()], 
                b, (String)gettingArt[art.ADDRESS.getName()]);
        emptyPage2();done1.setVisible(true);idErr.setVisible(false);
       phoneErr.setVisible(false);
        }else {idErr.setVisible(true);done1.setVisible(false);}}
        catch(NumberFormatException e){phoneErr.setVisible(true);done1.setVisible(false);}
    }//GEN-LAST:event_adddealActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        page1.setVisible(true);
        page2.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        page1.setVisible(true);
        page3.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void addArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArtistActionPerformed
       returns();
       // int i =;
      //int iii=;
      try{
        int ii=parseInt(gettingArt[art.ARTISTID.getName()]);
        long iiii=parseLong(gettingArt[art.PH.getName()]);
        if(!additems.check1(ii,"artist")){
        additems.addArtist(ii,(String)gettingArt[art.TorN.getName()],
      (String)gettingArt[art.BPLC.getName()], iiii
      , (gettingArt[art.ToA.getName()]));
        emptyPage3();done2.setVisible(true);idErr1.setVisible(false);
       phoneErr1.setVisible(false);}
        else {idErr1.setVisible(true);done2.setVisible(false);}
      }catch(NumberFormatException e){
       emptyPage3();phoneErr1.setVisible(true);done2.setVisible(false);}
    }//GEN-LAST:event_addArtistActionPerformed

    private void addArt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArt1ActionPerformed
   try{ returns();
       int a=parseInt(gettingArt[art.ARTID.getName()]);
       int b=parseInt(gettingArt[art.ARTISTID.getName()]);
       int c=parseInt(gettingArt[art.MRP.getName()]);
       int  cc=parseInt(gettingArt[art.DEALID.getName()]);
       int d=parseInt(gettingArt[art.AMT.getName()]);
       if(!additems.check1(a,"art")&&additems.check1(b,"artist")){
       additems.addArtWork(a
          ,b, (String)gettingArt[art.TorN.getName()],
       (String)gettingArt[art.CAP.getName()],
       (gettingArt[art.ToA.getName()]), 1998, c, 
       cc, d); 
       emptyPage3();done2.setVisible(true);idErr1.setVisible(false);
       phoneErr1.setVisible(false);
       }
       else{ idErr1.setVisible(true);done2.setVisible(false);}
       if(!additems.check1(b,"artist")){JOptionPane.showMessageDialog(null,"enter valid artist id or add the artist first","wrong artist id",JOptionPane.INFORMATION_MESSAGE);
              phoneErr1.setVisible(true);done2.setVisible(false);}
   }catch(NumberFormatException e){
       phoneErr1.setVisible(true);done2.setVisible(false);
   }
    }//GEN-LAST:event_addArt1ActionPerformed

    private void addcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustActionPerformed
        returns();
        try{
        int a=parseInt(gettingArt[art.ID.getName()]);
        if(!additems.check1(a,"customer")){
        long b = parseLong(gettingArt[art.CUSTPH.getName()]);System.out.println(b);
        additems.addCustomer(a,
                (String)gettingArt[art.NAME.getName()], 
                b, (String)gettingArt[art.ADDRESS.getName()]);
        emptyPage2();done1.setVisible(true);idErr.setVisible(false);
       phoneErr.setVisible(false);}
        else {idErr.setVisible(true);done2.setVisible(false);}}
        catch(NumberFormatException e){
            phoneErr.setVisible(true);done1.setVisible(false);
        }
    }//GEN-LAST:event_addcustActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
     page1.setVisible(true);
     page4.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        page4.setVisible(true);
        page5.setVisible(false);
        transtot.setVisible(false);transtotval.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        String s = (String) jComboBox4.getSelectedItem();
            transtot.setVisible(true);transtotval.setVisible(true);
            transtot.setText("total profit =");
            int[] x = new int[2];
            Fetch a = new Fetch();
             switch (s){
                 case "year":System.out.println("enter");
                      x=a.fetchOrder(orderTable,(transtot1.getText()),"year",(additems.getDate("yyyy-MM-dd"))); break;
                 case "month":System.out.println("enter");
                     x=a.fetchOrder(orderTable,(transtot1.getText()),"month",(additems.getDate("yyyy-MM-dd"))); break;
                 case "date":System.out.println("enter");
                     x=a.fetchOrder(orderTable,(transtot1.getText()),"date",transtot1.getText()); break;
                 default: transtot1.setText(null);break;
                
             }
             String y =""+ x[1]+"";
             transtotval.setText(y);
                  jScrollPane6.setVisible(true);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane4.setVisible(false);
                page5.setVisible(true);
       page4.setVisible(false);
    
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
            String s = (String) jComboBox3.getSelectedItem();
            transtot.setVisible(true);transtotval.setVisible(true);
            transtot.setText("total transaction =");
            int[] x = new int[2];
            Fetch a = new Fetch();
             switch (s){
                 case "this year":
                      x=a.fetchOrder(orderTable,(additems.getDate("yyyy")),"year",(additems.getDate("yyyy-MM-dd"))); break;
                 case "this month":
                     x=a.fetchOrder(orderTable,(additems.getDate("MM")),"month",(additems.getDate("yyyy-MM-dd"))); break;
                 case "this day":
                     x=a.fetchOrder(orderTable,(additems.getDate("yyyy-MM-dd")),"date",(additems.getDate("yyyy-MM-dd"))); break;
                 default: break;
                
             }
             String y =""+ x[0]+"";
             transtotval.setText(y);
                  jScrollPane6.setVisible(true);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane4.setVisible(false);
                page5.setVisible(true);
       page4.setVisible(false);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
       String s = (String) jComboBox2.getSelectedItem();
       transtot.setVisible(false);transtotval.setVisible(false);
       Fetch a = new Fetch(customTable,s);
        switch (s) {
            case "customer":
                a.fetchCustomer(customTable);
                jScrollPane1.setVisible(true);
                jScrollPane2.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane4.setVisible(false);
                jScrollPane6.setVisible(false);
                break;
            case "dealer":
                a.fetchDealer(dealerTable);
                jScrollPane2.setVisible(true);
                jScrollPane1.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane4.setVisible(false);
                jScrollPane6.setVisible(false);
                break;
            case "art":
                a.fetchArt(artTable);
                jScrollPane3.setVisible(true);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                jScrollPane4.setVisible(false);
                jScrollPane6.setVisible(false);
                break;
            case "artist":
                a.fetchArtist(artistTable);
                jScrollPane4.setVisible(true);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane6.setVisible(false);
                break;
            case "orders":
                a.fetchOrder(orderTable);
                jScrollPane4.setVisible(false);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                jScrollPane3.setVisible(false);
                jScrollPane6.setVisible(true);
                break;
            default:
                break;
        }
     
       page5.setVisible(true);
       page4.setVisible(false);
 
           
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void ohomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohomeMouseClicked
     page1.setVisible(true);
     page6.setVisible(false);
    }//GEN-LAST:event_ohomeMouseClicked

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed
       returns();
       int a=art.CUSTID.getName();
       int b=art.ORDID.getName();
       String bb=(String)gettingArt[b];
       int aa=parseInt(gettingArt[a]);
       if(((i==0)||(bb.equals(dummy)&&gettingArt[a].equals(dummy1)))&&(additems.check1(aa,"customer")&&!additems.check1(parseInt(bb),"orders"))) {
       
      
      ord[0] = parseInt(artId.getText());
      ord[1] = parseInt(price.getText());
    //  java.sql.Statement st;
        try {
           String t=additems.getTitle(ord[0]);
      Object[] row = {ord[0],t,ord[1]};
       DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
                    model.addRow(row);
    }  
           catch(Exception e){phoneErr3.setVisible(true);page6Err.setVisible(true);artId.setText(null);price.setText(null);}
    if(i<10){i++;set[i][0]=ord[0];set[i][1]=ord[1];
    dummy=gettingArt[art.ORDID.getName()];
       dummy1=gettingArt[art.CUSTID.getName()];int y=tot+set[i][1];tot=y;
       String x=""+y+"";
    totprice.setText(x);}
       }
       else if(bb.equals(dummy)&&gettingArt[a].equals(dummy1)){
           phoneErr3.setVisible(true);page6Err.setVisible(true);emptyPage6();done3.setVisible(false);
       }
       else if(!additems.check1(aa,"customer")){
           idErr2.setVisible(true);phoneErr3.setVisible(false);page6Err.setVisible(false);idErr4.setVisible(false);done3.setVisible(false);
       }
       else if(additems.check1(aa,"orders")){
           idErr2.setVisible(false);phoneErr3.setVisible(false);page6Err.setVisible(false);idErr4.setVisible(true);done3.setVisible(false);
       }
       else{idErr2.setVisible(false);phoneErr3.setVisible(true);page6Err.setVisible(true);idErr4.setVisible(false);done3.setVisible(false);emptyPage6();}
       
    }//GEN-LAST:event_addnewActionPerformed

    private void addbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbillActionPerformed
       int b=art.ORDID.getName();int bb=parseInt(gettingArt[b]);int a=art.CUSTID.getName();int aa=parseInt(gettingArt[a]);
        System.out.println(); 
        for(int i=1;i<2;i++){System.out.println(set[i][0]+" "+set[i][1]);}
        additems.recipt_attributes(bb, set, aa,  0,additems.getDate("yyyy-MM-dd"));
        emptyPage6();done3.setVisible(true);  idErr2.setVisible(false);phoneErr3.setVisible(false);page6Err.setVisible(false);idErr4.setVisible(false);
    }//GEN-LAST:event_addbillActionPerformed

    private void ohome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohome1MouseClicked
        emptyPage6(); date.setText(additems.getDate("yyyy-MM-dd"));done3.setVisible(false);
        idErr2.setVisible(false);phoneErr3.setVisible(false);page6Err.setVisible(false);idErr4.setVisible(false);
    }//GEN-LAST:event_ohome1MouseClicked

    private void ohome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohome2MouseClicked
      done1.setVisible(false);emptyPage2();
      idErr.setVisible(false);
       phoneErr.setVisible(false);
    }//GEN-LAST:event_ohome2MouseClicked

    private void ohome3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohome3MouseClicked
        done2.setVisible(false);emptyPage3();
        idErr1.setVisible(false);
       phoneErr1.setVisible(false);
    }//GEN-LAST:event_ohome3MouseClicked
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TheOutline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheOutline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheOutline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheOutline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable (){
                public void run() {
                new TheOutline().setVisible(true);
            }
});
    }
    private enum art{
        ARTID(0),ARTISTID(1),TorN(2),ToA(3),DEALID(4),AMT(5),CAP(6),BPLC(7),PH(8),MRP(9),
        ID(10),NAME(11),ADDRESS(12),CUSTPH(13),ORDID(14),CUSTID(15);
        private final int a;
       
        art(int i){
            a=i;
        }
        public int getName(){
            return a;
        }
    }
    public void returns(){
       
        gettingArt[0] = (artid.getText());
        gettingArt[1] = (String)artistid.getText();
        gettingArt[2] = (String)titleorname.getText();
        gettingArt[3] = (String)typeofart.getText();
        gettingArt[4] = (dealerid.getText());
        gettingArt[5] = amount.getText();
        gettingArt[6] = (String)caption.getText();
        gettingArt[7] = (String)bplace.getText();
        gettingArt[8] = (artistph.getText());
        gettingArt[9] = (mrp.getText());
        gettingArt[10] = theId.getText();
        gettingArt[11] = name.getText();
        gettingArt[12] = address.getText();
        gettingArt[13] = phone.getText();
        gettingArt[14] = orderid.getText();
        gettingArt[15] = custid.getText();
        
        
       // gettingArt[14] = amount.getText();
    } 
    public void emptyPage2(){
        theId.setText(null);
        name.setText(null);
        address.setText(null);
        phone.setText(null);
    }
     public void emptyPage3(){
        artid.setText(null);
        artistid.setText(null);
        titleorname.setText(null);
        typeofart.setText(null);
        caption.setText(null);
        mrp.setText(null);
        bplace.setText(null);
        amount.setText(null);
        artistph.setText(null);
        dealerid.setText(null);    
     }
      public void emptyPage6(){
          totprice.setText(null);
          orderid.setText(null);
          custid.setText(null);
          date.setText(null);
          price.setText(null);
          artId.setText(null);
          Fetch.clearTable(jTable1);
          dummy=null;
          dummy1=null;i=0;
      }
    
    String dummy=null,dummy1=null;
    int i=0;int tot=0;
    Integer[][] set=new Integer[10][2];
    Integer[] ord = new Integer[2];
    volatile String[] gettingArt=new String[25];
    private AddItems additems = new AddItems();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aadmin;
    private javax.swing.JLabel Aadmin1;
    private javax.swing.JLabel Hhome;
    private javax.swing.JButton addArt1;
    private javax.swing.JButton addArtist;
    private javax.swing.JButton addbill;
    private javax.swing.JButton addcust;
    private javax.swing.JButton adddeal;
    private javax.swing.JButton addnew;
    private javax.swing.JLabel addres;
    private javax.swing.JLabel addres1;
    private javax.swing.JLabel addres2;
    private javax.swing.JLabel addres3;
    private javax.swing.JLabel addres4;
    private javax.swing.JLabel addres5;
    private javax.swing.JLabel addres6;
    private javax.swing.JTextField address;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amt;
    private javax.swing.JTextField artId;
    private javax.swing.JLabel artOrArtist;
    private javax.swing.JTable artTable;
    private javax.swing.JLabel art_id;
    private javax.swing.JTextField artid;
    private javax.swing.JTable artistTable;
    private javax.swing.JLabel artist_id;
    private javax.swing.JTextField artistid;
    private javax.swing.JTextField artistph;
    private javax.swing.JTextField bplace;
    private javax.swing.JLabel cap;
    private javax.swing.JTextField caption;
    private javax.swing.JLabel custOrDealer;
    private javax.swing.JLabel custOrDealer1;
    private javax.swing.JTextField custid;
    private javax.swing.JTable customTable;
    private javax.swing.JTextField date;
    private javax.swing.JLabel deal1;
    private javax.swing.JTable dealerTable;
    private javax.swing.JTextField dealerid;
    private javax.swing.JLabel done1;
    private javax.swing.JLabel done2;
    private javax.swing.JLabel done3;
    private javax.swing.JLabel hAdmin;
    private javax.swing.JLabel hArt;
    private javax.swing.JLabel hArtist;
    private javax.swing.JLabel hCust;
    private javax.swing.JLabel hDeal;
    private javax.swing.JLabel hNew;
    private javax.swing.JLabel hOrder;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    public javax.swing.JLabel idErr;
    public javax.swing.JLabel idErr1;
    public javax.swing.JLabel idErr2;
    public javax.swing.JLabel idErr4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mrp;
    private javax.swing.JLabel mrpp;
    private javax.swing.JLabel na;
    private javax.swing.JTextField name;
    private javax.swing.JLabel ohome;
    private javax.swing.JLabel ohome1;
    private javax.swing.JLabel ohome2;
    private javax.swing.JLabel ohome3;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField orderid;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private javax.swing.JPanel page4;
    private javax.swing.JPanel page5;
    private javax.swing.JPanel page6;
    private javax.swing.JLabel page6Err;
    private javax.swing.JLabel ph;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneErr;
    private javax.swing.JLabel phoneErr1;
    private javax.swing.JLabel phoneErr3;
    private javax.swing.JTextField price;
    private javax.swing.JTextField theId;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel titleOrName;
    private javax.swing.JTextField titleorname;
    private javax.swing.JLabel toa;
    private javax.swing.JTextField totprice;
    private javax.swing.JLabel transtot;
    private javax.swing.JTextField transtot1;
    private javax.swing.JTextField transtotval;
    private javax.swing.JTextField typeofart;
    // End of variables declaration//GEN-END:variables
}
