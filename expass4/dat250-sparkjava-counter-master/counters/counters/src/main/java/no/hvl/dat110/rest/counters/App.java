package no.hvl.dat110.rest.counters;

import static spark.Spark.after;
import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.put;

import com.google.gson.Gson;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
	
	static HashMap<Integer, Todo> todos = new HashMap<>();
	static Gson gson = new Gson();


	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		after((req, res) -> {
  		  res.type("application/json");
  		});
		
		get("/", (req, res) -> "Hello World!");

        get("/todo", (req, res) -> gson.toJson(todos));

        get("/todo/:id", (req, res) -> {
        	int id = Integer.parseInt(req.params("id"));
        	return todos.get(id).toJson();
		});

        delete("todo/:id", (req,res) -> {
        	int id = Integer.parseInt(req.params("id"));
        	return todos.remove(id).toJson();
		});

		put("/todo/:id", (req,res) -> {
			int id = Integer.parseInt(req.params("id"));
			todos.put(id, gson.fromJson(req.body(), Todo.class));
			return todos.get(id).toJson();

		});

		post("/todo", (req,res) -> {
			//id will increment by one more than the previous
			int id = todos.size() + 1;
			todos.put(id, gson.fromJson(req.body(), Todo.class));
			return todos.get(id).toJson();
		});

		todos.put(0, new Todo("Clean", "Clean the house"));
		todos.put(1, new Todo("Do assignment", "Complete assignment in DAT250"));


	}

}
