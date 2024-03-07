import java.util.HashMap;

public class IDandPass {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPass(){
        logininfo.put("User1","Pass1");
        logininfo.put("User2","Pass2");
        logininfo.put("User3","Pass3");
    }

    protected HashMap getLogininfo(){

        return logininfo;

    }


}
