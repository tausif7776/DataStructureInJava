package String;


public class ConsonantAndVowel {
    public static void main(String[] args) {
        String str = "i am the best and you";
        int vowelco=0;
        int consoco=0;

        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelco++;
                }
                else{
                    consoco++;
                }
            }
        }
        System.out.println(vowelco);
        System.out.println(consoco);
    }
}
