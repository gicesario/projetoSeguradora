package br.com.seguradoraGisela.seguradoraGisela.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import com.mongodb.lang.NonNull;

public abstract class EntidadeBase {

	@Id
	@NonNull
	private String Id;

	@CreatedDate
	public LocalDateTime insertDate;

	@LastModifiedDate
	public LocalDateTime updateDate;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public LocalDateTime getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(LocalDateTime insertDate) {
		this.insertDate = insertDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}



}
