package HTTPrequest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Anime
 */
public class Anime {

  private String name;

  private String character;

  private String quote;

  public Anime(@JsonProperty("name") String name,
              @JsonProperty("name") String character,
              @JsonProperty("content") String quote
  ){
    this.name = name;
    this.character = character;
    this.quote = quote;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCharacter() {
    return character;
  }

  public void setCharacter(String character) {
    this.character = character;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }
}
