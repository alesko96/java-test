package pl.sii.eu;

/**
 * Implement method hasDuplicateCharacters that will return true if given input string has any duplicated letters.
 * Method should be case sensitive and ignore whitespace characters.
 */
@FunctionalInterface
interface DuplicateChecker {
    boolean hasDuplicateCharacters(String input){
        int counter=0;
        boolean bool = false;
        String s = input.trim();
        String upper = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==upper.charAt(i))
                counter++;
         }
        if(counter>0)
            bool = true;
        
        return bool;
    }

    hasDuplicateCharacters("String");
}
