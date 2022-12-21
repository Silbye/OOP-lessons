package lesson2;

public class Relative extends Human {

    String relation;

    Relative(int argId, String argName, int argAge, String argNationality, String argGender, String relation) {
        super(argId, argName, argAge, argNationality, argGender);
        this.relation = relation;
    }

    @Override
    public void info() {
        System.out.printf("%s:\n", relation);
        super.info();
    }
}
