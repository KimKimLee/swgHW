package soso;



import java.util.*;
import java.io.*;



         if(choice==1) {
            System.out.print("�̸�:");
            String w_date = scanner.nextLine();
            w_date = scanner.nextLine();
            System.out.print("��ȭ��ȣ:");
            String d_date = scanner.nextLine();
            System.out.print("�̸���:");
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
                System.out.println("["+no+"]"+"��ȭ��ȣ:"+todo.getphone_num()+", �̸�:"+phone.name()+", �̸���:"+phone.getemail()+"]");
                   }
            System.out.print("*******************************\n");
         }
        
      }
   }
}