package br.edu.ifpb.pweb2.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

public class CodCurso {

	@Constraint(validateBy=CodCursoConstraintValidator.class)
	@target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface CodCurso{
		public String value() default "TSI";
		public String message() default "Deve iniciar por TSI";
		public Class<?>[] groups() default {};
		public Class<? extends Payload>[] payload() default {};
	}
}
