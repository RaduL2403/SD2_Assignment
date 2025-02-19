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


    //Stub methods
    public boolean contains(char symbol){
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
            
        }
        return false;
    }
    public int length(){
        return this.letters.length;
    }
    public char[] getLetters(){
        return this.letters;
    }

}
