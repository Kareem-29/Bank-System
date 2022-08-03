/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;
import java.util.ArrayList;
/**
 *
 * @author Maryoom
 */
public class ClientList {
    
    private ArrayList<Client> clientList=new ArrayList<Client>();
    
    public void addClient(Client c){
        clientList.add(c);
    }
    
    public Client searchClientID(int ID){
       Client search=null;
       for(Client c:clientList )
            if(c.getClientID()==ID)
            {
            search=c;
            break;
            }
       return search;
}
    
    public void displayClientList(){
        if(clientList.isEmpty())
            System.out.println("No Client entered! ");
        else
        System.out.println(clientList);
    }
}