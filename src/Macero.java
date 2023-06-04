public interface Macero {
    /**
     * Will convert a character to its ASCII code
     *
     * @param character to convert to its ASCII character
     * @return ASCII code of the character
     */
    int convertToASCII(char character);

    /**
     * Will encode the converted ASCII characters using logarithms
     *
     * @return cryptogram
     */
    String encode();

    /**
     * Will decode the cryptogram using exponentiation
     *
     * @param cryptogram encoded message
     * @return cryptogram decoded
     */
    String decode(String cryptogram);

    /**
     * Will convert an ASCII code into its character
     *
     * @param code ASCII code of a character
     * @return character of the introduced code
     */
    char ASCIIToCharacter(int code);

}
