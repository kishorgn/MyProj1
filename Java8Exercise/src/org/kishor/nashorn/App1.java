package org.kishor.nashorn;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		List<ScriptEngineFactory> scriptEngineFactories = scriptEngineManager.getEngineFactories();
		scriptEngineFactories.forEach(engine -> System.out.println(engine.getNames()+"\n"));
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("Nashorn");
		
		String name = "Kishor";
		Integer value = null;
		
		try{
			nashorn.eval("print('"+name+"')");
			value = (Integer) nashorn.eval("10+2");
		}
		catch(ScriptException se){
			se.printStackTrace();
		}
		System.out.println("value : "+value);

	}

}
