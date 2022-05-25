package PropiedadesYConfigSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:properties.yml")
public class ServiceClass {
  @Value("${VAR1}")
  private String var1;

  @Value("${My.VAR2}")
  private int var2;
  @Value("${var3:var3 no tiene valor}")
  private String var3;

  public ServiceClass() {}

  public ServiceClass(String var1, int var2, String var3) {
    this.var1 = var1;
    this.var2 = var2;
    this.var3 = var3;
  }

  public String getVar1() {
    return var1;
  }

  public void setVar1(String var1) {
    this.var1 = var1;
  }

  public int getVar2() {
    return var2;
  }

  public String getVar3() {
    return var3;
  }

  public void setVar3(String var3) {
    this.var3 = var3;
  }

  public void setVar2(int var2) {
    this.var2 = var2;

  }

  @Override
  public String toString() {
    return "ServiceClass{" +
            "var1='" + var1 + '\'' +
            ", var2=" + var2 +
            ", var3='" + var3 + '\'' +
            '}';
  }
}
