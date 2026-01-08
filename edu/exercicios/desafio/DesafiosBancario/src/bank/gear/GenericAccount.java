package bank.gear;

public interface GenericAccount {

    default void withdrawn(double value) {};
    
    default void deposit(double value) {};
    
    default void transfer(double value, GenericAccount account) {};
    
    default void printExtract() {};

}
