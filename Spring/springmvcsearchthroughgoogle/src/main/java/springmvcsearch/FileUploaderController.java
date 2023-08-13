package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploaderController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model m) {
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.err.println(file.getName());
		System.out.println(file.getBytes());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getFileItem());
		System.out.println(file.getClass());
		System.out.println();
		
		//Get byte data
		byte[] data = file.getBytes();
		// We have to save this file to server...
		String path = session.getServletContext().getRealPath("/")+ "WEB-INF" + File.separator + "resources" + 
					  File.separator + "image" + File.separator +file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
			m.addAttribute("msg", "file uploaded successfully...");
			m.addAttribute("filename", file.getOriginalFilename());
			
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Uploading Error");
			m.addAttribute("msg", "uploading error!!");
		}
		return "filesuccess";
	}
}
