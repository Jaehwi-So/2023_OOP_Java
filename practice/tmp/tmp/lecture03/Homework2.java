package lecture03;

import java.util.Scanner;

class Student{
    private int studentCode;    //학번
    private String name;    //이름
    private String major;   //전공
    private int phone;  //전화번호

    public Student(){

    }

    public Student(int studentCode, String name, String major, int phone){
        this.studentCode = studentCode;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
public class Homework2 {
    public static void main(String[] args){
        Student[] students = new Student[3];
        Scanner sc = new Scanner(System.in);

        // 학생 리스트(3명) 입력
        for(int i = 0; i < students.length; i++){
            //학생 속성 공백단위 입력
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentCode = sc.nextInt(); //학번
            String name = sc.next();    //이름
            String major = sc.next();   //전공
            String phoneStr = sc.next();    //전화번호

            //전화번호 길이체크 (010 케이스만)
            if(phoneStr.length() != 11){
                System.out.println("전화번호의 길이가 올바르지 않습니다");
                return;
            }

            //전화번호 하이폰 삭제
            phoneStr = phoneStr.replace("-", "");

            //전화번호 정수로 변경
            int phone = Integer.parseInt(phoneStr);

            //Student 인스턴스 생성 후 배열에 저장
            Student student = new Student(studentCode, name, major, phone);
            students[i] = student;
        }

        // 출력
        System.out.println("입력한 학생들의 정보는 다음과 같습니다.");
        for(int i = 0; i < students.length; i++){
            // 전화번호 복구 1053559999 -> 010-5355-9999
            String phone = "0";
            String tmp = Integer.toString(students[i].getPhone());
            phone = phone.concat(tmp.substring(0, 2) + "-");
            phone = phone.concat(tmp.substring(2, 6) + "-");
            phone = phone.concat(tmp.substring(6, 10));

            // 학생 정보 출력
            System.out.printf("%d번째 학생: %d %s %s %s \n", i + 1, students[i].getStudentCode(), students[i].getName(), students[i].getMajor(), phone);
        }

    }
}
