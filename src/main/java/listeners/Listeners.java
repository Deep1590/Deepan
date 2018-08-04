package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Listeners implements IAnnotationTransformer,IRetryAnalyzer{
	
	int retry=1;

	@Override
	public void transform(ITestAnnotation annotations, Class testclass, Constructor testconstructor, Method testmethod) {
		
		
		annotations.setRetryAnalyzer(this.getClass());
		annotations.setInvocationCount(1);
		if(!testmethod.getName().equalsIgnoreCase("createLead"))
		{
			annotations.setEnabled(false);
		}
		}
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retry<2)
		{
			retry++;
			return true;
		}
		else 
		{
		return false;
		}
	}

	
		
	}


