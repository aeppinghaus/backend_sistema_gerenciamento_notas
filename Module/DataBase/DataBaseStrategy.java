package Module.DataBase;

class DataBaseStrategy extends DatabaseAbstract {
  private DatabaseAbstract object;

  DataBaseStrategy(String strategy) {
    if (strategy == "local") {
      this.object = new DatabaseLocal();
    } else if (strategy == "sqlite") {
      this.object = new DatabaseSqLite();
    }
  }

  public String[] query(String sql) {
    return this.object.query(sql);
  }

  public boolean exec(String sql) {
    return this.object.exec(sql);
  }
}
