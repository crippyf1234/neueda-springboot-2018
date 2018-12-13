package uk.ac.belfastmet.mla.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersAPI {
	
	@JsonProperty("AllMembersList")
	private AllMembersList allMembersList;

}
