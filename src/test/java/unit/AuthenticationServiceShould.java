package unit;

import signatureChange.AuthenticationService;
import org.junit.Assert;
import org.junit.Test;
import signatureChange.Id;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Assert.assertTrue(service.isAuthenticated(new Id(12345)));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Assert.assertFalse(service.isAuthenticated(new Id(1111)));
    }
}
