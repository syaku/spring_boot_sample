package net.sevenspirals.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import net.sevenspirals.dbflute.allcommon.DBMetaInstanceHandler;
import net.sevenspirals.dbflute.exentity.*;

/**
 * The entity of TWEET as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TWEET_ID
 * 
 * [column]
 *     TWEET_ID, USER_ID, BODY, INS_TRACE, INS_DATETIME, UPD_TRACE, UPD_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TWEET_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     USER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     user
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tweetId = entity.getTweetId();
 * Long userId = entity.getUserId();
 * String body = entity.getBody();
 * String insTrace = entity.getInsTrace();
 * java.time.LocalDateTime insDatetime = entity.getInsDatetime();
 * String updTrace = entity.getUpdTrace();
 * java.time.LocalDateTime updDatetime = entity.getUpdDatetime();
 * entity.setTweetId(tweetId);
 * entity.setUserId(userId);
 * entity.setBody(body);
 * entity.setInsTrace(insTrace);
 * entity.setInsDatetime(insDatetime);
 * entity.setUpdTrace(updTrace);
 * entity.setUpdDatetime(updDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTweet extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TWEET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _tweetId;

    /** USER_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** BODY: {NotNull, VARCHAR(256)} */
    protected String _body;

    /** INS_TRACE: {NotNull, VARCHAR(256)} */
    protected String _insTrace;

    /** INS_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _insDatetime;

    /** UPD_TRACE: {NotNull, VARCHAR(256)} */
    protected String _updTrace;

    /** UPD_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TWEET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tweetId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTweet) {
            BsTweet other = (BsTweet)obj;
            if (!xSV(_tweetId, other._tweetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tweetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tweetId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_body));
        sb.append(dm).append(xfND(_insTrace));
        sb.append(dm).append(xfND(_insDatetime));
        sb.append(dm).append(xfND(_updTrace));
        sb.append(dm).append(xfND(_updDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Tweet clone() {
        return (Tweet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        checkSpecifiedProperty("tweetId");
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        registerModifiedProperty("tweetId");
        _tweetId = tweetId;
    }

    /**
     * [get] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] BODY: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'BODY'. (basically NotNull if selected: for the constraint)
     */
    public String getBody() {
        checkSpecifiedProperty("body");
        return _body;
    }

    /**
     * [set] BODY: {NotNull, VARCHAR(256)} <br>
     * @param body The value of the column 'BODY'. (basically NotNull if update: for the constraint)
     */
    public void setBody(String body) {
        registerModifiedProperty("body");
        _body = body;
    }

    /**
     * [get] INS_TRACE: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'INS_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getInsTrace() {
        checkSpecifiedProperty("insTrace");
        return _insTrace;
    }

    /**
     * [set] INS_TRACE: {NotNull, VARCHAR(256)} <br>
     * @param insTrace The value of the column 'INS_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setInsTrace(String insTrace) {
        registerModifiedProperty("insTrace");
        _insTrace = insTrace;
    }

    /**
     * [get] INS_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'INS_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getInsDatetime() {
        checkSpecifiedProperty("insDatetime");
        return _insDatetime;
    }

    /**
     * [set] INS_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param insDatetime The value of the column 'INS_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setInsDatetime(java.time.LocalDateTime insDatetime) {
        registerModifiedProperty("insDatetime");
        _insDatetime = insDatetime;
    }

    /**
     * [get] UPD_TRACE: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'UPD_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdTrace() {
        checkSpecifiedProperty("updTrace");
        return _updTrace;
    }

    /**
     * [set] UPD_TRACE: {NotNull, VARCHAR(256)} <br>
     * @param updTrace The value of the column 'UPD_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setUpdTrace(String updTrace) {
        registerModifiedProperty("updTrace");
        _updTrace = updTrace;
    }

    /**
     * [get] UPD_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'UPD_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdDatetime() {
        checkSpecifiedProperty("updDatetime");
        return _updDatetime;
    }

    /**
     * [set] UPD_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param updDatetime The value of the column 'UPD_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdDatetime(java.time.LocalDateTime updDatetime) {
        registerModifiedProperty("updDatetime");
        _updDatetime = updDatetime;
    }
}
