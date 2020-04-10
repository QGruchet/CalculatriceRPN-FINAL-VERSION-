# Description

Bienvenue dans une calculatrice RPN. Le but est très simple. A l'aide d'une structure pile, cette calculatrice stocke les elements entrés. 

# Utilisation
Si un nombre (compris entre 10000 et -10000) est entre, ce programme stockera se nombre dans une pile. Si la pile est pleine (<100 nombres), le programme renvoie une erreur.
Si un opérateur est entré, le programme fera le calcul sur les deux dernières entrés de la pile. Lorsque qu'il est entre alors qu'il n'y a pas suffisament de nombre de la pile, le programme renvoie une erreur et demande si vous voulez recommencer.
L'utilisateur peut egalement entre "quitter" pour sortir du programme.


# Compilation et execution
Pour compiler ce programme deux solutions:
- Depuis votre editeur, appuyer sur le bouton "build" puis "run main"
- Depuis un terminal entrez les commandes suivantes :
	-javac Main.java
	-java Main
