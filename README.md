## Factory pattern

Simple examples of the Factory pattern (adn Simple Factory).
- Simple factory : create cars according to brand thanks to the `SimpleCarFactory`
- Factory pattern : create sports cars according to the chosen factory `SeatSportCarStore` or `SeatSportCarStore`


**Les plus :**
- Permet de découpler le code client, il intéragit désormais avec une abstraction plutôt qu'une classe concrète
- Permet de centraliser la création d'objets, de ce fait la maintenance de ce code est à un unique endroit
- Si un nouvel objet doit être disponible à l'instanciation, il suffit d'étendre la classe abstraite `SportCarStore` pour pouvoir le spécifier

**Les moins :**
- Pas forcément nécessaire si l'objet est très peu instancié ou qu'il existe un unique type d'objet instanciable (Service, Singleton...)

