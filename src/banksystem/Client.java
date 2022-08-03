/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Kareem_29
 */
public class Client {
    
    private int clientID;
    private String clientName ;
    private int clientBalance;
    
    public Client(){
        this.clientID=0;
        this.clientName=null;
        this.clientBalance=0; 
    }
    public Client (int ID, String Name, int Balance){
        this.clientID=ID;
        this.clientName=Name;
        this.clientBalance=Balance;        
    }
    
    public int getClientID(){
        return this.clientID;
    }
    
    public void setClientID(int ID){
        this.clientID=ID;
    }
    
    public String getClientName(){
        return this.clientName;
    }
    
    public void setClientName(String Name){
        this.clientName=Name;
    }
    
    public int getClientBalance() {
        return this.clientBalance;
    }
    
    public void setClientBalance(int Balance){
        this.clientBalance=Balance;
    }
    
    @Override
    public String toString(){
        return "ID: "+getClientID()+" , Name: "+getClientName()+" , Balance: "+getClientBalance()+"\n";
        
    }    
    
    public void withdraw(int amount){
        if(amount>getClientBalance()) System.out.println("You can't withdraw this amount! ");
        else
        this.clientBalance=getClientBalance()-amount;
        
    }
    
        public void deposite(int amount){
        this.clientBalance=getClientBalance()+amount;
    
}
        
        
}