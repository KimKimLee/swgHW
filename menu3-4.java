         else if (choice==4) {
        	 
        	 System.out.print("��¥ �Է�:");
             String n = scanner.nextLine();
             n = scanner.nextLine();
             
        	 Set<Integer> keys = h.keySet();
             Iterator<Integer> it = keys.iterator(); 
             while(it.hasNext()) {
            	
                Integer number = it.next();
                Appoint app = h.get(number);
                
    			if(n.equals(app.getdate())) 
    				System.out.println("["+number+" : "+"����?(��¥):"+app.getdate()+", ������?:"+app.getname()+", ���?:"+app.getloc()+"]");
             }
                System.out.println("delete which number?/n");
         
                int ans = scanner.nextInt();
                	h.remove(ans);	
         }
         
