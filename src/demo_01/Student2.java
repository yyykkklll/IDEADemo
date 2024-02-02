package demo_01;

/**
 * @author yklsfzy
 * @date 2024/2/1/0001 12:06:13
 */
public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private int ChineseScore;
    private int EnglishScore;
    private int MathScore;

    public Student2() {
    }

    public Student2(String name, int age, int ChineseScore, int EnglishScore, int MathScore) {
        this.name = name;
        this.age = age;
        this.ChineseScore = ChineseScore;
        this.EnglishScore = EnglishScore;
        this.MathScore = MathScore;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return ChineseScore
     */
    public int getChineseScore() {
        return ChineseScore;
    }

    /**
     * 设置
     *
     * @param ChineseScore
     */
    public void setChineseScore(int ChineseScore) {
        this.ChineseScore = ChineseScore;
    }

    /**
     * 获取
     *
     * @return EnglishScore
     */
    public int getEnglishScore() {
        return EnglishScore;
    }

    /**
     * 设置
     *
     * @param EnglishScore
     */
    public void setEnglishScore(int EnglishScore) {
        this.EnglishScore = EnglishScore;
    }

    /**
     * 获取
     *
     * @return MathScore
     */
    public int getMathScore() {
        return MathScore;
    }

    /**
     * 设置
     *
     * @param MathScore
     */
    public void setMathScore(int MathScore) {
        this.MathScore = MathScore;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", ChineseScore = " + ChineseScore + ", EnglishScore = " + EnglishScore + ", MathScore = " + MathScore + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int SumScore1 = ChineseScore + EnglishScore + MathScore;
        int SumScore2 = o.getChineseScore() + o.getEnglishScore() + o.getMathScore();
        int res = SumScore1 - SumScore2;
        res = res == 0 ? res = this.ChineseScore - o.ChineseScore : res;
        res = res == 0 ? res = this.EnglishScore - o.EnglishScore : res;
        res = res == 0 ? res = this.age - o.age : res;
        res = res == 0 ? res = this.name.compareTo(o.name) : res;
        return res;
    }
}
