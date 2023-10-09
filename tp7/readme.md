# tp7 POO    

## nom LAKROUT  HACHOUR.  
  
## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif of tp7:
The objectif of this tp is to complete the code given to create a class representing vehicles than to create a class which represente a Rental agency.  

The rental agency has many methodes and it rent vehicles to clients and return them also can display all the vehicles or selected vehicles with filters.  

We also completed the code to create a class named AndFilter which is an intersection of filters that were given in the documents (MaxPriceFilter and BrandFilter)  
 
 In this tp we used the notion of interfaces in the filters also we used for the first time the notion of heritage .  
 We used it to create the class Car which is a vehicle but with the inforamtion number of places,we created also the class MotorBike which is also a vehicle  with the information of the cylindree.  
 
 We created also the class SuspiciousAgency which is a RentalAgency but it apply 10% added to the normal daily price to rent for the clients under 25 years old.  
 
### Commands : 
#### documentation :  
```bash
javadoc -sourcepath src -d docs -subpackages rental 
```
#### test:
* compilation:  
```bash
javac -classpath test4poo.jar test/rental/*.java
```

* execution:  
```bash
 java -jar test4poo.jar rental.<the name of the class of tests to execute>
```

#### compilation and execution of the main program:  
* compilation:  
```bash
javac -sourcepath src -d classes src/rental/*.java
```

* execution:  
there is two ways of execution:  
first:  
```bash
jar cvfe rentalAgency.jar rental.MainAgency -C classes rental 
java -jar rentalAgency.jar
```

second:  
```bash
java -classpath classes rental.MainAgency

```
 
   
  
