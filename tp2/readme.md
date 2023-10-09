# rendu tp2 POO    

## nom LAKROUT  HACHOUR.  
  
## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif du tp2  
    
Ce tp a pour objetif de crèer nos premiere classes en java avec bluej en faisant le 4 exercices demandé le premier c'est de créer et manipuler une classe Stock le deuxieme une Classe Goods le troisieme et le quatrieme qui son dans le meme dossier est de créer une classe Lightbulb et la manipuler avec une classe Switch .  

### descripton du tp2  
  
Pour recuperer le fichiers du tp2 il faut cloner tout d'abord le depot distant sur git apres on execute la commande git pull sur le terminal on recupere le fichier tp2 sur le depot local.

Le fichier tp2 contient 3 dossier(directory) le premier dossier represente l exercice1 le deuxieme l'exercice 2 et le troisieme les exercice
3 et 4.  
  
#### exercice1  

Dans le  premier exercice on trouve le fichier  Stock.java  ou nous avons codé la classe Stock  cette classe a pour 2 constructeur un avec parametre entier qui modifie la quantité et la met a la valeur du parametre et le deuxieme sans parametre qui cree une classe Stocke avec la quantité egale a 0 
Cette classe a pour methodes:
* getQuantity() : cette methode ne prend rien en parametre et renvoie la quantity dans le stock.
* add(int n) : cette methode prends en parametre en entier et ajoute cet entier a la quantite du stock cette methode ne renvoie rien. 
* remove(int r) : cette methode prend en parametre un entier r et le soustrait de la quantité du stock si l entier et plus grand que la quantite elle renvoie la quantite  et mets la quantite a 0 sinon elle renvoie combien on a soustrait.
* toString() : cette methpde ne prend rien en parametre et renvoie la phrase "the stocks quantity is quantite(entier)".  

##### REMARQUE: pour appeler ces methodes faut d'abord créer une instance de type Stock  
    
#### exercice2  

Dans le deuxieme qu on trouve dans le fichier exercice2 on trouve le fichier Goods.java ou nous avons codé la classe Goods qui nous permet de gerer une marchandise . cette classe a deux constructeurs:
* Goods(string n) : ce constructeur prend en parametres une chaine de caracteres n et la mets dans le nom de la marchandise.
* Goods(String n ,double pr) : ce constructeur prend en parametre une chaine de caractere comme nom de la marchandise et un double comme prix de la marchandise
 
Les methodes de cette classe sont:
* getPrice() : elle ne prend rien en parametres et renvoi le prix de l'objet qu'elle a appelé.
* setPrice(double n) : elle prend un double en parametres et modifie le prix de la marchandise avec le parametre et ne renvoie rien (setter).
* setName(String ch) : elle prend  une chaine de caracteres en parametres et l'affecte a le nom de la marchandise et ne renvoie rien(setter).
* toString() : elle ne prend rien en parametre et renvoi une chaine de caractere qui decrit la marchandise.
* ttc() :  elle ne prend rien en parametre et renvoie le prix final de la marchandise avec la tva qui est de 20%.  

#### exercice3_4  
dans le troisieme exercice on modelise une ampoule avec une classe Lightbulb  
cette classe a pour constructeur:
* Lightbulb(int p,String col):ce constructeur prent un entier en parametre qui represente la puissance de l'ampoulle et une chaine de caractere qui represente sa couleur  
cette classe a pour methodes:
* getPower(): elle prend rien en parametre et renvoie la puissance de l ampoule
* getColor:elle ne prend rien en parametre et renvoie la couleur de l'ampoule
* isOn():elle prend rien en parametre et renvoi true si l ampoule et allume sinon false
* on(): elle prend rien en parametre et elle allume l ampoule et ne renvoie rien
*  off(): elle prend rien en parametre et elle eteint l ampoule et ne renvoie rien
* toString():elle ne prend rien en parametre et renvoie une phrase qui decrit l'ampoulle.  

dans le quatrieme exercice on une classe Switch qui controlle une ampoulle 
cette classe a un constructeur:
* Switch(Lightbub amp):ce constructeur prend en parametre un objet de type Lightbulb  

cette classe a pour methode  
getLightbulb():elle ne prend rien en paametre et renvoie l'ampoule controle par l'interepteur (Switch)
* push():elle ne prend rien en parametre et allume ou eteint l'ampoulle selon son etat(si elle est alummee elle l'eteint et le contraire)



      
