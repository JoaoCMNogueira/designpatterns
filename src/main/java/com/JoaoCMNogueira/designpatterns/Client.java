package com.JoaoCMNogueira.designpatterns;

public interface Client extends BarObserver{
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
