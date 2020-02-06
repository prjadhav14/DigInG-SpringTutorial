package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.domain.Reason;

@Service
public class MoodService {
	List<String> moods;
	Map<String,String> reasons;
	String currentMood;
	public MoodService(){
		moods=new ArrayList<String>();
		moods.add("Happy");
		moods.add("Sad");
		moods.add("Romatic");
		moods.add("Angry");
		moods.add("Annoyed");
		
		reasons= new HashMap<String,String>();
		reasons.put("Happy","It found no warnings today");
		reasons.put("Sad","It found many error today");
		reasons.put("Romatic","It learnt to play songs");
		reasons.put("Angry","It got stuck in a never ending loop");
		reasons.put("Annoyed","It has to compile same code again and again");
		
	}
	public Mood getCurrentMood(){
		Random rand=new Random();
		currentMood=moods.get(rand.nextInt(moods.size()));
		return new Mood(currentMood);
	}
	
	public Reason getDescription(String mood){
		for(String keys : reasons.keySet()) {
			if(keys.equalsIgnoreCase(mood)) {
				return new Reason(reasons.get(keys));
			}
		}
		return new Reason("Reason not found");
	}
}
