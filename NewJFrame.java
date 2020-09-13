

/**
 *
 * @author kishore
 */
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.apache.commons.io.FileUtils;
public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        fill();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WhatsOnDisk");

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(122, 113, 113));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(236, 231, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("execute");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jCheckBox2.setText("read");
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jCheckBox3.setText("write");

        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel1.setText("PERMISSIONS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        jLabel2.setText(" FILE TYPE :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        jTextField1.setBackground(new java.awt.Color(122, 113, 113));
        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 220, -1));

        jTree1.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                jTree1TreeExpanded(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                ItChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ItChanged(javax.swing.event.TreeSelectionEvent evt) {                           
        // TODO add your handling code here:
        DefaultMutableTreeNode node =
                        (DefaultMutableTreeNode)evt.getPath().getLastPathComponent();
        this.fillAgain(node);
    }                          

    private void jTree1TreeExpanded(javax.swing.event.TreeExpansionEvent evt) {                                    
        // TODO add your handling code here:
        
    }                                   

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // System.setProperty("swing.disableFileSystemViewSpeedFix", "true");
                new NewJFrame().setVisible(true);
            }
        });
    }
private FileSystemView fileSystemView;
    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration                   

    private void fillAgain(DefaultMutableTreeNode node){
        jTree1.setEnabled(false);
            fileSystemView = new JFileChooser().getFileSystemView();
            try{
                DefaultMutableTreeNode z=node;
            String pathName="";
            pathName=z.toString().substring(0,z.toString().indexOf("("));
                        z=(DefaultMutableTreeNode)z.getParent();
                    while(!z.isRoot()){
                        if(z.toString().substring(0,z.toString().indexOf("(")).equals("/"))
                        pathName=z.toString().substring(0,z.toString().indexOf("("))+""+pathName;
                        else pathName=z.toString().substring(0,z.toString().indexOf("("))+"/"+pathName;
                        z=(DefaultMutableTreeNode)z.getParent();
                    }
                    //System.out.println(pathName);
                    File f = new File(pathName);
                    //System.out.println(new JFileChooser.getTypeDescription(f));
                File[] roots =fileSystemView.getFiles(f,true);
            for (File fileSystemRoot : roots) {
                float m =(float)FileUtils.sizeOf(new File(fileSystemRoot.getAbsolutePath()))/(1024*1024);
                String x=fileSystemRoot.getName()+"("+m+"MB)";
                DefaultMutableTreeNode nodew = new DefaultMutableTreeNode(x);
                node.add( nodew );
                
                File[] files = fileSystemView.getFiles(fileSystemRoot, true);
                for (File file : files) {
                    if (file.isDirectory()) {
                        float zz = (float)FileUtils.sizeOfDirectory(new File(file.getAbsolutePath()))/(1024*1024);
                        String c=file.getName()+"(("+zz+"MB))";
                        DefaultMutableTreeNode node1=new DefaultMutableTreeNode(c);
                        nodew.add(node1);
                        File[] filew = fileSystemView.getFiles(file,true);
                        for (File filex : filew) {
                            if (filex.isDirectory()) {
                        float zw = (float)FileUtils.sizeOfDirectory(new File(filex.getAbsolutePath()))/(1024*1024);
                        String cw=filex.getName()+"(("+zw+"MB))";
                        
                        node1.add(new DefaultMutableTreeNode(cw));
                        //System.out.println(cw);
                        
                    }
                    //else if(filex.isFile()) node.add(new DefaultMutableTreeNode(file.getName()));
                }
                        
                    }
                   // else if(file.isFile()) node.add(new DefaultMutableTreeNode(file.getName()));
                }
                //
            }}
       catch(Exception e){System.out.println(e);}
         jTree1.setEnabled(true);   
    }
    private void fill() {
        fileSystemView = new JFileChooser().getFileSystemView();
 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("/");
           DefaultTreeModel treeModel = new DefaultTreeModel(root);
       try{ File[] roots = fileSystemView.getRoots();
            for (File fileSystemRoot : roots) {
                String x=fileSystemRoot.getName()+"("+(fileSystemRoot.getUsableSpace()/(1024*1024*1024))+"GB)";
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(x);
                root.add( node );
                File[] files = fileSystemView.getFiles(fileSystemRoot, true);
                for (File file : files) {
                    if (file.isDirectory()) {
                        float zz = (float)FileUtils.sizeOfDirectory(new File(file.getAbsolutePath()))/(1024*1024*1024);
                        String c=file.getName()+"("+zz+"GB)";
                        DefaultMutableTreeNode node1=new DefaultMutableTreeNode(c);
                        node.add(node1);
                        //System.out.println();
                        File[] filew = fileSystemView.getFiles(file,true);
                        for (File filex : filew) {
                            if (filex.isDirectory()) {
                        float zw = (float)FileUtils.sizeOfDirectory(new File(filex.getAbsolutePath()))/(1024*1024);
                        String cw=filex.getName()+"("+zw+"MB)";
                        
                        node1.add(new DefaultMutableTreeNode(cw));
                        //System.out.println(node1.toString()+" "+node1.getParent().toString());
                        
                    }
                    //else if(filex.isFile()) node.add(new DefaultMutableTreeNode(file.getName()));
                }
                        
                    }
                    //else if(file.isFile()) node.add(new DefaultMutableTreeNode(file.getName()));
                }
                //
            }}
       catch(Exception e){System.out.println(e);}
        
        //DefaultTreeModel dmt = new DefaultTreeModel(root);
        this.jTree1.setModel(treeModel);
        jTree1.setRootVisible(false);
        
    }
}
