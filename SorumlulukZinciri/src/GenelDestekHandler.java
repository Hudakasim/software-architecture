public class GenelDestekHandler extends SupportHandler{
    @Override
    public void handleRequest(String request) {
        if (request == "genel"){
            System.out.println("Genel destek");
        }
        else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
