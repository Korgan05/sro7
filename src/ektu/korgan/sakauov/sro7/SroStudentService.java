package ektu.korgan.sakauov.sro7;

import java.util.*;

public class SroStudentService {
    private final List<SroStudent> students = new ArrayList<>();
    private final Map<Integer, SroStudent> byId = new HashMap<>();

    public void add(SroStudent st) {
        students.add(st);
        byId.put(st.getId(), st);
    }

    public SroStudent getById(int id) throws SroStudentNotFoundException {
        SroStudent found = byId.get(id);
        if (found == null) throw new SroStudentNotFoundException("Студент не найден: id=" + id);
        return found;
    }

    public List<SroStudent> list() { return new ArrayList<>(students); }

    public boolean removeById(int id) {
        SroStudent removed = byId.remove(id);
        if (removed != null) {
            students.remove(removed);
            return true;
        }
        return false;
    }
}
