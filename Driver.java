package hw8;

public class Driver {
	public static void main(String[] args) {
		Farm farm1 = new Farm("FarmName:          farm of ten | Number of Animals:    5 |  Farm Size: 10");

		Animal a1 = new Animal("cow", 2012, 1000.50, 'f');
		Animal a2 = new Animal("pig", 2009, 550.50, 'm');
		Animal a3 = new Animal("donkey", 1999, 773.42, 'm');
		Animal a4 = new Animal("sheep", 2016, 164.23, 'f');
		Animal a5 = new Animal("goose", 2004, 10.75, 'f');
		farm1.addAnimal(a1);
		farm1.addAnimal(a2);
		farm1.addAnimal(a3);
		farm1.addAnimal(a4);
		farm1.addAnimal(a5);
		farm1.printAllDetails();
	}

}
