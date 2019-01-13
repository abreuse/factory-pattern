## Factory pattern

Simple examples of the Factory pattern (and Simple Factory).
- Simple factory : create cars according to brand thanks to the `SimpleCarFactory`
- Factory pattern : create sports cars according to the chosen factory `SeatSportCarStore` or `SeatSportCarStore`

The difference between `Factory` and `Abstract Factory` is that :
- `Factory` uses **inheritance** to create new objects (that's the case for `SportCarStore`)
- The `Factory` is used to create one product (`Car` in the example)
- `Abstract Factory` uses **composition** to create new objects 
- The `Abstract Factory` groups together a set of related products, like `Motor`, `highlight`, `Hood` which are `Parts` of a car

The `Abstract Factory` is not implemented in this repo, it could have been implemented with an interface named `PartsCarFactory` which exposes `create` methods to instanciate new subclasses of `Parts`. Like `Motor`, `Highlight`, `Hood`, etc.
The `SportCarStore` would have been composed of the `PartsCarFactory` to create `Parts`subclasses objects, on runtime an instance of `SkodaPartsCarFactory` or `SeatPartsCarFactory` would have been passed to the composition.

**Les plus :**
- Permet de découpler le code client, il intéragit désormais avec une abstraction plutôt qu'une classe concrète
- Permet de centraliser la création d'objets, de ce fait la maintenance de ce code est à un unique endroit
- Si un nouvel objet doit être disponible à l'instanciation, il suffit d'étendre la classe abstraite `SportCarStore` pour pouvoir le spécifier

**Les moins :**
- Pas forcément nécessaire si l'objet est très peu instancié ou qu'il existe un unique type d'objet instanciable (Service, Singleton...)

