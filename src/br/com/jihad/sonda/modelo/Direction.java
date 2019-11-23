package br.com.jihad.sonda.modelo;
public enum Direction {
	
		N{
			@Override
			public Direction getLeft() {
				return W;
			}

			@Override
			public Direction getRight() {
				return E;
			}
		}, W {
			@Override
			public Direction getLeft() {
				return S;
			}

			@Override
			public Direction getRight() {
				return N;
			}
		}, S {
			@Override
			public Direction getLeft() {
				return W;
			}

			@Override
			public Direction getRight() {
				return E;
			}
		}, E {
			@Override
			public Direction getLeft() {
				return N;
			}

			@Override
			public Direction getRight() {
				return S;
			}
		};
	
	public abstract Direction getLeft();
	public abstract Direction getRight();
}

