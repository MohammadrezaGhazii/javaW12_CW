package org.example.Q3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
   private AtomicInteger balance = new AtomicInteger(0);

    public void deposit(int amount){
      this.balance.addAndGet(amount);
   }
   public void withdraw(int amount){
      if (balance.get() >= amount){
         this.balance =new AtomicInteger(this.balance.addAndGet(-amount));
      }
      else {
         System.out.println("your balance is not enough ");
      }

   }
}


