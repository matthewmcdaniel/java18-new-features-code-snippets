**Link to JEP:** https://openjdk.java.net/jeps/413

In Java 18, there is a new feature in the Javadoc tool. Developer can now utilize the `{@snippet}` tag to create code snippets within their documentation.

Usage
---
```
mvn clean package javadoc:javadoc
```
Then view the resulting javadocs in your favorite web browser.

The docs should be located in `target/site/apidocs/me/matthewmcdaniel/Main.html`.
