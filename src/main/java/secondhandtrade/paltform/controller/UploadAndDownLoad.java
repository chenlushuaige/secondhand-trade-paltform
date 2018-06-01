package secondhandtrade.paltform.controller;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import secondhandtrade.paltform.dto.ProductDTO;

/**
 * Copyright (C), XXX有限公司
 * FileName: UploadAndDownLoad
 * Author:   chenlu
 * Date:     2018/5/19 19:12
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class UploadAndDownLoad {
    @RequestMapping("/uploadImg")
    @ResponseBody
    public void uploadImg(MultipartFile file[], String pName) throws Exception {
        System.out.println("得到的areaName:"+pName);
        // 设置上传的路径是D盘下的picture
        String imgPath = "D:/picture/";

        for (MultipartFile f : file) {
            // 图片的名字用毫秒数+图片原来的名字拼接
            System.out.println(f.getSize());
            System.out.println(f.getBytes());
            String imgName = f.getOriginalFilename();
            //上传文件
            uploadFileUtil(f.getBytes(), imgPath, imgName);
        }
    }

    /**
     * 上传文件的方法
     * @param file：文件的字节
     * @param imgPath：文件的路径
     * @param imgName：文件的名字
     * @throws Exception
     */
    public void uploadFileUtil(byte[] file, String imgPath, String imgName) throws Exception {
        File targetFile = new File(imgPath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(imgPath + imgName);
        out.write(file);
        out.flush();
        out.close();
    }
}
