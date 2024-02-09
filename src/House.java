public class House implements Comparable<House> {

    private String address;
    private double price;
    private double squareFootage;
    private static int totalHouses = 0;

    public double getPrice() {
        return price;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public static int getTotalHouses() {
        return totalHouses;
    }

    public House(String address, double price, double squareFootage){
        this.address = address;
        this.price = price;
        this.squareFootage = squareFootage;
//        totalHouses++;
    }

    public String toString(){
        String printOut = "Price" + price + "Address" + address + "SquareFootage" + squareFootage;
        System.out.println(printOut);

        return printOut;
    }


    @Override
    public int compareTo(House blocks) {
        int compare = Double.compare(this.price, blocks.price);

        if (compare != 0){
            return compare;
        }
        return Double.compare(this.squareFootage, blocks.squareFootage);
    }
    public static void main(String[]args){
        House [] house = new House[3];
        house[0] = new House("1154 Juja",5000, 150);
        house[1] = new House("1655 Thika",50000, 550);
        house[2] = new House("1956 Nairobi",80000, 600);

        System.out.println("Total number of houses"+ getTotalHouses());
    }
}
