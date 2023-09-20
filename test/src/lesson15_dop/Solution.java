package lesson15_dop;
/*
1. В классе Solution создайте по 3 конструктора
для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution
 от класса Solution.
3. Внутри класса SubSolution создайте конструкторы
командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в
SubSolution так, чтобы они соответствовали
конструкторам класса Solution.
 */
public class Solution {
    public Solution(int var){}
    public Solution(String var){}
    public Solution(byte var){}

    protected Solution(Integer var){}
    protected Solution(char var){}
    protected Solution(double var){}

    private Solution(Byte var){}
    private Solution(Double var){}
    private Solution(short var){}

    Solution(Short var){}
    Solution(boolean var){}
    Solution(Boolean var){}
}
