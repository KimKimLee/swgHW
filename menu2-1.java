if(choice==1) {
				System.out.print("�ۼ� ��¥:");
				String w_date = scanner.nextLine();
				w_date = scanner.nextLine();
				System.out.print("���� ��¥:");
				String d_date = scanner.nextLine();
				System.out.print("����:");
				String detail = scanner.nextLine();
				h.put(memNO,new Todolist(w_date,d_date,detail)); 
				memNO++;
			}