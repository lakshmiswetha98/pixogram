package com.cts.training.media.controller;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.media.entity.Media;
import com.cts.training.media.services.IMediaService;


@RestController
public class MediaController {

	
	private Logger logger  = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IMediaService mediaService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/media") // GET HTTP VERB
	public ResponseEntity<List<Media>> exposeAll() {
		
		List<Media> media = this.mediaService.findAllMedia();
		ResponseEntity<List<Media>> response = 
								new ResponseEntity<List<Media>>(media, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/media/{mediaId}") // GET HTTP VERB
	public ResponseEntity<Media> getById(@PathVariable Integer mediaId) {
		
		Media media = this.mediaService.findMediaById(mediaId);
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/media") // POST HTTP VERB
	public ResponseEntity<Media> save(@RequestBody Media media) {
		this.mediaService.addMedia(media);
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	@PutMapping("/media")
	public ResponseEntity<Media> saveUpdate(@RequestBody Media media) {
		this.mediaService.updateMedia(media);
			
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/media/{mediaId}")
	public ResponseEntity<Media> delete(@PathVariable Integer mediaId) {
		
		Media media = this.mediaService.findMediaById(mediaId);
		this.mediaService.deleteMedia(mediaId);
		
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
}
















