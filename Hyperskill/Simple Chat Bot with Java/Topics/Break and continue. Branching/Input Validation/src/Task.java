// This is a fill blanks task. You can use this editor as a playground

public class Task {
  public static void main(String[] args) {
    // put your code here
    for (int i = 0; i < 5; i++) {
      for (char letter = 'a'; letter <= 'f'; letter++) {
        if (letter < 'f') {
          continue;
        }
        System.out.println(letter);
      }
    }
  }
}
