package installer.Json;

import java.util.List;
import java.util.Map;

public abstract interface ContainerFactory
{
  public abstract Map createObjectContainer();
  
  public abstract List creatArrayContainer();
}
