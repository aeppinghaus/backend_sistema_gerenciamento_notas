package Module.DataBase;

abstract class DatabaseAbstract implements DataBaseInterface {
  public String[] query(String sql) {
    String[] records = { "sem registro" };
    return records;
  }

  public boolean exec(String sql) {
    return false;
  }
}