Quite = absolutamente
often = a menudo
quiet often = con frecuencia 

most used to assign different values to a variable depending on a certain condition.

it provides a compact way to express simple [[Conditional statement]]. instead of writing lengthy ``if - else `` constructs for **basic conditions** 

# what is the ternary operator?
operator which evaluates a condition and chooses one of tow cases to execute. 

``` Java
int a = ...;
int b = ...;
int max = ...;
if (a > b) {
max = a; 
} else {
max = b; 
}
```
```java
int max = a > b ? a : b;
```
```java
result = condition ? trueCase : elseCase;
```
```Java
int num = ...; // it's initialized by a value 
System.out.println(num % 2 == 0 ? "even" : "odd");
```
> Note: Java allows us to nest one ternary operator into another one, but it can be less readable than the corresponding conditional statement. If you do this, be careful.

**If else if **

```Java
int a = ...; // it's initialized by a value
int b = ...; // it's initialized by a value
String result = a == b ? "equal" :
				a > b ? "more" : "less";
```
