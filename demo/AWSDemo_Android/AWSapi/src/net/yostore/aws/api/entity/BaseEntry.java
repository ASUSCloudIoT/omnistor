package net.yostore.aws.api.entity;

/**
 * 
 *		<id>{ File ID �� Folder ID}</id>
		<parent>{ Parent folder ID }</parent>
		<rawfilename>{ �ɮצW��}</rawfilename>
		<isbackup>{ 0 | 1 }</isbackup>
		<isorigdeleted>{ 0���R��:1�w�R�� }</isorigdeleted>
		<marks>{���ݩ�file��Markid�A�Y���h��MarkId�h�H�ťդ��j�Centry�S��markid�ɫh��element���X�{}
		</marks>
		<createdtime>{ �榡��yyyy-MM-dd HH:mm:ss �A�Ӧ�UserFileTable��Time��� }</createdtime>
		<lastchangetime>{ ��ƫ��O������� �A�Ӧ�UserFileTable.LastChangeTime��� }</lastchangetime>
		<attribute>{�PInfo Relay/folder/browse/��attribute�榡}</attribute>
		<isinfected>{�ɮ׬O�_�P�V�f�r0�G��ܥ��P�V| 1�G��ܤw�P�V�C}</isinfected>
		<size>{�ɮפj�p�C}</size>
		<ispublic>{�O�_��public�C0�G�p�� | 1�G���}}</ispublic>

 * @author Scott
 *
 */
public class BaseEntry {
	
	private String id;
	private String parent;
	private String rawfilename;
	private boolean isBackup;
	private boolean isorigdeleted;
	private String marks;
	private String createdtime;
	private long lastchangetime;
	private Attribute attribute;
	private boolean isinfected;
	private long size;
	private boolean ispublic;
	
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getParent()
	{
		return parent;
	}
	public void setParent(String parent)
	{
		this.parent = parent;
	}
	public String getRawfilename()
	{
		return rawfilename;
	}
	public void setRawfilename(String rawfilename)
	{
		this.rawfilename = rawfilename;
	}
	public boolean getIsBackup()
	{
		return isBackup;
	}
	public void setIsBackup(boolean isBackup)
	{
		this.isBackup = isBackup;
	}
	public String getCreatedtime()
	{
		return createdtime;
	}
	public void setCreatedtime(String createdtime)
	{
		this.createdtime = createdtime;
	}
	public long getLastchangetime()
	{
		return lastchangetime;
	}
	public void setLastchangetime(long lastchangetime)
	{
		this.lastchangetime = lastchangetime;
	}
	public boolean getIsOrigdeleted()
	{
		return isorigdeleted;
	}
	public void setIsorigdeleted(boolean isorigdeleted)
	{
		this.isorigdeleted = isorigdeleted;
	}
	public String getMarks()
	{
		return marks;
	}
	public void setMarks(String marks)
	{
		this.marks = marks;
	}
	public Attribute getAttribute()
	{
		return attribute;
	}
	public void setAttribute(Attribute attribute)
	{
		this.attribute = attribute;
	}
	public boolean getIsInfected()
	{
		return isinfected;
	}
	public void setIsinfected(boolean isinfected)
	{
		this.isinfected = isinfected;
	}
	public long getSize()
	{
		return size;
	}
	public void setSize(long size)
	{
		this.size = size;
	}
	public boolean getIsPublic()
	{
		return ispublic;
	}
	public void setIspublic(boolean ispublic)
	{
		this.ispublic = ispublic;
	}
}
