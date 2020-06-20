## API Key Filter Demo

This project demonstrates how to use a Filter in a Spring Boot app to check for
an API key. It looks up the key in a H2 database (database.h2:mydb.mv.db) and will
return a 401 if the key is not found.

If you want to run this just modify the application.properties file to reflect
the location of the H2 database.

NOTE: The H2 Console is unsecured at http://0.0.0.0:8080/h2-console/

The key in the database is yGR7D8KStnKdhQE8

This request will work:

```
$ curl -H "Key: yGR7D8KStnKdhQE8" "http://localhost:8080/api/hello?name=ashish"
{"greeting":"Hello ashish"}
```

But this one will not:

```
$ curl -H "Key: badkey" "http://localhost:8080/api/hello?name=ashish"
Invalid API KEY
```
