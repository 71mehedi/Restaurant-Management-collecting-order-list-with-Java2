
package rmsx.ih.rmsx.Login_Layer.db;

import rmsx.ih.rmsx.Login_Layer.model.Customer;


/**
 *
 * @author ihzonaid
 */
public class DB {

 
    
    
    public Customer[] customers = new Customer[20];
    private int  index = 5;
    
    
    public DB(){
        getCustomer4Db();
        
        
    }
    
    public Customer[] getCustomer4Db(){
        customers[0] = new Customer("ih","abc");
        customers[1] = new Customer("think", "abc");
        customers[2] = new Customer("fs", "abc");
        customers[3] = new Customer("tani", "abc");
        customers[4] = new Customer("jani", "abc");
        return customers;
    }
    
    public  Customer addCustomer2Db(String name, String pass){
        customers[index] = new Customer(name,pass) ;
        index ++;
        return customers[index-1];
    }
    
    
    
    
}
