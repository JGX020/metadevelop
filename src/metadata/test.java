package metadata;

import java.lang.reflect.Field;

public class test {
	
	    public static void getFruitInfo(Class<?> clazz){
	        
	        String strFruitName=" 水果名称：";
	        String strFruitColor=" 水果颜色：";
	        String strFruitProvicer="供应商信息：";
	        
	        Field[] fields = clazz.getDeclaredFields();
	        
	        for(Field field :fields){
	            if(field.isAnnotationPresent(FruitName.class)){
	                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
	                strFruitName=strFruitName+fruitName.value();
	                System.out.println(strFruitName);
	            }
	            else if(field.isAnnotationPresent(FruitColor.class)){
	                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
	                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
	                System.out.println(strFruitColor);
	            }
	            
	        }
	    }
	
  public static void main(String[] args){
	  //Apple apple=new Apple();
	  getFruitInfo(Apple.class);
  }
}
