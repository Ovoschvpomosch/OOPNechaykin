import java.util.Objects;

public class UserMethodLocalInnerClass {
    private String login;
    private String password;

    void createQuery(){
        class Query{
            public void printToLog(){
                System.out.println("User with login "+login+" and password "
                        +password+" send request");
            }
        }
        Query query=new Query();
        query.printToLog();
    }

    public UserMethodLocalInnerClass(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMethodLocalInnerClass that = (UserMethodLocalInnerClass) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserMethodLocalInnerClass{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        UserMethodLocalInnerClass user=new UserMethodLocalInnerClass("log1","123456");
        user.createQuery();

    }
}
