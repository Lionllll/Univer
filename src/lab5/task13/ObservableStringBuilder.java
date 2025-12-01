package lab5.task13;

import java.util.*;
public class ObservableStringBuilder {
    private StringBuilder sb=new StringBuilder();
    private List<ChangeListener> ls=new ArrayList<>();
    public void addListener(ChangeListener l){ ls.add(l); }
    private void n(){ for(ChangeListener l:ls) l.onChange(sb.toString()); }
    public ObservableStringBuilder append(String s){ sb.append(s); n(); return this; }
}