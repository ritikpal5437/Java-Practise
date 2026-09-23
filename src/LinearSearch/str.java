public class str {
    public static void main(String[] args) {
        String name ="Ritik";
        char target= 't';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;

        }
        // for (int i = 0; i < str.length(); i++) {
        //     if(target==str.charAt(i)){
        //     return true;
        //     }
        // 
         for (int i = 1; i <4; i++) {// basically for its range
            if(target==str.charAt(i)){
            return true;
            }
        }
    
    return false;
        }
    }
