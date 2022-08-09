package ecommerce.backend.rest.util;

@FunctionalInterface
public interface ShortToByteFunction {

    byte applyAsByte(short s);

}
