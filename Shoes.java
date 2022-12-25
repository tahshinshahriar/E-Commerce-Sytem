// Tahshin Shahriar
// ID- 501105944
public class Shoes extends Product{
    /* Shoes IS A product that has additional information - different sizes and colors

 	 A shoe also comes in 5 different sizes (6,7,8,9,10) & 2 different colors ( Black and Brown)

 	 Particular Size and color is  specified as a specific "stock type" in get/set/reduce stockCount methods.

*/
    private int size6BlackStock;
    private int size6BrownStock;
    private int size7BlackStock;
    private int size7BrownStock;
    private int size8BlackStock;
    private int size8BrownStock;
    private int size9BlackStock;
    private int size9BrownStock;
    private int size10BlackStock;
    private int size10BrownStock;

    // Constructor for class shoes
    public Shoes(String name, String id, double price, int size6BlackStock,int size6BrownStock, int size7BlackStock, int size7BrownStock, int size8BlackStock,int size8BrownStock, int size9BlackStock, int size9BrownStock, int size10BlackStock, int size10BrownStock,int stat){
        super(name,id,price,100000,Category.CLOTHING,0); // Calling the constructor of super class product
        this.size6BlackStock=size6BlackStock;
        this.size6BrownStock=size6BrownStock;
        this.size7BlackStock=size7BlackStock;
        this.size7BrownStock=size7BrownStock;
        this.size8BlackStock=size8BlackStock;
        this.size8BrownStock=size8BrownStock;
        this.size9BlackStock=size9BlackStock;
        this.size9BrownStock=size9BrownStock;
        this.size10BlackStock=size10BlackStock;
        this.size10BrownStock=size10BrownStock;
    }

    public boolean validOptions(String productOptions)
    {
        // check productOptions for different sizes and colors of shoes

        if ((!productOptions.equals("6 Black")) && (!productOptions.equals("6 Brown")) && (!productOptions.equals("7 Black"))&& (!productOptions.equals("7 Brown"))&& (!productOptions.equals("8 Black"))&& (!productOptions.equals("8 Brown"))&& (!productOptions.equals("9 Black"))&& (!productOptions.equals("9 Brown"))&& (!productOptions.equals("10 Black"))&& (!productOptions.equals("10 Brown"))) // check if the product option is valid or not
        {
            return false;
        }
        return true;
    }

    public int getStockCount(String productOptions)
    //checking the stockcount for different sizes and colours of the shoes
    {
        if(productOptions.equals("6 Black")){
            return this.size6BlackStock;
        }
        if(productOptions.equals("6 Brown")){
            return this.size6BrownStock;
        }
        if(productOptions.equals("7 Black")){
            return this.size7BlackStock;
        }
        if(productOptions.equals("7 Brown")){
            return this.size7BrownStock;
        }
        if(productOptions.equals("8 Brown")){
            return this.size8BrownStock;
        }
        if(productOptions.equals("8 Black")){
            return this.size8BlackStock;
        }
        if(productOptions.equals("9 Black")){
            return this.size9BlackStock;
        }
        if(productOptions.equals("9 Brown")){
            return this.size9BrownStock;
        }
        if(productOptions.equals("10 Black")){
            return this.size10BlackStock;
        }
        if(productOptions.equals("10 Brown")){
            return this.size10BrownStock;
        }




        return 1;
    }
    public void setStockCount(int stockCount, String productOptions)
    // setting stockcount for the specific shoe products given in the productoptions argument
    {
        if(productOptions.equals("6 Black")){
             this.size6BlackStock = stockCount;
        }
        if(productOptions.equals("6 Brown")){
             this.size6BrownStock= stockCount;
        }
        if(productOptions.equals("7 Black")){
             this.size7BlackStock= stockCount;
        }
        if(productOptions.equals("7 Brown")){
             this.size7BrownStock= stockCount;
        }
        if(productOptions.equals("8 Brown")){
             this.size8BrownStock= stockCount;
        }
        if(productOptions.equals("8 Black")){
             this.size8BlackStock= stockCount;
        }
        if(productOptions.equals("9 Black")){
             this.size9BlackStock= stockCount;
        }
        if(productOptions.equals("9 Brown")){
             this.size9BrownStock= stockCount;
        }
        if(productOptions.equals("10 Black")){
             this.size10BlackStock= stockCount;
        }
        if(productOptions.equals("10 Brown")){
            this.size10BrownStock= stockCount;
        }


    }
    public void reduceStockCount(String productOptions)
    {
        // Reducing stock count of the product "productOptions"

        if (productOptions.equals("6 Black")) {
            this.size6BlackStock--;
        }
        if (productOptions.equals("6 Brown")) {
            this.size6BrownStock--;
        }
        if (productOptions.equals("7 Black")) {
            this.size7BlackStock--;
        }
        if (productOptions.equals("7 Brown")) {
            this.size7BrownStock--;
        }
        if (productOptions.equals("8 Brown")) {
            this.size8BrownStock--;
        }
        if (productOptions.equals("8 Black")) {
            this.size8BlackStock--;
        }
        if (productOptions.equals("9 Black")) {
            this.size9BlackStock--;
        }
        if (productOptions.equals("9 Brown")) {
            this.size9BrownStock--;
        }
        if (productOptions.equals("10 Black")) {
            this.size10BlackStock--;
        }
        if (productOptions.equals("10 Brown")) {
            this.size10BrownStock--;
        }
    }
    public void print()
    {
        super.print();
    }




















}
