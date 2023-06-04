import java.util.StringTokenizer;

public class MaceroImpl implements Macero {
    private String toEncode;
    private int key;
    private String cryptogram;
    private String decodedCryptogram;
    private StringBuilder stringBuilder;

    /**
     * Constructor that initializes all the necessary elements
     *
     * @param toEncode Text to encrypt
     * @param key      Encoding/decoding key
     */
    public MaceroImpl(String toEncode, int key) {
        this.toEncode = toEncode;
        this.key = key;
        this.cryptogram = "";
        this.decodedCryptogram = "";
        this.stringBuilder = new StringBuilder();
    }

    /**
     * @param character to convert to its ASCII code
     * @return ASCII code of the character
     */
    @Override
    public int convertToASCII(char character) {
        return character;
    }

    /**
     * Encodes the String using the key as the base of a logarithm and the ASCII code
     * of the character as the argument of the logarithm.
     *
     * @return A String with the cryptogram
     */
    @Override
    public String encode() {
        for (int i = 0; i < toEncode.length(); i++) {
            int ascii = convertToASCII(toEncode.charAt(i));
            float encoded = (float) (Math.log10(ascii) / Math.log10(key)); /*Logarithm operation. Base = key and Argument = ascii code*/
            float shortenedNumber = Math.round(encoded * 1000f) / 1000f; /*Picking 3 decimals*/
            stringBuilder.append(shortenedNumber).append(" "); /*Building the solution*/
        }
        cryptogram = stringBuilder.toString();
        emptyStringBuilder();
        return cryptogram;
    }

    /**
     * Decodes a cryptogram using the exponentiation
     * The key is used as the base and each number of the cryptogram as the exponent.
     *
     * @param cryptogram is the text to decode
     * @return A String with the decoded text
     */
    @Override
    public String decode(String cryptogram) {
        emptyStringBuilder();
        StringTokenizer str = new StringTokenizer(cryptogram, " ");
        while (str.hasMoreTokens()) {
            Double value = Double.parseDouble(str.nextToken());
            double asciiWithDecimals = Math.pow(key, value);
            int asciiWithNoDecimals = (int) Math.round(asciiWithDecimals);
            char character = ASCIIToCharacter(asciiWithNoDecimals);
            stringBuilder.append(character);
        }
        decodedCryptogram = stringBuilder.toString();
        emptyStringBuilder();
        return decodedCryptogram;
    }

    /**
     * Empties the StringBuilder used in the encoding a decoding processes
     */
    private void emptyStringBuilder() {
        if (!stringBuilder.isEmpty()) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    /**
     * Converts an ASCII code to its character
     */
    @Override
    public char ASCIIToCharacter(int code) {
        return (char) code;
    }
}
