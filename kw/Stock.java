package TeamprojectThird.kw;

public class Stock {
    private String stockName; // 주식이름
    private double updownRate; // 등락률
    private double price ; // 가격 ,
    private int pieces ; // 갯수


    public Stock() {
    }

    public Stock(String stockName, double updownRate, double price, int pieces) {
        this.stockName = stockName;
        this.updownRate = updownRate;
        this.price = price;
        this.pieces = pieces;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getUpdownRate() {
        return updownRate;
    }

    public void setUpdownRate(double updownRate) {
        this.updownRate = updownRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
