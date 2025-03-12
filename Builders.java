public class Builders {
    public static void main(String[] args){
        StringBuilder sb =new StringBuilder("Awais");
        //Set Char
        sb.setCharAt(0,'O');
        System.out.println(sb);
        //insert
        sb.insert(0, 'O');
        System.out.println(sb);
        //delete
        sb.delete(0, 1);
        System.out.println(sb);
        //append
        sb.append("Nasir");
        System.out.println(sb);


        
    }
    
}
