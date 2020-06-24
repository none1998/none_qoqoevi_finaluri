package none.qoqoevi.services;
import none.qoqoevi.model.Currency;
import none.qoqoevi.model.Info;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@WebService
public class CurrencyService {
    Scanner scanner=new Scanner(System.in);

    @WebMethod
    public Currency GetCurrency(Currency cur) {
        return new Currency("USD", 3.5f,3.2f);
    }

    @WebMethod
    public Info GetCurrencyDescription(Info info) {
        return new Info("USD", "ამერიკული დოლარი");
    }

    @WebMethod
    public List<Currency> getStatistic(){
        List<Currency> currencyList=new ArrayList<Currency>();
        currencyList.add(new Currency("USD", 3.5f,3.2f));
        currencyList.add(new Currency("GEL", 3.0f,3.1f));
        currencyList.add(new Currency("EUR", 3.25f,3.21f);
        return currencyList;
    }

}