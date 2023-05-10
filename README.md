# ForumWeek9-OOP
# Name: Tirza Gabriella
# NIM: 2602109870

## 1.(a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)
In the above scenario, a class like SalesPerson represents an object which have properties such as id, salesHistory, and count. 
An instantiation of this class would be a specific salesPerson object created from this class.
In summary, a class provides or describes the template for a certain item, while when a class is instantiated, an object for that class is really created.

## The different modules in the program each open a graphical user interface (GUI). Each GUI has a similar design but contains differences specific to each module.
## 1.(b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)
First, inheritance can be implemented by first extending the usage of the gui library (for example, jframe), next, once a main gui element that already incorporates 
the basic UI characteristics of the app is made, it can be further inherited again to create a more specific page. 
For example, we have a class named SalesAppUI that extends JFrame and has some general attributes like main menu and buttons to navigate. Next, when we want to create a new page, 
we can extend the SalesAppUI class and further add more specific attributes and functions to the new UI. 

## (c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)
To carry out frequent activities like input validation, database connectivity, and user interface design, libraries contain reusable code that may be used. 
Programmers can save time and effort by utilizing pre-written code from libraries rather of writing and testing this code from scratch.
We can use UI libraries to create UI or we can use Java's Array library to for array related problems. 

## Each instance variable is initialized when a SalesPerson object is instantiated.
## (a) Complete the constructor public SalesPerson(String id), from the SalesPerson class. (2 points)
public SalesPerson(String id){
    this.id = id;
    this.salesHistory = new Sales[100];
}

## (b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)
Accessors are needed to get the attributes of the object once instantiated. 

## (c) (i) Construct unified modelling language (UML) diagrams to clearly show the relationship between the SalesPerson and Sales classes. (4 points)

## (c) (ii) Outline a negative effect that a future change in the design of the Sales object might have on this suite of programs. (2 points)
a change in the attributes might affect the accessor methods of the class. Other than that, any changes in the accessors will affect the class' usage after instantiation, and 
at some of SalesPerson's functions. Like for example, if we're to change getValue accessor to something like getPrice, we'll need to change the accessor usage at main and 
SalesPerson's method like caclTotalSales. 
     
## (d) State the output after running this code. (4 points)

## (e) Construct the method calcTotalSales(), in the SalesPerson class that calculates the total value of the sales for a specific SalesPerson object. (5 points)
(code can be seen at SalesPerson and Sales Class)

## The salesPeople array contains 100 instantiated objects. The company wishes to reward the salesperson whose sales have the largest total value.
## (f) By making use of any previously written methods, construct the method highest(), that returns the ID of the salesperson whose sales have the largest total value. (5 points)
(code can be seen at SalesPerson and Sales Class)
 
## (g) Construct the method addSales(Sales s, String id), in the Driver class, that will add a new Sales object s, to the salesperson with a specified ID. Note: You can assume that the ID is a valid one. (4 points)
(code can be seen at Driver, SalesPerson, and Sales class) 

## A further class in this suite of programs is the Payroll class. This class is run at the end of each month to calculate each salesperson’s salary, which is based on the sales that have been made during that month.
## (h) Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made. (3 points)
Both in the constructor and the class, a date variable must be added. For the date variable, getters and setters would be required. Date variable would require consideration in CalcTotal.

## (i) Discuss the use of polymorphism that occurs in this suite of programs. (3 points)
The two constructors in the SalesPerson class, which is an example of overloading; the compiler executes the constructor, demonstrate this.

