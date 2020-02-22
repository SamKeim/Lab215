package co.grandcircus.Lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebAppController {

	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/gas/mileage-form")
	public ModelAndView showGasForm() {
		ModelAndView mav = new ModelAndView("gas/gasform");
		return mav;
	}
	
	@RequestMapping("/gas/mileage-result")
	public ModelAndView showGasResult(
			@RequestParam("gallons") double gallons,
			@RequestParam("mpg") double mpg,
			@RequestParam("distance") int distance) {
		ModelAndView mav = new ModelAndView("gas/gasresult");
		
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
	
	@RequestMapping("/tip/tip-form")
	public ModelAndView showTipForm() {
		ModelAndView mav = new ModelAndView("tip/tipform");
		return mav;
	}
	
	@RequestMapping("/tip/tip-result")
	public ModelAndView showTipResult(
			@RequestParam("percentage") double percentage,
			@RequestParam("bill") double bill,
			@RequestParam(value="cpercentage", required=false) double cpercentage) {
		ModelAndView mav = new ModelAndView("tip/tipresult");
		
		if(percentage == 0.01) {
			percentage = cpercentage / 100.0;
		}
		
		double result = percentage * bill;
		
		mav.addObject("percentage", percentage);
		mav.addObject("bill", bill);
		mav.addObject("result", result);
				
		return mav;
	}
	
	
	
}
