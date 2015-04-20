package net.sevenspirals.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import net.sevenspirals.dbflute.cbean.cq.ciq.*;
import net.sevenspirals.dbflute.cbean.*;
import net.sevenspirals.dbflute.cbean.cq.*;

/**
 * The base condition-query of TWEET.
 * @author DBFlute(AutoGenerator)
 */
public class BsTweetCQ extends AbstractBsTweetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TweetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTweetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TWEET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TweetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TweetCIQ xcreateCIQ() {
        TweetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TweetCIQ xnewCIQ() {
        return new TweetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TWEET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TweetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TweetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tweetId;
    public ConditionValue xdfgetTweetId()
    { if (_tweetId == null) { _tweetId = nCV(); }
      return _tweetId; }
    protected ConditionValue xgetCValueTweetId() { return xdfgetTweetId(); }

    /** 
     * Add order-by as ascend. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_TweetId_Asc() { regOBA("TWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_TweetId_Desc() { regOBD("TWEET_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _body;
    public ConditionValue xdfgetBody()
    { if (_body == null) { _body = nCV(); }
      return _body; }
    protected ConditionValue xgetCValueBody() { return xdfgetBody(); }

    /** 
     * Add order-by as ascend. <br>
     * BODY: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Body_Asc() { regOBA("BODY"); return this; }

    /**
     * Add order-by as descend. <br>
     * BODY: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Body_Desc() { regOBD("BODY"); return this; }

    protected ConditionValue _insTrace;
    public ConditionValue xdfgetInsTrace()
    { if (_insTrace == null) { _insTrace = nCV(); }
      return _insTrace; }
    protected ConditionValue xgetCValueInsTrace() { return xdfgetInsTrace(); }

    /** 
     * Add order-by as ascend. <br>
     * INS_TRACE: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_InsTrace_Asc() { regOBA("INS_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INS_TRACE: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_InsTrace_Desc() { regOBD("INS_TRACE"); return this; }

    protected ConditionValue _insDatetime;
    public ConditionValue xdfgetInsDatetime()
    { if (_insDatetime == null) { _insDatetime = nCV(); }
      return _insDatetime; }
    protected ConditionValue xgetCValueInsDatetime() { return xdfgetInsDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_InsDatetime_Asc() { regOBA("INS_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_InsDatetime_Desc() { regOBD("INS_DATETIME"); return this; }

    protected ConditionValue _updTrace;
    public ConditionValue xdfgetUpdTrace()
    { if (_updTrace == null) { _updTrace = nCV(); }
      return _updTrace; }
    protected ConditionValue xgetCValueUpdTrace() { return xdfgetUpdTrace(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_TRACE: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UpdTrace_Asc() { regOBA("UPD_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TRACE: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UpdTrace_Desc() { regOBD("UPD_TRACE"); return this; }

    protected ConditionValue _updDatetime;
    public ConditionValue xdfgetUpdDatetime()
    { if (_updDatetime == null) { _updDatetime = nCV(); }
      return _updDatetime; }
    protected ConditionValue xgetCValueUpdDatetime() { return xdfgetUpdDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UpdDatetime_Asc() { regOBA("UPD_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UpdDatetime_Desc() { regOBD("UPD_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTweetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTweetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TweetCQ bq = (TweetCQ)bqs;
        TweetCQ uq = (TweetCQ)uqs;
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my USER_ID, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public UserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("TWEET", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TweetCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TweetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TweetCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TweetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TweetCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TweetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TweetCQ> _myselfExistsMap;
    public Map<String, TweetCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TweetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TweetCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TweetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TweetCB.class.getName(); }
    protected String xCQ() { return TweetCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
