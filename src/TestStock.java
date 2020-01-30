public class TestStock {
    public static void main(String[] args){
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.printf("The %s stock changed. %s: %.2f%%\n", stock.getName(), stock.getSymbol(), stock.getChangePercent());

    }
}
