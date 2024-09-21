package HTTPrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Anime
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Anime {

  private String name;


  private String quote;

  public Anime(@JsonProperty("name") String name,
              @JsonProperty("content") String quote
  ){
    this.name = name;
    this.quote = quote;
  }
  //
  //public Anime(String character){
  //  this.character = character;
  //}
  //
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
   public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }
}
