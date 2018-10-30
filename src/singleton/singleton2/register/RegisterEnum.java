package singleton.singleton2.register;

/**
 * Created by maomao on 2018/4/7.
 * 单例的目的就是是资源共享，赋值或初始化一次，大家都能重复利用
 */
public enum RegisterEnum {
    RED() {
        private int r = 255;
        private int g = 0;
        private int b = 0;

        @Override
        public String toString() {
            return "r=" + r;
        }
    }, BLAOK, WHITE;
}
