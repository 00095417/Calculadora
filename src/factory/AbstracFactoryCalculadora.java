package factory;


import aritmetico.Aritmetico;
import convertor.Convertor;


/**
 *
 * @author Carlos Ruiz
 */
public interface AbstracFactoryCalculadora{
    
    Aritmetico getAritmetico(String type);
    Convertor getConvertor(String type);   
}
