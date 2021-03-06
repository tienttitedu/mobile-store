package org.mobile.image.service;

import org.mobile.image.model.Image;
import org.mobile.image.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	private ImageRepository imageRepository;

	@Transactional
	public Image findOne(int id) {
		return imageRepository.findOne(id);
	}
}
