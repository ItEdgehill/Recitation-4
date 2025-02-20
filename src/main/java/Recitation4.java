public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < word.length(); index += 1){
            char ch = word.charAt(index);
            if(Character.isLetter(ch)){
                StringBuilder test = new StringBuilder(ch + "");
                sb.append(test.repeat(test, index));

            }else if(Character.isDigit(ch)){

                int letter_value;
                for(letter_value = 0; (Character.getNumericValue(ch))>letter_value; letter_value++){
                    sb.append(ch);
                }
            }else{
                sb.append(word.substring(0, index));
            }

        }
        return sb.toString();
    }
}

/*
1. Assume we have a variable called word
2. Assume we have a variable called sb
3. start with first character
4. if the character is a digit, then, duplicate based on its value
5. else if the character is a letter, then duplicate by its position
6. else if the character is not a letter and not a digit, then append string up to but not including
7. get next character
8. if there is a character, then goto 4
9. Done
*/
