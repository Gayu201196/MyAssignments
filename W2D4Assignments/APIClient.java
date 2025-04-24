package week2.Day4.W2D4Assignments;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The response for the endpoint "+endpoint+"with the request body as "+requestBody+" is "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("https://api.restful-api.dev/objects");
		api.sendRequest("https://api.restful-api.dev/objects", "type:articles", true);

	}

}
