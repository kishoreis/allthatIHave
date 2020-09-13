
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SignIn {
     DbConnection conn = new DbConnection();
        ResultSet res=null;
    public boolean login(String name,String password){
        if(name.equals(null)||password.equals(null)) return false;
        if(name.length()>20||password.length()>9) return false;
        
        String st="select * from userlist where `username`=? and `password`=?;";
       // conn.create(res);
        try{
            PreparedStatement s = conn.myConnection.prepareStatement(st);
            s.setString(1, name);
            s.setString(2,password);
            res=s.executeQuery();
            if(res.next())
            {System.out.println("Success!!!!");
            //JOptionPane.showMessageDialog(null,"login successful","",JOptionPane.INFORMATION_MESSAGE);
             return true;}
            else  return false; 
        }
        catch(SQLException e){ JOptionPane.showMessageDialog(null,"error connecting database","",JOptionPane.INFORMATION_MESSAGE);}
         return false;
    }

    public boolean regist(JLabel label[],String name,String username,String password,int age){
        System.out.println("after call"+name+username+password+age+"end call");
        if(name.equals(null)||password.equals(null)||username.equals(null)) {label[4].setVisible(true);return false;};
        if(9<password.length())  {label[1].setVisible(true); return false;}
        if(20<name.length())  {label[0].setVisible(true); return  false;}
        if(20<username.length())  {label[3].setVisible(true); return false ;}
        if(0>age&&120<age) {label[2].setVisible(true); return false ;}
        System.out.println("after check"+name+username+password+age+"end check");
   
        String st="insert into userlist(name,username,password,age) values('"+name+"','"+username+"','"+password+"','"+age+"')";
       // conn.create(res);
        try{
            PreparedStatement s = conn.myConnection.prepareStatement(st);
            int i=s.executeUpdate();
            if(i>0){
           return true;
            }
        }
        catch(SQLException e){ 
            if(e.getSQLState().startsWith("23")){
             label[5].setVisible(true);
             return false;
            }
            JOptionPane.showMessageDialog(null,"error with database,try again","",JOptionPane.INFORMATION_MESSAGE);
        return false;
            }
        return true;
    }
}
