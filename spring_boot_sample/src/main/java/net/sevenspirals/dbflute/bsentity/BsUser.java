package net.sevenspirals.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import net.sevenspirals.dbflute.allcommon.DBMetaInstanceHandler;
import net.sevenspirals.dbflute.exentity.*;

/**
 * The entity of USER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_ID
 * 
 * [column]
 *     USER_ID, E_MAIL, INS_TRACE, INS_DATETIME, UPD_TRACE, UPD_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     TWEET
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     tweetList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String eMail = entity.getEMail();
 * String insTrace = entity.getInsTrace();
 * java.time.LocalDateTime insDatetime = entity.getInsDatetime();
 * String updTrace = entity.getUpdTrace();
 * java.time.LocalDateTime updDatetime = entity.getUpdDatetime();
 * entity.setUserId(userId);
 * entity.setEMail(eMail);
 * entity.setInsTrace(insTrace);
 * entity.setInsDatetime(insDatetime);
 * entity.setUpdTrace(updTrace);
 * entity.setUpdDatetime(updDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _userId;

    /** E_MAIL: {UQ, NotNull, VARCHAR(256)} */
    protected String _eMail;

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
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param eMail : UQ, NotNull, VARCHAR(256). (NotNull)
     */
    public void uniqueBy(String eMail) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("EMail");
        setEMail(eMail);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** TWEET by USER_ID, named 'tweetList'. */
    protected List<Tweet> _tweetList;

    /**
     * [get] TWEET by USER_ID, named 'tweetList'.
     * @return The entity list of referrer property 'tweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Tweet> getTweetList() {
        if (_tweetList == null) { _tweetList = newReferrerList(); }
        return _tweetList;
    }

    /**
     * [set] TWEET by USER_ID, named 'tweetList'.
     * @param tweetList The entity list of referrer property 'tweetList'. (NullAllowed)
     */
    public void setTweetList(List<Tweet> tweetList) {
        _tweetList = tweetList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tweetList != null) { for (Tweet et : _tweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tweetList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_eMail));
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
        if (_tweetList != null && !_tweetList.isEmpty())
        { sb.append(dm).append("tweetList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] E_MAIL: {UQ, NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'E_MAIL'. (basically NotNull if selected: for the constraint)
     */
    public String getEMail() {
        checkSpecifiedProperty("EMail");
        return _eMail;
    }

    /**
     * [set] E_MAIL: {UQ, NotNull, VARCHAR(256)} <br>
     * @param eMail The value of the column 'E_MAIL'. (basically NotNull if update: for the constraint)
     */
    public void setEMail(String eMail) {
        registerModifiedProperty("EMail");
        _eMail = eMail;
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
