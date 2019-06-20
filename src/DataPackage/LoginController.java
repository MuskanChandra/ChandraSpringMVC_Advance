
package DataPackage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController
{
	@RequestMapping (value="/Login",method = RequestMethod.GET)
	public ModelAndView DoLogin()
	{
		ModelAndView mv=new ModelAndView("LoginForm","command",new Login());
		
		return mv;
		
	}
	@RequestMapping (value="/ProcessLogin",method = RequestMethod.POST)
	public ModelAndView ProcessLogin(@ModelAttribute("Login")Login l,ModelMap model)
	{
		if(l.validate())
		{
			model.addAttribute("name", l.username);
		return new ModelAndView("success");
		}
		else
		{
			model.addAttribute("name", l.username);
			return new ModelAndView("error");
		}
		
		
	}
  
}
