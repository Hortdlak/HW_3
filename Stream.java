import java.util.List;
import java.util.Iterator;

// Создать класс Stream, содержащий в себе список StudyGroups и реализующий интерфейс Iterable;

class Stream implements Iterable<StudyGroup> {
    private String streamName;

    private List<StudyGroup> groups;

    public Stream(String streamName, List<StudyGroup> groups) {
        this.streamName = streamName;
        this.groups = groups;
    }

    public String getStreamName() {
        return streamName;
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int size() {
        return groups.size();
    }
}