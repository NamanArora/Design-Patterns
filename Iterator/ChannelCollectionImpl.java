package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    public static List<Channel> list = new ArrayList<>();

    @Override
    public void addChannel(Channel a) {
        list.add(a);
    }

    @Override
    public void removeChannel() {

    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum e) {
        return new ChannelIteratorImpl(list,e);
    }
}
