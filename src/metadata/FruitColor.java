package metadata; 
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果颜色注解
 * @author peida
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	 
    /**
     * 颜色枚举
     * @author peida
     *
     */
    public enum Color{ BULE("red",1),RED("green",2),GREEN("greey",3);
    	private String name;
        private int index;

        // 构造方法
        private Color(String name, int index) {
            this.name = name;
            this.index = index;
        }

        // 普通方法
        public static String getName(int index) {
            for (Color c : Color.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }

        // get set 方法
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }};
    
    /**
     * 颜色属性
     * @return
     */
    Color fruitColor() default Color.GREEN;

}