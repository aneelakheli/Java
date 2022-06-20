# Regular Expression

A Java regular expression, or Java regex, is a sequence of characters that specifies a pattern which can be searched or manipulating strings/text. A regex defines a set of strings, usually united for a given purpose.
A regular expression can be a single character, or a more complicated pattern.
It is widely used to define the constraint on strings such as password and email validation.
Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

- Pattern Class - Defines a pattern (to be used in a search).
- Matcher Class - Used to search for the pattern. An engine that performs match operations on a character sequence by interpreting a Pattern.
- PatternSyntaxException Class - Indicates syntax error in a regular expression pattern.

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



## Matcher Class:
Matcher class implements the MatchResult interface. It is a regex engine which is used to perform match operations on a character sequence.