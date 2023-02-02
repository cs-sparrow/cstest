/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 * @author cs
 * @create 2022-12-29-21:25
 */
public class BankTest {
}
class Bank{

    private Bank(){

    }

    private static Bank instence = null;

    public static Bank getInstance(){
        if(instence == null){
            synchronized (Bank.class) {
                if(instence == null){
                    instence = new Bank();
                }
            }
        }
        return instence;
    }


}
