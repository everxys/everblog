package com.ever.everblog.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class ImageController {

    @GetMapping(
        value = "/get-image-with-media-type",
        produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getImageWithMediaType() throws IOException {
        FileInputStream in=new FileInputStream("/home/everxys/Pictures/Wallpaper/wallpaper.jpg");
        return IOUtils.toByteArray(in);
    }


}
