package co.grandcircus.Lab215;

import org.springframework.web.servlet.ModelAndView;

public class Modules {

	public ModelAndView tipCalculations(double percent, double bill, double cpercent, ModelAndView mav) {
		if (percent == 0.01) {
			percent = cpercent / 100.0;
		}

		double result = percent * bill;
		mav.addObject("percentage", percent);
		mav.addObject("bill", bill);
		mav.addObject("result", result);

		return mav;
	}

	public ModelAndView gasCalculations(double gallons, double mpg, int distance, ModelAndView mav) {

		String resultString = "";
		double range = mpg * gallons;
		double milesDiff = Math.abs((double) distance - range);
		double galDiff = milesDiff / mpg;

		if (distance != 0) {
			if (range > (double) distance && galDiff > 1.5) {
				resultString = String.format(
						"<font color=\"green\">You have enough gas! You have %.1fgal extra (%.1fmi).</font>",
						galDiff, milesDiff);
			} else if (range < (double) distance && galDiff < 1.5) {
				resultString = String.format(
						"<font color=\"red\">You don't have enough gas! You are %.1fgal short (%.1fmi) and your gas tank will be on empty when you arrive at your destination.</font>",
						galDiff, milesDiff);
			} else {
				resultString = String.format("<font color=\"gold\">You have barely enough gas! You will have %.1fgal when you arrive at your destination</font>", galDiff);
			}
		}
		
		//add distance string, if applicable
		if (distance != 0) {
			mav.addObject("tripDistance", String.format("Trip Distance: %dmi",distance));
				
		}
		
		mav.addObject("gallons", gallons);
		mav.addObject("mpg", mpg);
		mav.addObject("range", range);
		mav.addObject("result", resultString);

		return mav;
	}
}
