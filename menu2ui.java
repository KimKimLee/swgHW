
import java.util.*;
import java.io.*;


class Todolist implements Serializable{
	int num;
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
	public Todolist(String w_date,String d_date,String detail) {
		this.w_date=w_date;
		this.d_date=d_date;
		this.detail =detail;
	}
}

public class menu2{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<Integer,Todolist> h = new HashMap<Integer, Todolist>(); 
		Scanner scanner = new Scanner(System.in);
		//to do list ����,����,���� => �� ��¥,due date,����
			int memNO =1;
			int num =0 ;
		while(true) {
			System.out.println("1. to do list ����");
			System.out.println("2. to do list ���� ");
			System.out.println("3. to do list ����");
			System.out.println("4. to do list ����");
			System.out.println("5. ����");
			System.out.print("�޴� ��ȣ>>");
			
			int choice = scanner.nextInt();
			}
	}
}