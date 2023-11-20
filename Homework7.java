/*
• 문제
– 추상 클래스 Printer 설계
멤버 변수: model (모델명), printedCount (현재까지의 출력 매수), availableCount (출력 가능 매수)
추상 멤버 함수: boolean print()
– Printer를 상속받는 InkjetPrinter 클래스와 LaserPrinter 클래스를 설계
• 상속받은 클래스에서의 print() 함수 구현
– availableCount 값이 0일 경우,
InkjetPrinter의 경우 “모델명: xx매째 인쇄 실패 - 잉크 부족.”을 출력하고 false 리턴
LaserPrinter의 경우 “모델명: xx매째 인쇄 실패 - 토너 부족.”을 출력하고 false 리턴
xx매는 printedCount(이전까지의 출력매수) +1이 됨
– availableCount 값이 1 이상이면,
printedCount는 하나 증가, availableCount는 하나 감소시키고 true 리턴
 */
abstract class Printer{
    String model;
    int printedCount;
    int availableCount;

    public Printer(String model, int availableCnt){
        this.model = model;
        this.availableCount = availableCnt;
    }

    public abstract boolean print();

}

class InkjetPrinter extends Printer{

    public InkjetPrinter(String model, int availableCnt){
        super(model, availableCnt);
    }

    @Override
    public boolean print() {
        if(availableCount == 0){
            System.out.println(String.format("%s: %d매째 인쇄 실패 - 잉크 부족", this.model, this.printedCount + 1));
            return false;
        }
        else{
            this.printedCount++;
            this.availableCount--;
            return true;
        }
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCnt){
        super(model, availableCnt);
    }

    @Override
    public boolean print() {
        if(availableCount == 0){
            System.out.println(String.format("%s: %d매째 인쇄 실패 - 토너 부족", this.model, this.printedCount + 1));
            return false;
        }
        else{
            this.printedCount++;
            this.availableCount--;
            return true;
        }
    }
}
public class Homework7 {

    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
