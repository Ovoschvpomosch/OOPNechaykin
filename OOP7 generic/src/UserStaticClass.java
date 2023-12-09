public class UserStaticClass {
    private static String login;
    private static String password;

    public static class Query{
        public void printToLog(){
            System.out.printf("User with login %s and password %s send request\n",
                    login,password);
        }
    }

    public static void initialize(String login, String password){
        UserStaticClass.login=login;
        UserStaticClass.password=password;
    }

    public static void main(String[] args)
    {
        initialize("log","pas");
        UserStaticClass.Query qwerty=new UserStaticClass.Query();
        qwerty.printToLog();
    }
}
