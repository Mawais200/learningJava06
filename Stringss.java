public class Stringss {
   public static void main(String[] args){
    
 String Fname ="Awais";
 String Lname="Nasir";
 //Concat
 String Full =Fname+""+Lname;
 System.out.println(Full);
   //length
   System.out.println(Full.length());
    //Character print of Strings
    for(int i=0;i<Full.length();i++){
        System.out.println(Full.charAt(i));
    }
        //compare
        if(Fname.compareTo(Lname)==0){
            System.out.println("strings equal");
        }else{
            System.out.println("Strings are not equal");
        }
    
        //subString of original array
        String Fullname="My name is Muhammad Awais";
String name= Fullname.substring(11);
System.out.println(name);
  
   }
  
  
   
   
   
}
