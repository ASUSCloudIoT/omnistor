package entity;

public class RequestServiceGatewayResponse
{
	/* all fields */
	private String _status = null;	
	private String _servicegateway = null;	
	private String _time = null;
	private String _accountsyncstate = null;
	
	private static final String HTTPS = "https://";

	/* default constructor */
	public RequestServiceGatewayResponse()
	{		
	}

	/* all fields constructor */
	public RequestServiceGatewayResponse(String status, String servicegateway, String time, String accountsyncstate)
	{
		this._status = status;
		this._servicegateway = servicegateway;
		this._time = time;
		this._accountsyncstate = accountsyncstate;
	}
	
	/* setters */
	public void setStatus(String _status)
	{
		this._status = _status;
	}
	
	public void setServicegateway(String _servicegateway)
	{
		this._servicegateway = HTTPS + _servicegateway;
	}
	
	public void setTime(String _time)
	{
		this._time = _time;
	}
	
	public void setAccountsyncstate(String _accountsyncstate)
	{
		this._accountsyncstate = _accountsyncstate;
	}

	/* getters */
	public String getStatus()
	{
		return _status;
	}
	
	public String getServicegateway()
	{
		return _servicegateway;
	}
	
	public String getTime()
	{
		return _time;
	}
	public String getAccountsyncstate()
	{
		return _accountsyncstate;
	}
	
	/* toString */
	public String toString()
	{
		StringBuilder msg = new StringBuilder("RequestservicegatewayResponse=>\n");
		msg.append(" status:").append(_status).append("\n");
		msg.append(" servicegateway:").append(_servicegateway).append("\n");
		msg.append(" time:").append(_time).append("\n");
		msg.append(" accountsyncstate:").append(_accountsyncstate).append("\n");
		return msg.toString();
	}
}