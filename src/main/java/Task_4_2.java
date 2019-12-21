public class Task_4_2 {
    public static void main(String[] args) {
        Sweet sweet1 = new Sweet();
        sweet1.name = "Candy";
        sweet1.weight = 300;
        sweet1.price = 10;
        sweet1.id = 1;

        Sweet sweet2 = new Sweet();
        sweet2.name = "Jelly Bean";
        sweet2.weight = 400;
        sweet2.price = 15;
        sweet2.id = 2;

        Sweet sweet3 = new Sweet();
        sweet3.name = "Marshmallow";
        sweet3.weight = 500;
        sweet3.price = 18;
        sweet3.id = 3;

        System.out.println("В нашем подарке есть следующие сладости: " + sweet1.name + ", " + sweet2.name + ", " + sweet3.name + ". Их стоимость: " + (sweet1.price + sweet2.price + sweet3.price) + " доллара. Их вес: " + (sweet1.weight + sweet2.weight + sweet3.weight) + " грамм.");

    }
    static public class Sweet {
        String name;
        int weight;
        int price;
        int id;
    }
}
