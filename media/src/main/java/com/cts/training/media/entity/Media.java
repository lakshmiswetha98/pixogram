package com.cts.training.media.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Media")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer UserId;
	@Column
	private String Title;
	@Column
	private String Description;
	@Column
	private Integer Mimetype;
	@Column
	private Integer size;
	@Column
	private String posterFileUrl;
	@Column
	private String fileUrl;
	@Column
	private Boolean hide;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	@Column
	@UpdateTimestamp
	private LocalDateTime updatedOn;
	@Column
	private String tags;
	
}
