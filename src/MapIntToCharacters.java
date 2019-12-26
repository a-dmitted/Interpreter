public class MapIntToCharacters implements Expression {
    private String tString;
    public MapIntToCharacters(String tString){
        this.tString = tString;
    }
    @Override
    public void interpret(Conversion originalContext) {
        originalContext.convertToCharacters(tString);
    }
}
