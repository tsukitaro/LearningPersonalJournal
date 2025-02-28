when you work with this type of data, we need make sure that these data is secure

we have some methods to work them 
- [[#configuration file]]
- [[# Environment Variable]]

# configuration file
we could create a file named 'config.properties'
and store there api's or another sensible data

example 
``` 
"config.properties"
api.key=API_KEY_VALUE
```
and implement in our java code 
```java
>>ApiManager.java
public class ApiManager {
	private Properties properties = new Propierties();
	public apiManager(){
		this.properties = properties
	}
	try(InputStream input= getClass().getClassLoader().getResourceAsStream("config.properties")){
	properties.load(input);
	} catch (IOException e){
	e.printStackTrace();
	}
public String getApiKey(){
	return properties.getProperty("api.key")
}

}
```
and add to .gitignore config.properties file

with this code we could get the api key and hide this data sensible