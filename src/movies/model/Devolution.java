package movies.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Devolution {
	
	private LocalDateTime expectedDate;
	private LocalDateTime actualDate;
	private BigDecimal value;
 
	public Devolution(LocalDateTime expectedDate) {
		this.expectedDate = expectedDate;
	}

	public LocalDateTime getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(LocalDateTime expectedDate) {
		this.expectedDate = expectedDate;
	}

	public LocalDateTime getActualDate() {
		return actualDate;
	}

	public void setActualDate(LocalDateTime actualDate) {
		this.actualDate = actualDate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}	
}
