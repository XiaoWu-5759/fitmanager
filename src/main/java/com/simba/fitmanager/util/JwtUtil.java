//package com.simba.fitmanager.util;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class JwtUtil {
//    static final String secret = "secret";
//
//    public static String generateToken(String username) {
//        HashMap<String, Object> map = new HashMap<>();
//        //you can put any data in the map
//        map.put("username", username);
//        String jwt = Jwts.builder()
//                .setClaims(map)
//                .setExpiration(new Date(System.currentTimeMillis() + 3600_000_000L))// 1000 hour
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//        return "Bearer "+jwt; //jwt前面一般都会加Bearer
//    }
//
//    public static void validateToken(String token) {
//        try {
//            // parse the token.
//            Map<String, Object> body = Jwts.parser()
//                    .setSigningKey(secret)
//                    .parseClaimsJws(token.replace("Bearer ",""))
//                    .getBody();
//        }catch (Exception e){
//            throw new IllegalStateException("Invalid Token. "+e.getMessage());
//        }
//    }
//}
