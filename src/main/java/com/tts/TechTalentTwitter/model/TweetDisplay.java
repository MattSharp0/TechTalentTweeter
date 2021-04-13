package com.tts.TechTalentTwitter.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TweetDisplay {
	
	private User user;
	private String date;
	private String message;
	private List<Tag> tags;
}
