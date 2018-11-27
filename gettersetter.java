class Appoint implements Serializable{
   String location;
   String name;
   String date;
   int number=0;
   
   public String getloc() {
      return location;
   }
   public void setloc(String location) {
      this.location = location;
   }
   public String getname() {
      return name;
   }
   public void setname(String name) {
      this.name = name;
   }
   public String getdate() {
      return date;
   }
   public void setdate(String date) {
      this.date = date;
   }
   public int getnum() {
	      return number;
	   }
   public void setnum(int number) {
	      this.number = number;
	   }
   public  Appoint(String date, String name,String location) {
      this.name=name;
      this.location=location;
      this.date = date;
   }
}
