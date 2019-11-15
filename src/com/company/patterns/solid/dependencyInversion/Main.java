package com.company.patterns.solid.dependencyInversion;

public class Main {
}

interface DBConnection {

	int connect();
}

class MysqlConnection implements DBConnection{

	@Override
	public int connect() {
		return 0;
	}
}

class MongoConnection implements DBConnection {

	@Override
	public int connect() {
		return 0;
	}
}

class PasswordReminder {
	private DBConnection dbConnection;

	public PasswordReminder(DBConnection dbConnection) {

		this.dbConnection = dbConnection;
	}
}
