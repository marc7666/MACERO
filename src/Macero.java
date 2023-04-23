public interface Macero {
    int convertToASCII(char character);
    float encode(char character, int key);
    String decode(String cryptogram, int key);
    char ASCIIToCharacter(int code);
}
