package org.hansung.crudApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
	@RequestMapping(value = "dept/deptlist.do")
	public String deptSelectAll(Model model) {
		model.addAttribute("deptlist", "dept select All");
		return "dept/deptAll";
	}
}
