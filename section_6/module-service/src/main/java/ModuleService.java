import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModuleService implements ModuleApi {

  private static final Logger LOG = LoggerFactory.getLogger(ModuleService.class);

  // private String commentedCodeToHaveAnIssue;

  private String[] strings;

  public void shouldCreateAFindBugsIssue(String[] strings) {
    this.strings = strings;
  }
  
}
