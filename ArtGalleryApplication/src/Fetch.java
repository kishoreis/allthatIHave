
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krishna
 */
public class Fetch {
    Statement st,st1;
    DbConnection conn = new DbConnection();
    ResultSet res=null,resx=null; 
      public Fetch(){}  
    public Fetch(JTable t,String method){
        clearTable(t);
        String s = "select * from "+method+";" ;
        try{
            st = conn.myConnection.createStatement();
            res=st.executeQuery(s);
            
        }
        catch(SQLException e){
            System.out.println(e+"here");
        }
    }
    
    public void fetchArt(JTable artTable){
          clearTable(artTable);
       try{
           st = conn.myConnection.createStatement();
             resx =st.executeQuery("select Title,Caption,Typeofart,Year,MRP,Artist_name from art,artist where art.Artist_id = artist.Artist_id group by Title;");
       }
       catch(SQLException e){System.out.println(e+"outside");}
            try{
                while(resx.next()) {
                    Object[] row={resx.getString("Title"),resx.getString("Artist_name"),resx.getString("caption"),resx.getString("Typeofart"),resx.getInt("Year"),resx.getInt("MRP"),resx.getString("Artist_name"),};
                    DefaultTableModel model =(DefaultTableModel) artTable.getModel();
                    model.addRow(row);
                    }
               }catch(SQLException e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
      
       catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
        
    }
    
    public void fetchArtist(JTable artistTable){
         clearTable(artistTable);
       
            try{
                while(res.next()) {
                    Object[] row={res.getString("Artist_id"),res.getString("Artist_name"),res.getString("Birth_place"),res.getInt("Phone_no"),res.getString("Styleofart")};
                    DefaultTableModel model =(DefaultTableModel) artistTable.getModel();
                    model.addRow(row);
                }
               }catch(SQLException e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
      
        catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
        
    }
    
    public void fetchCustomer(JTable dealerTable){
         clearTable(dealerTable);
            try{
                while(res.next()) {
                    Object[] row={res.getString("Customer_id"),res.getString("Name"),res.getString("Phone_no"),res.getString("adress"),res.getString("Total_prchs")};
                    DefaultTableModel model =(DefaultTableModel) dealerTable.getModel();
                    model.addRow(row);
                }
               }catch(SQLException e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);;}
      
        catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
        
    }
    
    public void fetchDealer(JTable dealerTable){
        try {
            clearTable(dealerTable);
            
            
            while(res.next()) {
                Object[] row={res.getString("Dealer_id"),res.getString("Name"),res.getString("Phone_no"),res.getString("Adress")};
                DefaultTableModel model =(DefaultTableModel) dealerTable.getModel();
                model.addRow(row);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Fetch.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error"+ex);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
        
    }
    public int[] fetchOrder(JTable dealerTable,String a,String b,String c){
        int z=0;
        System.out.println(a+""+b);
        int[] x=new int[2];
        clearTable(dealerTable);
         try{if(b.equals("date")) z=0;
         else z=parseInt(a);
             Boolean r;
             System.out.println(a+""+b);
             CallableStatement cal = conn.myConnection.prepareCall("{call trans("+z+",'"+b+"','"+c+"')}");
         r = cal.execute();
        if(r){ res = cal.getResultSet();
                while(res.next()) {
                    Object[] row={res.getString("Order_id"),res.getString("Customer_id"),res.getString("Art_id"),res.getString("Date"),res.getString("Profit"),res.getString("Price")};
                    DefaultTableModel model =(DefaultTableModel) dealerTable.getModel();
                    model.addRow(row);
                }}
        r=cal.getMoreResults();
        if(r){res = cal.getResultSet();
        if(res.next()){x[0]=res.getInt("sum(Price)");x[1]=res.getInt("sum(Profit)");}
        return x;
        
               }}catch(SQLException e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
      
        catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
    return x;}
   public void fetchOrder(JTable orderTable){
       try{
       st=conn.myConnection.createStatement();
         res=st.executeQuery("select * from orders;");
                while(res.next()) {
                    Object[] row={res.getString("Order_id"),res.getString("Customer_id"),res.getString("Art_id"),res.getString("Date"),res.getString("Profit"),res.getString("Price")};
                    DefaultTableModel model =(DefaultTableModel) orderTable.getModel();
                    model.addRow(row);
                }
               }catch(SQLException e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
      
        catch(Exception e){System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);}
   } 
    public static final synchronized void clearTable(JTable jTable1){
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        int numrows = model.getRowCount();
        for(int i = numrows - 1; i >=0; i--)
            {
                model.removeRow(i);
            }
    }
    
    public void fetchBill(JTable order,ResultSet res){
         
    }
    
}
