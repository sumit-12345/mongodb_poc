package com.test.mongodb.mongodb_poc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.test.mongodb.mongodb_poc.dto.EnrolmentDTO;
import com.test.mongodb.mongodb_poc.dto.ExperienceDTO;
import com.test.mongodb.mongodb_poc.dto.PreferenceDTO;
import com.test.mongodb.mongodb_poc.dto.ProductExperienceDTO;
import com.test.mongodb.mongodb_poc.model.Enrolment;
import com.test.mongodb.mongodb_poc.model.Preference;
import com.test.mongodb.mongodb_poc.repo.EnrolmentRepository;
import com.test.mongodb.mongodb_poc.repo.PreferencesRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ)
@AllArgsConstructor
public class EntolmentService {
	
	private EnrolmentRepository enrolmentRepository;
	private PreferencesRepository preferencesRepository;
	
	public boolean enroleProduct(ProductExperienceDTO inc,List<ProductExperienceDTO> existing) {
		Enrolment enrolment = new Enrolment();
		List<Preference> preferencesList = new ArrayList<Preference>();
		for(ProductExperienceDTO pDto:existing) {
			if(inc.getProductId()==pDto.getProductId()) {
				enrolment.setEnrolmentResourceKey("src:Express:Enrolment:342");
				int productId = new Random().nextInt();
				enrolment.setEnrolmentId(productId);
				enrolment.setStatus("active");
				Enrolment enr = enrolmentRepository.save(enrolment);
				for(ExperienceDTO experienceDTO : pDto.getExperiences()) {
					for(ExperienceDTO experienceDTO2:inc.getExperiences()) {
						if(experienceDTO.getExperienceId()==experienceDTO2.getExperienceId()) {
							Preference preference = new Preference();
							preference.setEnrolmentId(enr.getEnrolmentId());
							preference.setExperienceId(experienceDTO.getExperienceId());
							preference.setPreferenceId(getRandomInteger());
							preference.setStatus("active");
							preference.setExperienceName(experienceDTO.getExperienceName());
							preferencesList.add(preference);		
						}
					}
				}
				break;
			}
		}
		List<Preference> pref = preferencesRepository.saveAll(preferencesList);
		return true;
	}
	
	public List<EnrolmentDTO> getEnrolments() {
		List<Enrolment> enrolments = enrolmentRepository.findAll();
		List<EnrolmentDTO> enrolmentDTOs = new ArrayList<>();
		for(Enrolment enrolment : enrolments) {
			EnrolmentDTO enrolmentDTO = new EnrolmentDTO();
			enrolmentDTO.setEnrolmentId(enrolment.getEnrolmentId());
			enrolmentDTO.setStatus(enrolment.getStatus());
			enrolmentDTO.setCancelReason(enrolment.getCancelReason());
			enrolmentDTO.setCancelTarget(enrolment.getCancelTarget());
			List<PreferenceDTO> preferenceDTOs = new ArrayList<>();
			for(PreferenceDTO pDto:this.getPreferenceDTOs()) {
				if(pDto.getEnrolmentId()==enrolment.getEnrolmentId()) 
					preferenceDTOs.add(pDto);
			}
			enrolmentDTO.setPreferenceDTO(preferenceDTOs);
			enrolmentDTOs.add(enrolmentDTO);
		}
		return enrolmentDTOs;
	}
	
	public List<PreferenceDTO> getPreferenceDTOs() {
		List<Preference> preferences = preferencesRepository.findAll();
		List<PreferenceDTO> preferenceDTOs = new ArrayList<>();
		for(Preference preference : preferences) {
			PreferenceDTO preferenceDTO = new PreferenceDTO();
			preferenceDTO.setEnrolmentId(preference.getEnrolmentId());
			preferenceDTO.setExperienceId(preference.getExperienceId());
			preferenceDTO.setStatus(preference.getStatus());
			preferenceDTO.setExperienceName(preference.getExperienceName());
			preferenceDTOs.add(preferenceDTO);
		}
		return preferenceDTOs;
	}
	
	private int getRandomInteger() {
		Random random = new Random();
		int rand = 0;
		while (true){
		    rand = random.nextInt(100);
		    if(rand !=0) break;
		}
	return rand;
	}
}
