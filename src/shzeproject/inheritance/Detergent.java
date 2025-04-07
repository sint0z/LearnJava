package shzeproject.inheritance;

public class Detergent extends Cleanser {

    public void scrub(String s) {
      append(s);
      super.scrub();
  }
  public void foam(){append("foam()");}
}
