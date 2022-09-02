package Module.DataBase;

interface DataBaseInterface {
  public String[] query(String sql);

  public boolean exec(String sql);
}

