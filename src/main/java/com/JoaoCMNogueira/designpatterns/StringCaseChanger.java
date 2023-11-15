package com.JoaoCMNogueira.designpatterns;

public class StringCaseChanger implements StringTransformer{

    @Override
    public String execute(StringDrink drink) {
        StringBuilder strdrink = new StringBuilder(drink.getText());
        StringBuilder strRes = new StringBuilder();
        for (int i = 0; i < strdrink.length(); i++){
            if(Character.isLowerCase(strdrink.charAt(i))){
                strRes.append(Character.toUpperCase(strdrink.charAt(i)));
            } else {
                strRes.append(Character.toLowerCase(strdrink.charAt(i)));
            }
        }
        drink.setText(String.valueOf(strRes));
        return null;
    }
}
