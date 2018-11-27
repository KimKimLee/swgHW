if(choice==1) {
				System.out.print("작성 날짜:");
				String w_date = scanner.nextLine();
				w_date = scanner.nextLine();
				System.out.print("마감 날짜:");
				String d_date = scanner.nextLine();
				System.out.print("내용:");
				String detail = scanner.nextLine();
				h.put(memNO,new Todolist(w_date,d_date,detail)); 
				memNO++;
			}