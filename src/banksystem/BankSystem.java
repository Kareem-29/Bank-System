/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.Scanner;

/**
 *
 * @author Kareem_29
 */
public class BankSystem {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ClientList s=new ClientList();
         

        int cho=0;
        int cho2=0;
        do{
            System.out.println("Welcome to the Bank System!");
            System.out.println("[1]Administrator\n[2]Client\nChoice");
            cho=input.nextInt();
            
            switch(cho){
                case 1:
                    System.out.println("Welcome Admin!");
                    System.out.println("[1] Add Client\n[2]View All Clients\n[3] Exit\nChoice");
                    int cho1=input.nextInt();
                    switch(cho1){
                        case 1:
                            Client c1=new Client();
                            System.out.println("Enter Client ID: ");
                            int id=input.nextInt();
                            c1.setClientID(id);
                            System.out.println("Enter Client Name: ");
                            String name=input.next();    
                            c1.setClientName(name);
                            System.out.println("Enter Client Balance: ");
                            int balance=input.nextInt();  
                            c1.setClientBalance(balance);
                           
                           s.addClient(c1);
                           break;
                        case 2:
                             s.displayClientList();
                           break;
                        case 3:
                            System.exit(0);
                        
                    }
                    break;
                case 2:
                    System.out.println("Enter your ID: ");
                    int id=input.nextInt();
                    if(s.searchClientID(id)==null)
                        System.out.println("Client not found! ");
                    else {
                        do{
                    System.out.println("Welcome "+s.searchClientID(id).getClientName());
                    System.out.println("[1] Withdraw\n[2] Deposit\n[3] Balance\n[4] Exit\nChoice: ");
                    cho2=input.nextInt();
                    switch(cho2){
                        case 1:
                    System.out.println("Enter amount to withdraw: ");
                    int amount=input.nextInt();
                    s.searchClientID(id).withdraw(amount);
                        break;
                        case 2:
                            System.out.println("Enter amount to deposite: ");
                            int amount1=input.nextInt();
                            s.searchClientID(id).deposite(amount1);
                            break;
                        case 3:
                            System.out.println("Your Balance: "+s.searchClientID(id).getClientBalance());
                            break;
                        case 4:
                            System.exit(0);    
                    }
                    }while(cho2 !=4);
                        
                        }

        }
        
        
        
    }
    while(cho!=5);
}
}
