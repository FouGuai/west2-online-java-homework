
public class Main {
    public static void main(String[] args) {

    }
}

class Booth {
    private long id;
    private String name;
    private int total;
    private boolean isClosed;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public String toString() {
        return "id:" + id + " name:" + name + " total;" + total + " isClosed:" + isClosed;
    }

    Booth(long id, String name, int total, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
    }

    static public void purchase(Booth booth, int purchaseNum) {
        if (booth.isClosed) {
            System.out.println("The booth is closed.");
            return;// 终止函数
        }
        if (purchaseNum <= 0 && purchaseNum > booth.total) {
            System.out.println("the purchaseNum must beyond 0 and min total");
        }
        booth.total -= purchaseNum;
        System.out.println("success");

    }

    public void restock(int restockNum) {
        if (restockNum > 200) {
            System.out.println("the restockNum is beyond 200");
            return; // 终止函数
        }
        total += restockNum;
    }

    static public void closeBooth(Booth[] booths) {
        for (var booth : booths) {
            if (booth.isClosed) {
                booth.setIsClosed(false);
                System.out.println(booth.toString());
            }
        }
    }
}