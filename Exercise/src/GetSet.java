/**
 * Created by zhoupan on 10/21/15.
 */
public class GetSet {
    private int id;
    private String name;
    private boolean sex;
    private double score;

    GetSet(){
    }
    GetSet(String name){
        this.name=name;
    }
    GetSet(String name, int id, boolean sex, double score){
        this.name=name;
        this.score=score;
        this.id=id;
        this.sex=sex;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String toString(){
        System.out.println("id=" + id + " name=" + name + " sex=" + (sex ? "男" : "女")+" score="+score);
        return null;
    }
}
