public enum Direction {
	
		NORTH {
			@Override
			public Direction getLeft() {
				return WEST;
			}

			@Override
			public Direction getRight() {
				return EAST;
			}
		}, WEST {
			@Override
			public Direction getLeft() {
				return SOUTH;
			}

			@Override
			public Direction getRight() {
				return NORTH;
			}
		}, SOUTH {
			@Override
			public Direction getLeft() {
				return WEST;
			}

			@Override
			public Direction getRight() {
				return EAST;
			}
		}, EAST {
			@Override
			public Direction getLeft() {
				return NORTH;
			}

			@Override
			public Direction getRight() {
				return SOUTH;
			}
		};
	
	public abstract Direction getLeft();
	public abstract Direction getRight();
}

