import java.util.StringTokenizer;

/**
 * @author: Marc Cervera Rosell
 * @project: MACERO
 * @date: 27/04/2023
 */
public class MaceroImpl implements Macero {
    private String toEncode;
    private int key;
    private String cryptogram;
    private String decodedCryptogram;
    private StringBuilder stringBuilder;

    public MaceroImpl(String toEncode, int key) {
        this.toEncode = toEncode;
        this.key = key;
        this.cryptogram = "";
        this.decodedCryptogram = "";
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public int convertToASCII(char character) {
        return character;
    }

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

    @Override
    public String decode(String cryptogram) {
        emptyStringBuilder();
        StringTokenizer str = new StringTokenizer(cryptogram, " ");
        while (str.hasMoreTokens()){
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

    private void emptyStringBuilder() {
        if (!stringBuilder.isEmpty()) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    @Override
    public char ASCIIToCharacter(int code) {
        return (char) code;
    }
}
