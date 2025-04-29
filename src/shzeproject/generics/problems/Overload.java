package shzeproject.generics.problems;

import java.util.List;

public class Overload<TC,TU> {

    void f(List<TC> list){}
    // void f(List<TU> list){} - компилятор не пропустит, т.к сигнатура метода одинаковая, и все из-за стирания

    // Fix =)
    void f1(List<TC> list){}
    void f2(List<TU> list){}
}
