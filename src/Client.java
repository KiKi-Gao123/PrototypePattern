public class Client {
    public static void main(String[] args) {
        Email email,copyEmail=null;

        email = new Email();

        try {
            copyEmail=(Email)email.deepClone();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("email==copyEmail");
        System.out.println(email==copyEmail);
        System.out.println("email.getAttachMent()==copyEmail.getAttachMent()");
        System.out.println(email.getAttachMent()==copyEmail.getAttachMent());
    }
}
