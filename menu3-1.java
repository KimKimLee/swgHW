         if(choice==1) {
        	
            System.out.print("����?(��¥) :");
            String date = scanner.nextLine();
            date = scanner.nextLine();
            System.out.print("������? :");
            String name = scanner.nextLine();
            System.out.print("���? :");
            String location = scanner.nextLine();
            
            h.put(num, new Appoint(date,name,location)); 
            num++;
            
            /* String line = scanner.nextLine();
 			if(line.equals("�׸�")) {
 				break;
 			}*/
 		}
