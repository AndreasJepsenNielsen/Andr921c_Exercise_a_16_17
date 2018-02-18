public class Kap16Opgave17 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(8);
        A.add(13);
        A.add(17);
        A.add(4);
        A.add(9);
        A.add(12);
        A.add(98);
        A.add(41);
        A.add(7);
        A.add(23);
        A.add(0);
        A.add(92);

        System.out.println(removeRange(3,8,A));


    }

    // kapitel 16 opgave 17

    public static LinkedIntList removeRange(int startindex,int endIndex,LinkedIntList list)
    {
        for (int i = 0; i <= endIndex ; i++) {
            if(i>= startindex) {
                list.set(i, 7000);
            }
        }
        while (list.contains(7000)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 7000) {
                    list.remove(i);
                }
            }
        }
        return list;
    }
}
