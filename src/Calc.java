public class Calc implements ICalc {
    private CallBack callBack;

    interface CallBack{
        void callBack(String message);
    }


    @Override
    public void init(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void callCalc(String str) {
        callBack.callBack(str);
    }
}
