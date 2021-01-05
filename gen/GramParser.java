// Generated from D:/Programming/Java/IJ/MatlogC/.idea\Gram.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
//	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, IMPL=4, LB=5, RB=6, VAR=7, WS=8;
	public static final int
		RULE_expression = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'&'", "'|'", "'->'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "AND", "OR", "IMPL", "LB", "RB", "VAR", "WS"
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

	@Override
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Node expr;
		public ExpressionContext exp1;
		public Token VAR;
		public Token AND;
		public ExpressionContext exp2;
		public Token OR;
		public Token IMPL;
		public TerminalNode NOT() { return getToken(GramParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LB() { return getToken(GramParser.LB, 0); }
		public TerminalNode RB() { return getToken(GramParser.RB, 0); }
		public TerminalNode VAR() { return getToken(GramParser.VAR, 0); }
		public TerminalNode AND() { return getToken(GramParser.AND, 0); }
		public TerminalNode OR() { return getToken(GramParser.OR, 0); }
		public TerminalNode IMPL() { return getToken(GramParser.IMPL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(3);
				match(NOT);
				setState(4);
				((ExpressionContext)_localctx).exp1 = expression(4);
				((ExpressionContext)_localctx).expr =  new Not(((ExpressionContext)_localctx).exp1.expr);
				}
				break;
			case LB:
				{
				setState(7);
				match(LB);
				setState(8);
				((ExpressionContext)_localctx).exp1 = expression(0);
				setState(9);
				match(RB);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).exp1.expr;
				}
				break;
			case VAR:
				{
				setState(12);
				((ExpressionContext)_localctx).VAR = match(VAR);
				((ExpressionContext)_localctx).expr =  new Variable((((ExpressionContext)_localctx).VAR!=null?((ExpressionContext)_localctx).VAR.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(16);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(17);
						((ExpressionContext)_localctx).AND = match(AND);
						setState(18);
						((ExpressionContext)_localctx).exp2 = expression(7);
						((ExpressionContext)_localctx).expr =  new BinOp(((ExpressionContext)_localctx).exp1.expr, ((ExpressionContext)_localctx).exp2.expr, (((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(21);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(22);
						((ExpressionContext)_localctx).OR = match(OR);
						setState(23);
						((ExpressionContext)_localctx).exp2 = expression(6);
						((ExpressionContext)_localctx).expr =  new BinOp(((ExpressionContext)_localctx).exp1.expr, ((ExpressionContext)_localctx).exp2.expr, (((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(26);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(27);
						((ExpressionContext)_localctx).IMPL = match(IMPL);
						setState(28);
						((ExpressionContext)_localctx).exp2 = expression(3);
						((ExpressionContext)_localctx).expr =  new BinOp(((ExpressionContext)_localctx).exp1.expr, ((ExpressionContext)_localctx).exp2.expr, (((ExpressionContext)_localctx).IMPL!=null?((ExpressionContext)_localctx).IMPL.getText():null));
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\'\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13\2"+
		"\3\2\2\3\2\3\2\2\2\2*\2\20\3\2\2\2\4\5\b\2\1\2\5\6\7\3\2\2\6\7\5\2\2\6"+
		"\7\b\b\2\1\2\b\21\3\2\2\2\t\n\7\7\2\2\n\13\5\2\2\2\13\f\7\b\2\2\f\r\b"+
		"\2\1\2\r\21\3\2\2\2\16\17\7\t\2\2\17\21\b\2\1\2\20\4\3\2\2\2\20\t\3\2"+
		"\2\2\20\16\3\2\2\2\21#\3\2\2\2\22\23\f\b\2\2\23\24\7\4\2\2\24\25\5\2\2"+
		"\t\25\26\b\2\1\2\26\"\3\2\2\2\27\30\f\7\2\2\30\31\7\5\2\2\31\32\5\2\2"+
		"\b\32\33\b\2\1\2\33\"\3\2\2\2\34\35\f\5\2\2\35\36\7\6\2\2\36\37\5\2\2"+
		"\5\37 \b\2\1\2 \"\3\2\2\2!\22\3\2\2\2!\27\3\2\2\2!\34\3\2\2\2\"%\3\2\2"+
		"\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2\5\20!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}