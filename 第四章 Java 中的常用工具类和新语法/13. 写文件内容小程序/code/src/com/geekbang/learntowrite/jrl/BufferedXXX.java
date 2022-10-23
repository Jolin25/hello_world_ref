package com.geekbang.learntowrite.jrl;

import java.io.*;

/**
 * @author jrl
 * @date Create in 10:56 2022/10/21
 */
public class BufferedXXX {
    public static void main(String[] args) {
        BufferedXXX bufferedXXX = new BufferedXXX();
        //这个文件170KB
        // BufferedInputStream
        // bufferedXXX.copy_pdf_to_another_pdf_with_byte_array_buffer_stream();//8ms
        // bufferedXXX.copy_pdf_to_another_pdf_with_byte_array_stream();
        // bufferedXXX.copy_pdf_to_another_pdf_buffer_stream();//33ms
        bufferedXXX.copy_pdf_to_another_pdf_stream();//1722ms
    }

    void copy_pdf_to_another_pdf_with_byte_array_buffer_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        String fileName = "D:" + File.separator + "Desktop" + File.separator + "mysql规范.pdf";
        String fileName2 = "D:" + File.separator + "Desktop" + File.separator + "mysql规范-副本2.pdf";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName2))) {
            int len;
            // 4KB
            byte[] bytes = new byte[4 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用缓冲流复制PDF文件总耗时:" + (end - start) + " 毫秒"); // 8ms
    }

    void copy_pdf_to_another_pdf_with_byte_array_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        String fileName = "D:" + File.separator + "Desktop" + File.separator + "mysql规范.pdf";
        String fileName2 = "D:" + File.separator + "Desktop" + File.separator + "mysql规范-副本3.pdf";
        try (FileInputStream fis = new FileInputStream(fileName);
             FileOutputStream fos = new FileOutputStream(fileName2)) {
            int len;
            // 设置了读写的字节数组的情况下，设置的大小合理，则是否 buffered 影响不大。因为这就相当于已经有了一个buffered了
            byte[] bytes = new byte[4 * 1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用普通流复制PDF文件总耗时:" + (end - start) + " 毫秒"); // 0ms 应该是还有其他层面的缓存造成的
    }

    void copy_pdf_to_another_pdf_buffer_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        String fileName = "D:" + File.separator + "Desktop" + File.separator + "mysql规范.pdf";
        String fileName2 = "D:" + File.separator + "Desktop" + File.separator + "mysql规范-副本4.pdf";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName2))) {
            int content;
            while ((content = bis.read()) != -1) { // 一个一个字节读
                bos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用缓冲流复制PDF文件总耗时:" + (end - start) + " 毫秒");
    }

    void copy_pdf_to_another_pdf_stream() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        String fileName = "D:" + File.separator + "Desktop" + File.separator + "mysql规范.pdf";
        String fileName2 = "D:" + File.separator + "Desktop" + File.separator + "mysql规范-副本5.pdf";
        try (FileInputStream fis = new FileInputStream(fileName);
             FileOutputStream fos = new FileOutputStream(fileName2)) {
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("使用普通流复制PDF文件总耗时:" + (end - start) + " 毫秒");
    }

}
