package com.application.springMvc.controller;

import com.application.springMvc.model.FormDataWithFile;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Controller for requests handling
 * @author Ihor Savchenko
 * @version 1.0
 */
@Controller
public class MvcController {

    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }

    @GetMapping(value = "/pageForUploadOneFile")
    public String returnFormForUploadOneFile() {
        return "uploadFormPageOneFile";
    }

    @PostMapping(value = "/uploadOneFile")
    public String handleUploadingOneFile(@RequestParam("file") MultipartFile file,
                  @RequestParam("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("file", file);
        modelMap.addAttribute("name", name);
        return "resultUploadingOneFile";
    }

    @GetMapping(value = "/pageForUploadOneImage")
    public String returnFormForUploadOneImage() {
        return "uploadFormPageOneImage";
    }

    @PostMapping(value = "/uploadOneImageForDisplay", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] handleUploadingOneImageForDisplay(@RequestParam("file") MultipartFile file) {

        try {
            return IOUtils.toByteArray(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping(value = "/pageForUploadMultiFiles")
    public String returnFormForUploadMultiFiles() {
        return "uploadFormPageMultiFiles";
    }

    @PostMapping(value = "/uploadMultiFiles")
    public String handleUploadingMultiFiles(@RequestParam("files") MultipartFile[] files, ModelMap modelMap) {
        modelMap.addAttribute("files", files);
        return "resultUploadingMultiFiles";
    }

    @GetMapping(value = "/pageForUploadModelWithFile")
    public String returnFormForUploadModelWithFile() {
        return "uploadFormPageForModelWithFile";
    }

    @PostMapping(value = "/uploadModelWithFile")
    public String handleUploadingModelWithFile(@ModelAttribute FormDataWithFile formDataWithFile, ModelMap modelMap) {
        modelMap.addAttribute("formDataWithFile", formDataWithFile);
        return "resultUploadingModelWithFile";
    }

}