package br.com.jihad.sonda.modelo;

public enum Direction {

    NORTH(new Position(0,1)){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    WEST (new Position(-1, 0)){
        @Override
        public Direction getLeft() {
            return SOUTH;
        }

        @Override
        public Direction getRight() {
            return NORTH;
        }
    },

    SOUTH (new Position(0, -1)){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    EAST (new Position(1,0)){
        @Override
        public Direction getLeft() {
            return NORTH;
        }

        @Override
        public Direction getRight() {
            return SOUTH;
        }
    };

    private Position position;

    Direction (Position position) {
        this.position = position;

    }

    public abstract Direction getLeft();
    public abstract Direction getRight();

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }



}
