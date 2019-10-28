package com.keylane.view.model;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.util.Clients;

import com.keylane.components.Triangle;
import com.keylane.components.TriangleType;
import com.keylane.engine.KeylaneException;
import com.keylane.engine.TriangleService;

/**
 * This is a View Model Class
 * ZK Binder binds it to the
 * index.zul page
 * during initialization.
 * @author Nikolaos Chantzopoulos
 * @version 0.1
 * @since   11-18-2017
 */
public class TriangleViewModel {

	private TriangleService triangleService;
	private Triangle triangle;
	

	/*
	 *  Marker annotation to identify a initial method.
	 *  Binder calls the method with this annotation when initializing a ViewModel.
	 */
	@Init
	public void init() {
		
		initialize();
	}
	
	
	public void initialize() {
		
		triangleService = new TriangleService();
		triangle = new Triangle(TriangleType.UNKNOWN, "");
		
	}

	/*
	 *  The ViewModel is an abstraction of the View. 
	 *  The View is responsible for displaying information and interacting with users.
	 *  The information corresponds to ViewModel's property and interaction corresponds to ViewModel's Command.
	 *  The Command is an action to manipulate ViewModel's property. 
	 *  Each command provides an action that the View can perform on ViewModel.
	 */
	@Command
	@NotifyChange("triangle")
	public void cmd() {
		
		boolean isValid = false;
		
		try {
			
			isValid = triangleService.determineIsValidTriangle(triangle.getSide1(), 
					triangle.getSide2(), triangle.getSide3());
			if(isValid) {
				triangle = triangleService.defineTriangleType(triangle.getSide1(), 
						triangle.getSide2(), triangle.getSide3());
			}
			else {
				Clients.showNotification("Not valid triangle", Clients.NOTIFICATION_TYPE_ERROR, null, null, 3000);
				triangle = new Triangle(TriangleType.UNKNOWN, "");
				
			}
			
		} catch (KeylaneException e) {
			
			triangle = new Triangle(TriangleType.UNKNOWN, "");
			Clients.showNotification(e.getMessage(), Clients.NOTIFICATION_TYPE_ERROR,null, null, 3000);
			
		}		

	}


	/*
	 *  Getters and Setters
	 *  A View Model class is actualy a POJO
	 *  communicating with the zul 
	 *  through the binder.
	 */
	public Triangle getTriangle() {
		return triangle;
	}


	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

	
}
