package co.grandcircus.Lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GasMileageController {

	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("form");
		return mav;
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showResult(
			@RequestParam("gallons") double gallons,
			@RequestParam("mpg") double mpg,
			@RequestParam("distance") int distance) {
		ModelAndView mav = new ModelAndView("result");
		
		String resultString = "";
		double range = mpg * gallons;
		if(range > (double)distance) {
			resultString = "<font color=\"green\">You have more than enough gas!</font>";
		} else if (range < (double)distance) {
			resultString = "<font color=\"red\">You don't have enough gas!</font>";
		} else {
			resultString = "<font color=\"gold\">You have barely enough gas!</font>";			
		}
		
		mav.addObject("gallons", gallons);
		mav.addObject("mpg", mpg);
		mav.addObject("range", range);
		mav.addObject("result", resultString);
		return mav;
	}
	
}
