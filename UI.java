package sowegong;

import java.util.*;

public class UI {
   int aws;
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner a = new Scanner(System.in);
      
      
      while(true) {
         System.out.printf("********** MENU ************\n");
         System.out.printf("1.PHONE BOOK\n"); //����ó�� �̸�,��ȭ��ȣ,�̸��� ����,����,�߰�,����
         System.out.printf("2.TO DO LIST\n"); //to do list ����,����,���� => �� ��¥,due date,����
         System.out.printf("3.APPOITMENT\n");// ��� ����,����,����,���� =>��¥,����,���
         System.out.printf("4.EXIT\n");
         System.out.printf("WHICH SERVICE DO YOU WANT?>>");
         Integer aws = a.nextInt() ;   
         System.out.printf("****************************\n");

         if (aws ==1) {}
         else if (aws==2) {}
         else if (aws==3) {}
         else if (aws==4) {break;}
      }
   
   }
}