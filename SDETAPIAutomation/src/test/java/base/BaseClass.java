package base;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;
	public void addheader() {
		reqSpec = RestAssured.given().header("Content-Type","application/json");
		
	}
	public void addHeader(Header header) {
		reqSpec.header(header);
	}
	public void addHeaders(Headers headers) {
		reqSpec=RestAssured.given().headers(headers);
	}
	public void addBodyas(Object obj) {
		reqSpec=reqSpec.body(obj);
	}
	public void addBody(String body) {
		reqSpec.body(body);
	}
	public Response reqType(String type) {
		switch (type) {
		case "GET":
			response = reqSpec.get(Endpoints.GETURL);
			break;
		case "POST":
			response=reqSpec.post(Endpoints.POSTURL);
			break;
		case "PUT":
			response=reqSpec.put(Endpoints.PUTURL);
			break;
		case "DELETE":
			response=reqSpec.delete(Endpoints.DELETEURL);
			break;
		}
		return response;		
	}
	public ResponseBody getBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}
	public String getBodyasPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;
	}
	
	
	
	
	
	
}
