         if(choice==1) {
        	
            System.out.print("언제?(날짜) :");
            String date = scanner.nextLine();
            date = scanner.nextLine();
            System.out.print("누구와? :");
            String name = scanner.nextLine();
            System.out.print("어디서? :");
            String location = scanner.nextLine();
            
            h.put(num, new Appoint(date,name,location)); 
            num++;
            
            /* String line = scanner.nextLine();
 			if(line.equals("그만")) {
 				break;
 			}*/
 		}
