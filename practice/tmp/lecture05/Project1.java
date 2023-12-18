package lecture05;

import java.util.Scanner;


public class Project1 {

    String helpMessage = "Type a Java Language expression, statement, or declaration\n" +
            "Or type one of the following commands:\n" +
            "/list: list the source you have typed.\n" +
            "/exit: exit the jshell tool\n" +
            "/history: history of what you hava typed.\n" +
            "/!: rerun last snippet.\n";
    String[] buffer = new String[10];  //최대 10 크기의 히스토리 버퍼
    int point = 0;  //히스토리 버퍼의 다음 삽입 위치
    boolean isExit = false;   //EXIT 명령어 시 True


    /**
     * Jshell Command 종류 정의
     */
    enum SlashCommand{
        LIST("/list"), HISTORY("/history"), EXIT("/exit"), LAST_COMMAND("/!"), HELP("/help");
        String command;
        SlashCommand(String command) {
            this.command = command;
        }
        String getCommand() { return command; }
    }




    /**
     * 히스토리 버퍼에 입력내용 추가
     */
    void insertHistory(String s){
        //버퍼가 꽉 찼을 때 비움
        if(point == 10){
            System.out.println("The History buffer is cleared");
            for(int i = 0; i < buffer.length; i++){
                buffer[i] = null;
            }
            point = 0;
        }
        buffer[point] = s;
        point++;
    }

    /**
     * 슬래쉬 시작 명령어 여부 확인
     */
    boolean isSlashCommand(String s){
        String slash = s.substring(0, 1);
        if(slash.equals("/")){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * 슬래쉬 시작 명령어를 Jshell 명령어로 해독하여 실행
     */
    public void runSlashCommand(String s){
        s = s.trim();

        /* /list */
        if(s.equals(SlashCommand.LIST.getCommand())){
            int index = 1;
            for(int i = 0; i < point; i++){
                if(isSlashCommand(buffer[i]) == false){
                    System.out.printf("%d : %s\n", index, buffer[i]);
                    index++;
                }
            }
        }

        /* /history */
        else if(s.equals(SlashCommand.HISTORY.getCommand())){
            for(int i = 0; i < point; i++){
                System.out.printf("%s\n", buffer[i]);
            }
        }

        /* /exit */
        else if(s.equals(SlashCommand.EXIT.getCommand())){
            System.out.println("Goodbye.");
            isExit = true;
        }

        /* /! */
        else if(s.equals(SlashCommand.LAST_COMMAND.getCommand())){
            for(int i = 1; i <= point; i++){
                if(buffer[point - i] == null){
                    break;
                }
                else if(isSlashCommand(buffer[point - i]) == false){
                    System.out.printf("Re-Running '%s'.\n", buffer[point - i]);
                    break;
                }
            }
        }

        /* /help */
        else if(s.equals(SlashCommand.HELP.getCommand())){
            System.out.println(helpMessage);
        }
        else{
            System.out.println("Invalid Command " + s);
        }



    }

    public static void main(String[] args){
        Project1 p = new Project1();
        Scanner sc  = new Scanner(System.in);

        while(!p.isExit){
            System.out.print("jshell> ");
            String s = sc.nextLine();

            // 슬래시 커멘드인 경우 Jshell 명령처리
            if(p.isSlashCommand(s)){
                p.runSlashCommand(s);
            }

            // 슬래시 시작이 아닌 경우
            else{
                System.out.printf("Running '%s'.\n", s);
            }
            p.insertHistory(s);

        }

    }
}
