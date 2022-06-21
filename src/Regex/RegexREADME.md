# Regular Expression

A Java regular expression, or Java regex, is a sequence of characters that specifies a pattern which can be searched or manipulating strings/text. A regex defines a set of strings, usually united for a given purpose.
A regular expression can be a single character, or a more complicated pattern.
It is widely used to define the constraint on strings such as password and email validation. Regular Expressions are provided under __java.util.regex__ package. This consists of 3 classes and 1 interface.
Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

- __Pattern Class__ - Defines a pattern (to be used in a search).
- __Matcher Class__ - Used to search for the pattern. An engine that performs match operations on a character sequence by interpreting a Pattern.
- __PatternSyntaxException Class__ - Indicates syntax error in a regular expression pattern.

## Pattern Class:
This class is a compilation of regular expressions that can be used to define various types of patterns, providing no public constructors. This can be created by invoking the compile() method which accepts a regular expression as the first argument, thus returns a pattern after execution.

**compile(String) method**
The compile(String) method of the Pattern class in Java is used to create a pattern from the regular expression passed as parameter to method. Whenever you need to match a text against a regular expression pattern more than one time, create a Pattern instance using the Pattern.compile() method.

syntax
``` java
    public static pattern compile(String regex)
```

**Parameters**: This method accepts one single parameter regex which represents the given regular expression compiled into a pattern.
**Return Value**: This method returns the pattern compiled from the regex passed to the method as a parameter.

**split(CharSequence)**
split(CharSequence) method of a Pattern class used to splits the given char sequence passed as parameter to method around matches of this pattern.This method can split charSequence into an array of String’s, using the regular expression used to compile the pattern as a delimiter.so we can say that the method returns the array of strings computed by splitting the input around matches of this pattern.

```java
public String[] split(CharSequence input)
```
__Parameters:__ This method accepts a single parameter input which represents character sequence to be split.

__Return value:__ This method returns the array of strings computed by splitting the input around matches of this pattern.

__quote(String)__
quote(String) method of a Pattern class used to returns a literal pattern String for the specified String passed as parameter to method.This method produces a String equivalent to **"s"** that can be used to create a Pattern. Metacharacters or escape sequences in the input sequence will be given no special meaning. If you compile the value returned by the quote method, you’ll get a Pattern which matches the literal string that you passed as a parameter to method.\Q and \E mark the beginning and end of the quoted part of the string.

Syntax
```java
public static String quote(String s)
```

**Parameters:** This method accepts a single parameter s which represents the string to be literalized.

**Return value:** This method returns a literal string replacement for String s.

## Matcher Class:
Matcher class implements the MatchResult interface. It is a regex engine which is used to perform match operations on a character sequence. This too defines no public constructors. This can be implemented by invoking a matcher() on any pattern object.

**appendReplacement(StringBuffer, String):**
The appendReplacement(StringBuffer, String) method of Matcher class behaves as a appen-and-replace method. This method reads the input string and replace it with the matched pattern in the matcher string.

Syntax:
```java 
public Matcher appendReplacement(StringBuffer buffer, String stringToBeReplaced)
```
Parameters: This method take two parametes:
- buffer: which is the StringBuffer that stores the target string.
- stringToBeReplaced: which is the string to be replaced in the matcher.

**Matcher find()**
the find() method of matcher class attempts to find the next subsequence of the input sequence that find the pattern. it returns a booleans value showing the same.

Syntax:
```java
    public boolean find()
```
**Parameters:** This method do not takes any parameter.
**Return Value** This method returns a **boolean value** showing whether a subsequence of the input sequence find this matcher's pattern.

**Note**: _T Pattern.matches() checks if the whole text matches with a pattern or not. Other methods (demonstrated below) are mainly used to find multiple occurrences of patterns in the text._

**PatternSyntaxException Class**
This is an object of Regex which is used to indicate a syntax error in a regular expression pattern and is a unchecked exception. 


## Regular Expression Pattern.
Brackets are used to find a range of characters.
|  Expresssion   |     Description                                                          |
|    :----:      | :-----:                                                                  |
|  [abc]         | find one character from the options between the brackets.                |
|  [^abc]        | find one character NOT between the brackets                              |
|  [0-9]         | find one character from the range 0 to 9                                 |


## Metacharacters
Metacharacters are characters with a special meaning:

| Metacharacter |	Description                                                                              |
|  :----:       |   :------:                                                                                 |
|       |	    |  Find a match for any one of the patterns separated by | as in: cat|dog|fish               |
|       .       |  Find just one instance of any character                                                   |
|       ^       |  Finds a match as the beginning of a string as in: ^Hello                                  |       
|       $       |  Finds a match at the end of the string as in: World$                                      |
|      \d 	    |  Find a digit                                                                              |
|      \s	    |  Find a whitespace character                                                               |
|      \b	    | Find a match at the beginning of a word like: \bWORD, or at the end of a word like WORD\b  |
|    \uxxxx	    | Find the Unicode character specified by the hexadecimal number xxxx                        |

### Quantifiers.
Quantifiers define quantities:

|   Quantifier  |    Description                                                          |
|  :----:       |      :-----:                                                            |  
|     n+	    |  Matches any string that contains at least one n                        |
|     n*	    |  Matches any string that contains zero or more occurrences of n         |
|     n?	    |  Matches any string that contains zero or one occurrences of n          |
|     n{x}	    |  Matches any string that contains a sequence of X n's                   |
|     n{x,y}	|  Matches any string that contains a sequence of X to Y n's              |
|     n{x,}	    |  Matches any string that contains a sequence of at least X n's          |