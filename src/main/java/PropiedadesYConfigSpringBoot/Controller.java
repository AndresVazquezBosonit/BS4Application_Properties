package PropiedadesYConfigSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ServiceClass serviceClass;

    @GetMapping("/valores")
    @ResponseBody
    public String getValores(){
        return "Valor de var1 es: "+ serviceClass.getVar1() + " valor de my.var2 es: " + serviceClass.getVar2();
    }

    @GetMapping("/var3")
    public String getvar3(){
        return "Valor de var3 es: " + serviceClass.getVar3();
    }

}
