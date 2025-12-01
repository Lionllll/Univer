package lab5.task12;

import java.util.*;
public class UndoStringBuilder {
    private StringBuilder sb=new StringBuilder();
    private Stack<Runnable> st=new Stack<>();
    public UndoStringBuilder append(String s){
        sb.append(s);
        st.push(()->sb.delete(sb.length()-s.length(), sb.length()));
        return this;
    }
    public void undo(){ if(!st.isEmpty()) st.pop().run(); }
    public String toString(){ return sb.toString(); }
}