import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cadeia (somente 0's e 1's): ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("A cadeia pertence à linguagem L = {0^n 1^n | n >= 0}");
        } else {
            System.out.println("A cadeia NÃO pertence à linguagem L = {0^n 1^n | n >= 0}");
        }
        scanner.close();
    }
    public static boolean isValid(String input) {
        int countZero = 0;
        int countOne = 0;
        boolean foundOne = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != '0' && currentChar != '1') {
                return false;
            }
            if (currentChar == '0') {
                if (foundOne) {
                    return false;
                }
                countZero++;
            } else if (currentChar == '1') {
                foundOne = true;
                countOne++;
            }
        }
        return countZero == countOne;
    }
}
