package uk.ac.belfastmet.belfasteventswebsite.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Events {
	
	private String identifier;
	private String url;
	private String title;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
}
