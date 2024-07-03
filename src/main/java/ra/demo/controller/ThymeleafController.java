package ra.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/", "/homeController"})
public class ThymeleafController {
    @GetMapping("/demo")
    public String home(Model model) {
        String ra = "Rikkei Academy - Đào tạo CNTT";
        String rs = "Rikkeisoft - Công ty phần mềm";
        model.addAttribute("ra", ra);
        model.addAttribute("rs", rs);
        Student student = new Student("SV001", "Nguyễn Văn A", 20, true);
        model.addAttribute("student", student);
        List<Student> listStudents = new ArrayList<>();
        Student student2 = new Student("SV002", "Nguyễn Văn B", 22,false);
        listStudents.add(student);
        listStudents.add(student2);
        model.addAttribute("listStudents", listStudents);
        return "home";
    }
}
