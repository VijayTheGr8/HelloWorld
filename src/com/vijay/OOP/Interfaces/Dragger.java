package com.vijay.OOP.Interfaces;

public class Dragger {

    public void drag(Draggable widget) {
        widget.drag();
        System.out.println("Dragging Done!");
    }
}
