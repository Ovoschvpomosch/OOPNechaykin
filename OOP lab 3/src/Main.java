package Part2;
public class Main {
    /**public static void main(String[] args) {
        Vector vector1 = new Vector(7, 15, 11, 7);

        Vector vector2 = new Vector();

        Vector vectorProduct = vector1.vectorProduct(vector2);
        double scalarProduct = vector1.scalarProduct(vector2);
        double length = vector1.length();
        vector1.multiplyByScalar(2);
        Vector sum = vector1.sum(vector2);
        Vector difference = vector1.difference(vector2);

        System.out.println("Векторное произведение: " + vectorProduct.x2 + ", " + vectorProduct.y2);
        System.out.println("Скалярное произведение: " + scalarProduct);
        System.out.println("Длинна: " + length);
        System.out.println("Сумма: (" + sum.x2 + ", " + sum.y2 + ")");
        System.out.println("Разница: (" + difference.x2 + ", " + difference.y2 + ")");**/


        //Часть 2
            public static void main(String[] args) {
                Clothing[] clothingArray = new Clothing[4];
                clothingArray[0] = new TShirt(ClothingSize.M, 29.99, "Blue");
                clothingArray[1] = new Pants(ClothingSize.L, 49.99, "Black");
                clothingArray[2] = new Skirt(ClothingSize.S, 39.99, "Red");
                clothingArray[3] = new Tie(ClothingSize.M, 19.99, "Yellow");

                Atelier atelier = new Atelier();
                atelier.dressWomen(clothingArray);
                atelier.dressMen(clothingArray);
            }
        }