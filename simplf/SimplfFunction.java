package simplf;
 
import java.util.List;

class SimplfFunction implements SimplfCallable {
    private  Environment closure;
    private final Stmt.Function declaration;
    

    SimplfFunction(Stmt.Function declaration, Environment closure) {
        this.declaration = declaration;
        this.closure = closure;
    }

    public void setClosure(Environment environment) {
        this.closure = environment;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> args) {
        throw new UnsupportedOperationException("TODO: implement functions");
    }

    @Override
    public String toString() {
        return "<fn >";
    }

}