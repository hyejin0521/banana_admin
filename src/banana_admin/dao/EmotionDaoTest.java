package banana_admin.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import banana_admin.controller.Controllers;
import banana_admin.domain.Emotion;

public class EmotionDaoTest {

   static EmotionDao emotionDao;
    
   @BeforeClass
   public static void setup() {
      emotionDao = new EmotionDao();
      new Controllers();
   }
   
   @Test
   public void testInsertRegisterEmotion() {
      
      boolean success = emotionDao.insertRegisterEmotion("웃김");
      
      assertTrue(success /*실제결과*/); //boolean값일때
   }

   @Ignore("Not implemented yet")
   @Test
   public void testSelectAllEmotion() { 
      
      ArrayList<Emotion> emotionList = emotionDao.selectAllEmotion();
      
      ArrayList<Emotion> resultEmotionList = new ArrayList<Emotion>();
      Emotion emotion = new Emotion(1,"행복");
      resultEmotionList.add(emotion);

      assertEquals(resultEmotionList.get(0).getEmotionName(), emotionList.get(0).getEmotionName());
          
   }

   @Ignore("Not implemented yet")
   @Test
   public void testUpdateEmotion() {
      
      Emotion emotion = new Emotion(1,"행복");
      boolean success = emotionDao.updateEmotion(emotion);
      

      assertEquals(true /*예상결과*/, success /*실제결과*/);
   }

}