package com.vijay.OOP.Inheritance;

public class TextBox extends UIControl {
    public String text = "";

    public TextBox() {
        super(true);
        //System.out.println("Textbox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
