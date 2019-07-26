package object;

public class HashMapTest {
    private Integer a;

    public HashMapTest(int a) {
        this.a = a;
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof HashMapTest)) {
            return false;
        } else {
            HashMapTest other = (HashMapTest)o;
            if(!other.canEqual(this)) {
                return false;
            } else {
                Integer this$data = this.getA();
                Integer other$data = other.getA();
                if(this$data == null) {
                    if(other$data != null) {
                        return false;
                    }
                } else if(!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }
    protected boolean canEqual(Object other) {
        return other instanceof HashMapTest;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getA() {
        return a;
    }

    public int hashCode() {
        byte result = 1;
        Integer $data = this.getA();
        return result * 29 + ($data == null? 99 : $data.hashCode());
    }
}
