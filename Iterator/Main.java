package com.company;

public class Main {

    static ChannelCollection populateData()
    {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;

    }

    public static void main(String[] args) {
        // write your code here



        ChannelCollection collection = populateData();
        ChannelIterator iterator = collection.iterator(ChannelTypeEnum.ALL);
        while(iterator.hasNext()){
            Channel c = iterator.next();
            System.out.println(c.toString());
        }
        ChannelIterator Englishiterator = collection.iterator(ChannelTypeEnum.ENGLISH);
        while(Englishiterator.hasNext()){
            Channel c = Englishiterator.next();
            System.out.println(c.toString());
        }

    }
}
