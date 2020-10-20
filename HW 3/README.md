# Homework 3
### Project Team:
Sahib Bajwa

### I spoke with Professor Montgomery and my project 3 is different than the original project 3. He also said that he would grade it himself. Sorry if this causes any inconveniences/misunderstandings.

### Assumptions:
One of the large assumptions I had was how the decorator was implemented. This was the first time that I was using a decorator, so I believe that it was implemented right. The original interface should only have the method name inside, and the class that implements the interface has the implementation of the method that will be changed by the decorator and the class that extends the decorator.

Another assumption I had about the project as a whole was that I could complete it by myself within a reasonable time whilst behind in the class overall. Again, thanks Professor for the help.

### Issues Encountered:
I could not get JUnit 5 to work on my machine/eclipse. I simply went with JUnit 4 and everything worked fine.

I initially created a whole other class to go through the days, but it started to become very complicated. I changed my implementation to go through the days within the Main class.

My observer could not do simple print statements, which made the output file messier than it should have been. This was fixed by adding a method that simply returned a blank print statement to the observer.

### Running the Application:
I run the application by running the main function/class in Eclipse IDE. I ran the main function for 30 days like the project pdf explained.

### Language and Environment Used for Development
I used Java 8 (I think?) with Eclipse IDE to deveope my project. JUnit 4 was used for the test cases in MyUnitTest.

### Changes to This Project 3
In our meeting, these were the changes you told me about to reduce the scope for project 3. The scope of my project:

* There is one customer type
  * The customer will come in and buy whatever, then will leave
    * There will be a random ammount of customers of said customer type
  
* There is no inventory limit
  * There is one type of roll
  * There is one type of sauce
    * This means the roll will either have sauce or no sauce
    
* The main point of this project is to implement the OOAD principles and designes we learned in class, so:
  * Make sure to use the factory design
    * I tried implementing this with the Customer -> casualCustomer relationship
      * There would be more types of customers if the scope was not decreased (with probability in what types of customers arrived)
    * I tried implementing this with the Roll -> springRoll relationship
      * There would be more types of rolls if the scope was not decreased (with probability in which one the customer bought)
      
  * Make sure to use an observer
    * The observer declares:
      * Store open and full inventory (although inventory never changes)
      * When a customer buys a roll
        * What type of customer
        * What type of roll
          * If the roll has sauce or not
      * Store close and amount of customers served for the day.
      
  * Make sure to use a decorator
    * I did this by using a decorator to add functionality to the Sauce interface
      * Now, there can be no sauce or hot sauce added to the roll (randomly)
      

* There are only 2 JUnit tests
  * The first test makes sure that we can create a casual customer successfully
  * The second test makes sure that a casual customer can purchase a spring roll successfully
 
### Ending Note (similar to email):
Sorry for turning this in to you so late, I had some personal stuff come up that took away a lot of my time I had planned to complete the project earlier last week.

I believe that I finished the project with the changes you told me about during our meeting. If I missed any or you want me to do more, please let me know. I'll try to finish anything you believe is important surrounding project 3.
