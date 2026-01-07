import java.io.*;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    transient String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static class SerializationExample {
        static void main(String[] args) {
            User user = new User("Devan", "1234");
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
                out.writeObject(user);
                System.out.println("Object serialized password check : " + user.password);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
                User loaduser = (User) in.readObject();
                System.out.println("Object Deserialized");
                System.out.println("Name : " + loaduser.name);
                System.out.println("Password : " + loaduser.password);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}