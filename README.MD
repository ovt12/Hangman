# Notes

Here are some points I want you to have a look at before we catch up.

There are notes through the codebase have a look I have grouped them below.

## OOP

- Inheritance
    - Extending Main -> Results, Intro
        - Nothing should really extend Main, even if intellij is telling you to.
    - Extending Game -> Drawings
        - hangmanImage is a method so takes parameters, you can pass in lives
        - You would extend a class if you only need one variable for a method
        - Think inheritance creates a IS-A relationship
            - If you kept it the same you are saying that Drawings IS A Game.
            - Which it isn't.

## Classes

- Words class all good

- Intro
    - Remove inheritance
    - Rename method as following convention for constructor
        - See notes in the class.

- Main
    - create instance of game
        - call methods on it

- Game
    - Removed all static references
    - Make instance variables private
    - Create instances of Objects / classes instead of relying on static classes
    - tidy up recursion using continue

- Results
    - Removed all static references
    - Update lostResult method to take lives as a parameter rather than having access to it through inheritance.
        - Remove recursion

---

## Review

- It would be good to review
    - Inheritance
    - static
    - creating a class
    - methods

---