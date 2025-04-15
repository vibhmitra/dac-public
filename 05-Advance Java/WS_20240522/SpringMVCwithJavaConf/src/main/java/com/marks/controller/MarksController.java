package com.marks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marks.model.Marks;

@Controller
public class MarksController {
	@RequestMapping("Insert")
	public ModelAndView preInsert() {
		Marks marksObj = new Marks();
		/**MarksModel: The name under which the marks object will be 
		exposed in the view.
		marks: The actual Marks object to be used in the view.
		
		It Specifies the view name (InsertMarksView) and adds the Marks object (marksObj)
		 to the model with the attribute name MarksModel
		**/
		ModelAndView mv = new ModelAndView("InsertMarksView", "MarksModel", marksObj);
		return (mv);
	}

	/**
	 * The @ModelAttribute annotation binds a form submission to a Marks object.
	 * MarksModel": Refers to the name of the attribute that was set in the Insert method.
	 *  Spring will look for this attribute in the model or request parameters.
       Marks marks: The Marks object that is populated with the data from the form 
       submission.
	 * TotalMarks": The name under which the marks object will be exposed in the jsp view
	 * It Specifies the view name (ResutView) and adds the Marks object (marks) to the model with the attribute name TotalMarks.

	 */
	@RequestMapping("CalTotalMarks")
	public ModelAndView insertMarks(
			@ModelAttribute("MarksModel") 
			Marks marks) {
		ModelAndView mv = new ModelAndView("ResultView", "TotalMarks", marks);
		return mv;

	}

}