package PhotographInvoiceSystem;
abstract class User {
    protected String userId;
    protected String passwd;
    private boolean loginStatus;
    User(){
        loginStatus = false;
    }
}
