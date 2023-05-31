public class ReverseString{
    public static void main(String[] args){
        String r = reverse("dog"); //A
        System.out.println(r);
    }

    public static String reverse(String s){ //B
        char[] letters = new char[s.length()]; //C

        int letterIndex = 0; //D
        for (int i = s.length()-1; i >= 0; i--){ //E
           letters[letterIndex] = s.charAt(i); //F
           letterIndex++; //G
        }
        String reverse = ""; //H
        for (int i=0; i < s.length(); i++){ //I
            reverse += letters[i]; //J
        }
        return reverse;
    }
}

//A: calls the 'reverse' method and assigns the returned value to the variable 'r'
//B: defines a public static method named 'reverse' that takes a String parameter 's' and returns a String
//C: Creates a char array named 'letters' with a length equal to the length of the input string 's'
//D: initializes an integer variable named 'letterIndex' with an initial value of 0. This variable is 
//used to keep track of the current index position in the 'letters' array where the reversed characters will be stored
//E: starts a loop that iterates from the last character of the string 's' to the first character
//F: 'string.charAt(index)' is a method used to retrieve the character at a specific index position within a string. 's.charAt(i)'
//retireves the character at index 'i' from the string 's'. The 'charAt()' method takes an index as an argument and returns
//the character at that index in the string. Therefore the line 'letters[letterIndex] = s.charAt(i)' assigns the current
//character of 's' to the 'letters' array at the corresponding index 'letterIndex'
//G: increments the 'letterIndex' by 1
//H: initializes an empty string variable named 'reverse'
//I: starts a loop that iterates from the first character of the string 's' to the last character
//J: appends the character at the 'i' index of the 'letters' array to the 'reverse' string




