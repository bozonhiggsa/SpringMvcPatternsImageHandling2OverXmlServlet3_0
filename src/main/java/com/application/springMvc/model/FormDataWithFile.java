package com.application.springMvc.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Model for form with data
 * @author Ihor Savchenko
 * @version 1.0
 */
public class FormDataWithFile {

    private String name;
    private String login;
    private MultipartFile file;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
