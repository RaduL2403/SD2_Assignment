//Radu Lupu 3130999
package griffith;

public class Word {

    //attribute
    private char[] letters;

    //constructor
    public Word(char[] letters) {
        if (letters == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }
        this.letters = letters;
    }


    //method to check if the word contains a specific letter
    public boolean contains(char symbol){
        //loop to check if the word contains the letter
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }

        }
        return false;   //return false if the letter is not found
    }

    //method to find the length of the word
    public int length(){
        return this.letters.length;
    }

    //method to get the letters of the word
    public char[] getLetters(){
        return this.letters;
    }

}
