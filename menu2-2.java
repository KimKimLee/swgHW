if (choice==2) {
				 Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [�ۼ���¥:"+todo.getw_date()+", ������¥:"+todo.getd_date()+", ����:"+todo.getdetail()+"]");
					 	}
				System.out.print("*******************************\n");
			}