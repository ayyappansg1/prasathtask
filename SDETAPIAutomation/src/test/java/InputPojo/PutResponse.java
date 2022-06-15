package InputPojo;

public class PutResponse {
	    private ArgsInput args;
	    private HeadersPutBody headers;
	    public ArgsInput getArgs() {
			return args;
		}
		public PutResponse(ArgsInput args, HeadersPutBody headers, String url) {
			super();
			this.args = args;
			this.headers = headers;
			this.url = url;
		}
		public void setArgs(ArgsInput args) {
			this.args = args;
		}
		public HeadersPutBody getHeaders() {
			return headers;
		}
		public void setHeaders(HeadersPutBody headers) {
			this.headers = headers;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		private String url;
	
	

}
