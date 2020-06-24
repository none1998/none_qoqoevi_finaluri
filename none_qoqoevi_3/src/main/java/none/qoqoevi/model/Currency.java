package none.qoqoevi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {

    String currency;
    float buy;
    float sell;

    public Currency(String currency, float buy, float sell) {
        this.currency = currency;
        this.buy = buy;
        this.sell = sell;
    }

    public Currency() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currency='" + currency + '\'' +
                ", buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}