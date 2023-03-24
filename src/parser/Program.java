package parser;

public class Program {
    private Block block;
    private String identifier;

    public Program(Block block,String identifier){
        this.block = block;
        this.identifier = identifier;
    }

//    @Override
//    public String toString() {
//        return "program "+this.identifier+";"+'\n'+this.block;
//    }
}
