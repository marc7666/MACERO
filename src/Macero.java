/**
 * @author: Main
 * @project: MACERO
 * @date: 23/04/2023
 */
public interface Macero {
    int convertToASCII(char character);

    String encode();

    String decode(String cryptogram, int key);

    char ASCIIToCharacter(int code);

}
