package com.halen.controller;

import com.halen.entity.User;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/test")
    public String testUser() {

        return "test";
    }

    @RequestMapping("/testupload")
    public String testUpload() {

        return "upload";
    }

    @RequestMapping("/demo")
    public String demo() {

        return "user";
    }

    @RequestMapping("/user")
    public ModelAndView user() {
        ModelAndView model = new ModelAndView();
        model.setViewName("user");
        User user = new User();
        user.setId(20);
        user.setName("Halen");
        model.addObject("user", user);
        return model;
    }

    @RequestMapping("/redirect")
    public String redirect() {

        return "redirect:/user/test";
    }

    @RequestMapping("/req/{id}/{name}")
    public String requestTest(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "user";
    }

    @RequestMapping("/posttest")
    public String post(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        System.out.println(id);
        System.out.println(name);
        return "user";
    }

    @RequestMapping("/testjson")
    @ResponseBody
    public User testjson() {
        User user = new User();
        user.setId(20);
        user.setName("Halen");
        return user;
    }

    @RequestMapping("/postjson")
    public String postjson(@RequestBody User user) {

        return "user";
    }

    @RequestMapping("/interceptor")
    public String interceptor() {

        return "user";
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {

        String name = file.getOriginalFilename();
        File uploadF = new File("/" + name);

        file.transferTo(uploadF);

        return "upload";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download() throws IOException {
        String path = "F:/halen.jpg";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", path);
        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }


}
