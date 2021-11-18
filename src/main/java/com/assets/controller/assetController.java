package com.assets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.assets.model.Asset;
import com.assets.service.AssetService;


public class assetController {
	@Autowired
	AssetService assetService;
	@GetMapping("/api/asset")
	private List<Asset> getAllAsset(){
		return assetService.getAllAsset();
	}
	@GetMapping("/api/asset/{name}")
	private List<Asset> getAllAsset(){
		
		return assetService.getAllAsset();
	}
}
