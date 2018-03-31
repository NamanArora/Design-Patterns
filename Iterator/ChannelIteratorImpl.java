package com.company;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    int position;
    List<Channel> list;
    ChannelTypeEnum e;

    ChannelIteratorImpl( List<Channel> l ,ChannelTypeEnum e)
    {
        this.list = l;
        this.e=e;
    }

    @Override
    public boolean hasNext() {
        if(position<list.size())
        {
            Channel temp = list.get(position);
            if(temp.e==e || e==ChannelTypeEnum.ALL)
                return true;
            position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel temp = list.get(position);
        position++;
        return temp;
    }
}
