package Исключения_в_программировании_и_их_обработка.seminars.seminars03;

import java.io.IOException;

public class Ex_05 {
    public static void main(String[] args) throws IOException{
        try(Count ct = new Count()){
            ct.add(); // 1
            ct.add(); // 2
            ct.add(); // 3
            System.out.println(ct.getCount()); // count = 3
            ct.close(); // count = null
            ct.add(); // null + 1 -> ERROR
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

class Count implements AutoCloseable{
    private Integer count;

    public Count(){
        this.count = 0;
    }

    public void add() throws IOException{
        checkClose();
        this.count++;
    }

    public Integer getCount() throws IOException{
        checkClose();
        return count;
    }

    public void checkClose() throws IOException{
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }

    @Override
    public void close(){
        this.count = null;
    }
}
