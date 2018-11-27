package sowegong;

import java.util.*;

public class UI {
   int aws;
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner a = new Scanner(System.in);
      
      
      while(true) {
         System.out.printf("********** MENU ************\n");
         System.out.printf("1.PHONE BOOK\n"); //연락처에 이름,전화번호,이메일 수정,갱신,추가,삭제
         System.out.printf("2.TO DO LIST\n"); //to do list 생성,수정,삭제 => 쓴 날짜,due date,내용
         System.out.printf("3.APPOITMENT\n");// 약속 삭제,수정,생성,보기 =>날짜,누구,어디
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