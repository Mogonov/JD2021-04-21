package by.it.nikitko.jd02_04;

public interface Patterns {

    String OPERATION = "(?<=[^-+*/=,{])([-+*/=])";
    String SCOPES = "\\(.*\\)";
    String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}";
    String MATRIX = "\\{" + VECTOR + "(," + VECTOR + ")*}";

}
/* Вариант А: 3.8+26.2 87.4-23.1 1.04*5.9 12.7*5 6+12 7*3.1 4/8 9-0.9  Вариант B:
 {2,3,4}*2 {2,3,4}/3 {2,3,4}-5 4+{2,3,4} {2,3,4}+{5,6,7} {2,3,4}-{5,6,7} 
 Вариант С: {{1,2},{8,3}}-2 {{1,-2},{8,3}}*{1,2} {{1,2},{8,3}} * {{1,2},{8,3}} {{1,2},{8,3}}+{{1,2},{8,3}}   */