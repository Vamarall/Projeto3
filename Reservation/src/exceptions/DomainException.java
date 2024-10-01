package exceptions;

public class DomainException extends RuntimeException{
    //Declarando a versao de uma classe serializable
    private static final long serialVersionUID = 1L;


    public DomainException(String msg){
        super(msg);
    }

    
}
