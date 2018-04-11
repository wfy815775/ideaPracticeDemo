import java.util.function.Supplier;

interface StaticInterfaceDemo {
    static InterfaceDemo create(Supplier<InterfaceDemo> interfaceDemoSupplier){
        return interfaceDemoSupplier.get();
    }
}


