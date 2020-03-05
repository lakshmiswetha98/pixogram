package com.cts.training.media.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MediaModel {
		
	private Integer id;
	private Integer userId;
	private String title;
	private String description;
	private String tags;
	private String type;
	private String file;
}

