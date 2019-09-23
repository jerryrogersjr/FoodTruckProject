## Food Truck Project

This is my second end of week project with Skill Distillery. The program
will ask to enter food truck name, food type, and rating for up to five trucks.

The program will then display a menu of options to choose from which will provide
feedback and loop back to the menu until the user enters quit to exit the program.

example:

Choose from the following menu
*****************************************
1 *** List all Food Trucks              *
2 *** Display Food Truck Average Rating *
3 *** Display Highest Rated Food Truck  *
4 *** Quit Program                      *
*****************************************
3
Food Truck Name: 3
Food Type: 3
Truck ID 3509
Rating 3


Choose from the following menu
*****************************************
1 *** List all Food Trucks              *
2 *** Display Food Truck Average Rating *
3 *** Display Highest Rated Food Truck  *
4 *** Quit Program                      *
*****************************************
4
Goodbye!


### Overview

You will define a FoodTruck class with fields for a unique numeric id,
a name ("TacoRific", "Mediterranean Medic", etc.), food type
("Tacos", "Falafel", etc.), and a numeric rating.

You will create a separate class with a main method that starts the
program. It will have an array to store up to five FoodTruck objects.
The main method of this class is the only static method in the entire project.

User Story #1
The user is prompted to input the name, food type, and rating for up
to five food trucks. For each set of input, a FoodTruck object is created,
its fields set to the user's input, and it is added to the array. The truck
id is not input by the user, but instead assigned automatically in the
FoodTruck constructor from a static field that is incremented as each
truck is created.

User Story #2
If the user inputs quit for the food truck name, input ends immediately
and the program continues.

User Story #3
After input is complete, the user sees a menu from which they can choose to:

List all existing food trucks. See the average rating of food trucks.
Display the highest-rated food truck. Quit the program.

User Story #4
After choosing a menu item, the user sees the menu again and can choose
another item until the choose to quit.
### How to Run

Assuming you have Java already loaded on your machine:

Terminal: Navigate to the file inside terminal, javac FoodTruck.java, javac
FoodTruckApp.java, then java FoodTruckApp. The program will run and prompt the user (you)
for input and return values, etc.

Fancy editor (eclipse):

File, open, navigate to the file(s), and open. Run as java file and get results, etc.

### Technologies/Topics (I) Used

-MacBook Pro -java version "1.8.0_221" -terminal -iTerm2 -Eclipse -Atom

-Java Fundamentals
-Object-Oriented Programming in Java


### Lessons learned

Lessons learns...well, it took me a lot longer than maybe it should have. However,
I'm finding that as I had many 'little' challenges, I spent a lot of time learning
Java the hard way ;). Over the past week, there were some of the topics that didn't
quiet set in, but this project forced me to dig deep, work hard, reach out for
help, and not only reinforce the materials but help me learn about prioritizing
when and what to go down the 'rabbit hole' on... Overall, I learned a lot with
much more to learn.

Key take aways was 'passing by value', visibility, inheritance, object initialization,
encapsulation, and Never Quit...the answer is a short walk away (or whatever you
do to clear your hear).

### Project Requirements

-Enter up to five trucks with name, food, and rating.
-Menu to list all trucks and data, get rating average, and highest rating.
-Set a unique ID that incremented with trucks added.
-Only 'static' method being the main method.
-README.
