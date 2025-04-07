package shzeproject.exception.lostexception;

public class LostMessage {
    void firstMethod() throws VeryImportantException{
        throw new VeryImportantException();
    }

    void secondMethod() throws HoHumException{
        throw new HoHumException();
    }

    void threeMethod() throws Exception{
        throw new Exception("А я третье ислючение");
    }

    public static void main(String[] args) throws Exception {
        LostMessage lm = new LostMessage();

        try{
            lm.firstMethod();
        }catch(Exception e){
            System.out.println(e);
        }finally{ 
            try {
                lm.secondMethod();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lm.threeMethod();
            }
        }
    }
}
