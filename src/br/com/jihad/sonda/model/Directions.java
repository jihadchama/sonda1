package br.com.jihad.sonda.model;

public enum Directions {

    NORTH(new Coordinate(0,1)) {
        @Override
        public Directions getLeft() {
            return WEST;
        }

        @Override
        public Directions getRight() {
            return EAST;
        }
    },

    WEST(new Coordinate(-1, 0)) {
        @Override
        public Directions getLeft() {
            return SOUTH;
        }

        @Override
        public Directions getRight() {
            return NORTH;
        }
    },

    SOUTH(new Coordinate(0, -1)) {
        @Override
        public Directions getLeft() {
            return EAST;
        }

        @Override
        public Directions getRight() {
            return WEST;
        }
    },

    EAST(new Coordinate(1,0)) {
        @Override
        public Directions getLeft() {
            return NORTH;
        }

        @Override
        public Directions getRight() {
            return SOUTH;
        }
    };

    private Coordinate coordinate;

    Directions(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public abstract Directions getLeft();
    public abstract Directions getRight();

    public Coordinate getCoordinate() {
        return coordinate;
    }
}