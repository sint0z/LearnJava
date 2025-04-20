package shzeproject.generics.limitgeneric.color;

import shzeproject.generics.limitgeneric.color.redundacy.SolidEx;

import java.awt.*;

/*
  Данный класс предназначен для демонстрации работы, классов
  использующих обобщения и ограничения которые наложены на них
*/
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());

        int tempX = solid.getX();
        int tempW = solid.weight();
        Color tempCol = solid.color();

        //Использование класса, убравший избыточность
        SolidEx<Bounded> solidExtends = new SolidEx<>(new Bounded());
        tempX = solidExtends.getX();
        tempW = solidExtends.weight();
        tempCol = solidExtends.getColor();
    }
}
