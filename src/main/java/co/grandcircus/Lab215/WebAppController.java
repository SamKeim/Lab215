package co.grandcircus.Lab215;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/gas/")
	public ModelAndView showGasForm() {
		ModelAndView mav = new ModelAndView("gas/gasform");
		return mav;
	}
	
	@RequestMapping("/gas/result")
	public ModelAndView showGasResult(
			@RequestParam("gallons") double gallons,
			@RequestParam("mpg") double mpg,
			@RequestParam(value="distance", required=false) int distance) {
		ModelAndView mav = new ModelAndView("gas/gasresult");
		
		Modules m = new Modules();
		mav = m.gasCalculations(gallons, mpg, distance, mav);
		return mav;
	}
	
	@RequestMapping("/tip/")
	public ModelAndView showTipForm() {
		ModelAndView mav = new ModelAndView("tip/tipform");
		return mav;
	}
	
	@RequestMapping("/tip/result")
	public ModelAndView showTipResult(
			@RequestParam("percentage") double percentage,
			@RequestParam("bill") double bill,
			@RequestParam(value="cpercentage", required=false) double cpercentage) {
		ModelAndView mav = new ModelAndView("tip/tipresult");
		Modules m = new Modules();
		mav = m.tipCalculations(percentage, bill, cpercentage, mav);
		
		return mav;
	}
	
	
	
}
