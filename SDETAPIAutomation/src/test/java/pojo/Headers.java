package pojo;

public class Headers {
    private String xForwardedProto;
    private String xForwardedPort;
    private String host;
    private String xAmznTraceId;
    private String upgradeInsecureRequests;
    private String userAgent;
    private String accept;
    private String acceptEncoding;
    private String acceptLanguage;
    private String cookie;
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
	public String getUpgradeInsecureRequests() {
		return upgradeInsecureRequests;
	}
	public void setUpgradeInsecureRequests(String upgradeInsecureRequests) {
		this.upgradeInsecureRequests = upgradeInsecureRequests;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAcceptEncoding() {
		return acceptEncoding;
	}
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}
	public String getAcceptLanguage() {
		return acceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	
	
}
