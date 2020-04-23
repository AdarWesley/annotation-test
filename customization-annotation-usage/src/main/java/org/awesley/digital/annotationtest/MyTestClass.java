package org.awesley.digital.annotationtest;

import org.awesley.infra.annotation.Customizable;

@Customizable(name = "myBean", beanType = MyTestClass.class)
public class MyTestClass {
	public MyTestClass() {
		
	}

}
