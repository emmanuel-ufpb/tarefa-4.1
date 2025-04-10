public abstract class MachineComponent {
    protected String name;
    
    // Método abstrato para retornar a quantidade de máquinas ou componentes
    public abstract int getMachineCount();
    
    // Métodos de acesso para o nome
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
