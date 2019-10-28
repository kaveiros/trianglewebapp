#Trianglewebapp

This web application is defining the type of the triangle based on given side lengths.
Based on the triangle's three sides as input, the triangle can be equilateral, isosceles or scalene.
An appropriate image along with the description is presented to the user each time.

In order to determine if the given lengths form a valid triangle, 
the application uses the Triangle Inequality Theorem: The sum of the lengths of any two sides of a 
triangle is greater than the length of the third side.
 
If the the given lengths form a valid triangle, the application classifies it in 3 categories:

Equilateral if all sides are equal.

Isosceles if two of the three sides are equal.

Scalene if all sides are not equal.

If none of the above conditions id valid, then no image is shown to the user, and a notification is shown
describing the error.

##Getting Started-Running the application.
This is a Maven project built through Eclipse IDE and also includes J-Unit test cases.
In order to run the application use the command :

```
mvn jetty:run
```

Alternatively, if you use eclipse, go to run configurations, create new maven build configuration 
and at the Goals input fill in jetty:run.

You can then navigate to :

```
http://localhost:8080/trianglewebapp/
```
to use the application.

To run Junit tests use command:

```
mvn test

```

To clean everything :

```
mvn clean

```
##Deployment

if you want to deploy the application to tomcat run:

```
mvn package
```
Navigate to target folder.
Copy the war file to the webbapps directory of the apache tomcat. 
It will be extracted automatically and it will be available under the trianglewebapp folder.

##Build With
* [Zkoss](https://www.zkoss.org/) -The web framework used for the ui. It is an Ajax web application framework that enables 
creation of graphical user interfaces for web applications. Communication between the front end and back end is achieved 
through Model View Model (MVVM) design pattern.
* [Maven](https://maven.apache.org/) - Dependency Management tool.

## Author
* **Nikolaos Chantzopoulos** 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.