package week05LoggerCode;

public class App {

  public static void main(String[] args) {
    
  
  AsteriskLogger logger = new AsteriskLogger();
  logger.log("Hello");
  logger.error("Hello");
  

  SpacedLogger logger = new SpacedLogger();
  logger.log("Hello");
  logger.error("Hello");
}

}