/*
 Name:  [Hamzah Shafeeq]
 Assignment:  [Lab6]
 Program: [Computer Programmer]
 
 [This is a program to get the user's input and classify how many key strokes,
 letters, upper case letters, lower case letters, even numbers, odd numbers
 and digits are in there and print the result out to the user]
 */
import javax.swing.JOptionPane;

public class TestStringClassifier{
    
        public static void main(String[] args){
            //to catch the compile error
            try{
            //prompt the user to enter some text
            String str = JOptionPane.showInputDialog(null,
                "Enter a sentence to classify.",
                "Sentence Input", JOptionPane.QUESTION_MESSAGE);
            //use classifier class to determine the users input
            StringClassifier classifier = new StringClassifier(str);
            //desplay the information
            JOptionPane.showMessageDialog(null, classifier.toString(),
                "String Information", JOptionPane.INFORMATION_MESSAGE);
            } catch(IllegalArgumentException ex){
                System.out.print(ex.getMessage());
            }
        }
}