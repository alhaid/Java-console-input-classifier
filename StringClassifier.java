/*
 Name:  [Hamzah Shafeeq]
 Assignment:  [Lab6]
 Program: [Computer Programmer]
 
 [This is a class can be used to classify the user's input and determine how
 many key strokes,letters, upper case letters, lower case letters,even numbers,
 odd numbers and digits are in there and print the result out to the user]
 */
public class StringClassifier{
    //making private attributes
    private String string;
    private int keyStrokes;
    private int letters;
    private int digits;
    private int upperCase;
    private int lowerCase;
    private int oddNums;
    private int evenNums;
    
    //constructor
    public StringClassifier (String string) throws IllegalArgumentException{
        setString(string);
        keyStrokes = 0;
        letters = 0;
        digits = 0;
        upperCase = 0;
        lowerCase = 0;
        oddNums = 0;
        evenNums = 0;
        classify(string);
    }
    //set method
    public void setString (String string) throws IllegalArgumentException{
        if (string != null && !string.equals("")){
            this.string = string;
        }else{
            throw new IllegalArgumentException ("You have to enter something"
                + " you can not leave it empty");
        }
    }
    //get method
    public String getString() { return string;}
    //classifier method 
    public void classify (String string){ 
        //for loop to check what the user
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            keyStrokes = string.length();//to check how many strokes
            if(Character.isLetter (c)){
                letters ++;
            }
            if(Character.isDigit (c)){
                digits ++;
                if(c%2 == 0){
                    evenNums ++;
                }else{
                    oddNums ++;
                }
            }
            if(Character.isLowerCase (c)){
                lowerCase ++;
            }
            if(Character.isUpperCase (c)){
                upperCase ++;
            }
        }
    }
    //toString method to print out what the user have typed
    public String toString() {
        return String.format("you string iformation:\n\nkeyStrokes: %d%n"
            + "Letters %d%nUpper-case: %d%nLower-case: %d%nDigits: %d%n"
            + "Even: %d%nOdd: %d%n", keyStrokes, letters, upperCase, lowerCase,
             digits, evenNums, oddNums);
    }
}