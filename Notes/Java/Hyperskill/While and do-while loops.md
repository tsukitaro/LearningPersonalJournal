# While
block of code and condition (a Boolean expresion)

if the condition is ``true``, the code within the block is executed. This code repeats until the condition becomes ``false``. the condition is check before the block is executed, is also known as a **pre-test loop**

Syntax
```Java
while (condition) { // body: do something repetitive 
}
```
infinite loop if the condition is invariably ``true``: 
```java
while (true) {
	// body: do something indefinitely
}
```
**Example** letters in English
```java
public class WhileDemo {

	public static void main(String[] args){
		char letter = 'A';
		while (letter <= 'Z'){
			System.out.printnl(letter);
			letter++;
		}

	}
}
```
## do-while loop
in this loop the body is executed first, while the condition is tested afterwards. if the condition is ``true``, statements within the block are executed again. This repeats until the condition becomes ``false``.
because do-while check the condition after is executed, the control structure is often also known as a **post-test loop**
Syntax
```java
do { // body: do something 
} while (condition);
```
```java
public class DoWhileDemo {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int value; do { value = scanner.nextInt(); 
		 System.out.println(value); } while (value != 0); 
	} 
}
```

**In practice, the do-while loop is used less than the while loop. It is used when code inside the loop must be executed at least once.**

## Reading a sequence with an unknown length

The `while` loop can also be used to read a sequence of characters of an arbitrary length. For that, we can invoke the `hasNextInt()` method of `Scanner` inside the condition. The method returns `true` if the next element is an integer number and `false` otherwise.

Here is a code that calculates the sum of all elements from the provided sequence:

```java
Scanner scanner = new Scanner(System.in);
int sum = 0;
while (scanner.hasNextInt()) {
	int elem = scanner.nextInt();
	sum += elem;
} 
System.out.println(sum);
```
