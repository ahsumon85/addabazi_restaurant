
package com.addabazi.upload;

import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface UploadService
{
    public void uploadService(String imgPath,String fileName,UploadedFile uploadFile);

}
