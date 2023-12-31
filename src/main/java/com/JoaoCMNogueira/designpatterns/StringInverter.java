package com.JoaoCMNogueira.designpatterns;

public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        StringBuilder str = new StringBuilder(drink.getText());
        str.reverse();
        drink.setText(String.valueOf(str));
    }

}
