#ifndef RECTANGLE_H
#define RECTANGLE_H

class Rectangle
{
    public:
        int length, breadth;
       // IMPLICIT DEFINATION
       // void getData();
       // int areaRec() { return (length * breadth); }
       // int perimeterRec(){ return (2 * (length * breadth)); }

       // EXPLICITLY Defined in Rectangle.cpp
       int areaRec();       // <--- THESE ARE PROTOTYPE, and DEFINED in the File " Rectangle.cpp"
       int perimeterRec();
};

#endif // RECTANGLE_H
