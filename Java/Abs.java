package Java;

public class Abs {
    public void main(String[] args) {
        try (Box box = new Box()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class Box implements AutoCloseable  {

        @Override
        public void close() throws Exception {
            
        }
    }
}



