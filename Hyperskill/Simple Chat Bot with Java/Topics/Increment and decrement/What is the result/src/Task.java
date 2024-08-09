// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    int a = 4; // 5
    int b = a++; //4
    int c = --a + b++; //a4 + 4 =8
    int result = ++a - (c++ - b) + c; // 5 - 3 + 9
    System.out.println(result);
  }
}
