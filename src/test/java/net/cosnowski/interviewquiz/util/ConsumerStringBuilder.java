package net.cosnowski.interviewquiz.util;

import java.util.function.Consumer;

public class ConsumerStringBuilder<T> implements Consumer<T>{
    private final StringBuilder sb;
    private final String separator;
    
    public ConsumerStringBuilder()  {
        this.sb = new StringBuilder();
        this.separator = ",";
    }

    @Override
    public void accept(T value) {
        if (sb.length() > 0)  {
            sb.append(separator);
        }
        sb.append(value);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
