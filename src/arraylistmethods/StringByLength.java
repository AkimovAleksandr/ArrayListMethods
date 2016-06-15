/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmethods;

import java.util.Comparator;

/**
 *
 * @author Kudesnik
 */
public class StringByLength implements Comparator<String> 
{
        @Override
	public int compare(String s1,String s2)
        {
            return s1.length()-s2.length();
        }
}
//
// public class GradeComparator implements Comparator {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//
//		// descending order (ascending order would be:
//		// o1.getGrade()-o2.getGrade())
//		return o2.getGrade() - o1.getGrade();
//	}
//
//