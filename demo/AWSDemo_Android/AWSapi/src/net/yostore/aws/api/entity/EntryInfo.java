package net.yostore.aws.api.entity;



/**
 * 
 *	<id>{ File ID �� Folder ID}</id>
 *	<parent>{ Parent folder ID }</parent>
 *	<rawentryname>{ �ɮשΥؿ��W��}</rawentryname>
 *	<time>{ �榡��yyyyMMddHHmmss �A���e�Ӧ�UserFileTable.Time ��UserFoleTable.Time��� }</time>
 *	<ispublic>{ ��entry�O�_���}����?0�����}:1���} }</ispublic>
 *	<score>{�ŦX����r�������ʤ���}</score>
 *	<marks>{���ݩ�entry��Markid�A�Y���h��MarkId�h�H�ťդ��j}</marks>
 *	<ancestorid>{ root folder id;folderId1;folderId2;folderId3�K }</ancestorid><!-- �`�N�GInfo Relay����H�_�����j -->
 *	<ancestorname>{;(�H�����_�Y��̫ܳe���ڥؿ��W�ٯd��)folderName1;folderName2;folderName3�K}</ancentorname><!-- �`�N�GInfo Relay����H�_�����j -->
 * @author Scott
 *
 */
public class EntryInfo {
	private String id;
	private String parent;
	private String rawentryname;
	private String time;
	private boolean ispublic;
	private boolean isorigdeleted;
	private String score;
	private String marks;
	private String ancestorid;
	private String ancestorname;
	private KIND kind;
	private String rootFolder;
	private boolean isBackup;
	private Attribute attribute;
	private long _size;
	public long getSize(){ return this._size; }
	public void setSize(long value){ this._size = value; }

	public enum KIND{
		ALL(0),
		FOLDER(1),
		FILE(2);
		KIND(int key_id) {
            this.key_id = key_id;
		}
            
        public static KIND getKind(int id){
        	switch(id){
        		case 0:
        			return KIND.ALL;
        		case 1:
        			return KIND.FOLDER;
        		case 2:
        			return KIND.FILE;
        		default:
        			return KIND.ALL;
        	}
        }

        private final int key_id;

        public int getInt() {
            return key_id;
        }
	};
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getRawentryname() {
		return rawentryname;
	}
	public void setRawentryname(String rawentryname) {
		this.rawentryname = rawentryname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public boolean getIspublic() {
		return ispublic;
	}
	public void setIspublic(boolean ispublic) {
		this.ispublic = ispublic;
	}
	public boolean getIsorigdeleted() {
		return isorigdeleted;
	}
	public void setIsorigdeleted(boolean isorigdeleted) {
		this.isorigdeleted = isorigdeleted;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getAncestorid() {
		return ancestorid;
	}
	public void setAncestorid(String ancestorid) {
		this.ancestorid = ancestorid;
	}
	public String getAncestorname() {
		return ancestorname;
	}
	public void setAncestorname(String ancestorname) {
		this.ancestorname = ancestorname;
	}
	public void setKind(KIND kind) {
		this.kind = kind;
	}
	public KIND getKind() {
		return kind;
	}
	
	
	public String getRootFolder()
	{
		return rootFolder;
	}
	public void setRootFolder(String rootFolder)
	{
		this.rootFolder = rootFolder;
	}

	public boolean getIsBackup()
	{
		return isBackup;
	}
	public void setIsBackup(boolean isBackup)
	{
		this.isBackup = isBackup;
	}
	public Attribute getAttribute()
	{
		return attribute;
	}
	public void setAttribute(Attribute attribute)
	{
		this.attribute = attribute;
	}



}
