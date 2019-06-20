package DataPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MineLoginController 
{
	@RequestMapping(value = "/MineLogin", method = RequestMethod.GET)
	public ModelAndView DoMineLogin()
	{
		ModelAndView mav = new ModelAndView("MineLoginForm", "command", new MineLogin());
		return mav;
	}
	
	@RequestMapping(value = "/ProcessMineLogin", method = RequestMethod.POST)
	public ModelAndView ProcessMineLogin(@ModelAttribute("MineLogin") MineLogin ml, ModelMap model)
	{
		if(ml.validate()) 
		{
			model.addAttribute("name", ml.username);
			return new ModelAndView("MineLoginSuccess");
		}
		else
		{
			model.addAttribute("name", ml.username);
			return new ModelAndView("MineLoginError");
		}
	}
}
