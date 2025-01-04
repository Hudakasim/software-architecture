public class TeknikDestekHandler extends SupportHandler{
    @Override
    public void handleRequest(String request) {
        if(request == "teknik"){
            System.out.println("Teknik destek");
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
