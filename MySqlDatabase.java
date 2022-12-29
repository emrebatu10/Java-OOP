package OOP;

public class MySqlDatabase extends Abstract_Class{

    public void add(){
        System.out.println("eklendi");

    }

    public void delete(){
        System.out.println("silindi");

    }

    @Override
    void update() {
        System.out.println("Mysql güncellendi");

    }

    @Override
    void get() {
        System.out.println("Mysql elde edildi");

    }
}
