# MIAGe Master 1 - TP Tests 1

### NOM : DOE
### Prénom : John
### Groupe de TP : 
- [ ] 1
- [x] 2
- [ ] 3


### 0. Création et initialisation du projet Maven "question-score-project"

Créez un compte sur la plateforme Github si ce n'est pas déjà fait.  
Vérifiez votre configuration Git locale. 
Rappel pour configurer Git lors d’un premier usage sur une machine de travail :

    git config --global user.name "Your Username"
    git config --global user.email "Your email"
    git config --global color.ui "auto"
    git config --global -l


Créez votre projet sur Github en vous inscrivant au devoir indiqué par votre enseignant.  
Clonez dans l’espace de travail de votre choix le projet Github généré pour vous par Github Classroom.  
Importez/ouvrez votre projet local dans l'IDE de votre choix supportant Maven (l'enseignant utilisera [IntelliJ](https://www.jetbrains.com/idea/download/)).  
Modifiez le fichier README pour qu’il contienne vos nom, prénom et groupe en place des données exemples.  
Commitez et pushez  dans votre dépôt distant en utilisant le message de commit suivant :

> fix #0 Activité préliminaire terminée

Dans la suite de ce document, à chaque fois que vous trouverez un énoncé commençant par “fix #...”, vous devez committer et pusher les modifications sur votre dépôt distant en utilisant comme message de commit cet énoncé.

Les corrections des activités suivantes seront transmises au fil de l’eau ; elles seront disponibles dans les différentes branches du projet Github suivant : https://github.com/miage-toulouse/question-score-project 

### 1. Couverture du code par les tests de la classe QuestionAChoixExclusif (en mode Kata)

- Créez la classe de test unitaire permettant de tester la classe *QuestionAChoixExclusif*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *QuestionAChoixExclusif* à 100%.


> fix #1 Tests sur QuestionAChoixExclusif

### 2. Couverture du code par les tests de la classe QuestionAChoixMultiple 

- Créez la classe de test unitaire permettant de tester la classe *QuestionAChoixMuliple*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *QuestionAChoixMultiple* à 100%.

> fix #2 Tests sur QuestionAChoixMultiple

### 3. Couverture du code par les tests de la classe ScoreCalculateur 

- Créez la classe de test unitaire permettant de tester la classe *ScoreCalculateur*.
- Écrivez les tests unitaires permettant de couvrir le code de la classe *ScoreCalculateur* à 100% en utilisant la contrainte et les cas de tests suivants :
    - pour chaque cas de test, l'instance de *ScoreCalculateur* utilisée est testée sur une question de type *QuestionAChoixMultiple* initialisée de la
     manière suivante :
    `questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));`
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1 et 4, on obtient 0 comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 2 et 3, on obtient 2*100/3 à 0,01 près comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 2, 3 et 5, on obtient 100 à 0,01 près comme résultat.

> fix #3 Tests sur ScoreCalculateur

### 4. Correction de l'application

- Complétez les tests unitaires permettant de couvrir le code de la classe *ScoreCalculateur* en utilisant les cas de test suivants :
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1,2,3,4,5 on obtient 0 à 0,01 près comme résultat ;
    - quand on calcule le score pour une liste de réponses contenant les valeurs 1,2 et 3 on obtient 16.66 à 0,01 près comme résultat ;
- Après avoir constaté que ce test ne passait pas, modifiez le code de l'application et des tests (si nécessaire) afin que **tous les tests passent**. (Conseil : assurez-vous que vos modifications ne créent pas de nouvelles erreurs Checkstyle.)

> fix #4 Correction application

