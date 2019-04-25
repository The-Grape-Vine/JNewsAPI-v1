# JNewsAPI
This is a wrapper for [NewsAPI.org](https://newsapi.org/), made in Kotlin.

## How to Use
**Resolving the dependency**
```groovy
repositories { 
    maven { url "https://dl.bintray.com/thevineyard/JNewsAPI" } 
}
```

```groovy
compile 'xyz.thegrapevine:JNewsAPI:1.0.0'
```

**Using the library**
```java
NewsClient client = new NewsClientBuilder("token").build();

// Top headlines about bitcoin
NewsEntity entity = client.getTopHeadlines("bitcoin");

// Sources
SourceEntity sources = client.getSources()

// Everything about media
NewsEntity entity = client.getEverything("media")
```
