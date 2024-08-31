// sets in java

// [1,2,3,4] / [1.1,2.1,2.3,25.5] / ["a","b","c","d"] / ["junagadh","rajkot",jamnagar"] are example of set in java
// 

//   > set did not carry duplicate value 
// here we use HashSet : HashSet is not ordered set 
// TYPES of set in java :
/*
    1 > Hashset         {unordered set ; NOTE : not mintain specific order}
    2 > TreeSet         {orderd set ; NOTE : maintain SORTED order}
    3 > LinkedHashSet   {same as hashset(ordered set ; NOTE : maintain INSERTION order) ; faster on certain operation}
 */
/*
 * ordered means it maintain insertation order of elements
 * unordered means it not maintain insertion order of elements
 */
// for create a set in java import HashSet and Set class from java.util package for unordered set
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;       // import TreeSet class from java,util package instead of HashSet for ordereded set

// TIP : if you don't want to declare differen class from pakage than just import all class from package -->  import java.util.*;
public class setexample {
    public static void main(String[] args) {

        // HashSet for unoredered set
        // to create a set Syntax :
        //  Set<datatype> setname = new HashSet<datatype>();    |or|    Set<datatype> setname = new HashSet<>();

        Set<Integer> set1 = new HashSet<Integer>();

        // here we can also use Double/String instead of Integer datatype
        /* set did not contain same value 
        explaination : if we add 1,2,3,4,2,3 --> than output will be --> [1,2,3,4] */


        // to add element in set Syntax :
        // setname.add(value);

        System.out.println("HashSet : ");               //this line is only for output/understanding

        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(-3);           // here we add negative value
        set1.add(2);          // here we add duplicate/same value
        set1.add(1);          // here we add duplicate/same value
        System.out.print("{unordered set} Set  is : ");         //this line is only for output/understanding
        System.out.println(set1);

        /* here we input a negative value we expect [-3,1,2,4] set {ordered set}
         but we got unordered set as output --> [1,2,-3,4]       because we use HashSet library here*/
        // to remove element in set Syntax :
        // setname.remove(value);
        // set is [1,2,3,4] and want to remove 1 from the set 

        set1.remove(1);

        // print rest of set

        System.out.print("After remove 1 from set : ");             //this line is only for output/understanding
        System.out.println(set1);

        // remove 3 from set

        set1.remove(3);
        System.out.print("After remove 3 from set : ");             //this line is only for output/understanding
        System.out.println(set1);



        /*add 1,3 in set*/set1.add(1);set1.add(3);                 //this line is only for output/understanding
        // to check set conatin element
        /*explanation : suppose set = [1,2,3,4]  --> check 2 --> True       ||  or  ||      --> check 9 -->  Flase*/

        // Syntax  :  Boolean newvariable = setname.contains(value);           {here boolean datatype return true/false value}

        // here set is [1,2,3,4]

        Boolean a = set1.contains(2);
        System.out.print("check 1 is in set or not : ");                //this line is only for output/understanding
        System.out.println(a);      // return true

        Boolean b = set1.contains(9);
        System.out.print("check 9 is in set or not : ");                //this line is only for output/understanding
        System.out.println(b);      //return false

        Boolean c = set1.contains("q");
        System.out.print("check char is in set or not : ");                //this line is only for output/understanding
        System.out.println(c);      //here we input a character and we get false because list did not conatinn "q"

        // NOTE : in upper example we use a,b,c different variable if we use same variable for all checks we get error

        /*
         * EXAMPLE
        Boolean a = set1.contains(2);
        System.out.println(a);

        Boolean a = set1.conatains(9);
        System.out.println(a);

        OUTPUT      :       
        Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Duplicate local variable a
        b cannot be resolved to a variable

        -->in simple language we cannot use duplicate variable/same variable while perform conatains operation in set
        */

        // to remove all elements in set/clear set Syntax : 
        // setname.clear();
        set1.clear();
        System.out.print("set after using clear : ");                   //this line is only for output/understanding
        System.out.println(set1);

        
        // to check set is empty or not 
        // SYNTAX   :   System.out.println(setname.isEmpty());
        System.out.print("is set is empty or not : ");                     //this line is only for output/understanding
        System.out.println(set1.isEmpty());

        set1.add(1);set1.add(2);set1.add(3);set1.add(4);                //this line is only for output/understanding
        // after operation list is [1,2,3,4]
        // now check list is empty or not
        System.out.print("is set is empty or not after add : ");                //this line is only for output/understanding
        System.out.println(set1.isEmpty());

        // to get size/rank of the set Synatax : 
        // System.out.println(setname.size());
        System.out.print("Size of set is : ");                      //this line is only for output/understanding
        System.out.println(set1.size());
        // or declare a integer variable 
        /*int w = set1.size();
        System.out.print(w);        -->         also return 4 */


        // TreeSet for ordered set
        // same Synatx as HaashSet  -->Syntax:
        // Set<datatype> setname = new TreeSet<datatype>();     |or|      Set<datatype> setname = new TreeSet<>();

        Set<Integer> set2 = new TreeSet<Integer>();
        
        //add element is set
        System.out.print("TreeSet : ");              //this line is only for output/understanding
        set2.add(1);
        set2.add(2);
        set2.add(-3);
        set2.add(4);
        set2.add(2);

        System.out.print("{Treeset} set is : ");            //this line is only for output/understanding
        System.out.println(set2);
        // here we got ordered set 
        // NOTE    :   ALL OPERATIONS IN TreeSet ARE SAME AS HashSet


        // Upper given all examples are contain same data type values

        // declare a set with different type of datatypes
        // Syntax :
        // Set<Object> setname = new HashSet<>();   |or|    Set<Object> set3 = new HashSet<Object>();
        // NOTE : use only HashSet of this type of operations
        Set<Object> set3 = new HashSet<Object>();
        set3.add(1);            //integer 
        set3.add("hello");      //string
        set3.add(1.111);        //double/float
        set3.add("a");          //character
        System.out.print("Different data type set is : ");                     //this line is only for output/understanding
        System.out.println(set3);
    }
}