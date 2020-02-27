package packe;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class jwtToken_prepartion {

	public static void main(String[] args) {
		System.out.println("hello");
		
		byte[] secret = Base64.getDecoder().decode("cHJha2FzaEA1NDY3MXByYWthc2hANTQ2NzFwcmFrYXNoQDU0NjcxcHJha2FzaEA1NDY3MQ==");
		//GETTING CURRENT TIME
		Instant now = Instant.now();
		
         String jwt=	Jwts.builder()
		.setSubject("jwt").
		setAudience("kaluva").
		setIssuedAt(Date.from(now)).
		claim("NAME", "OMPRAKASH").
		claim("ID", "569")
		//setting expire time for one day of token
		.setExpiration(Date.from(now.plus(1,ChronoUnit.DAYS)))
		.signWith(Keys.hmacShaKeyFor(secret))		
		.compact();
       System.out.println(jwt);
       
       //parsing jwt token
       Jws<Claims> tokenParse =  (Jws<Claims>) Jwts.parser().setSigningKey(secret).parseClaimsJws(jwt);
       System.out.println(tokenParse);
       System.out.println(tokenParse.getBody().get("NAME"));
       System.out.println(tokenParse.getBody().get("ID"));
       
       
	}

}
