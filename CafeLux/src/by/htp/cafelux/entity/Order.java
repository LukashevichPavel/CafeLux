package by.htp.cafelux.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Order {
private Long orderId;
private Long userId;
private int tableId;
private ArrayList<Course> course;
private Date date;
private Time time;
private Date dateTimeClose;
private String status;

public Order() {
	super();
	
}

public Order(Long orderId, Long userId, int tableId, ArrayList<Course> course, Date date, Time time, Date dateTimeClose,
		String status) {
	super();
	this.orderId = orderId;
	this.userId = userId;
	this.tableId = tableId;
	this.course = course;
	this.date = date;
	this.time = time;
	this.dateTimeClose = dateTimeClose;
	this.status = status;
}

public Long getOrderId() {
	return orderId;
}

public void setOrderId(Long orderId) {
	this.orderId = orderId;
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public int getTableId() {
	return tableId;
}

public void setTableId(int tableId) {
	this.tableId = tableId;
}

public ArrayList<Course> getCourse() {
	return course;
}

public void setCourse(ArrayList<Course> course) {
	this.course = course;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Time getTime() {
	return time;
}

public void setTime(Time time) {
	this.time = time;
}

public Date getDateTimeClose() {
	return dateTimeClose;
}

public void setDateTimeClose(Date dateTimeClose) {
	this.dateTimeClose = dateTimeClose;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((course == null) ? 0 : course.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((dateTimeClose == null) ? 0 : dateTimeClose.hashCode());
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + tableId;
	result = prime * result + ((time == null) ? 0 : time.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	if (course == null) {
		if (other.course != null)
			return false;
	} else if (!course.equals(other.course))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (dateTimeClose == null) {
		if (other.dateTimeClose != null)
			return false;
	} else if (!dateTimeClose.equals(other.dateTimeClose))
		return false;
	if (orderId == null) {
		if (other.orderId != null)
			return false;
	} else if (!orderId.equals(other.orderId))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (tableId != other.tableId)
		return false;
	if (time == null) {
		if (other.time != null)
			return false;
	} else if (!time.equals(other.time))
		return false;
	if (userId == null) {
		if (other.userId != null)
			return false;
	} else if (!userId.equals(other.userId))
		return false;
	return true;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", userId=" + userId + ", tableId=" + tableId + ", course=" + course
			+ ", date=" + date + ", time=" + time + ", dateTimeClose=" + dateTimeClose + ", status=" + status + "]";
}


}
