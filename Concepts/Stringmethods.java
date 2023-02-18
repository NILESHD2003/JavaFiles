package Concepts;

import java.util.Scanner;

public class Stringmethods {
    public static void main(String[] args) {

        //java allows us to use string as a datatype
//        String name=("Nilesh");
//        System.out.printf("My name is ");
//        System.out.println(name);
        //Printing can be done by using multiple commands like System.out.print/println/printf/format

        //taking input in string

//        Scanner S=new Scanner(System.in);

//        String word=S.next();//next() takes only one word as input till space.
//        System.out.println(word);
//        String line=S.nextLine();//nextline() takes the whole line until the enter button is hit including spaces.
//        System.out.println(line);

        /*
        notes
            ----------------------------------------------------------------------------------------------------------------
            1) .length() -> it returns the length of string.
            2) .toLowerCase() -> it returns a string that has all lowercase characters.
            3) .toUpperCase() -> it returns a string that has all uppercase characters.
            4) .trim -> it trims i.e. removes the spaces from the string beginning and end.
            5) .substring -> it returns string from the given index.
            6) .replace -> replaces the char or array from a given string.
            7) .charAt -> gives the char present at given index.
            8) .IndexOf & .LastIndexOf -> IndexOf() search for the first occurence of given char whereas the .lastIndexOf()
            search for the last occurence.
            9) .equals -> checks whether both the strings are equal and gives true or false.
            10) .equalsIgnorecase -> ignores whether the characters are uppercase or lowercase and gives true or false.
            Methodname--Description	Return--Type
            charAt()--Returns the character at the specified index (position)--char
            codePointAt()--Returns the Unicode of the character at the specified index--int
            codePointBefore()--Returns the Unicode of the character before the specified index--int
            codePointCount()--Returns the number of Unicode values found in a string.--int
            compareTo()--Compares two strings lexicographically--int
            compareToIgnoreCase()--Compares two strings lexicographically, ignoring case differences--int
            concat()--Appends a string to the end of another string--String
            contains()--Checks whether a string contains a sequence of characters--boolean
            contentEquals()--Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer--boolean
            copyValueOf()--Returns a String that represents the characters of the character array--String
            endsWith()--Checks whether a string ends with the specified character(s)--boolean
            equals()--Compares two strings. Returns true if the strings are equal, and false if not--boolean
            equalsIgnoreCase()--Compares two strings, ignoring case considerations--boolean
            format()--Returns a formatted string using the specified locale, format string, and arguments--String
            getBytes()--Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array--byte[]
            getChars()--Copies characters from a string to an array of chars--void
            hashCode()--Returns the hash code of a string--int
            indexOf()--Returns the position of the first found occurrence of specified characters in a string--int
            intern()--Returns the canonical representation for the string object--String
            isEmpty()--Checks whether a string is empty or not--boolean
            lastIndexOf()--Returns the position of the last found occurrence of specified characters in a string--int
            length()--Returns the length of a specified string--int
            matches()--Searches a string for a match against a regular expression, and returns the matches--boolean
            offsetByCodePoints()--Returns the index within this String that is offset from the given index by codePointOffset code points--int
            regionMatches()--Tests if two string regions are equal--boolean
            replace()--Searches a string for a specified value, and returns a new string where the specified values are replaced--String
            replaceFirst()--Replaces the first occurrence of a substring that matches the given regular expression with the given replacement--String
            replaceAll()--Replaces each substring of this string that matches the given regular expression with the given replacement--String
            split()--Splits a string into an array of substrings--String[]
            startsWith()--Checks whether a string starts with specified characters--boolean
            subSequence()--Returns a new character sequence that is a subsequence of this sequence--CharSequence
            substring()--Returns a new string which is the substring of a specified string--String
            toCharArray()--Converts this string to a new character array--char[]
            toLowerCase()--Converts a string to lower case letters--String
            toString()--Returns the value of a String object--String
            toUpperCase()--Converts a string to upper case letters--String
            trim()--Removes whitespace from both ends of a string--String
            valueOf()--Returns the string representation of the specified value--String
            ----------------------------------------------------------------------------------------------------------------
            >>>>pointing the cursor on a keyword in intellij idea will show the java documentation for same.
            >>>>\(backslash) is a escape sequence char.
            ----------------------------------------------------------------------------------------------------------------
         */


        //example
        //original string can also be changed pointing the method to original string
//        String example=("Hello World");
//        int length=example.length();
//        System.out.println(length);
//
//        String lstring=example.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring=example.toUpperCase();
//        System.out.println(ustring);
//
//        String trimmed=example.trim();
//        System.out.println(trimmed);
//
//        String sub=example.substring(1,10);//(x,y) is the range of index.
//        System.out.println(sub);
//
        String example2=("Harry");
//
//        String replace=example2.replace('r','p');//replaces a character
//        System.out.println(replace);
//
//        String replace2=example2.replace("arry","air");//replaces a word
//        System.out.println(replace2);

//        System.out.println(example2.charAt(3));//returns char present at given index.
//        System.out.println(example2.indexOf('H'));//returns index of given char.
//        System.out.println(example2.indexOf('r',3));//(x,y) means search for x from yth index.

//        System.out.println(example2.equals("harry"));

    }
}
