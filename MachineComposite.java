import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent {
    // Lista que armazena os componentes agregados (pode conter folhas ou outros composites)
    private List<MachineComponent> components = new ArrayList<>();

    // Método para adicionar um componente
    public void add(MachineComponent component) {
        components.add(component);
    }
    
    // Método para remover um componente (opcional)
    public void remove(MachineComponent component) {
        components.remove(component);
    }
    
    // Método para recuperar um componente por índice (opcional)
    public MachineComponent getChild(int index) {
        return components.get(index);
    }
    
    // Percorre os componentes agregados e retorna a soma das contagens (usa recursão se necessário)
    @Override
    public int getMachineCount() {
        int total = 0;
        for (MachineComponent comp : components) {
            total += comp.getMachineCount();
        }
        return total;
    }
}
