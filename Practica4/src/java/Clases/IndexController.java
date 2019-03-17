/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
/**
 *
 * @author Salvador
 */
@Controller
public class IndexController {

   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("index", "command", new Index());
   }
   
   @RequestMapping(value = "/addIndex", method = RequestMethod.POST)
   public String addIndex(@ModelAttribute("SpringWeb")Index index, 
   ModelMap model) {
      model.addAttribute("correo", index.getCorreo());
      model.addAttribute("password", index.getPassword());
      model.addAttribute("date", index.getDate());
      model.addAttribute("telefono", index.getTelefono());
      
      return "result";
   }
}
