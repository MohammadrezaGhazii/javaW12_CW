package org.example.Q3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
   private int balance;

   public void deposit(int amount){
      this.balance += amount;
      System.out.println("new balance is :" + this.balance);
      
   }
   public void withdraw(int amount){
      if (balance >= amount){
         this.balance -=amount;
      }
      else {
         System.out.println("your balance is not enough ");
      }

   }
}


