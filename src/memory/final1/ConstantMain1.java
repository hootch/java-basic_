package memory.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수 " + currentUserCount);
        if (currentUserCount > Constant.MAX_USER) {
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여");
        }
    }
}
