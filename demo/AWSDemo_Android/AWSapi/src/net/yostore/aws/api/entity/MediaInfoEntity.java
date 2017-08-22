package net.yostore.aws.api.entity;

public class MediaInfoEntity
{
//	private long id = -1l;
	private long i = -999l;
	private long da = System.currentTimeMillis();
	private String d = null;
	private int ty = 0;
	private int r = 0;
	private String no = "";
	private int en = 0;
	private int us = 0;
	private int fr = 1;
//	private String userName;
	
	/******************************************************************************************************************************************************
	�榡�G
	<i>�G�ɮ�id�A�����ɮ�id
	<da>�G�ɮ׮ɶ��A����ɮק�s�ɶ����J
	<d>�G�ɮצW��
	<ty>�G�ɮ׮榡�A�ثe0: photo, 1: movie
	<r>�G���ਤ�סA��0, 90, 180, 270�|��
	<no>�Gnote
	<en>�G���v���ɥثe���ɪ��p�A1: ���ɤ�, 2: ���ɥ���(�Ӥ��ɵL���񦹸�T)
	<us>�G���ɮץثe�W�Ǫ��p�A0:�w�b����, 1:�W�Ǥ�, 2: �W�ǥ���
	<fr>�G���ɮ׶פJ�ӷ��A0:my collection, -3:backup, -5:MySyncFolder, 1:pixwe client�W��
	�ɮ׽d�ҡG
	<i>19238</i><da>1098912</da><d>img001.jpg</d><ty>0</ty><r>180< /r><no>���ѧڬݨ�ڤ娫�i���]</no><us>0</us>
	 
	 ******************************************************************************************************************************************************/
	public MediaInfoEntity(){
		
	}
	
//	public long getId()
//	{
//		return id;
//	}
//
//	public void setId(long id)
//	{
//		this.id = id;
//	}
//
//	public String getUserName()
//	{
//		return userName;
//	}
//
//	public void setUserName(String userName)
//	{
//		this.userName = userName;
//	}

	public long getI()
	{
		return i;
	}

	public void setI(long i)
	{
		this.i = i;
	}

	public long getDa()
	{
		return da;
	}

	public void setDa(long da)
	{
		this.da = da;
	}

	public String getD()
	{
		return d;
	}

	public void setD(String d)
	{
		this.d = d;
	}

	public int getTy()
	{
		return ty;
	}

	public void setTy(int ty)
	{
		this.ty = ty;
	}

	public int getR()
	{
		return r;
	}

	public void setR(int r)
	{
		this.r = r;
	}

	public String getNo()
	{
		return no;
	}

	public void setNo(String no)
	{
		this.no = no;
	}

	public int getEn()
	{
		return en;
	}

	public void setEn(int en)
	{
		this.en = en;
	}

	public int getUs()
	{
		return us;
	}

	public void setUs(int us)
	{
		this.us = us;
	}
	
	public int getFr() {
		return fr;
	}

	public void setFr(int fr) {
		this.fr = fr;
	}

	public String toXml(){
		String rtn="";
		rtn+="<i>"+i+"</i><da>"+da+"</da><d>"+d+"</d><ty>"+ty+"</ty><r>"+r+"</r><no>"+no+"</no>"+(en>0?("<en>"+en+"</en>"):"")+"<us>"+us+"</us>"+"<fr>"+fr+"</fr>";
		return rtn;
	}
	
}
