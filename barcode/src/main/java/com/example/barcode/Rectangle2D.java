package com.example.barcode;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class Rectangle2D extends RectangularShape {
    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }
/*
    @Override
    public boolean isEmpty() {
        return false;
    }
*/
    protected Rectangle2D() {
        super();
    }
/*
    @Override
    public void setFrame(double var1, double var3, double var5, double var7) {

    }

    @Override
    public boolean contains(@NotNull error.NonExistentClass var1) {
        return super.contains(var1);
    }

    @Override
    public boolean intersects(@NotNull Rectangle2D var1) {
        return super.intersects(var1);
    }

    @Override
    public boolean contains(@NotNull Rectangle2D var1) {
        return super.contains(var1);
    }*/

//    @NotNull
//    @Override
//    public error.NonExistentClass getBounds() {
//        return super.getBounds();
//    }

 /*   @NotNull
    @Override
    public error.NonExistentClass getPathIterator(@NotNull error.NonExistentClass var1, double var2) {
        return super.getPathIterator(var1, var2);
    }
*/
/*    @NotNull
    @Override
    public Object clone() {
        return super.clone();
    }*/

    public static class Double extends Rectangle2D implements Serializable {
        public double x;
        public double y;
        public double width;
        public double height;
        private static final long serialVersionUID = 7771313791441850493L;

        public Double() {
        }

        public Double(double var1, double var3, double var5, double var7) {
            this.setRect(var1, var3, var5, var7);
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        public boolean isEmpty() {
            return this.width <= 0.0D || this.height <= 0.0D;
        }

        public void setRect(double var1, double var3, double var5, double var7) {
            this.x = var1;
            this.y = var3;
            this.width = var5;
            this.height = var7;
        }

        public void setRect(Rectangle2D var1) {
            this.x = var1.getX();
            this.y = var1.getY();
            this.width = var1.getWidth();
            this.height = var1.getHeight();
        }

        public int outcode(double var1, double var3) {
            int var5 = 0;
            if (this.width <= 0.0D) {
                var5 |= 5;
            } else if (var1 < this.x) {
                var5 |= 1;
            } else if (var1 > this.x + this.width) {
                var5 |= 4;
            }

            if (this.height <= 0.0D) {
                var5 |= 10;
            } else if (var3 < this.y) {
                var5 |= 2;
            } else if (var3 > this.y + this.height) {
                var5 |= 8;
            }

            return var5;
        }

        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Double(this.x, this.y, this.width, this.height);
        }
/*

        public Rectangle2D createIntersection(Rectangle2D var1) {
            Rectangle2D.Double var2 = new Rectangle2D.Double();
            Rectangle2D.intersect(this, var1, var2);
            return var2;
        }

        public Rectangle2D createUnion(Rectangle2D var1) {
            Rectangle2D.Double var2 = new Rectangle2D.Double();
            Rectangle2D.union(this, var1, var2);
            return var2;
        }
*/

        public String toString() {
            return this.getClass().getName() + "[x=" + this.x + ",y=" + this.y + ",w=" + this.width + ",h=" + this.height + "]";
        }
    }

}

