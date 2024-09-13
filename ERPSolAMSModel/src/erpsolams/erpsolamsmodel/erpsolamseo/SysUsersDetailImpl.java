package erpsolams.erpsolamsmodel.erpsolamseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 04 16:27:42 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SysUsersDetailImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Moduleid,
        Levelid,
        Projectid,
        RestrictAccess,
        Userid,
        Remarks,
        Canadd,
        Canedit,
        Candelete,
        HLevel,
        Canview,
        Modifiedby,
        ModifiedDate,
        Createdby,
        CreationDate,
        Submit,
        Unsubmit,
        Reprint,
        Print,
        ApplicationRa,
        SpecialAct,
        Approval1,
        Approval2,
        txtModuleName,
        RowID,
        SysProgram,
        SysUsers;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int MODULEID = AttributesEnum.Moduleid.index();
    public static final int LEVELID = AttributesEnum.Levelid.index();
    public static final int PROJECTID = AttributesEnum.Projectid.index();
    public static final int RESTRICTACCESS = AttributesEnum.RestrictAccess.index();
    public static final int USERID = AttributesEnum.Userid.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CANADD = AttributesEnum.Canadd.index();
    public static final int CANEDIT = AttributesEnum.Canedit.index();
    public static final int CANDELETE = AttributesEnum.Candelete.index();
    public static final int HLEVEL = AttributesEnum.HLevel.index();
    public static final int CANVIEW = AttributesEnum.Canview.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int SUBMIT = AttributesEnum.Submit.index();
    public static final int UNSUBMIT = AttributesEnum.Unsubmit.index();
    public static final int REPRINT = AttributesEnum.Reprint.index();
    public static final int PRINT = AttributesEnum.Print.index();
    public static final int APPLICATIONRA = AttributesEnum.ApplicationRa.index();
    public static final int SPECIALACT = AttributesEnum.SpecialAct.index();
    public static final int APPROVAL1 = AttributesEnum.Approval1.index();
    public static final int APPROVAL2 = AttributesEnum.Approval2.index();
    public static final int TXTMODULENAME = AttributesEnum.txtModuleName.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int SYSPROGRAM = AttributesEnum.SysProgram.index();
    public static final int SYSUSERS = AttributesEnum.SysUsers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SysUsersDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolams.erpsolamsmodel.erpsolamseo.SysUsersDetail");
    }


    /**
     * Gets the attribute value for Moduleid, using the alias name Moduleid.
     * @return the value of Moduleid
     */
    public String getModuleid() {
        return (String) getAttributeInternal(MODULEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Moduleid.
     * @param value value to set the Moduleid
     */
    public void setModuleid(String value) {
        setAttributeInternal(MODULEID, value);
    }

    /**
     * Gets the attribute value for Levelid, using the alias name Levelid.
     * @return the value of Levelid
     */
    public String getLevelid() {
        return (String) getAttributeInternal(LEVELID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Levelid.
     * @param value value to set the Levelid
     */
    public void setLevelid(String value) {
        setAttributeInternal(LEVELID, value);
    }

    /**
     * Gets the attribute value for Projectid, using the alias name Projectid.
     * @return the value of Projectid
     */
    public String getProjectid() {
        return (String) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Projectid.
     * @param value value to set the Projectid
     */
    public void setProjectid(String value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for RestrictAccess, using the alias name RestrictAccess.
     * @return the value of RestrictAccess
     */
    public String getRestrictAccess() {
        return (String) getAttributeInternal(RESTRICTACCESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RestrictAccess.
     * @param value value to set the RestrictAccess
     */
    public void setRestrictAccess(String value) {
        setAttributeInternal(RESTRICTACCESS, value);
    }

    /**
     * Gets the attribute value for Userid, using the alias name Userid.
     * @return the value of Userid
     */
    public String getUserid() {
        return (String) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Userid.
     * @param value value to set the Userid
     */
    public void setUserid(String value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for Canadd, using the alias name Canadd.
     * @return the value of Canadd
     */
    public String getCanadd() {
        return (String) getAttributeInternal(CANADD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Canadd.
     * @param value value to set the Canadd
     */
    public void setCanadd(String value) {
        setAttributeInternal(CANADD, value);
    }

    /**
     * Gets the attribute value for Canedit, using the alias name Canedit.
     * @return the value of Canedit
     */
    public String getCanedit() {
        return (String) getAttributeInternal(CANEDIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Canedit.
     * @param value value to set the Canedit
     */
    public void setCanedit(String value) {
        setAttributeInternal(CANEDIT, value);
    }

    /**
     * Gets the attribute value for Candelete, using the alias name Candelete.
     * @return the value of Candelete
     */
    public String getCandelete() {
        return (String) getAttributeInternal(CANDELETE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Candelete.
     * @param value value to set the Candelete
     */
    public void setCandelete(String value) {
        setAttributeInternal(CANDELETE, value);
    }

    /**
     * Gets the attribute value for HLevel, using the alias name HLevel.
     * @return the value of HLevel
     */
    public String getHLevel() {
        return (String) getAttributeInternal(HLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for HLevel.
     * @param value value to set the HLevel
     */
    public void setHLevel(String value) {
        setAttributeInternal(HLEVEL, value);
    }

    /**
     * Gets the attribute value for Canview, using the alias name Canview.
     * @return the value of Canview
     */
    public String getCanview() {
        return (String) getAttributeInternal(CANVIEW);
    }

    /**
     * Sets <code>value</code> as the attribute value for Canview.
     * @param value value to set the Canview
     */
    public void setCanview(String value) {
        setAttributeInternal(CANVIEW, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for Submit, using the alias name Submit.
     * @return the value of Submit
     */
    public String getSubmit() {
        return (String) getAttributeInternal(SUBMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Submit.
     * @param value value to set the Submit
     */
    public void setSubmit(String value) {
        setAttributeInternal(SUBMIT, value);
    }

    /**
     * Gets the attribute value for Unsubmit, using the alias name Unsubmit.
     * @return the value of Unsubmit
     */
    public String getUnsubmit() {
        return (String) getAttributeInternal(UNSUBMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Unsubmit.
     * @param value value to set the Unsubmit
     */
    public void setUnsubmit(String value) {
        setAttributeInternal(UNSUBMIT, value);
    }

    /**
     * Gets the attribute value for Reprint, using the alias name Reprint.
     * @return the value of Reprint
     */
    public String getReprint() {
        return (String) getAttributeInternal(REPRINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Reprint.
     * @param value value to set the Reprint
     */
    public void setReprint(String value) {
        setAttributeInternal(REPRINT, value);
    }

    /**
     * Gets the attribute value for Print, using the alias name Print.
     * @return the value of Print
     */
    public String getPrint() {
        return (String) getAttributeInternal(PRINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Print.
     * @param value value to set the Print
     */
    public void setPrint(String value) {
        setAttributeInternal(PRINT, value);
    }

    /**
     * Gets the attribute value for ApplicationRa, using the alias name ApplicationRa.
     * @return the value of ApplicationRa
     */
    public String getApplicationRa() {
        return (String) getAttributeInternal(APPLICATIONRA);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplicationRa.
     * @param value value to set the ApplicationRa
     */
    public void setApplicationRa(String value) {
        setAttributeInternal(APPLICATIONRA, value);
    }

    /**
     * Gets the attribute value for SpecialAct, using the alias name SpecialAct.
     * @return the value of SpecialAct
     */
    public String getSpecialAct() {
        return (String) getAttributeInternal(SPECIALACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpecialAct.
     * @param value value to set the SpecialAct
     */
    public void setSpecialAct(String value) {
        setAttributeInternal(SPECIALACT, value);
    }

    /**
     * Gets the attribute value for Approval1, using the alias name Approval1.
     * @return the value of Approval1
     */
    public String getApproval1() {
        return (String) getAttributeInternal(APPROVAL1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Approval1.
     * @param value value to set the Approval1
     */
    public void setApproval1(String value) {
        setAttributeInternal(APPROVAL1, value);
    }

    /**
     * Gets the attribute value for Approval2, using the alias name Approval2.
     * @return the value of Approval2
     */
    public String getApproval2() {
        return (String) getAttributeInternal(APPROVAL2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Approval2.
     * @param value value to set the Approval2
     */
    public void setApproval2(String value) {
        setAttributeInternal(APPROVAL2, value);
    }

    /**
     * Gets the attribute value for txtModuleName, using the alias name txtModuleName.
     * @return the value of txtModuleName
     */
    public String gettxtModuleName() {
        return (String) getAttributeInternal(TXTMODULENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtModuleName.
     * @param value value to set the txtModuleName
     */
    public void settxtModuleName(String value) {
        setAttributeInternal(TXTMODULENAME, value);
    }

    /**
     * Gets the attribute value for RowID, using the alias name RowID.
     * @return the value of RowID
     */
    public RowID getRowID() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSysProgram() {
        return (EntityImpl) getAttributeInternal(SYSPROGRAM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSysProgram(EntityImpl value) {
        setAttributeInternal(SYSPROGRAM, value);
    }

    /**
     * @return the associated entity SysUsersImpl.
     */
    public SysUsersImpl getSysUsers() {
        return (SysUsersImpl) getAttributeInternal(SYSUSERS);
    }

    /**
     * Sets <code>value</code> as the associated entity SysUsersImpl.
     */
    public void setSysUsers(SysUsersImpl value) {
        setAttributeInternal(SYSUSERS, value);
    }


    /**
     * @param moduleid key constituent
     * @param levelid key constituent
     * @param projectid key constituent
     * @param userid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String moduleid, String levelid, String projectid, String userid) {
        return new Key(new Object[] { moduleid, levelid, projectid, userid });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPISGenertePK("NO");
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

