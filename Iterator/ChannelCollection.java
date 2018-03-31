package com.company;

public interface ChannelCollection {

    public void addChannel(Channel b);
    public void removeChannel();
    public ChannelIterator iterator(ChannelTypeEnum e);
}
