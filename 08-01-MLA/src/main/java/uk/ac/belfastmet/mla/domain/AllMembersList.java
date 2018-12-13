package uk.ac.belfastmet.mla.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {

	@JsonProperty("Member")
	private ArrayList<Member> members;
	
	public ArrayList<Member> getByConstituency(String constituency){
		
		ArrayList<Member> byConstituency = new ArrayList<Member>();
		
		for(int i = 0 ; i < this.members.size() ; i++) {
			if(members.get(i).getConstituencyName().equals(constituency)) {
				byConstituency.add(members.get(i));
			}
		}
		
		return byConstituency;
		
	}
	
}
