package com.JoaoCMNogueira.designpatterns;

public class StringReplacer implements StringTransformer{
    private char oldx;
    private char newx;
    public StringReplacer(char x, char y){
        this.oldx = x;
        this.newx = y;
    }
    public String execute(StringDrink drink) {
        drink.setText(drink.getText().replace(oldx, newx));
        return null;
    }
}
