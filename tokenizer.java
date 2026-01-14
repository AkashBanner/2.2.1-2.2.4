public class tokenizer {
    public static void main(String[] args) {
        String tokenizer = "Will is a wizard ";
        int start = 0;
        int end;
        for (end = tokenizer.indexOf(' ', start); end != -1; end = tokenizer.indexOf(' ', start)) {
            String word = tokenizer.substring(start, end);
            
        }
    }
}
