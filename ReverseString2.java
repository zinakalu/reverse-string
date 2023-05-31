//create a string to reverse
//call the reverse method inside main
//create reverse method and create an array
//create an index to track the current variable
//create a for loop to get each value backwards
//create a variable to store revered string
//create another for loop and append indices to variable
//print reversed string

public class ReverseString2{
    public static void main(String[] args){
        String string = "Zina";
        string = reverse("Zina");
        System.out.println(string);
    }

    public static String reverse(String s){
        char [] letters = new char[s.length()];

        int lettersIndex = 0;

        for (int i = s.length()-1; i >=0; i--){
            letters[lettersIndex] = s.charAt(i);
            lettersIndex++;
        }

        String reversedString = "";
        for (int i=0; i < s.length(); i++){
            reversedString += letters[i];
        }
        return reversedString;
    }
}