package com.cts.training.media.services;

import java.util.List;

import com.cts.training.media.entity.Media;



public interface IMediaService {
	List<Media> findAllMedia();
	Media findMediaById(Integer id);
	boolean addMedia(Media media);
	boolean updateMedia(Media media);
	boolean deleteMedia(Integer id);


}
