# tp6 POO    

## nom LAKROUT  HACHOUR.  
  
## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif of tp6:  
the objectif of this tp is to manipulate images with differents methods and create them also modify them  
in this tp we used the notion of interface in java  
at the end of this tp we created the main method named ImageMain.java where we apply our methods on images created or passed in parameter  


#### documentation :  
```bash
javadoc -sourcepath src -d docs -subpackages image image.color image.util
```
#### test:
* compilation:  
```bash
javac -classpath test4poo.jar test/*.java
```

* execution:  
```bash
 java -jar test4poo.jar ImageTest
```

#### compilation and execution of the main program:  
* compilation:  
```bash
javac -sourcepath src -d classes src/image/*.java
```

* execution:  
there is two ways of execution:  
first:  
```bash
jar cvfe image.jar image.ImageMain -C classes image images
java -jar image.jar <the name of the image> <the parametre for the methode edgeExtraction> <the parametre for decreaseNbGrayLevels>

```

second:  
```bash
java -classpath classes image.ImageMain <the name of the image> <the parametre for the methode edgeExtraction> <the parametre for decreaseNbGrayLevels>

```






