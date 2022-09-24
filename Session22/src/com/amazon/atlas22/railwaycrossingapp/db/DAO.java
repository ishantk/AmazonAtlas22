package com.amazon.atlas22.railwaycrossingapp.db;

import java.util.Map;

// Database Access Object -> Design Pattern :)
public interface DAO {
	boolean set(Object object);
	boolean delete(Object object);
	Map<String, ?> retrieve(Object object);
	Object retrieve(String key);
}
