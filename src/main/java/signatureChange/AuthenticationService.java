package signatureChange;

public class AuthenticationService {
//    public boolean isAuthenticated(int id) {
//        return id == 12345;
//    }
    public boolean isAuthenticated(Id id) {
        return id.isAdmin();
    }
}
