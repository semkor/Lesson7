package lesson28.Comparator;

import java.util.Comparator;
import java.util.Date;

public class Capability implements Comparable<Capability> {
    private long id;
    private String channelName;
    private String fingerprint;
    private boolean isActive;
    private Date dateCreated;

    public Capability(long id, String channelName, String fingerprint, boolean isActive, Date dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    //-1 OR 0 OR 1  - возможны три значения (отрицательное (на местах), 0, 1 - положит (меняем местами)
    @Override
    public int compareTo(Capability o) {
        System.out.println("compareTo is used");
        return (int) (this.id-o.getId());
    }
    //1001,1005,990
    // step1:  1001-1005=-4 - отрицательное, значит элементы остаются на своих местах
    //1001,1005,990
    //step2:   1005-990=15- положительное, значит элементы меняются местами
    //1001,990,1005
    //step3: 1001,990 = 11 - положительное, значит элементы меняются местами
    //990,1001,1005


    @Override
    public String toString() {
        return "Capability{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public static class FullComparator implements Comparator<lesson28.Comparable.Capability> {

        @Override
        public int compare(lesson28.Comparable.Capability o1, lesson28.Comparable.Capability o2) {
            if(!o1.getChannelName().equals(o2.getChannelName()))            //если не равны
                return o1.getChannelName().compareTo(o2.getChannelName());  //сортирую по getChannelName()
            if(!o1.getFingerprint().equals(o2.getFingerprint()))            //если не равны
                return o1.getFingerprint().compareTo(o2.getFingerprint());  //сортирую по getFingerprint()
            if(o1.getDateCreated().compareTo(o2.getDateCreated())<0)        //остальное сортирую по дате
                return 1;      //дата 1- min, дата 2 - max -"-1" - меняем
            else if(o1.getDateCreated().compareTo(o2.getDateCreated())==0)
                return 0;      // даты равные - ничего не меняем
            else
                return -1;
        }
    }
}
