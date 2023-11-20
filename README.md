# JavaPolymorphism
Polymorphism example in Java

Contains a base class called Vehicle with the following attributes and methods:
Attributes: brand (String), year (int)
Method: start(), which should print "Vehicle started."

In addition, it contains subclasses of Vehicle named Car and Motorcycle. The start() method is overriden in each subclass to print "Car started." and "Motorcycle started." respectively.

In the main class, objects of Car, Motorcycle, and Vehicle are created. Polymorphism is used to assign them to a reference variable of type Vehicle.

It is iterated through the array and the start() method is called on each element.

The method printVehicleInfo(Vehicle vehicle) takes a Vehicle object as a parameter and prints its brand and year.

There is a subclass of Vehicle named Bicycle. The start() method is overridden to print "Bicycle started."
