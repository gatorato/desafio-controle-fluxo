//Esta classe pode ser o fundamento para criação de qualquer tipo de exceção
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
