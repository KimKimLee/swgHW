package ttee;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.*;

class Checkbooktest {

   @Test
   void testphonebookcreate() {
      Phonebook createpb = new Phonebook();
      createpb.create("이주은","010-1111-2222","jusowegong@sooksook");
      createpb.create("김가영","010-2222-3333","gasowegong@sooksook");
      createpb.create("김수경","010-3333-4444","susowegong@sooksook");
      createpb.create("설효진","010-4444-5555","hyosowegong@sooksook");
      createpb.create("이기용pf","010-5555-6666","kysowegong@sooksook");
      System.out.println("view phonebook all");
      createpb.view();
      //fail("Not yet implemented");
   }
   @Test
   void testphonebookupdate() {
       Phonebook updatepb = new Phonebook();
          System.out.println("Before update phonebook no.3 email");
          updatepb.view("김수경");
          updatepb.updateemail(3, "sukyungjjang@sooksook");
          System.out.println("After update phonebook no.3 email");
          updatepb.view("김수경");
   }
   
   @Test
   void testphonebookdelete() {
      Phonebook deletepb = new Phonebook();
      System.out.println("phonebook : after delete 6");
      deletepb.delete(6);
      deletepb.view();
      //fail("Not yet implemented");
   }
   
   @Test
      void testtodolistcreate() {
          Todolist createTodo = new Todolist();
          createTodo.create("1/1","12/31","365일 일년!");
          createTodo.create("1/16","1/16","홍콩여행");
          createTodo.create("1/13","1/14","달고나캠프");
          createTodo.create("3/2","3/6","수강정정기간");
          createTodo.create("4/5","4/10","소웨공과제");
          System.out.println("view todolist all");
         // createTodo.view();
      }
   @Test
      void testtodolistdelete() {
         Todolist deletetodo = new Todolist();
           System.out.println("Todolist : after delete 2");
           deletetodo.delete(2);
           deletetodo.view();
   }

   @Test
   void testappointcreate() {
      Appointment createappoint = new Appointment();
      createappoint.create("1/1","김가영","수유역 4번출구");
      createappoint.create("2/2","김수경","범계역 1번출구");
      createappoint.create("3/3","이주은","산본역 3번출구");
      createappoint.create("4/4","이마루","들판");
      createappoint.create("5/5","이기용pf","명신관 420");
      System.out.println("view appointment all");
      createappoint.view();
      //fail("Not yet implemented");
   }

   @Test
   void testappointdelete() {
      Appointment deleteappoint = new Appointment();
      System.out.println("Appointment : after delete 4");
      deleteappoint.delete(4);
      deleteappoint.view();
      //fail("Not yet implemented");
   }
   @Test
      void testtappointupdate() {
         Appointment updateappoint = new Appointment();
           System.out.println("Before update appointment no.2 person");
           updateappoint.view("2/2");
           updateappoint.updateperson(2, "이빵빵");
           System.out.println("After update appointment no.2 person 김수경 -> 이빵빵");
           updateappoint.view("2/2");
      }
   

}