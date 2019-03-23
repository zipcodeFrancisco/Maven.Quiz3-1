# Quiz 3

## Overview
* This quiz has 5 sections.
	1. fundamentals
		* `VowelUtils`
		* `StringUtils`
		* `PigLatinGenerator` - Difficult
	2. arrays
		* `SquareArrayAnalyzer`
		* `TicTacToe`
		* `WaveGenerator` - Difficult
	3. object orientation
		* `LabStatus`
		* `RockPaperScissors`
	4. collections
		* `Lab`
		* `Student`
	5. generics
		* `ArrayUtility` - Difficult

















## Fundamentals

### VowelUtils
* **Description**
	* The purpose of this class is to create utility methods to be used to assist in the completion of `PigLatinGenerator`.
* **Methods to Complete**
	* `Boolean hasVowels(String word)`
	* `Integer getIndexOfFirstVowel(String word)`
	* `Boolean startsWithVowel(String word)`
	* `Boolean isVowel(Character character)`


### StringUtils
* **Description**
	* The purpose of this class is to create utility methods to be used to assist in the completion of `WaveGenerator`.
* **Methods to Complete**
	* `String capitalizeNthCharacter(String str, Integer indexToCapitalize)`
	* `Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString)`
	* `String[] getAllSubStrings(String string)`
	* `Integer getNumberOfSubStrings(String input)`

-
### PigLatinGenerator
* **Description**
	* Pig Latin is an English language game where the goal is to hide the meaning of a word from people not aware of the rules. 
	* Given a `String` representative of a _word_, the rules are as follows:
		* If the word starts with a vowel, then return the original string with `"way"` appended.
		* If the word starts with a consonant, then shift consonants from the beginning of the word to the end of the word until the first vowel. Then, return the newly shifted string with `"ay"` appended.
		* If the word has no vowels, then return the original string plus "ay".


#### Example
* **Sample Program**

```
public static void main(String[] args) {
	PigLatinGenerator p = new PigLatinGenerator();
	System.out.println(p.translate("Map");
	System.out.println(p.translate("Apple");
	System.out.println(p.translate("Map Apple");
	System.out.println(p.translate("Psych");
}
```

* **Output**

```
apMay
Appleway
apMay Appleway
Psychay
```


















## Arrays


### Square Array Checker
* Given two arrays `a` and `b` write a method `compare(a, b)` that returns true if the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in `b` are the elements in `a` squared, regardless of the order.


#### Example 1 - Valid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
```
* `compare(a, b)` returns true because in `b`
	* 121 is the square of 11,
	* 14641 is the square of 121,
	* 20736 the square of 144,
	* 361 the square of 19,
	* 25921 the square of 161,
and so on.



#### Example 2 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
```
`compare(a,b)` returns `false` because in `b` 132 is not the square of any number of `a`.


#### Example 3 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
```

`compare(a,b)` returns `false` because in `b` 36100 is not the square of any number of `a`.


### TicTacToe

### WaveGenerator























## Object Orientation


























## Collections























## Generics