using System;

namespace Edabit.Solutions
{
    public class Circle
    {
        private double radius;
        
        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double GetArea() => radius * radius * Math.PI;

        public double GetPerimeter() => 2 * Math.PI * radius;
    }
}