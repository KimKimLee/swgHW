        else if (choice==2) {
             Set<Integer> keys = h.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
                Integer number = it.next();
                Appoint app = h.get(number);
                System.out.println("["+number+" : "+"언제?(날짜):"+app.getdate()+", 누구와?:"+app.getname()+", 어디서?:"+app.getloc()+"]");
            }
         }