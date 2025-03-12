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
        //Reverse
        System.out.println(sb.reverse());
        //make a logic to reverse a string
        for(int i=0; i<sb.length()-1-i;i++){
            int start = i;
            int end = sb.length()-1-i;
            char frontchar =sb.charAt(start);
            char backchar=sb.charAt(end);
            sb.setCharAt(frontchar, backchar);
            sb.setCharAt(backchar, frontchar);


        }
        System.out.println(sb);



        
    }
    
}
