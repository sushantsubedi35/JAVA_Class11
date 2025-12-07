import java.util.scanner;
public void classwork1{
    
    public static void main(String[] args){
        Scanner input = new scanner(System.in);

        String alpha = input.nextLine();

        System.out.println("please Enter Letter From A to Z");

        if(alpha == 'a'||alpha == 'e' || alpha == "i" || alpha =='i' || alpha == 'o' || alpha == 'u'){
            System.out.println("The Entered Letter Is Vowel letter");
        }

        +