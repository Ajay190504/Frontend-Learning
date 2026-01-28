package constructors.practice;

class LoginSession {
    String loginTime;

    LoginSession() {
        loginTime = "10:30 AM";   // assume current time
    }

    public static void main(String[] args) {
        LoginSession s = new LoginSession();
        System.out.println("Login Time: " + s.loginTime);
    }
}