package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {
//    parameter final or const
    public LoginRequest {
        System.out.println("Membuat object login request");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
