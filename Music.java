package net.sue445.jubeatplusplus.enums;

import java.util.HashMap;
import java.util.Map;

import net.sue445.jubeatplusplus.exception.TuneIdNotFoundException;

import org.apache.commons.lang.StringUtils;



/**
 * 楽曲マスタ
 * @author sue445
 *
 */
public enum Music {
	JP000001("100000201", "ウィリアム・テル序曲", "うぃりあむてるじょきょく", 3, 7, 9),
	JP000002("100000315", "Sweet Rain", "すいーとれいん", 4, 8, 9),
	JP000003("100000106", "Snow Goose", "すのーぐーす", 5, 7, 8),
	JP000004("100000102", "天国と地獄", "てんごくとじごく", 3, 8, 9),
	JP000005("100000112", "Special One", "すぺしゃるわん", 4, 5, 7),
	JP000006("220000110", "天体観測", "てんたいかんそく", 2, 4, 5),
	JP000007("100000105", "Jumping Boogie", "じゃんぴんぐぶぎー", 5, 7, 8),
	JP000008("100000101", "bass 2 bass", "べーすとぅーべーす", 5, 6, 8),
	JP000009("100000107", "Polaris", "ぽらりす", 2, 5, 8),
	JP000010("220000208", "夏祭り", "なつまつり", 2, 6, 8),
	JP000011("100000217", "スペースカーニバル", "すぺーすかーにばる", 4, 7, 9),
	JP000012("220000209", "空色デイズ", "そらいろでいず", 3, 6, 8),
	JP000013("220000201", "情熱大陸", "じょうねつたいりく", 2, 7, 9),
	JP000014("100000307", "fellow", "ふぇろー", 4, 5, 8),
	JP000015("100000310", "Far east nightbird", "ふぁーいーすとないとばーど", 4, 7, 10),
	JP000016("321020001", "となりのトトロ feat.sayurina", "となりのととろ", 2, 6, 8),
	JP000017("321020002", "もののけ姫", "もののけひめ", 2, 5, 8),
	JP000018("321020003", "君をのせて feat.sayurina", "きみをのせて", 2, 6, 8),
	JP000019("321020004", "風の通り道 feat.佐野隆", "かぜのとおりみち", 3, 6, 7),
	JP000020("311010001", "ニンジャマンジャパンのテーマ", "にんじゃまんじゃぱんのてーま", 2, 6, 7),
	JP000021("311010002", "-SHINOBI-", "しのび", 3, 6, 8),
	JP000022("311010003", "隠密Dancers", "おんみつだんさーず", 3, 5, 7),
	JP000023("311010004", "Never Give Up!", "ねばーぎぶあっぷ", 1, 4, 8),
	JP000024("220000105", "抱いてセニョリータ", "だいてせにょりーた", 2, 4, 6),
	JP000025("220000109", "POP STAR", "ぽっぷすたー", 1, 4, 7),
	JP000026("220000124", "I'M IN THE MOOD FOR DANCING", "あいむいんざむーどふぉうだんしんぐ", 2, 4, 6),
	JP000027("220000303", "じょいふる", "じょいふる", 1, 6, 8),
	JP000028("220000106", "キューティーハニー", "きゅーてぃーはにー", 3, 5, 6),
	JP000029("220000108", "こんなに近くで...", "こんなにちかくで", 2, 3, 5),
	JP000030("220000117", "光のロック", "ひかりのろっく", 2, 4, 8),
	JP000031("220000211", "愛をとりもどせ！！", "あいをとりもどせ", 2, 5, 7),
	JP000032("100000115", "Evans", "えばんす", 6, 8, 10),
	JP000033("100000207", "coming true", "かみんぐとぅるー", 5, 7, 9),
	JP000034("100000216", "AIR RAID FROM THA UNDAGROUND", "えあれいどふろむざあんだーぐらうんど", 5, 9, 10),
	JP000035("100000314", "Shine On Me", "しゃいんおんみー", 4, 8, 9),
	JP000036("100000202", "隅田川夏恋歌", "すみだがわなつこいうた", 5, 7, 9),
	JP000037("100000209", "Good-bye Chalon", "ぐっばいきゃろん", 4, 8, 9),
	JP000038("100000218", "Lead Me", "りーどみー", 3, 7, 9),
	JP000039("100000305", "ALL MY HEART -この恋に、わたしの全てを賭ける-", "おーるまいはーと", 4, 8, 9),
	JP000040("220000102", "粉雪", "こなゆき", 3, 4, 6),
	JP000041("100000118", "凛として咲く花の如く", "りんとしてさくはなのごとく", 4, 7, 9),
	JP000042("100000206", "Queen's Paradise", "くいーんずぱらだいす", 4, 7, 8),
	JP000043("100000210", "SWEET ANGEL", "すいーとえんじぇる", 4, 6, 9),
	JP000044("100000108", "Happy Happy", "はっぴーはっぴー", 2, 5, 8),
	JP000045("220000205", "HOT LIMIT", "ほっとりみっと", 5, 7, 8),
	JP000046("100000208", "Shining Star", "しゃいにんぐすたー", 4, 6, 8),
	JP000047("220000302", "Supercalifragilisticexpialidocious", "すーぱーかりふらじりすてぃっくえくすぴありどーしゃす", 4, 5, 9),
	JP000048("220000104", "全力少年", "ぜんりょくしょうねん", 2, 5, 6),
	JP000049("100000119", "TRUE♥LOVE", "とぅるーらぶ", 3, 7, 9),
	JP000050("100000214", "ECO FIGHTER", "えこふぁいたー", 3, 5, 8),
	JP000051("100000309", "さよならトリップ", "さよならとりっぷ", 3, 7, 9),
	JP000052("220000118", "BELIEVE IN LOVE", "びりーぶいんらぶ", 3, 4, 6),
	JP000053("220000120", "I my me mine", "あいまいみーまいん", 3, 6, 8),
	JP000054("100000211", "INVISIBLE WORLD", "いんびじぶるわーるど", 2, 7, 8),
	JP000055("100000212", "Russian Snowy Dance", "ろしあんすのーりーだんす", 5, 8, 10),
	JP000056("100000111", "IN THE NAME OF LOVE", "いんざねーむおぶらぶ", 6, 7, 9),
	JP000057("100000116", "In Scottish Highlands", "いんすこてぃっしゅはいらんず", 4, 7, 9),
	JP000058("220000116", "キスしてほしい", "きすしてほしい", 3, 5, 7),
	JP000059("100000120", "Slang", "すらんぐ", 4, 7, 9),
	JP000060("100000103", "GIGA BREAK", "ぎがぶれいく", 6, 7, 10),
	JP000061("220000111", "endscape", "えんどすけーぷ", 2, 5, 6),
	JP000062("220000206", "PROMiSE", "ぷろみす", 2, 5, 7),
	JP000063("100000303", "Ready Go!!", "れでぃごー", 5, 6, 8),
	JP000064("100000205", "STARLIT DUST/スティルに捧ぐ", "すたーりっとだすと", 4, 6, 8),
	JP000065("220000210", "Lovin' Life", "らびんらいふ", 2, 5, 7),
	JP000066("100000219", "少年リップルズ", "しょうねんりっぷるず", 4, 7, 9),
	JP000067("220000301", "Sandstorm", "さんどすとーむ", 2, 6, 8),
	JP000068("220000112", "負けないで", "まけないで", 3, 4, 5),
	JP000069("100000204", "eyes", "あいず", 3, 7, 9),
	JP000070("100000308", "KUNG-FU MAMA", "かんふーまま", 3, 7, 9),
	JP000071("100000323", "愛と勇気の三度笠ポン太", "あいとゆうきのさんどがさぽんた", 4, 6, 8),
	JP000072("321040001", "gr8 story", "ぐれいとすとーりー", 2, 5, 8),
	JP000073("321040002", "小悪魔Sparkling", "こあくますぱーきんぐ", 3, 5, 8),
	JP000074("321040003", "R.P.G.～Rockin' Playing Game", "あーるぴーじー", 4, 7, 9),
	JP000075("321040004", "Crazy Bunny Coaster", "くれいじーばにーこーすたー", 3, 6, 9),
	JP000076("220000107", "ふがいないや ", "ふがいないや", 2, 5, 7),
	JP000077("220000114", "SPEED KING", "すぴーどきんぐ", 3, 6, 7),
	JP000078("100000117", "SigSig", "しぐしぐ", 6, 8, 9),
	JP000079("100000213", "恋のメリーゴーランド", "こいのめりーごーらんど", 5, 7, 8),
	JP000080("100000104", "Icicles", "あいしくるず", 4, 6, 8),
	JP000081("220000122", "PEACH", "ぴーち", 2, 4, 6),
	JP000082("100000220", "コイノチカラ", "こいのちから", 3, 6, 8),
	JP000083("100000322", "concon", "こんこん", 6, 9, 10),
	JP000084("321050001", "纏", "まとい", 3, 8, 9),
	JP000085("321050002", "愛しいひとへ", "いとしいひとへ", 2, 7, 8),
	JP000086("321050003", "一番音頭", "いちばんおんど", 3, 5, 7),
	JP000087("321050004", "PRIDE ～君がくれたもの～", "ぷらいど", 2, 7, 8),
	JP000088("220000103", "Love so sweet", "らぶそーすいーと", 2, 4, 6),
	JP000089("220000113", "A Perfect Sky", "あぱーふぇくとすかい", 3, 5, 7),
	JP000090("100000203", "AREA 51", "えりあふぃふてぃーわん", 6, 8, 10),
	JP000091("100000302", "Green Green Dance", "ぐりーんぐりーんだんす", 4, 8, 9),
	JP000092("220000119", "BLUE BIRD", "ぶるーばーど", 2, 4, 6),
	JP000093("100000301", "白鳥の湖", "はくちょうのみずうみ", 4, 7, 9),
	JP000094("100000304", "Shining Wizard", "しゃいにんぐうぃざーど", 5, 8, 10),
	JP000095("100000321", "うらもからだも落花微塵", "うちもからだもらっかみじん", 4, 7, 9),
	JP000096("321040101", "HOLY SHINE", "ほーりーしゃいん", 2, 5, 8),
	JP000097("321040102", "防衛本脳", "ぼうえいほんのう", 3, 6, 9),
	JP000098("321040103", "BELIEVE", "びりーぶ", 2, 5, 8),
	JP000099("321040104", "Evidence", "えびでんす", 2, 5, 7),
	JP000100("100000113", "Crosswind", "くろすういんど", 3, 7, 9),
	JP000101("100000215", "Macuilxochitl", "まくいるしょちとる", 7, 8, 10),
	JP000102("100000221", "ALBIDA", "あるびだ", 5, 7, 10),
	JP000103("100000316", "FLOWER", "ふらわー", 6, 9, 10),
	JP000104("220000202", "Garden of Love", "がーでんおぶらぶ", 1, 6, 8),
	JP000105("220000203", "素直になれたら", "すなおになれたら", 1, 4, 6),
	JP000106("100000306", "Love ♡ km", "らぶきろめーとる", 3, 7, 9),
	JP000107("100000320", "STELLAR WIND", "すてらういんど", 6, 9, 10),
	JP000108("311060002", "Sweet Little Biju", "すいーとりとるびじゅ", 3, 6, 8),
	JP000109("311060003", "オムライス", "おむらいす", 2, 5, 8),
	JP000110("311060004", "HYPER COSMO", "はいぱーこすも", 4, 7, 9),
	JP000111("311060001", "Bijuのテーマ", "びじゅのてーま", 2, 5, 7),
	JP000112("321040201", "Flash Light feat. JAY'ED", "ふらっしゅらいと", 2, 5, 7),
	JP000113("321040202", "Real Clothes<Album Mix>", "りーるくろすいず", 3, 5, 8),
	JP000114("321040203", "Sweet Rain (Jazztronik pack)", "すいーとれいん", 3, 5, 7),
	JP000115("321040204", "BRA. Step", "びーあーるえーすてっぷ", 3, 7, 9),
	JP000116("100000109", "I love マミー", "あいらぶまみー", 4, 5, 8),
	JP000117("220000123", "YELL ～エール～", "えーる", 2, 5, 6),
	JP000118("220000207", "My SunShine", "まいさんしゃいん", 1, 4, 6),
	JP000119("100000318", "Jailbreak", "じぇいるぶれいく", 5, 6, 9),
	JP000120("220000101", "一色", "ひといろ", 2, 4, 7),
	JP000121("100000114", "あいのうた", "あいのうた", 3, 4, 7),
	JP000122("100000311", "Prophet Vibe", "ぷろふぇっとばいぶ", 4, 7, 9),
	JP000123("100000319", "キルト", "きると", 5, 7, 9),
	;

	public static final int ID_LENGTH = 8;


	/**
	 * tuneIdからMusicへのマッピング
	 */
	private static final Map<String, Music> TUNE_ID_TO_MUSIC = new HashMap<String, Music>();

	/**
	 * タイトルからMusicへのマッピング
	 */
	private static final Map<String, Music> TITLE_TO_MUSIC = new HashMap<String, Music>();

	static{
		for(Music music : values()){
			TUNE_ID_TO_MUSIC.put(music.getTuneId(), music);
			TITLE_TO_MUSIC.put(music.getTitle(), music);
		}
	}

	/**
	 * 曲名
	 */
	private final String title;

	/**
	 * 曲名（読み仮名）
	 */
	private final String readingTitle;

	/**
	 * BASICのレベル
	 */
	private final int basicLevel;

	/**
	 * ADVANCEDのレベル
	 */
	private final int advancedLevel;

	/**
	 * EXTREMEのレベル
	 */
	private final int extremeLevel;

	/**
	 * iTunesのID?(Z_TUNEID)
	 */
	private final String tuneId;


	private Music(String tuneId, String title, String readingTitle, int basicLevel, int advancedLevel, int extremeLevel) {
		this.tuneId = tuneId;
		this.title = title;
		this.readingTitle = readingTitle;
		this.basicLevel = basicLevel;
		this.advancedLevel = advancedLevel;
		this.extremeLevel = extremeLevel;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return readingTitle
	 */
	public String getReadingTitle() {
		return readingTitle;
	}

	/**
	 * @return basicLevel
	 */
	public int getBasicLevel() {
		return basicLevel;
	}

	/**
	 * @return advancedLevel
	 */
	public int getAdvancedLevel() {
		return advancedLevel;
	}

	/**
	 * @return extremeLevel
	 */
	public int getExtremeLevel() {
		return extremeLevel;
	}

	/**
	 * 文字列からenumを取得する
	 * @param str
	 * @return
	 */
	public static Music toEnum(String str){
		if(StringUtils.isEmpty(str)){
			throw new NullPointerException("str is required");
		}

		return valueOf(str.trim());
	}

	/**
	 * tuneIdからenumを取得する
	 * @param tuneId
	 * @return
	 * @throws TuneIdNotFoundException tuneIdが見つからない
	 */
	public static Music findByTuneId(String tuneId){
		Music music = TUNE_ID_TO_MUSIC.get(tuneId);
		if(music == null){
			throw new TuneIdNotFoundException(tuneId);
		}
		return music;
	}

	/**
	 * titleからenumを取得する
	 * @param title
	 * @return
	 * @throws TuneIdNotFoundException tuneIdが見つからない
	 */
	public static Music findByTitle(String title){
		Music music = TITLE_TO_MUSIC.get(title);
		if(music == null){
			return null;
		}
		return music;
	}

	/**
	 * enumの個数を取得する
	 * @return
	 */
	public static int size(){
		return TUNE_ID_TO_MUSIC.size();
	}

	/**
	 * @return tuneId
	 */
	public String getTuneId() {
		return tuneId;
	}
}
