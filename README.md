# Recitation 4 - Loops

## Learning Objective:

1. Develop experience with Java loops.
2. Implement nested loops.
3. Use available resources and methods to solve a posed problem.



## Repeater Explosion

A word repeater explosion has occurred. However, to figure out how a word explodes, read on and study the examples.

In the accompanying IntelliJ project, you are provided with a `Recitation4` class that contains a static method with the following signature,

```
pubic static String explode(String word)
```

The function `explode` takes a string as an argument and returns a *** repeater exploded string***, which is a string generated from the original string by duplicating each letter in the string based on the character's position. Digits are duplicated by the value of their digit. Any other character considered non-alphanumeric will result in all characters being appended to the result, up to but not including the non-alphanumeric character.


For example,


- `explode("Code")` results in `"Coodddeeee"`
- `explode("2beORnot!")` results in `"22bbeeeOOOORRRRRnnnnnnoooooootttttttt2beORnot"`
- `explode("0zero")` results in `"zzeeerrrrooooo"`, where 0 is the digit zero.
- `explode("#56bat")` results in `"55555666666bbbbaaaaatttttt"`
- `explode("be^2vn")` results in `"beebe22vvvvvnnnnnn"`

### Requirements

The `explode` method must use a nested `for` loop and must use the `Character` class to determine if a character is a letter, digit, or neither.  In addition, the method must use a `StringBuilder` to generate the result.

<div style="background-color:pink; border:1px solid red; border-radius: 10px;">
IMPORTANT:  You should write down your algorithm as we do in class before coding this recitation exercise.  You will need to include your algorithm in the comments section provided in the <code>Recitation4</code> class.
</div>

## Submitting Your Work

After completing the above tasks, submit your work by clicking the CodeGrade link in Blackboard.