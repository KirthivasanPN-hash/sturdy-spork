public class String_search {
    public static void main(String[] args) {
        String name = "Kirthivasan";
        char letter = 'h';
        System.out.println(search(name,letter));
    }
    static boolean search(String name, char tar){
        if(name.length()==0){
            return false;
        }
        for(char ch:name.toCharArray()) {
            if (ch == tar) {
                return true;
            }
        }
        return false;
    }
}
  
