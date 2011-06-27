package net.sue445.jubeatplusplus.enums;

import java.util.EnumMap;
import java.util.Map;


/**
 * 楽曲パックマスタ
 * @author sue445
 *
 */
public enum MusicPack {
	MP000000("デフォルト", "2010/11/08", new Music[]{Music.JP000001, Music.JP000002, Music.JP000003}),
	MP000001("music pack 01", "2010/11/08", new Music[]{Music.JP000004, Music.JP000005, Music.JP000006, Music.JP000007}),
	MP000002("music pack 02", "2010/11/08", new Music[]{Music.JP000008, Music.JP000009, Music.JP000010, Music.JP000011}),
	MP000003("music pack 03", "2010/11/08", new Music[]{Music.JP000012, Music.JP000013, Music.JP000014, Music.JP000015}),
	MP000004("ハイテンションジブリ pack", "2010/11/08", new Music[]{Music.JP000016, Music.JP000017, Music.JP000018, Music.JP000019}),
	MP000005("ニンジャマンジャパン pack", "2010/11/08", new Music[]{Music.JP000020, Music.JP000021, Music.JP000022, Music.JP000023}),
	MP000006("music pack 04", "2010/11/21", new Music[]{Music.JP000024, Music.JP000025, Music.JP000026, Music.JP000027}),
	MP000007("music pack 05", "2010/11/21", new Music[]{Music.JP000028, Music.JP000029, Music.JP000030, Music.JP000031}),
	MP000008("music pack 06", "2010/11/21", new Music[]{Music.JP000032, Music.JP000033, Music.JP000034, Music.JP000035}),
	MP000009("music pack 07", "2010/11/21", new Music[]{Music.JP000036, Music.JP000037, Music.JP000038, Music.JP000039}),
	MP000010("music pack 08", "2010/12/10", new Music[]{Music.JP000040, Music.JP000041, Music.JP000042, Music.JP000043}),
	MP000011("music pack 09", "2010/12/10", new Music[]{Music.JP000044, Music.JP000045, Music.JP000046, Music.JP000047}),
	MP000012("music pack 10", "2011/01/13", new Music[]{Music.JP000048, Music.JP000049, Music.JP000050, Music.JP000051}),
	MP000013("music pack 11", "2011/01/13", new Music[]{Music.JP000052, Music.JP000053, Music.JP000054, Music.JP000055}),
	MP000014("music pack 12", "2011/02/10", new Music[]{Music.JP000056, Music.JP000057, Music.JP000058, Music.JP000059}),
	MP000015("music pack 13", "2011/02/10", new Music[]{Music.JP000060, Music.JP000061, Music.JP000062, Music.JP000063}),
	MP000016("music pack 14", "2011/02/22", new Music[]{Music.JP000064, Music.JP000065, Music.JP000066, Music.JP000067}),
	MP000017("music pack 15", "2011/02/22", new Music[]{Music.JP000068, Music.JP000069, Music.JP000070, Music.JP000071}),
	MP000018("SuG pack", "2011/03/12", new Music[]{Music.JP000072, Music.JP000073, Music.JP000074, Music.JP000075}),
	MP000019("music pack 16", "2011/03/26", new Music[]{Music.JP000076, Music.JP000077, Music.JP000078, Music.JP000079}),
	MP000020("music pack 17", "2011/03/26", new Music[]{Music.JP000080, Music.JP000081, Music.JP000082, Music.JP000083}),
	MP000021("ET-KING pack", "2011/03/26", new Music[]{Music.JP000084, Music.JP000085, Music.JP000086, Music.JP000087}),
	MP000022("music pack 18", "2011/04/15", new Music[]{Music.JP000088, Music.JP000089, Music.JP000090, Music.JP000091}),
	MP000023("music pack 19", "2011/04/15", new Music[]{Music.JP000092, Music.JP000093, Music.JP000094, Music.JP000095}),
	MP000024("Daisy×Daisy pack", "2011/05/05", new Music[]{Music.JP000096, Music.JP000097, Music.JP000098, Music.JP000099}),
	MP000025("music pack 20", "2011/05/27", new Music[]{Music.JP000100, Music.JP000101, Music.JP000102, Music.JP000103}),
	MP000026("music pack 21", "2011/05/27", new Music[]{Music.JP000104, Music.JP000105, Music.JP000106, Music.JP000107}),
	MP000027("Biju☆Love☆ pack", "2011/06/07", new Music[]{Music.JP000108, Music.JP000109, Music.JP000110, Music.JP000111}),
	MP000028("Jazztronik pack", "2011/06/10", new Music[]{Music.JP000112, Music.JP000113, Music.JP000114, Music.JP000115}),
	MP000029("music pack 22", "2011/06/25", new Music[]{Music.JP000116, Music.JP000117, Music.JP000118, Music.JP000119}),
	MP000030("music pack 23", "2011/06/25", new Music[]{Music.JP000120, Music.JP000121, Music.JP000122, Music.JP000123}),
	;

	/**
	 * 楽曲からパックへのマッピング
	 */
	protected static final Map<Music, MusicPack> MUSIC_TO_PACK = new EnumMap<Music, MusicPack>(Music.class);
	static{
		for(MusicPack pack : values()){
			for(Music music : pack.musics){
				MUSIC_TO_PACK.put(music, pack);
			}
		}
	}

	/**
	 * 楽曲パック名
	 */
	private final String title;

	/**
	 * 配信日(YYYY/MM/DD)
	 */
	private final String releasedAt;

	/**
	 * 収録曲
	 */
	private final Music[] musics;


	private MusicPack(String title, String releasedAt, Music[] musics) {
		this.title = title;
		this.releasedAt = releasedAt;
		this.musics = musics;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return releasedAt
	 */
	public String getReleasedAt() {
		return releasedAt;
	}

	/**
	 * @return musics
	 */
	public Music[] getMusics() {
		return musics;
	}

	/**
	 * 楽曲からパックを探す
	 * @param music
	 * @return
	 */
	public static MusicPack findByMusic(Music music){
		return MUSIC_TO_PACK.get(music);
	}

	private static final int MAX_LENGTH = MusicPack.values().length;

	public static int size(){
		return MAX_LENGTH;
	}
}
