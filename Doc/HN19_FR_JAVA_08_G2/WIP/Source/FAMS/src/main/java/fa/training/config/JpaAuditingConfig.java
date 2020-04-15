package fa.training.config;

//@Configuration
//@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
	
//	@Bean
//	public AuditorAware<String> auditorProvider() {
//		return new AuditorAwareImpl();
//	}
//	
//	//return ten nguoi sua, hay tao
//	public static class AuditorAwareImpl implements AuditorAware<String>{
//
//		@Override
//		public Optional<String> getCurrentAuditor() {
//			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//			if (null == authentication) {
//				return null;
//			}
//			return Optional.of(authentication.getName());
//		}
//		
//	}
	
	
}
