# Tennis

Le but de ce Kata est d’afficher le score courant d’un match de tennis. 

On a en entrée un tableau qui indique la séquence des points marqués. 
Par exemple le tableau [1, 1, 2, 2, 1] indique que le joueur 1 a marqué les deux premiers points puis le joueur 2 en a marqué 2 et le joueur 1 marque le dernier point du jeu.

Le score est retourné sous la forme {"nomJoueur1":"scoreJoueur1","nomJoueur2":"scoreJoueur2"} dans un HashMap.

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar TennisTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TennisTest
