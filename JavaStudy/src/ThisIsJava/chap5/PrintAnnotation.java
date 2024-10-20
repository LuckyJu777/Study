//어노테이션 = metadata
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
//Target 메소드에만 적용 Retention은 런타임 시까지
//어노테이션 정보를 유지하도록 함.
//value는 구분선에 사용될 문자
//number는 반복 출력 횟수