# Sujet

Modifier les classes **FireMonster**, **WaterMonster** et **AirMonster** pour hériter de **Monster**.
Ajouter les constructeurs nécessaires à l'initialisation des attributs; le type sera "fire", "water" et "air" selon les classes respectives.

Implémenter leurs méthodes **attack(Monster opponent)** :


- un **FireMonster** inflige deux fois plus de dégâts à un **AirMonster**
- un **AirMonster** inflige deux fois plus de dégâts à un **WaterMonster**
- un **WaterMonster** inflige deux fois plus de dégâts à un **FireMonster**

De plus, la méthode **attack** doit retourner l'appel de la méthode **isKO()** sur l'instance de l'adversaire.

Créer une classe **Arena** avec une méthode **main()**. Instancier deux objets de la classe **Monster** avec des valeurs au choix, puis les faire combattre jusqu’à ce qu’un des deux soit KO.

Compiler et tester la classe **Arena**.
