package ttee;


import java.io.Serializable;
import java.util.*;

public class Scheduler {
   int aws;
   public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  Scanner scanner = new Scanner(System.in);
      while(true) {
         System.out.printf("********** MENU ************\n");
         System.out.printf("1.PHONE BOOK\n"); 
         System.out.printf("2.TO DO LIST\n"); 
         System.out.printf("3.APPOITMENT\n");
         System.out.printf("4.EXIT\n");
         System.out.printf("WHICH SERVICE DO YOU WANT?>>");
         Integer aws = a.nextInt() ;   
         System.out.printf("****************************\n");
         Todolist tt=new Todolist();
         Phonebook kk=new Phonebook();
         Appointment aa=new Appointment();
         
         if (aws ==1) {
            while(true) {
                 System.out.println("1. phonebook ����");
                 System.out.println("2. phonebook ���� ");
                 System.out.println("3. phonebook ����");
                 System.out.println("4. phonebook ����");
                 System.out.println("5. ����");
                 System.out.print("�޴� ��ȣ>>");
                 
                 int choice = scanner.nextInt();
                 
                 if (choice==1){
                    System.out.print("�̸�:");
                    String name = scanner.next();
                     System.out.print("��ȭ��ȣ:");
                     String phonenum = scanner.next();
                     System.out.print("�̸���:");
                     String email = scanner.next();
                    kk.create(name,phonenum,email);
                    }
                 
                 if (choice==2){
                   kk.view();
                   }
                 
                 if (choice==3){
                    kk.view();
                    System.out.print("������ �̸��� �Է��Ͻÿ�:");
                    String d_name=scanner.next();
                    kk.view(d_name);
                    System.out.print("�����Ͻ� member no�� ���ÿ�:");
                     int del_num= scanner.nextInt();
                     kk.delete(del_num);
                    }
                 
                 if (choice==4){
                     kk.view();
                     System.out.print("�����Ͻ� �̸��� �Է��Ͻÿ�:");
                     String u_name= scanner.next();
                     kk.view(u_name);
                     
                     System.out.print("�����Ͻ�  member no�� ���ÿ�:");
                     Scanner scanner1 = new Scanner(System.in);
                     int up_num= scanner.nextInt();
   
                      System.out.print("1.�̸�\n");
                      System.out.print("2.��ȭ��ȣ\n");
                      System.out.print("3.�̸���\n");
                      System.out.print("�����Ͻ� �׸� no:");
                      int b= scanner1.nextInt();
              
                         if(b==1) {
                            System.out.print("�̸�:");
                            String name = scanner.nextLine();
                             name = scanner.nextLine();

                              kk.updatename(up_num,name);
                         }
                         if (b==2) {
                             System.out.print("��ȭ��ȣ:");
                            String phonenum = scanner.nextLine();
                            phonenum = scanner.nextLine();
                                kk.updatenumber(up_num, phonenum);
                         }
                         if (b==3) {
                            System.out.print("�̸���:");
                            String email = scanner.nextLine();
                            email = scanner.nextLine();
                                kk.updateemail(up_num, email);
                         }
                     
                 }
                      System.out.print("*******************************\n");

                 if (choice==5){break;}
                 }}
         
         else if (aws==2) { 
         
         while(true) {
             System.out.println("1. to do list ����");
             System.out.println("2. to do list ���� ");
             System.out.println("3. to do list ����");
             System.out.println("4. to do list ����");
             System.out.println("5. ����");
             System.out.print("�޴� ��ȣ>>");
             
             int choice = scanner.nextInt();
             
             if (choice==1){
                System.out.print("�ۼ� ��¥:");
                String w_date = scanner.next();
                 System.out.print("���� ��¥:");
                 String d_date = scanner.next();
                 System.out.print("����:");
                 String detail = scanner.next();
                tt.create(w_date,d_date,detail);
                }
             
             if (choice==2){
               tt.view();
               }
             
             if (choice==3){
                System.out.print("�����Ͻ� no�� ���ÿ�:");
                 int del_num= scanner.nextInt();
                 tt.delete(del_num);
                }
             
             if (choice==4){
                 tt.view();
             
                 System.out.print("�����Ͻ�  member no�� ���ÿ�:");
                 int up_num= scanner.nextInt();

                 System.out.print("1.������¥\n");
                 System.out.print("2.����\n");
                 System.out.print("�����Ͻ� �׸� no:");
                 int b= scanner.nextInt();

          
                  if(b==1) {
                      System.out.print("���� ��¥:");
                      String d_date = scanner.nextLine();
                      d_date = scanner.nextLine();
                      tt.updatedate(up_num, d_date);
                   }
                   if (b==2) {
                      System.out.print("����:");
                      String detail = scanner.nextLine();
                      detail = scanner.nextLine();
                      tt.updatedetail(up_num, detail); 
                   }                 
             }
             if (choice==5){break;}
       
        }}
         else if (aws==3) {
           
             
             while(true) {
                 System.out.println("1. appointment ����");
                 System.out.println("2. appointment ���� ");
                 System.out.println("3. appointment ����");
                 System.out.println("4. appointment ����");
                 System.out.println("5. ����");
                 System.out.print("�޴� ��ȣ>>");
                 
                 int choice = scanner.nextInt();
                 
                 if (choice==1){
                    System.out.print("��¥:");
                    String date = scanner.next();
                     System.out.print("������ ���:");
                     String persons = scanner.next();
                     System.out.print("���:");
                     String location = scanner.next();
                    aa.create(date,persons,location);
                    }
                 
                 if (choice==2){
                   aa.view();
                   }
                 
                 if (choice==3){
                    aa.view();
                    System.out.print("������ ��¥�� �Է��Ͻÿ�:");
                    String d_date=scanner.next();
                    aa.view(d_date);
                    System.out.print("�����Ͻ� date no�� ���ÿ�:");
                     int del_num= scanner.nextInt();
                     aa.delete(del_num);
                    }
                 
                 if (choice==4){
                    aa.view();
                     System.out.print("�����Ͻ� ��¥�� �Է��Ͻÿ�:");
                     String u_date= scanner.next();
                     aa.view(u_date);
                     System.out.print("�����Ͻ� date no�� ���ÿ�:");
                     int up_num= scanner.nextInt();

                     System.out.print("1.��¥\n");
                     System.out.print("2.������ ���\n");
                     System.out.print("3.���\n");
                     System.out.print("�����Ͻ� �׸� no:");
                     int b= scanner.nextInt();
               

                         if(b==1) {
                             System.out.print("��¥:");
                              String day = scanner.nextLine();
                              day = scanner.nextLine();

                               aa.updateday(up_num,day);
                         }
                         if (b==2) {
                               System.out.print("������ ���:");
                                String persons = scanner.nextLine();
                                persons = scanner.nextLine();
                                aa.updateperson(up_num, persons);
                         }
                         if (b==3) {
                            System.out.print("���:");
                             String location = scanner.nextLine();
                             location = scanner.nextLine();

                                aa.updatelocation(up_num, location);
                         }
                     
                 }
                 
                 if (choice==5){break;}
         }}
         else if (aws==4) {break;}
      }}
}
 class Phone implements Serializable{

   String name;
    String phonenum;
    String email;

   public String getname() {
      return name;
      }
   public void setname(String name) {
      this.name = name;
      }   
   public String getphonenum() {
      return phonenum;
      }
   public void setphonenum(String phonenum) {
      this.phonenum = phonenum;
      }
   public String getemail() {
      return email;
      }
   public void setemail(String email) {
      this.email = email;
      }
   public Phone(String name,String phonenum,String email) {
      this.name=name;
      this.phonenum=phonenum;
      this.email=email;
      }
   }

class Phonebook{
   
   static HashMap<Integer,Phone> p = new HashMap< Integer, Phone>();
   static int pmemNO=1;
   
   public void main(String[] args) throws Exception {
    
      }
 
   public void create(String name, String phonenum, String email) {
      
      p.put(pmemNO,new Phone(name,phonenum,email)); 
        pmemNO++;
        }
        
     public void view() {
           
             Set<Integer> keys = p.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
                Integer no = it.next();
                Phone pp = p.get(no);
                System.out.println("["+no+"]"+" [�̸�:"+pp.getname()+", ��ȭ��ȣ:"+pp.getphonenum()+", �̸���:"+pp.getemail()+"]");
                   }
            System.out.print("*******************************\n");
         }
     
     public void view(String v_name) {
        
         Set<Integer> keys = p.keySet();
          Iterator<Integer> it = keys.iterator(); 
          
          while(it.hasNext()) {
             Integer no = it.next();
              Phone pp = p.get(no);
              
              if(v_name.equals(pp.getname()))
              System.out.println("["+no+"]"+" [�̸�:"+pp.getname()+", ��ȭ��ȣ:"+pp.getphonenum()+", �̸���:"+pp.getemail()+"]");
              }
         System.out.print("*******************************\n");
         }
     
     public void delete(int del_num) {
        Phone m = p.get(del_num);
        if(m!=null)
           p.remove(del_num);
        else System.out.println("error!");
         }
        
     public void updatename(int up_num, String name){
        Phone l = p.get(up_num);
         p.put(up_num,new Phone(name,l.getphonenum(),l.getemail()));   
     }
     public void updatenumber(int up_num,String phonenum){
        Phone l = p.get(up_num);
        p.put(up_num,new Phone(l.getname(),phonenum,l.getemail()));  
     }
     public void updateemail(int up_num, String email){
        Phone l = p.get(up_num);
        p.put(up_num,new Phone(l.getname(),l.getphonenum(),email));  
    }
   }


class Todo implements Serializable{
      
   
    String w_date;
    String d_date;
    String detail;

   public String getw_date() {
      return w_date;
      }
   public void setw_date(String w_date) {
      this.w_date = w_date;
      }   
   public String getd_date() {
      return d_date;
      }
   public void setd_date(String d_date) {
      this.d_date = d_date;
      }
   public String getdetail() {
      return detail;
      }
   public void setDetail(String detail) {
      this.detail = detail;
      }
   public Todo(String w_date,String d_date,String detail) {
      this.w_date=w_date;
      this.d_date=d_date;
      this.detail =detail;
      }
   }

class Todolist{
 
    static HashMap<Integer,Todo> h = new HashMap< Integer, Todo>();
   
     static int memNO=1;
   public void main(String[] args) throws Exception {
   
      
     
         }
      
 
   public void create(String w_date, String d_date, String detail) {
       
        
            h.put(memNO,new Todo(w_date,d_date,detail)); 
            memNO++;
         }
        
     public  void view() {
           
             Set<Integer> keys = h.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
                Integer no = it.next();
                Todo to = h.get(no);
                System.out.println("["+no+"]"+" [�ۼ���¥:"+to.getw_date()+", ������¥:"+to.getd_date()+", ����:"+to.getdetail()+"]");
                   }
            System.out.print("*******************************\n");
         }
        
     public void view(String start_date) {
         
         Set<Integer> keys = h.keySet();
          Iterator<Integer> it = keys.iterator(); 
          
          while(it.hasNext()) {
             Integer no = it.next();
              Todo to = h.get(no);
              
              if(start_date.equals(to.getd_date()))
                 System.out.println("["+no+"]"+" [�ۼ���¥:"+to.getw_date()+", ������¥:"+to.getd_date()+", ����:"+to.getdetail()+"]");
          }
         System.out.print("*******************************\n");
         }
     
        public void delete(int del_num) {
           view();
           Todo m = h.get(del_num);
              if(m!=null)
               h.remove(del_num);
              else System.out.println("error!");
         }
        
        
        public void updatedate(int up_num, String d_date){
           Todo m = h.get(up_num);
           h.put(up_num,new Todo(m.getw_date(),d_date,m.getdetail())); 
   
        }
        public void updatedetail(int up_num,String detail){
           Todo m = h.get(up_num);
           h.put(up_num,new Todo(m.getw_date(),m.getd_date(),detail)); 
        }        
      }

class App implements Serializable{

   String date;
    String persons;
    String location;

   public String getdate() {
      return date;
      }
   public void setname(String date) {
      this.date = date;
      }   
   public String getpersons() {
      return persons;
      }
   public void setphonenum(String persons) {
      this.persons = persons;
      }
   public String getlocation() {
      return location;
      }
   public void setemail(String location) {
      this.location = location;
      }
   public App(String date,String persons,String location) {
      this.date=date;
      this.persons=persons;
      this.location=location;
      }
   }

class Appointment{
   
   static HashMap<Integer,App> a = new HashMap< Integer, App>();
   static int amemNO=1;
   
   public static void main(String[] args) throws Exception {
      
         
      }
 
   public void create(String date, String persons, String location) {
      
      a.put(amemNO,new App(date,persons,location)); 
        amemNO++;
        }
        
     public void view() {
           
             Set<Integer> keys = a.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
                Integer no = it.next();
                App aa = a.get(no);
                System.out.println("["+no+"]"+" [��¥:"+aa.getdate()+", ������ ���:"+aa.getpersons()+", ���:"+aa.getlocation()+"]");
                   }
            System.out.print("*******************************\n");
         }
     
     public  void view(String v_date) {
        
          Set<Integer> keys = a.keySet();
          Iterator<Integer> it = keys.iterator(); 
          
          while(it.hasNext()) {
             Integer no = it.next();
              App aa = a.get(no);
              
              if(v_date.equals(aa.getdate()))
               System.out.println("["+no+"]"+" [��¥:"+aa.getdate()+", ������ ���:"+aa.getpersons()+", ���:"+aa.getlocation()+"]");
              }
         System.out.print("*******************************\n");
         }
     
     public void delete(int del_num) {
        App m = a.get(del_num);
        if(m!=null)
           a.remove(del_num);
        else System.out.println("error!");
         }
        
     
     public void updateday(int up_num, String date){
        App l = a.get(up_num);
        a.put(up_num,new App(date,l.getpersons(),l.getlocation())); 
     }
     public void updateperson(int up_num, String person){
        App l = a.get(up_num);
         a.put(up_num,new App(l.getdate(),person,l.getlocation()));  
     }
     public void updatelocation(int up_num, String location){
        App l = a.get(up_num);
        a.put(up_num,new App(l.getdate(),l.getpersons(),location));  
     } 

     }