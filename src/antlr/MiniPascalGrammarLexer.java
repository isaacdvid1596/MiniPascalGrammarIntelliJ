// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, IDENTIFIER=52, 
		NUMBER=53, STRING=54, CHAR=55, COMMENT=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "IDENTIFIER", "NUMBER", "STRING", "CHAR", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'var'", "':'", "'array'", "'['", "']'", 
			"'of'", "'..'", "'integer'", "'real'", "'boolean'", "'char'", "'string'", 
			"'begin'", "':='", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'repeat'", "'until'", "'write'", "'('", "')'", "'read'", "','", 
			"'function'", "'end;'", "'end'", "'and'", "'or'", "'not'", "'true'", 
			"'false'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'div'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "NUMBER", "STRING", "CHAR", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniPascalGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPascalGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00009\u017b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00053\u0144\b3\n3\f3\u0147\t3\u0001"+
		"4\u00044\u014a\b4\u000b4\f4\u014b\u00014\u00014\u00044\u0150\b4\u000b"+
		"4\f4\u0151\u00034\u0154\b4\u00015\u00015\u00015\u00015\u00055\u015a\b"+
		"5\n5\f5\u015d\t5\u00015\u00015\u00016\u00016\u00016\u00016\u00056\u0165"+
		"\b6\n6\f6\u0168\t6\u00016\u00016\u00017\u00017\u00057\u016e\b7\n7\f7\u0171"+
		"\t7\u00017\u00017\u00018\u00048\u0176\b8\u000b8\f8\u0177\u00018\u0001"+
		"8\u0000\u00009\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9\u0001\u0000\u0006"+
		"\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r\r"+
		"\"\"\u0002\u0000{{}}\u0003\u0000\t\n\r\r  \u0184\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001"+
		"\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000"+
		"\u0000\u0001s\u0001\u0000\u0000\u0000\u0003{\u0001\u0000\u0000\u0000\u0005"+
		"}\u0001\u0000\u0000\u0000\u0007\u007f\u0001\u0000\u0000\u0000\t\u0083"+
		"\u0001\u0000\u0000\u0000\u000b\u0085\u0001\u0000\u0000\u0000\r\u008b\u0001"+
		"\u0000\u0000\u0000\u000f\u008d\u0001\u0000\u0000\u0000\u0011\u008f\u0001"+
		"\u0000\u0000\u0000\u0013\u0092\u0001\u0000\u0000\u0000\u0015\u0095\u0001"+
		"\u0000\u0000\u0000\u0017\u009d\u0001\u0000\u0000\u0000\u0019\u00a2\u0001"+
		"\u0000\u0000\u0000\u001b\u00aa\u0001\u0000\u0000\u0000\u001d\u00af\u0001"+
		"\u0000\u0000\u0000\u001f\u00b6\u0001\u0000\u0000\u0000!\u00bc\u0001\u0000"+
		"\u0000\u0000#\u00bf\u0001\u0000\u0000\u0000%\u00c2\u0001\u0000\u0000\u0000"+
		"\'\u00c7\u0001\u0000\u0000\u0000)\u00cc\u0001\u0000\u0000\u0000+\u00d2"+
		"\u0001\u0000\u0000\u0000-\u00d5\u0001\u0000\u0000\u0000/\u00d9\u0001\u0000"+
		"\u0000\u00001\u00dc\u0001\u0000\u0000\u00003\u00e3\u0001\u0000\u0000\u0000"+
		"5\u00e9\u0001\u0000\u0000\u00007\u00ef\u0001\u0000\u0000\u00009\u00f1"+
		"\u0001\u0000\u0000\u0000;\u00f3\u0001\u0000\u0000\u0000=\u00f8\u0001\u0000"+
		"\u0000\u0000?\u00fa\u0001\u0000\u0000\u0000A\u0103\u0001\u0000\u0000\u0000"+
		"C\u0108\u0001\u0000\u0000\u0000E\u010c\u0001\u0000\u0000\u0000G\u0110"+
		"\u0001\u0000\u0000\u0000I\u0113\u0001\u0000\u0000\u0000K\u0117\u0001\u0000"+
		"\u0000\u0000M\u011c\u0001\u0000\u0000\u0000O\u0122\u0001\u0000\u0000\u0000"+
		"Q\u0124\u0001\u0000\u0000\u0000S\u0127\u0001\u0000\u0000\u0000U\u0129"+
		"\u0001\u0000\u0000\u0000W\u012b\u0001\u0000\u0000\u0000Y\u012e\u0001\u0000"+
		"\u0000\u0000[\u0131\u0001\u0000\u0000\u0000]\u0133\u0001\u0000\u0000\u0000"+
		"_\u0135\u0001\u0000\u0000\u0000a\u0137\u0001\u0000\u0000\u0000c\u0139"+
		"\u0001\u0000\u0000\u0000e\u013d\u0001\u0000\u0000\u0000g\u0141\u0001\u0000"+
		"\u0000\u0000i\u0149\u0001\u0000\u0000\u0000k\u0155\u0001\u0000\u0000\u0000"+
		"m\u0160\u0001\u0000\u0000\u0000o\u016b\u0001\u0000\u0000\u0000q\u0175"+
		"\u0001\u0000\u0000\u0000st\u0005p\u0000\u0000tu\u0005r\u0000\u0000uv\u0005"+
		"o\u0000\u0000vw\u0005g\u0000\u0000wx\u0005r\u0000\u0000xy\u0005a\u0000"+
		"\u0000yz\u0005m\u0000\u0000z\u0002\u0001\u0000\u0000\u0000{|\u0005;\u0000"+
		"\u0000|\u0004\u0001\u0000\u0000\u0000}~\u0005.\u0000\u0000~\u0006\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005v\u0000\u0000\u0080\u0081\u0005a\u0000"+
		"\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\b\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005:\u0000\u0000\u0084\n\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005a\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087\u0088\u0005"+
		"r\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005y\u0000"+
		"\u0000\u008a\f\u0001\u0000\u0000\u0000\u008b\u008c\u0005[\u0000\u0000"+
		"\u008c\u000e\u0001\u0000\u0000\u0000\u008d\u008e\u0005]\u0000\u0000\u008e"+
		"\u0010\u0001\u0000\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090\u0091"+
		"\u0005f\u0000\u0000\u0091\u0012\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		".\u0000\u0000\u0093\u0094\u0005.\u0000\u0000\u0094\u0014\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097"+
		"\u0098\u0005t\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a\u0005"+
		"g\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\u009c\u0005r\u0000"+
		"\u0000\u009c\u0016\u0001\u0000\u0000\u0000\u009d\u009e\u0005r\u0000\u0000"+
		"\u009e\u009f\u0005e\u0000\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0\u00a1"+
		"\u0005l\u0000\u0000\u00a1\u0018\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"b\u0000\u0000\u00a3\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005o\u0000"+
		"\u0000\u00a5\u00a6\u0005l\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7"+
		"\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u001a\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005c\u0000\u0000\u00ab\u00ac\u0005h\u0000"+
		"\u0000\u00ac\u00ad\u0005a\u0000\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae"+
		"\u001c\u0001\u0000\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000\u00b0\u00b1"+
		"\u0005t\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000\u00b2\u00b3\u0005i"+
		"\u0000\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4\u00b5\u0005g\u0000\u0000"+
		"\u00b5\u001e\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005b\u0000\u0000\u00b7"+
		"\u00b8\u0005e\u0000\u0000\u00b8\u00b9\u0005g\u0000\u0000\u00b9\u00ba\u0005"+
		"i\u0000\u0000\u00ba\u00bb\u0005n\u0000\u0000\u00bb \u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005:\u0000\u0000\u00bd\u00be\u0005=\u0000\u0000\u00be"+
		"\"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005i\u0000\u0000\u00c0\u00c1"+
		"\u0005f\u0000\u0000\u00c1$\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005t"+
		"\u0000\u0000\u00c3\u00c4\u0005h\u0000\u0000\u00c4\u00c5\u0005e\u0000\u0000"+
		"\u00c5\u00c6\u0005n\u0000\u0000\u00c6&\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005e\u0000\u0000\u00c8\u00c9\u0005l\u0000\u0000\u00c9\u00ca\u0005s"+
		"\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb(\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005w\u0000\u0000\u00cd\u00ce\u0005h\u0000\u0000\u00ce\u00cf"+
		"\u0005i\u0000\u0000\u00cf\u00d0\u0005l\u0000\u0000\u00d0\u00d1\u0005e"+
		"\u0000\u0000\u00d1*\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005d\u0000\u0000"+
		"\u00d3\u00d4\u0005o\u0000\u0000\u00d4,\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005f\u0000\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\u00d8\u0005r"+
		"\u0000\u0000\u00d8.\u0001\u0000\u0000\u0000\u00d9\u00da\u0005t\u0000\u0000"+
		"\u00da\u00db\u0005o\u0000\u0000\u00db0\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005r\u0000\u0000\u00dd\u00de\u0005e\u0000\u0000\u00de\u00df\u0005p"+
		"\u0000\u0000\u00df\u00e0\u0005e\u0000\u0000\u00e0\u00e1\u0005a\u0000\u0000"+
		"\u00e1\u00e2\u0005t\u0000\u0000\u00e22\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005u\u0000\u0000\u00e4\u00e5\u0005n\u0000\u0000\u00e5\u00e6\u0005t"+
		"\u0000\u0000\u00e6\u00e7\u0005i\u0000\u0000\u00e7\u00e8\u0005l\u0000\u0000"+
		"\u00e84\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005w\u0000\u0000\u00ea\u00eb"+
		"\u0005r\u0000\u0000\u00eb\u00ec\u0005i\u0000\u0000\u00ec\u00ed\u0005t"+
		"\u0000\u0000\u00ed\u00ee\u0005e\u0000\u0000\u00ee6\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005(\u0000\u0000\u00f08\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005)\u0000\u0000\u00f2:\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005r"+
		"\u0000\u0000\u00f4\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005a\u0000\u0000"+
		"\u00f6\u00f7\u0005d\u0000\u0000\u00f7<\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005,\u0000\u0000\u00f9>\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005f"+
		"\u0000\u0000\u00fb\u00fc\u0005u\u0000\u0000\u00fc\u00fd\u0005n\u0000\u0000"+
		"\u00fd\u00fe\u0005c\u0000\u0000\u00fe\u00ff\u0005t\u0000\u0000\u00ff\u0100"+
		"\u0005i\u0000\u0000\u0100\u0101\u0005o\u0000\u0000\u0101\u0102\u0005n"+
		"\u0000\u0000\u0102@\u0001\u0000\u0000\u0000\u0103\u0104\u0005e\u0000\u0000"+
		"\u0104\u0105\u0005n\u0000\u0000\u0105\u0106\u0005d\u0000\u0000\u0106\u0107"+
		"\u0005;\u0000\u0000\u0107B\u0001\u0000\u0000\u0000\u0108\u0109\u0005e"+
		"\u0000\u0000\u0109\u010a\u0005n\u0000\u0000\u010a\u010b\u0005d\u0000\u0000"+
		"\u010bD\u0001\u0000\u0000\u0000\u010c\u010d\u0005a\u0000\u0000\u010d\u010e"+
		"\u0005n\u0000\u0000\u010e\u010f\u0005d\u0000\u0000\u010fF\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005o\u0000\u0000\u0111\u0112\u0005r\u0000\u0000"+
		"\u0112H\u0001\u0000\u0000\u0000\u0113\u0114\u0005n\u0000\u0000\u0114\u0115"+
		"\u0005o\u0000\u0000\u0115\u0116\u0005t\u0000\u0000\u0116J\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005t\u0000\u0000\u0118\u0119\u0005r\u0000\u0000"+
		"\u0119\u011a\u0005u\u0000\u0000\u011a\u011b\u0005e\u0000\u0000\u011bL"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005f\u0000\u0000\u011d\u011e\u0005"+
		"a\u0000\u0000\u011e\u011f\u0005l\u0000\u0000\u011f\u0120\u0005s\u0000"+
		"\u0000\u0120\u0121\u0005e\u0000\u0000\u0121N\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005=\u0000\u0000\u0123P\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"<\u0000\u0000\u0125\u0126\u0005>\u0000\u0000\u0126R\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005<\u0000\u0000\u0128T\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005>\u0000\u0000\u012aV\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"<\u0000\u0000\u012c\u012d\u0005=\u0000\u0000\u012dX\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005>\u0000\u0000\u012f\u0130\u0005=\u0000\u0000\u0130"+
		"Z\u0001\u0000\u0000\u0000\u0131\u0132\u0005+\u0000\u0000\u0132\\\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005-\u0000\u0000\u0134^\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005*\u0000\u0000\u0136`\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005/\u0000\u0000\u0138b\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"d\u0000\u0000\u013a\u013b\u0005i\u0000\u0000\u013b\u013c\u0005v\u0000"+
		"\u0000\u013cd\u0001\u0000\u0000\u0000\u013d\u013e\u0005m\u0000\u0000\u013e"+
		"\u013f\u0005o\u0000\u0000\u013f\u0140\u0005d\u0000\u0000\u0140f\u0001"+
		"\u0000\u0000\u0000\u0141\u0145\u0007\u0000\u0000\u0000\u0142\u0144\u0007"+
		"\u0001\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146h\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014a\u0007\u0002\u0000\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0153\u0001\u0000"+
		"\u0000\u0000\u014d\u014f\u0005.\u0000\u0000\u014e\u0150\u0007\u0002\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u014d\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154j\u0001\u0000\u0000\u0000"+
		"\u0155\u015b\u0005\'\u0000\u0000\u0156\u015a\b\u0003\u0000\u0000\u0157"+
		"\u0158\u0005\"\u0000\u0000\u0158\u015a\u0005\"\u0000\u0000\u0159\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0005\'\u0000\u0000\u015fl\u0001"+
		"\u0000\u0000\u0000\u0160\u0166\u0005\'\u0000\u0000\u0161\u0165\b\u0003"+
		"\u0000\u0000\u0162\u0163\u0005\\\u0000\u0000\u0163\u0165\t\u0000\u0000"+
		"\u0000\u0164\u0161\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005\'\u0000\u0000"+
		"\u016an\u0001\u0000\u0000\u0000\u016b\u016f\u0005{\u0000\u0000\u016c\u016e"+
		"\b\u0004\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0005}\u0000\u0000\u0173p\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0007\u0005\u0000\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u00068\u0000\u0000\u017ar\u0001\u0000\u0000\u0000\u000b"+
		"\u0000\u0145\u014b\u0151\u0153\u0159\u015b\u0164\u0166\u016f\u0177\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}