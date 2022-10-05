Create a superclass (aka parent class, base class) named Tool 
 Tool has a protected data field named price that is of type double 
 Tool has a default constructor that sets price to zero 
 Tool has a one‐argument constructor 
 Tool overrides the equals(Object o) method from the Object class 
 
Create a subclass (aka child class, extended class, derived class) name Hammer 
 Hammer has a private data field named weight of type int 
 Hammer has a default constructor that calls the super constructor and sets weight to zero 
 Hammer has a two‐argument constructor that calls the super one argument constructor 
 Hammer overrides the Object class toString() method and returns the string: 
o This is a Hammer the is price is #.## and the weight is: # 
 
Create a subclass (aka child class, extended class, derived class) name Plyer 
 Hammer has a private data field named size of type char 
 Plyer has a default constructor that calls the super constructor and sets size to empty char 
 Plyer has a two‐argument constructor that calls the super one argument constructor 
 Hammer overrides the Object class toString() method and returns the string: 
o This is a Plyer the is price is #.## and the sizet is: # 
