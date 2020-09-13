
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbConnection {
    static String[] x=new String[2];
    public Connection myConnection;
    //int timeha;
    public static void main(String[] rgs){
        DbConnection b = new DbConnection();
        x[1] = "hfghg";
        try{System.out.println((int)art.ARTISTID.getName());
        }catch(Exception e){
                System.out.println(e);
                }
        
    }
    private enum art{
        ARTID(0),ARTISTID(1),TorN(2),ToA(3),DEALID(4),AMT(5),CAP(6),BPLC(7),PH(8),MRP(9),
        ID(10),NAME(11),ADDRESS(12),CUSTPH(13);
        private int a;
       
        art(int i){
            a=i;
        }
        public int getName(){
            return a;
        }
    } 
    
    /** Creates a new instance of MyDBConnection */
    public DbConnection() {
         try{
        
        Class.forName("com.mysql.jdbc.Driver");
             myConnection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/artgallery","root", "root"
                     
             );
        
       
        }
        catch(ClassNotFoundException | SQLException e){ 
      System.out.println(e);
        }
    }
 }
