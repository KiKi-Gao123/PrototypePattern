import java.io.*;
public class Email implements Serializable {
    private AttachMent attachMent = null;

    public Email(){
        this.attachMent=new AttachMent();
    }

    public Object deepClone() throws IOException,ClassNotFoundException,OptionalDataException{
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }

    public AttachMent getAttachMent(){
        return this.attachMent;
    }
    public void display(){
        System.out.println("查看邮件");
    }
}
