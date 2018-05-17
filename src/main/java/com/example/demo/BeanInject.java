package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanInject {
	
	    @Value("${book.another}")
	    private String another;
	    
	    @Value("${book.name}")
	    private String name;

	    public String getAnother() {
	        return another;
	    }

	    public void setAnother(String another) {
	        this.another = another;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
