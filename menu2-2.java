if (choice==2) {
				 Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [작성날짜:"+todo.getw_date()+", 마감날짜:"+todo.getd_date()+", 내용:"+todo.getdetail()+"]");
					 	}
				System.out.print("*******************************\n");
			}