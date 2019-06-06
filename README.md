[![Download](https://api.bintray.com/packages/thevineyard/JNewsAPI/JNewsAPI/images/download.svg) ](https://bintray.com/thevineyard/JNewsAPI/JNewsAPI/_latestVersion)
[![Build Status](https://travis-ci.org/The-Grape-Vine/JNewsAPI.svg?branch=master)](https://travis-ci.org/The-Grape-Vine/JNewsAPI)
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/kinda-sfw.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/60-percent-of-the-time-works-every-time.svg)](https://forthebadge.com)
# JNewsAPI
This is a wrapper for [NewsAPI.org](https://newsapi.org/), made in Kotlin.

## Documentation
Docs are provided live at https://docs.thegrapevine.xyz/JNewsAPI.

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
