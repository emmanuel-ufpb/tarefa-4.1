public class Machine extends MachineComponent {
    // Como é uma máquina individual (folha), a contagem sempre será 1
    @Override
    public int getMachineCount() {
        return 1;
    }
}