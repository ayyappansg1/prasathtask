package restMain;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import InputPojo.ArgsInput;
import InputPojo.HeadersPutBody;
import InputPojo.PutResponse;
import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import pojo.GetResponse;

public class RestMainClass extends BaseClass{
	
	@Test(priority=0,enabled=true)
	public void getMethod() {
		addheader();
		Response response2 = reqType("GET");
		String bodyasPrettyString = getBodyasPrettyString(response2);
		System.out.println(bodyasPrettyString);
	
	}
	@Test(priority=1)
	public void postMethod() {
		Header h1=new Header("Content-Type", "application/json");
		Header h2=new Header("Accept", "application/json");
		List<Header> li=new ArrayList<>();
		li.add(h1);
		li.add(h2);
		Headers headers=new Headers(li);
		addHeaders(headers);
		ArgsInput argsInput=new ArgsInput("bar3", "bar4");
		HeadersPutBody headersPutBody=new HeadersPutBody("http", "80", "postman-echo.com", "rooroor", "apl", "adasda", "adpadpa", "asdjsanjn");
		PutResponse putResponse=new PutResponse(argsInput, headersPutBody, "sangar dada");
		addBodyas(putResponse);
		Response requestType = reqType("POST");
		System.out.println(requestType.getStatusCode());
		System.out.println(getBodyasPrettyString(requestType));
	}
	@Test
	public void putMethod() {
		Header h1=new Header("Content-Type", "application/json");
		Header h2=new Header("Accept", "application/json");
		List<Header> li=new ArrayList<>();
		li.add(h1);
		li.add(h2);
		Headers headers=new Headers(li);
		addHeaders(headers);
		ArgsInput argsInput=new ArgsInput("bar5", "bar6");
		HeadersPutBody headersPutBody=new HeadersPutBody("http", "80", "postman-echo.com", "rooroor", "apl", "adasda", "adpadpa", "asdjsanjn");
		PutResponse putResponse=new PutResponse(argsInput, headersPutBody, "sangar dada");
		addBodyas(putResponse);
		Response requestType = reqType("POST");
		System.out.println(requestType.getStatusCode());
		System.out.println(getBodyasPrettyString(requestType));
	}
	@Test
	public void deleteMethod() {
		addheader();
		Response deleteRes = reqType("DELETE");
		System.out.println(getBodyasPrettyString(deleteRes));
		
	}

}
