import java.util.List;

public class Transports {
    private List<transport> transports;

    public Transports(List<transport> transports) {
        this.transports = transports;
    }

    public List<transport> getTransports() {
        for (transport t : transports) {
            t.transportType();
        }
        return transports;
    }
}
