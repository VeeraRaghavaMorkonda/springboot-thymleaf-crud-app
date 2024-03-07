package com.veera.gcpservicemapping.controller;


import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veera.gcpservicemapping.entity.ServiceMappingEntity;
import com.veera.gcpservicemapping.repository.ServiceMappingRepository;

@Controller
@RequestMapping("/")
public class ServiceMappingController {

	private final ServiceMappingRepository serviceMappingRepository;

	public ServiceMappingController(ServiceMappingRepository serviceMappingRepository) {
		this.serviceMappingRepository = serviceMappingRepository;
	}

	@GetMapping("gcp-app-form")
	public String showAppForm(ServiceMappingEntity serviceMappingEntity) {
		return "add-app";
	}

	@GetMapping("")
	public String showUpdateForm(Model model) {
		model.addAttribute("apps", serviceMappingRepository.findAll());
		return "index";
	}

	@PostMapping("add-gcp-app")
	public String addServiceMappingEntity(@Valid ServiceMappingEntity serviceMappingEntity, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-app";
		}

		serviceMappingRepository.save(serviceMappingEntity);
		return "redirect:";
	}

	@GetMapping("gcp-app-edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		ServiceMappingEntity serviceMappingEntity = serviceMappingRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid App Id:" + id));
		model.addAttribute("apps", serviceMappingEntity);
		return "update-app";
	}

	@PostMapping("gcp-app-update/{id}")
	public String updateServiceMappingEntity(@PathVariable("id") long id, @Valid ServiceMappingEntity serviceMappingEntity, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			serviceMappingEntity.setId(id);
			return "update-app";
		}

		serviceMappingRepository.save(serviceMappingEntity);
		model.addAttribute("apps", serviceMappingRepository.findAll());
		return "index";
	}

	@GetMapping("gcp-app-delete/{id}")
	public String deleteServiceMappingEntity(@PathVariable("id") long id, Model model) {
		ServiceMappingEntity serviceMappingEntity = serviceMappingRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid app Id:" + id));
		serviceMappingRepository.delete(serviceMappingEntity);
		model.addAttribute("apps", serviceMappingRepository.findAll());
		return "index";
	}
}
