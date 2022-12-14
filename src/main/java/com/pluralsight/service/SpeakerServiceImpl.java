package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired
	private SpeakerRepository repository;

	public List<Speaker> findAll() {
		return repository.findAll();
	}

	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl repostiory constructor");
		repository = speakerRepository;

	}

//	public SpeakerRepository getRepository() {
//		return repository;
//	}

	@PostConstruct
	private void initialize() {
		System.out.println("We are called after constructors");
	}

	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}

}
