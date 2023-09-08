public class StringReverser {
    public String reverseString(String originalString) {
        char stringChar;
        String reversedString = "";
        for (int i = 0; i < originalString.length(); i++) {
            stringChar = originalString.charAt(i); //extracts each character
            reversedString = stringChar + reversedString; //adds each character in front of the existing string
        }
        return reversedString;
    }
}
