import static java.sql.JDBCType.ARRAY;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddItems {TheOutline t;
    private String prev_id;
    private int prevs_id;
    PreparedStatement st;
    DbConnection conn = new DbConnection();
    ResultSet res=null; 
    
    public void addArtWork(int Art_id,int Artist_id,String Title,String caption, String typeOfArt,int year,int MRP,int Dealer_id,int amount){
          System.out.println("haha");
        String s = "insert into art (Art_id,Artist_id,Title,Caption,Typeofart,Year,MRP,Dealer_id,amount) values(?,?,?,?,?,?,?,?,?);" ;
        try{
              
            st = conn.myConnection.prepareStatement(s);
            st.setInt(1,Art_id);
            st.setInt(2,Artist_id);
            st.setString(3,Title);
            st.setString(4,caption);
            st.setString(5,typeOfArt);
            st.setInt(6,year);
            st.setInt(7,MRP);
            st.setInt(8,Dealer_id);
            st.setInt(9,amount);
            
              
            
            int i=st.executeUpdate();
              
        }
        catch(SQLException e){
            System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);t.emptyPage3();
        }
    
    }
    
    public void addArtist(int Artist_id,String artist_name,String place,long phone,String styleOfArt ){
       // System.out.println(Artist_id+""+artist_name+""+place+""+phone+""+styleOfArt);
        String s= "insert into artist values(?,?,?,?,?);";
        try{
            st = conn.myConnection.prepareStatement(s);
            st.setInt(1,Artist_id);
            st.setString(2,artist_name);
            st.setString(3,place);
            st.setLong(4,phone);
            st.setString(5,styleOfArt);
            int i = st.executeUpdate();
        }
        catch(Exception e){
             System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);t.emptyPage3();
        }
    }
    
    public void addCustomer(int id,String name,long phone,String address){
        String s= "insert into customer (Customer_id,Name,Adress,Phone_no)values(?,?,?,?);";
        try{
            st = conn.myConnection.prepareStatement(s);
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3,address);
            st.setLong(4,phone);
            int i=st.executeUpdate();
        }
        catch(SQLException e){
        System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);t.emptyPage2();
        }
    }
    
    public void addDealer(int id,String name,long phone,String address){
        String s= "insert into dealer values(?,?,?,?);";
        try{
            st = conn.myConnection.prepareStatement(s);
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3,address);
            st.setLong(4,phone);
            int i=st.executeUpdate();
        }
        catch(SQLException e){
System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);t.emptyPage2();
        }
    }
    public boolean check1(int j,String tableName){
         try {
            Statement s = conn.myConnection.createStatement();
            if(tableName.equals("orders")){ res = s.executeQuery("select * from "+tableName+" where order_id="+j+";");}
         else res = s.executeQuery("select * from "+tableName+" where "+tableName+"_id="+j+";");
          if(res.next()) {System.out.println("check1 true");return true;}
        } catch (SQLException ex) {
            System.out.println(ex);return false;
        }
      return  false;
    }
    public String getTitle(int ord){
        
        try {
            Statement s = conn.myConnection.createStatement();
            res = s.executeQuery("select Title from art where Art_id="+ord+";");
             if(res.next()) return res.getString("Title"); 
        } catch (SQLException ex) {
            System.out.println(ex);
        }
           
      return null;   
      
    }
 
    void recipt_attributes(int order_id,Integer[][] input,int customer_id,int profit,String date){
        try{
           int i=1; System.out.println(input[i][0]+" "+input[i][1]+" "+customer_id+" "+order_id);
//            ArrayDescriptor descriptor = ArrayDescriptor.createDescriptor("int",conn.myConnection);
//            ARRAY arr = new ARRAY(descriptor,art_id);
//            ARRAY arr1 = new ARRAY(descriptor,price);
            while(input[i][0]!=null){
            System.out.println(input[i][0]+" "+input[i][1]+" "+customer_id+" "+order_id);    
            
            PreparedStatement ps = conn.myConnection.prepareStatement("INSERT INTO orders VALUES(?,?,?,'"+date+"',?,?);");
           // PreparedStatement pp = con.prepareStatement("INSERT INTO customer VALUES(?)");
           // PreparedStatement pp1 = con.prepareStatement("INSERT INTO art VALUES(?)");
            ps.setInt(3,input[i][0]);
            ps.setInt(4,profit);
            ps.setInt(5,input[i][1]);
            //ps.setArray(2,art_id);
            ps.setInt(2,customer_id);
            ps.setInt(1,order_id);
            ps.executeUpdate();
         i++;
            }
        }
        catch(Exception e){
System.out.println("error"+e);JOptionPane.showMessageDialog(null,"error","something went wrong ,try again",JOptionPane.INFORMATION_MESSAGE);t.emptyPage6();
    }
    }
    String getDate(String s){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern(s);  
        
   LocalDateTime now = LocalDateTime.now();  
   return (dtf.format(now)); 
    }
} 