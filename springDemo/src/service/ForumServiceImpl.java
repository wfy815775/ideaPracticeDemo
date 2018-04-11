package service;

public class ForumServiceImpl implements ForumService{
    @Override
    public void removeTopic(int topicid) {
        System.out.println("模拟删除topic记录 "+topicid);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeForum(int forumid) {
        System.out.println("模拟删除forum记录 "+forumid);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void ThrowExc(int id) {
        throw new RuntimeException("运行异常");
    }
}
