        else if (choice==2) {
             Set<Integer> keys = h.keySet();
             Iterator<Integer> it = keys.iterator(); 
            while(it.hasNext()) {
                Integer number = it.next();
                Appoint app = h.get(number);
                System.out.println("["+number+" : "+"����?(��¥):"+app.getdate()+", ������?:"+app.getname()+", ���?:"+app.getloc()+"]");
            }
         }