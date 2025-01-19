//package vn.ktn3_shop.util;
//
//import com.nimbusds.jose.util.Base64;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.oauth2.jwt.JwtEncoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import javax.crypto.spec.SecretKeySpec;
//
//@Component
//public class SecurityUtil {
//    private final JwtEncoder jwtEncoder;
//
//    public SecurityUtil(JwtEncoder jwtEncoder){
//        this.jwtEncoder = jwtEncoder;
//    }
//
//    public static final MacAlgorithm JWT_ALGORITHM = MacAlgorithm.HS256;
//
//    @Value("${ktn3_shop.jwt.base64-secret}")
//    private String jwtKey;
//
//    @Value("${ktn3_shop.jwt.access-token-validity-in-seconds}")
//    private long accessTokenExpiration;
//
//    @Value("${ktn3_shop.jwt.refresh-token-validity-in-seconds}")
//    private long refreshTokenExpiration;
//
//    private SecretKey getSecretKey() {
//        byte[] keyBytes = Base64.from(jwtKey).decode();
//        return new SecretKeySpec(keyBytes, 0, keyBytes.length,
//                JWT_ALGORITHM.getName());
//    }
//
//    public Jwt checkValidRefreshToken(String token){
//        NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withSecretKey(
//                getSecretKey()).macAlgorithm(SecurityUtil.JWT_ALGORITHM).build();
//        try {
//            return jwtDecoder.decode(token);
//        } catch (Exception e) {
//            System.out.println(">>> Refresh Token error: " + e.getMessage());
//            throw e;
//        }
//    }
//}
