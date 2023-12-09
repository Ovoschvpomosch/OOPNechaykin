import java.util.Objects;

public class UserRegularInnerClass {
    private String login;
    private String password;

    public class Query{
        public void printToLog(){
            System.out.printf("Пользователь с логинном %s и паролем %s отправил запрос\n",
                    login,password);
        }
    }

    public UserRegularInnerClass(String login, String password) {
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

    public void createQuery(){
        Query query=new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegularInnerClass that = (UserRegularInnerClass) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserRegularInnerClass{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        UserRegularInnerClass user=new UserRegularInnerClass("log1", "pass1");
        user.createQuery();
        UserRegularInnerClass.Query query1=user.new Query();
        UserRegularInnerClass.Query query2=new UserRegularInnerClass("log2", "pass2") .new Query();
        query1.printToLog();
        query2.printToLog();

    }

}
