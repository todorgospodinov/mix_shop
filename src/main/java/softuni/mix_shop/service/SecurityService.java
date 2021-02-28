package softuni.mix_shop.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
