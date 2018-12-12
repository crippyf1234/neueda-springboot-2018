package uk.ac.belfastmet.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;

@Controller
@RequestMapping()
public class WeatherController {
	
	@GetMapping("/weather/{location}")
	public String belfast(@PathVariable("location") String location, Model model) {
		
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=" + location;
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl,  TodaysWeather.class);
		
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.toString());
		model.addAttribute("pageTitle", location);
		model.addAttribute("todaysWeather", todaysWeather);
		return "weather";
		
	}
	
	@GetMapping("/weather/locationsearch")
	public String locationSearch(@RequestParam("category") String category, Model model) {
		
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=" + category;
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl,  TodaysWeather.class);
		
		model.addAttribute("pageTitle", category);
		model.addAttribute("todaysWeather", todaysWeather);
		model.addAttribute("image", category + ".jpg");
		
		return "weather";
	}
	
}
