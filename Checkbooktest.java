package ttee;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.*;

class Checkbooktest {

   @Test
   void testphonebookcreate() {
      Phonebook createpb = new Phonebook();
      createpb.create("������","010-1111-2222","jusowegong@sooksook");
      createpb.create("�谡��","010-2222-3333","gasowegong@sooksook");
      createpb.create("�����","010-3333-4444","susowegong@sooksook");
      createpb.create("��ȿ��","010-4444-5555","hyosowegong@sooksook");
      createpb.create("�̱��pf","010-5555-6666","kysowegong@sooksook");
      System.out.println("view phonebook all");
      createpb.view();
      //fail("Not yet implemented");
   }
   @Test
   void testphonebookupdate() {
       Phonebook updatepb = new Phonebook();
          System.out.println("Before update phonebook no.3 email");
          updatepb.view("�����");
          updatepb.updateemail(3, "sukyungjjang@sooksook");
          System.out.println("After update phonebook no.3 email");
          updatepb.view("�����");
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
          createTodo.create("1/1","12/31","365�� �ϳ�!");
          createTodo.create("1/16","1/16","ȫ�Ῡ��");
          createTodo.create("1/13","1/14","�ް�ķ��");
          createTodo.create("3/2","3/6","���������Ⱓ");
          createTodo.create("4/5","4/10","�ҿ�������");
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
      createappoint.create("1/1","�谡��","������ 4���ⱸ");
      createappoint.create("2/2","�����","���迪 1���ⱸ");
      createappoint.create("3/3","������","�꺻�� 3���ⱸ");
      createappoint.create("4/4","�̸���","����");
      createappoint.create("5/5","�̱��pf","��Ű� 420");
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
           updateappoint.updateperson(2, "�̻���");
           System.out.println("After update appointment no.2 person ����� -> �̻���");
           updateappoint.view("2/2");
      }
   

}