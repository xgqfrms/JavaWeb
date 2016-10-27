package oracle;



public class T3 {
    public static void main(String[] args) {
        try (DaChuiCareer daChui = new DaChuiCareer()) {
            daChui.happyLife();
            return;
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            return;
        } finally {
            System.out.println("story end");
            return;
        }
    }
    public static class DaChuiCareer implements AutoCloseable {
        public DaChuiCareer() {
            System.out.println("born");
        }
        public void happyLife() throws JoyfulException {
            System.out.println("happy living");
            throw new JoyfulException();
        }
        @Override
        public void close() throws UnexpectedException {
            System.out.println("unexpected");
            throw new UnexpectedException();
        }
    }
}
class JoyfulException extends Exception{};
class UnexpectedException extends Exception{};