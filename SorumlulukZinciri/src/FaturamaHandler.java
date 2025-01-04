public class FaturamaHandler extends SupportHandler{
    @Override
    public void handleRequest(String request) {
        if (request == "fatura"){
            System.out.println("Fatura handler");
        }else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
