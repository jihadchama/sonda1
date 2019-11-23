package br.com.jihad.sonda.modelo;

public enum Direction {

    NORTH(0,1){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    WEST (-1, 0){
        @Override
        public Direction getLeft() {
            return SOUTH;
        }

        @Override
        public Direction getRight() {
            return NORTH;
        }
    },

    SOUTH (0, -1){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    EAST (1, 0){
        @Override
        public Direction getLeft() {
            return NORTH;
        }

        @Override
        public Direction getRight() {
            return SOUTH;
        }
    };

    private int x, y;

    Direction (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract Direction getLeft();
    public abstract Direction getRight();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



}
