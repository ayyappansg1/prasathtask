package InputPojo;

public class HeadersPutBody {
    private String xForwardedProto;
    private String xForwardedPort;
    private String host;
    private String xAmznTraceId;
    private String contentType;
    private String accept;
    private String userAgent;
    public HeadersPutBody(String xForwardedProto, String xForwardedPort, String host, String xAmznTraceId,
			String contentType, String accept, String userAgent, String acceptEncoding) {
		super();
		this.xForwardedProto = xForwardedProto;
		this.xForwardedPort = xForwardedPort;
		this.host = host;
		this.xAmznTraceId = xAmznTraceId;
		this.contentType = contentType;
		this.accept = accept;
		this.userAgent = userAgent;
		this.acceptEncoding = acceptEncoding;
	}
	public String getxForwardedProto() {
		return xForwardedProto;
	}
	public void setxForwardedProto(String xForwardedProto) {
		this.xForwardedProto = xForwardedProto;
	}
	public String getxForwardedPort() {
		return xForwardedPort;
	}
	public void setxForwardedPort(String xForwardedPort) {
		this.xForwardedPort = xForwardedPort;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getxAmznTraceId() {
		return xAmznTraceId;
	}
	public void setxAmznTraceId(String xAmznTraceId) {
		this.xAmznTraceId = xAmznTraceId;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getAcceptEncoding() {
		return acceptEncoding;
	}
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}
	private String acceptEncoding;
	
	
}
