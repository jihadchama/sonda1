package br.com.jihad.sonda.modelo;

public enum Direction {

    NORTH(new Coordenates(0,1)){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    WEST(new Coordenates(-1, 0)){
        @Override
        public Direction getLeft() {
            return SOUTH;
        }

        @Override
        public Direction getRight() {
            return NORTH;
        }
    },

    SOUTH(new Coordenates(0, -1)){
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },

    EAST(new Coordenates(1,0)){
        @Override
        public Direction getLeft() {
            return NORTH;
        }

        @Override
        public Direction getRight() {
            return SOUTH;
        }
    };

    private Coordenates coordenates;

    Direction (Coordenates coordenates) {
        this.coordenates = coordenates;

    }

    public abstract Direction getLeft();
    public abstract Direction getRight();

    public Coordenates getCoordenates() {
        return coordenates;
    }




}
