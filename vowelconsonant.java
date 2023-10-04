public class vowelconsonant {
    public static void main(String[] args) {
        String str="gla university";
        int vowels=0, consonant=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
            
            else if((ch>='a' && ch<='z')){
                consonant++;
            }

        }
        System.out.println("vowels="+vowels);
             System.out.println("consonant="+consonant);
    }
    
}
