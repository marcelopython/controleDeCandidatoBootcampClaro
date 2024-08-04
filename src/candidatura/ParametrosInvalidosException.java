package candidatura;

public class ParametrosInvalidosException extends Exception {


    public ParametrosInvalidosException(String parametroInvalido) {
        super(parametroInvalido);
    }
}
