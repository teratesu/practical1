package practice07;

public class ProcessStrings implements StringOperations {
    @Override
    public int countChars(String text) {
        return text.length();
    }

    @Override
    public String oddChars(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    @Override
    public String reverse(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }
}
