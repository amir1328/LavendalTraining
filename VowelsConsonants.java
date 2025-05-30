public class VowelsConsonants {
    public static void main(String[] args) {
        String str="ameer";
        char[]newarr=str.toCharArray();
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            if(newarr[i]=='a'||newarr[i]=='e'||newarr[i]=='i'||newarr[i]=='o'||newarr[i]=='u'){
                vowels++;
            }
            else
                consonants++;
        }
        System.out.println("Vowels= "+vowels+"\n"+"Consonants="+consonants);
    }
}
