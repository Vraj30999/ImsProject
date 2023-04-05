package com.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Candidate;
import com.ims.entity.Developer;
import com.ims.service.CandidateService;
import com.ims.vo.CandidateVo;


@RestController
public class CandidateController {
	
	@Autowired
	private CandidateService candidateservice;
	
	//Post Candidate
	@PostMapping("/candidate")
	public CandidateVo addCandidate(@RequestBody CandidateVo candidatevo) {
		return this.candidateservice.addCandidate(candidatevo);	
	}
	
	//Get Candidate
	@GetMapping("/candidate")
	public List<CandidateVo> getCandidate(){
		return this.candidateservice.getCandidate();
	}
	
	//Update Candidate
	@PutMapping("/candidate")
	public CandidateVo updateCandidate(@RequestBody CandidateVo candidatevo) {
		return this.candidateservice.updateCandidate(candidatevo);
	}
	
	//Delete Candidate
	@DeleteMapping("/candidate/{candidateid}")
	public Candidate deleteCandidate(@PathVariable ("candidateid")int candidateid ) {
		return this.candidateservice.deleteCandidate(candidateid);
	}

}
