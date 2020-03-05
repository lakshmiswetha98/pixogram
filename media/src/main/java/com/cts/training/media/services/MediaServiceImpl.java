package com.cts.training.media.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.media.entity.Media;
import com.cts.training.media.repository.MediaRepository;


@Service
public class MediaServiceImpl implements IMediaService{

	@Autowired
	private MediaRepository mediaRepository;

	@Override
	public List<Media> findAllMedia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Media findMediaById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addMedia(Media media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMedia(Media media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMedia(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

