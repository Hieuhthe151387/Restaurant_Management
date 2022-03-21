/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import Model.Customer;
import Model.Employee;
import Model.Order;
import Model.Product;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBconnect {
    private Connection con;

    public DBconnect() {
        try {
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=restaurantDB";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    public Connection getCon() {
        return con;
    }
    public Account getAccount(String account, String password){
        String query = "select * from accountTB where Account='"+account+"' AND Password='"+password+"'";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("Account"));
                a.setPassword(rs.getString("Password"));
                a.setAuthority(rs.getInt("Authority"));
                a.setName(rs.getString("Username"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Employee getEmployee(String account){
        String query = "select * from EmployeesTB where Account='"+account+"'";// get Employee by account have been check
        Employee em = new Employee();
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {                
                em.setID(rs.getString("EmployeeId"));
                em.setName(rs.getString("EmployeeName"));
                em.setGender(rs.getByte("Gender")==1);
                em.setDob(rs.getDate("Dob"));
                em.setPhoneNumber(rs.getString("PhoneNumber"));
                em.setAddress(rs.getString("Address"));
                em.setRole(rs.getString("Role"));
                em.setSalary(rs.getDouble("Salary"));
                em.setShortname(rs.getString("Shortname"));
            }
        } catch (Exception e) {
        }
        return em;
    }
    public Employee getEmployeeById(String id){
        String query = "select * from EmployeesTB where EmployeeId=?";
        Employee em = new Employee();
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {                
                em.setID(rs.getString("EmployeeId"));
                em.setName(rs.getString("EmployeeName"));
                em.setGender(rs.getByte("Gender")==1);
                em.setDob(rs.getDate("Dob"));
                em.setPhoneNumber(rs.getString("PhoneNumber"));
                em.setAddress(rs.getString("Address"));
                em.setRole(rs.getString("Role"));
                em.setSalary(rs.getDouble("Salary"));
                em.setShortname(rs.getString("Shortname"));
            }
        } catch (Exception e) {
        }
        return em;
    }
    public String getNewId(int status){
            String query1 = "SELECT MAX(EmployeeId) As LastId FROM EmployeesTB";
            String query2 = "SELECT MAX(product_id) As LastId FROM Product";
            String query3 = "Select MAX(CustID) As LastId from CustomersTB";
            String query4 = "SELECT MAX(order_id)as LastId  FROM [Order]";
            String query;
            String id=null;
            switch(status){
                case 1: query = query1;
                        break;
                case 2: query = query2;
                        break;
                case 3: query = query3;
                        break;
                case 4: query = query4;
                        break;
                default: return null;
            }
            try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                id=rs.getString("LastId");
            }
        } catch (Exception e) {
        }
            String digit = id.substring(2);
            StringBuffer newid = new StringBuffer(id.substring(0, 2));

            int i= Integer.parseInt(digit);
            i++;
            newid = newid.append((i<10?"0"+i:i+""));
        return newid.toString();
    }
        public void addEmployee(Employee e){
//                    (ID,Name,gender,Dob,Phone,address,role,Salary,Shortname)
            String insert1="Insert into EmployeesTB values(?,?,?,'"+e.getDoB()+"',?,?,?,?,null,null,?)";
//            String insert="Insert into EmployeesTB values('EM04',N'Hoàng Văn Khuê',0,'2001-01-02','0123459876',N'Trạch Xá, Hoà Lâm, Ứng Hoà, Hà Nội',N'Phục vụ',6000000,null,null,N'Khuê')";
        try {
            PreparedStatement statement = con.prepareStatement(insert1);
            statement.setString(1,e.getID());
            statement.setString(2,e.getName());
            statement.setBoolean(3,e.isGender());
            statement.setString(4,e.getPhoneNumber());
            statement.setString(5,e.getAddress());
            statement.setString(6,e.getRole());
            statement.setDouble(7,e.getSalary());
            statement.setString(8,e.getShortname());
             statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        public void updateEmployee(Employee e){
            String update ="UPDATE EmployeesTB SET EmployeeName = ?,Gender=?, Dob=?," +
            "PhoneNumber =?,[Address]=?,[Role]=?,Salary= ?,ManagerID=null," +//,Account=null ?
            "ShortName=? WHERE EmployeeId=?" ;
             try {
            PreparedStatement statement = con.prepareStatement(update);
            statement.setString(1,e.getName());
            statement.setBoolean(2,e.isGender());
            statement.setDate(3, e.getDob());
            statement.setString(4,e.getPhoneNumber());
            statement.setString(5,e.getAddress());
            statement.setString(6,e.getRole());
            statement.setDouble(7,e.getSalary());
            statement.setString(8,e.getShortname());
            statement.setString(9,e.getID());
             statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    public ArrayList<Employee> getListEmployees(){
        ArrayList<Employee> list = new ArrayList<>();
        String query = "SELECT * FROM EmployeesTB";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {                
                Employee em = new Employee();
                em.setID(rs.getString("EmployeeId"));
                em.setName(rs.getString("EmployeeName"));
                em.setGender(rs.getByte("Gender")==1);
                em.setDob(rs.getDate("Dob"));
                em.setPhoneNumber(rs.getString("PhoneNumber"));
                em.setAddress(rs.getString("Address"));
                em.setRole(rs.getString("Role"));
                em.setSalary(rs.getDouble("Salary"));
                em.setShortname(rs.getString("Shortname"));
                list.add(em);
            }
        } catch (Exception e) {
        }
        return list;
    }
    public int deleteEmployee(String id){
        String sql = "DELETE FROM EmployeesTB WHERE EmployeeId = ?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            int i = state.executeUpdate();
            return i;
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
//    CRUD for Customer
    public ArrayList<Customer> getListCustomer(){
        ArrayList<Customer> list = new ArrayList<Customer>();
        String sql = "SELECT * FROM CustomersTB WHERE CustID<>'CS01';";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Customer cust = new Customer();
                cust.setID(rs.getString("CustID"));
                cust.setName(rs.getString("CustName"));
                cust.setAge(rs.getInt("Age"));
                cust.setGender(rs.getBoolean("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.setAccount(rs.getString("Account"));
                cust.setShortname(rs.getString("Shortname"));
                cust.setPhoneNumber(rs.getString("Phonenum"));
                list.add(cust);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public String getEmployeeName(String id){
        String sql = "SELECT * FROM EmployeesTB WHERE EmployeeId=?;";
        String name = "";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                name =rs.getString("EmployeeName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    public String getCustName(String id){
        String sql = "SELECT * FROM CustomersTB WHERE CustID=?;";
        String name = "";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                name =rs.getString("CustName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    public Customer getCustomerById(String id){
        String sql = "SELECT * FROM CustomersTB WHERE CustID=?;";
        Customer cust = new Customer();
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                cust.setID(rs.getString("CustID"));
                cust.setName(rs.getString("CustName"));
                cust.setAge(rs.getInt("Age"));
                cust.setGender(rs.getBoolean("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.setAccount(rs.getString("Account"));
                cust.setShortname(rs.getString("Shortname"));
                cust.setPhoneNumber(rs.getString("Phonenum"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cust;
    }
    public void createCust(Customer c){
        String sql = "INSERT INTO CustomersTB(CustID,CustName,Age,Gender,[Address],Account,Shortname,Phonenum)" +
"VALUES (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1,c.getID());
            state.setString(2,c.getName());
            state.setInt(3, c.getAge());
            state.setBoolean(4, c.isGender());
            state.setString(5,c.getAddress());
            state.setString(6, c.getAccount());
            state.setString(7, c.getShortname());
            state.setString(8,c.getPhoneNumber());
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void updateCust(Customer c){
        String sql = "UPDATE CustomersTB SET CustName = ?, Age=?, Gender =?, [Address] = ?, Shortname =?, Phonenum = ? WHERE CustID =?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1,c.getName());
            state.setInt(2, c.getAge());
            state.setBoolean(3, c.isGender());
            state.setString(4,c.getAddress());
//            state.setString(5, c.getAccount());
            state.setString(5, c.getShortname());
            state.setString(6,c.getPhoneNumber());
            state.setString(7,c.getID());
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteCust(String id){
        String sql = "DELETE FROM CustomersTB WHERE CustID = ?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createProduct(Product p){
        String query = "INSERT INTO Product VALUES(?,?,?,?,?);";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1,p.getId());
            state.setString(2, p.getName());
            state.setDouble(3, p.getPrice());
            state.setDouble(4, p.getCost());
            state.setDouble(5, p.getQuantity());
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Product getProductById(String id){
        Product p = new Product();
        String sql = "SELECT * FROM Product WHERE product_id = ?";
        try {
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, id);
            ResultSet rs = state.executeQuery();
            if(rs.next())
            {
            p.setId(rs.getString("product_id"));
            p.setName(rs.getString("productname"));
            p.setPrice(rs.getDouble("price"));
            p.setCost(rs.getDouble("cost"));
            p.setQuantity(rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    public ArrayList<Product> getListProduct(){
        ArrayList<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product";
        try {
            PreparedStatement state = con.prepareStatement(query);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getString("product_id"));
                p.setName(rs.getString("productname"));
                p.setPrice(rs.getDouble("price"));
                p.setCost(rs.getDouble("cost"));
                p.setQuantity(rs.getInt("quantity"));  
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void deleteProduct(String id){
        String query ="DELETE FROM Product WHERE product_id = ?;";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1,id);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateProduct(Product p){
        String query = "UPDATE Product SET productname = ?,price = ?, cost=?, quantity=? WHERE product_id =?;";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, p.getName());
            state.setDouble(2, p.getPrice());
            state.setDouble(3, p.getCost());
            state.setInt(4,p.getQuantity());
            state.setString(5,p.getId());
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateProductQuantity(String id,int quan){
        String query = "UPDATE Product SET quantity = ? WHERE product_id =?;";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setInt(1,quan);
            state.setString(2,id);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Order> getOrderList(){
        String query = "SELECT * FROM [Order]" +
                       "ORDER BY order_date DESC;";
        ArrayList<Order> list = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(query);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Order o = new Order();
                o.setId(rs.getString("order_id"));
                o.setDate(rs.getDate("order_date"));
                o.setCustid(rs.getString("cust_id"));
                o.setEmid(rs.getString("employee_id"));
                o.setStatus(rs.getInt("status"));
                o.setType(rs.getInt("type"));
                o.setOrderdetail(new ArrayList<>());
                list.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }    
    
    public ArrayList<Order> getOrderWaitList(){
        String query = "SELECT * FROM [Order] WHERE status <> 3 AND order_date < GETDATE() AND order_date > GETDATE()-1 ORDER BY order_date DESC;";
        ArrayList<Order> list = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(query);
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                Order o = new Order();
                o.setId(rs.getString("order_id"));
                o.setDate(rs.getDate("order_date"));
                o.setCustid(rs.getString("cust_id"));
                o.setEmid(rs.getString("employee_id"));
                o.setStatus(rs.getInt("status"));
                o.setType(rs.getInt("type"));
                o.setOrderdetail(new ArrayList<>());
                list.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Order getOrderById(String id){
        Order o = new Order();
        String query="SELECT * FROM (SELECT o.*,od.product_id,p.productname,od.quantity,od.price,od.cost "
                + "FROM [Order] o, Order_detail od,Product p WHERE o.order_id = od.order_id AND p.product_id = od.product_id)s " +
                "WHERE order_id = ?;";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1,id);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                o.setId(rs.getString("order_id"));
                o.setDate(rs.getDate("order_date"));
                o.setCustid(rs.getString("cust_id"));
                o.setEmid(rs.getString("employee_id"));
                o.setStatus(rs.getInt("status"));
                o.setType(rs.getInt("type"));
                Product p = new Product();
                p.setId(rs.getString("product_id"));
                p.setName(rs.getString("productname"));
                p.setPrice(rs.getDouble("price"));
                p.setCost(rs.getDouble("cost"));
                p.setQuantity(rs.getInt("quantity"));  
                list.add(p);
            }
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getString("product_id"));
                p.setName(rs.getString("productname"));
                p.setPrice(rs.getDouble("price"));
                p.setCost(rs.getDouble("cost"));
                p.setQuantity(rs.getInt("quantity"));  
                list.add(p);   
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        o.setOrderdetail(list);
        return o;
    }
    
    public void addneworder(Order o){
        try {
            con.setAutoCommit(false);
            PreparedStatement sql1 = con.prepareStatement("INSERT INTO [Order] VALUES(?,?,?,?,?,?)");
            sql1.setString(1,o.getId());
            sql1.setDate(2,o.getDate());
            sql1.setString(3,o.getCustid());
            sql1.setString(4,o.getEmid());
            sql1.setInt(5,o.getStatus());
            sql1.setInt(6, o.getType());
            sql1.executeUpdate();
            PreparedStatement sql2 = con.prepareStatement("INSERT INTO Order_detail(order_id,product_id,quantity,price,cost) VALUES (?,?,?,?,?)");
            for(Product p: o.getOrderdetail()){
                sql2.setString(1,o.getId());
                sql2.setString(2,p.getId());
                sql2.setInt(3,p.getQuantity());
                sql2.setDouble(4, p.getPrice());
                sql2.setDouble(5, p.getCost());
                sql2.executeUpdate();
            }
            con.commit();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void setStatus(String oid,int status){
        String query = "UPDATE [Order] SET status=? WHERE order_id=?";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setInt(1,status);
            state.setString(2,oid);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateCustOrder(String cid){
        try {
            PreparedStatement state = con.prepareStatement("UPDATE [Order] set cust_id ='CS01' where cust_id = ?;");
            state.setString(1,cid);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateEmOrder(String eid){
        try {
            PreparedStatement state = con.prepareStatement("UPDATE [Order] set employee_id ='CS01' where employee_id = ?;");
            state.setString(1,eid);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllItemInOrder(String oid){
        String query = "DELETE FROM Order_detail WHERE order_id=?";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1,oid);
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteOrder(String oid){
        try {
            con.setAutoCommit(false);
            deleteAllItemInOrder(oid);
            PreparedStatement sql = con.prepareStatement("DELETE FROM [Order] where order_id='"+oid+"'");
            sql.executeUpdate();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                con.commit();
            } catch (SQLException ex) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updatemetadataorder(Order o){
        String query ="UPDATE Order SET order_date=?,cust_id=?,employee_id=?,status=?,type=? WHERE order_id=?";
        try {
            PreparedStatement state = con.prepareStatement(query);
            state.setDate(1, o.getDate());
            state.setString(2, o.getCustid());
            state.setString(3, o.getEmid());
            state.setInt(4, o.getStatus());
            state.setInt(5, o.getType());
            state.setString(6, o.getId());
            state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateorder(Order o){
        try {
            con.setAutoCommit(false);
            deleteAllItemInOrder(o.getId());
            updatemetadataorder(o);
            PreparedStatement sql2 = con.prepareCall("INSERT Order_detail(order_id,product_id,quantity,price,cost) VALUES (?,?,?,?,?)");
            for(Product p: o.getOrderdetail()){
                sql2.setString(1,o.getId());
                sql2.setString(2,p.getId());
                sql2.setInt(3,p.getQuantity());
                sql2.setDouble(4, p.getPrice());
                sql2.setDouble(5, p.getCost());
            }
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

//class demo{
//    public static void main(String[] args) {
//        DBconnect db = new DBconnect();
////        System.out.println(db.getCustName("CS02")+db.getEmployeeName("EM02"));
////        Order o = db.getOrderById("OD01");
////        System.out.println(o.getId()+" "+o.getCustid()+" "+o.getEmid()+" "+o.getDate()+" "+o.getStatus()+" "+o.getType()+" "+o.getOrderdetail().size());
////        db.setStatus("OD05", 2);
////        o = db.getOrderById("OD05");
////        System.out.println(o.getId()+" "+o.getCustid()+" "+o.getEmid()+" "+o.getDate()+" "+o.getStatus()+" "+o.getType()+" "+o.getOrderdetail().size());
////        for(Product p: o.getOrderdetail()){
////            System.out.println(p.getId()+" "+p.getName()+" "+p.getcost()+" "+p.getprice());
////        }
//        for(Order ol: db.getOrderWaitList()){
//            System.out.println(ol.getId()+" "+ol.getCustid()+" "+ol.getEmid()+" "+ol.getDate()+" "+ol.getStatus()+" "+ol.getType());
//        }
////        o.setId("OD05");
////        db.deleteOrder("OD05");
////        db.deleteOrder("OD05");
////        System.out.println(o.getTotal()+" "+o.getBenefit());
//    }
//}
