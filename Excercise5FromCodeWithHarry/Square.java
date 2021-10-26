package com.codewithharry.shape;

public class Square extends Shape {
    Square(int dim1) {
        super(dim1, -1);
    }

    public int area() {
        return dim1 * dim2;
    }

}
