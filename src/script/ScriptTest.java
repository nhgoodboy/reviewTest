package script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptTest {

	private static int[][] a = {{1,2,3},{3,4,5}};
	
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine se = manager.getEngineByName("JavaScript");
		se.eval("print('hello world, my friends\\n')");
		System.out.println(a.length);
	}
}