import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String[] s = {};

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("?s=anewstringtoadd");
        } else if (url.getPath().equals("/increment")) {
            
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("count")) {
                  
                    return String.format("?s=pineapple"
                    );
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine{
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
    }}