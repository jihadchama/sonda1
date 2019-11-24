package br.com.jihad.sonda.modelo;

public enum Direction {

    N(new Position(0,1)){
        @Override
        public Direction getLeft() {
            return W;
        }

        @Override
        public Direction getRight() {
            return E;
        }
    },

    W (new Position(-1, 0)){
        @Override
        public Direction getLeft() {
            return S;
        }

        @Override
        public Direction getRight() {
            return N;
        }
    },

    S (new Position(0, -1)){
        @Override
        public Direction getLeft() {
            return W;
        }

        @Override
        public Direction getRight() {
            return E;
        }
    },

    E (new Position(1,0)){
        @Override
        public Direction getLeft() {
            return N;
        }

        @Override
        public Direction getRight() {
            return S;
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
