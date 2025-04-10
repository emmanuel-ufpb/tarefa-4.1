public class CompositePatternTest {
    public static void main(String[] args) {
        // Criação de máquinas individuais (folhas)
        Machine machine1 = new Machine();
        machine1.setName("Máquina 1");
        
        Machine machine2 = new Machine();
        machine2.setName("Máquina 2");
        
        Machine machine3 = new Machine();
        machine3.setName("Máquina 3");

        // Criação de um grupo (composite) que agrega machine1 e machine2
        MachineComposite group1 = new MachineComposite();
        group1.setName("Grupo 1");
        group1.add(machine1);
        group1.add(machine2);
        
        // Criação de outro grupo que agrega group1 e machine3
        MachineComposite group2 = new MachineComposite();
        group2.setName("Grupo 2");
        group2.add(group1);
        group2.add(machine3);
        
        // Exibe a contagem de máquinas em cada grupo
        System.out.println("Total de máquinas em " + group1.getName() + ": " + group1.getMachineCount());
        System.out.println("Total de máquinas em " + group2.getName() + ": " + group2.getMachineCount());
    }
}
