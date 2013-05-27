package uk.co.jamesj999.sonic.level;


public class TestLevel extends AbstractLevel {

	@Override
	protected void setupTiles() {

		byte[] tile1Height = new byte[16];
		tile1Height[0] = 4;
		tile1Height[1] = 4;
		tile1Height[2] = 4;
		tile1Height[3] = 4;
		tile1Height[4] = 4;
		tile1Height[5] = 4;
		tile1Height[6] = 4;
		tile1Height[7] = 4;
		tile1Height[8] = 4;
		tile1Height[9] = 4;
		tile1Height[10] = 4;
		tile1Height[11] = 4;
		tile1Height[12] = 4;
		tile1Height[13] = 4;
		tile1Height[14] = 4;
		tile1Height[15] = 4;

		byte[] tile2Height = new byte[16];
		tile2Height[0] = 5;
		tile2Height[1] = 5;
		tile2Height[2] = 5;
		tile2Height[3] = 5;
		tile2Height[4] = 5;
		tile2Height[5] = 5;
		tile2Height[6] = 5;
		tile2Height[7] = 5;
		tile2Height[8] = 6;
		tile2Height[9] = 6;
		tile2Height[10] = 6;
		tile2Height[11] = 6;
		tile2Height[12] = 6;
		tile2Height[13] = 6;
		tile2Height[14] = 6;
		tile2Height[15] = 6;

		byte[] tile3Height = new byte[16];
		tile3Height[0] = 7;
		tile3Height[1] = 7;
		tile3Height[2] = 7;
		tile3Height[3] = 7;
		tile3Height[4] = 7;
		tile3Height[5] = 7;
		tile3Height[6] = 7;
		tile3Height[7] = 7;
		tile3Height[8] = 8;
		tile3Height[9] = 8;
		tile3Height[10] = 8;
		tile3Height[11] = 8;
		tile3Height[12] = 8;
		tile3Height[13] = 8;
		tile3Height[14] = 8;
		tile3Height[15] = 8;

		byte[] tile4Height = new byte[16];
		tile4Height[0] = 8;
		tile4Height[1] = 8;
		tile4Height[2] = 8;
		tile4Height[3] = 8;
		tile4Height[4] = 8;
		tile4Height[5] = 8;
		tile4Height[6] = 8;
		tile4Height[7] = 8;
		tile4Height[8] = 8;
		tile4Height[9] = 8;
		tile4Height[10] = 8;
		tile4Height[11] = 8;
		tile4Height[12] = 8;
		tile4Height[13] = 8;
		tile4Height[14] = 8;
		tile4Height[15] = 8;

		byte[] tile5Height = new byte[16];
		tile5Height[0] = 7;
		tile5Height[1] = 7;
		tile5Height[2] = 7;
		tile5Height[3] = 7;
		tile5Height[4] = 7;
		tile5Height[5] = 7;
		tile5Height[6] = 7;
		tile5Height[7] = 7;
		tile5Height[8] = 6;
		tile5Height[9] = 6;
		tile5Height[10] = 6;
		tile5Height[11] = 6;
		tile5Height[12] = 6;
		tile5Height[13] = 6;
		tile5Height[14] = 6;
		tile5Height[15] = 6;

		byte[] tile6Height = new byte[16];
		tile6Height[0] = 5;
		tile6Height[1] = 5;
		tile6Height[2] = 5;
		tile6Height[3] = 5;
		tile6Height[4] = 5;
		tile6Height[5] = 5;
		tile6Height[6] = 5;
		tile6Height[7] = 5;
		tile6Height[8] = 4;
		tile6Height[9] = 4;
		tile6Height[10] = 4;
		tile6Height[11] = 4;
		tile6Height[12] = 4;
		tile6Height[13] = 4;
		tile6Height[14] = 4;
		tile6Height[15] = 4;

		Tile tile1 = new Tile(tile1Height);
		Tile tile2 = new Tile(tile2Height);
		Tile tile3 = new Tile(tile3Height);
		Tile tile4 = new Tile(tile4Height);
		Tile tile5 = new Tile(tile5Height);
		Tile tile6 = new Tile(tile6Height);

		addTile(tile1, 0, 0);
		addTile(tile1, 1, 0);
		addTile(tile1, 2, 0);
		addTile(tile1, 3, 0);
		addTile(tile2, 4, 0);
		addTile(tile3, 5, 0);
		addTile(tile4, 6, 0);
		addTile(tile4, 7, 0);
		addTile(tile4, 8, 0);
		addTile(tile4, 9, 0);
		addTile(tile4, 10, 0);
		addTile(tile4, 11, 0);
		addTile(tile5, 12, 0);
		addTile(tile6, 13, 0);
		addTile(tile1, 14, 0);
		addTile(tile1, 15, 0);
		addTile(tile1, 16, 0);
		addTile(tile2, 17, 0);
		addTile(tile2, 18, 0);
		addTile(tile2, 18, 0);
		addTile(tile3, 19, 0);
	}
}
