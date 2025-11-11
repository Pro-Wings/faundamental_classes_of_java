package com.prowings.custom.markerinteface;

public class DeletionManager {
	
	 public static void delete(Object obj) throws DeleteNotSupportedException {
		 
	        if (obj instanceof Deletable) 
	        {
	            System.out.println(obj.getClass().getSimpleName() + " deleted successfully.");
	        } 
	        else 
	        {
	            throw new DeleteNotSupportedException("Object of type " + obj.getClass().getSimpleName() + " cannot be deleted.");
	        }
	    }

}
