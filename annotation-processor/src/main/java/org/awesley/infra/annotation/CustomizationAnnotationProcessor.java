package org.awesley.infra.annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes(value = {
	"org.awesley.infra.annotation.Customizable"
})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CustomizationAnnotationProcessor extends AbstractProcessor {

	private Messager messager;
	private Types typeUtils;
	private Boolean onlyWarn;

	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
		
		messager = processingEnv.getMessager();
		typeUtils = processingEnv.getTypeUtils();
		onlyWarn = Boolean.parseBoolean(processingEnv.getOptions().getOrDefault("custAnnotationWarn", "false"));
	}
	
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		System.out.println("INFO: Processing Customization Annotations");
		
		for (TypeElement annotation : annotations) {
			System.out.println("INFO: Processing annotation: " + annotation.getSimpleName());
			Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(annotation);
		}
		
		return false;
	}
}
