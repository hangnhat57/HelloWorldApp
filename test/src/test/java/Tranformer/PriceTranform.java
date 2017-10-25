package Tranformer;


import cucumber.api.Transformer;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class PriceTranform extends Transformer<String> {
    @Override
    public String transform(String price)
    {

        String value =  price.replace(",","");
         value =   value.replace("£","");
        return value;
    }
}
