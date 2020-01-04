package br.com.ivo.awesome.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;
@Component
public class DateUtil {
	public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localdateTime) {
		return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(localdateTime);
	}
}
