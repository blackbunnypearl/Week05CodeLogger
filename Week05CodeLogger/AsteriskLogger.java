package week05LoggerCode;

public class AsteriskLogger implements Logger {

  public void log(String log) {
      System.out.println("***" + log + "***");
  }

  public void error(String error) {
      System.err.println("****************");
      System.err.println("***Error: " + error + "***");
      System.err.println("****************");
  }
}

