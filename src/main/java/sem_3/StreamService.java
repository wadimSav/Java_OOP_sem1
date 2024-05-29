package sem_3;

import java.util.List;

public record StreamService(List<Stream> stream) {
    public List<Stream> getSortedStreamList() {
        stream.sort(new StreamComparator());
        return stream;
    }
}
