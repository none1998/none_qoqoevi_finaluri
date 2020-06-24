package none.qoqoevi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Info {

    String currency;
    String info;

    public Info(String currency, String info) {
        this.currency = currency;
        this.info = info;
    }

    public Info() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "currency='" + currency + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}