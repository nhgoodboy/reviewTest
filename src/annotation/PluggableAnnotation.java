package annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target(TYPE)
@interface ClassLevelAnnotation {

}

@Target(METHOD)
@interface MethodLevelAnnotation {
	
}

@SupportedAnnotationTypes(value={"*"})
@SupportedSourceVersion(value = SourceVersion.RELEASE_6)
public class PluggableAnnotation extends AbstractProcessor{

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for(TypeElement element : annotations) {
			System.out.println(element.getQualifiedName());
		}
		return true;
	}
	
}
