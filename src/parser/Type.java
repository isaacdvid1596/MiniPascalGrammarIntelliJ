package parser;

import java.util.HashMap;

import static parser.Types.*;

public class Type {

    private HashMap<Types,String> types = new HashMap<>();

    public Type(Types typeKey, IndexRange indexRange){
        this.types.put(INTEGER,"integer");
        this.types.put(REAL,"real");
        this.types.put(BOOLEAN,"boolean");
        this.types.put(CHAR,"char");
        this.types.put(STRING,"string");
        this.types.put(ARRAY,"array ["+indexRange.toString()+"] of "+this.types.get(typeKey));
    }

}
