public class Appointments{
   public static void main(String[] args) throws Exception {
	   
      HashMap<Integer, Appoint> h = new HashMap<Integer, Appoint>(); 
      Scanner scanner = new Scanner(System.in);
      
         int num =1 ;
      while(true) {
         System.out.println("1. 약속 추가하기(추가 그만하고 싶을 시에 '그만'이라고 적으면 됨)");
         System.out.println("2. 약속리스트 보기");
         System.out.println("3. 약속 수정하기 ");
         System.out.println("4. 약속 삭제하기 ");
         System.out.println("5. 종료");
         System.out.print("메뉴입력>>");
         int choice = scanner.nextInt();
	}
}