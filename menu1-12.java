package soso;



import java.util.*;
import java.io.*;



         if(choice==1) {
            System.out.print("이름:");
            String w_date = scanner.nextLine();
            w_date = scanner.nextLine();
            System.out.print("전화번호:");
            String d_date = scanner.nextLine();
            System.out.print("이메일:");
            String detail = scanner.nextLine();
            h.put(memNO,new Phone(name,phone_num,email)); 
            memNO++;
         }
         else if (choice==2) {
             Set<Integer> keys = h.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
               Integer no = it.next();
               Phonebook todo = h.get(no);
                System.out.println("["+no+"]"+"전화번호:"+todo.getphone_num()+", 이름:"+phone.name()+", 이메일:"+phone.getemail()+"]");
                   }
            System.out.print("*******************************\n");
         }
        
      }
   }
}