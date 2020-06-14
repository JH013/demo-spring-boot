package com.example.demo.listener;

import com.example.demo.util.MyCounter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.*;

/**
 * @Description API访问量监听器
 * @ClassName ApiCounterListener
 * @Author wangz
 * @Date 2020/6/15 0015 0:37
 * @Version 1.0
 */
@WebListener
public class ApiCounterListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ApiCounter listener init");
        ServletContext sct = sce.getServletContext();
        String filePath = System.getProperty("user.dir") + "\\count.txt";
        sct.setAttribute("file-path", filePath);

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
            String content = reader.readLine();
            if (content == null) {
                MyCounter.init(0);
            } else {
                MyCounter.init(Integer.parseInt(content));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ApiCounter listener destroy");
        ServletContext sct = sce.getServletContext();
        String filePath = sct.getAttribute("file-path").toString();
        try {
            int count = MyCounter.getCount();

            File file = new File(filePath);
            if (!file.exists()) {

                file.createNewFile();

            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(Integer.toString(count).getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
