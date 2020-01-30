/** Class representing a stock */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    /** Constructs a stock with symbol and name */
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    /** Gets the symbol for the stock */
    public String getSymbol(){
        return this.symbol;
    }

    /** Gets the name for the stock */
    public String getName(){
        return this.name;
    }

    /** Sets the stock closing price for the previous day */
    public void setPreviousClosingPrice(double previousClosingPrice){
        if(previousClosingPrice != 0){
            this.previousClosingPrice = previousClosingPrice;
        }
    }

    /**  Sets the stocks current price */
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    /** Returns the percentage in price change of stock */
    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;
        return (change / previousClosingPrice) * 100;
    }

}
