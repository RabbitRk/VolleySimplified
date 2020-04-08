
# VolleySimplified

Simplified callback functions for the Volley Library. 

### Advantages:
## Follows Volley Singleton Pattern
1. You don't have to initialize StringRequest every time.
2.  No cache memory is collected.
3.  Optimized RetryPolicy and Timeout. (Avoid retrying twice)

### Installing

Add it to your root build.gradle at the end of repositories
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

```
implementation 'com.github.RabbitRk:VolleySimplified:1.0.0'
``` 
 
## Code break down

### Initialization

```
VolleyAdapter vAdapter = new VolleyAdapter(this);
 
// or just use the instance of the class like

new VolleyAdapter(this).//...
```

### Sample HashMap<String, String> 

```
HashMap<String, String> map = new HashMap<>();
map.put("id", "test1");
map.put("name", "test2"); 
```

### Send data to the server

### Syntax - Insert/Update/Delete

Function name may be insertData but you are going to manipulate the data in the serverside, so don't worry about that. It is for our own classification of the functions.

```
new VolleyAdapter(context).insertData(HashMap<String, String>, URL, new ServerCallback())
```
```
 new VolleyAdapter(this).insertData(map, Config.URL, new ServerCallback() {
            @Override
            public void onSuccess(String result) {
                ## result can be converted in to the JSONarray
                ## using JSONObject we can parse the data from the JSONarray
            }

            @Override
            public void onError(String result) {

            }
        });
```

### Syntax - Select

Getting data from the particular URL

```
new VolleyAdapter(context).getData(URL, new ServerCallback())
```
```
 new VolleyAdapter(this).getData(Config.URL, new ServerCallback() {
            @Override
            public void onSuccess(String result) {
                ## result can be converted in to the JSONarray
                ## using JSONObject we can parse the data from the JSONarray
            }

            @Override
            public void onError(String result) {

            }
        });
```

### Syntax - Select - with parameter

Sending data to the URL and get the data back.

```
new VolleyAdapter(context).getData(HashMap<String, String>, URL, new ServerCallback())
```
```
//Overloaded getdata method can be used to get the data by sending
//quering values in the Hashmap
new VolleyAdapter(this).getData(map, Config.URL, new ServerCallback() {
    @Override
    public void onSuccess(String result) {
        //result can be converted in to the JSONarray
        //using JSONObject we can parse the data from the JSONarray
    }

    @Override
    public void onError(String result) {

    }
});
```

 
## Author

* **Balaji Rk** - (https://github.com/RabbitRk) 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
