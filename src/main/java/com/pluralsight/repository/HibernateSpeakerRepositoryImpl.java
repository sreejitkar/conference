package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	@Autowired
	private Calendar cal;

	public List<Speaker> findAll() {

		List<Speaker> speakers = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();

		speaker.setFirstName("Sreejit");
		speaker.setLastName("Kar");

		speakers.add(speaker);

		System.out.println("Cal : " + cal.getTime());

		return speakers;

	}

}
