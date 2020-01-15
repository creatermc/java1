package ru.progwards.java1.lessons.abstractnum;

public class Pyramid extends Figure3D{

    public Pyramid(Number segment) {
        super(segment);
    }

    @Override
    public Number volume(){

        //это высота
        return segment.mul(segment.mul(segment));
        //return null;
    }
}

/*6 Реализовать класс Pyramid, переопределяющий метод
public Number volume(), который будет возвращать объем пирамиды, с основанием квадрат, и высотой равной стороне квадрата по формуле Segment*Segment*Segment/3;*/