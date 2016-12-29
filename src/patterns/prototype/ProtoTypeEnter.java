package patterns.prototype;

import java.util.ArrayList;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月17日 下午1:48:13
 **/
public class ProtoTypeEnter
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        // TODO Auto-generated method stub
        ArrayList<String> companies = new ArrayList<String>();
        companies.add("Baidu");
        companies.add("Tencent");
        companies.add("Ali");
        WorkExprience workExprience = new WorkExprience(companies);
        String nameString = new String("Tom");
        String genderString = new String("male");
        Resume resume = new Resume(nameString, 23, genderString, workExprience);
        System.out.println("Source Resume");
        resume.printResum();
        
        ArrayList<String> companies1 = new ArrayList<String>();
        companies1.add("Google");
        companies1.add("Microsoft");
        companies1.add("Oracle");
        Resume copyResume = (Resume)resume.clone();
        String nameString1 = new String("Jerry");
        String genderString1 = new String("Fmale");
        copyResume.setName(nameString1);
        copyResume.setAge(20);
        copyResume.setGender(genderString1);
        copyResume.getWorkExprience().setCompanyArrayList(companies1);
        System.out.println();
        System.out.println("Source Resume");
        resume.printResum();
        System.out.println();
        System.out.println("Copy Resume");
        copyResume.printResum();
    }
}