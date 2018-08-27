package io.jpress.module.article.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticle<M extends BaseArticle<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setPid(java.lang.Integer pid) {
		set("pid", pid);
	}
	
	public java.lang.Integer getPid() {
		return getInt("pid");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}
	
	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}
	
	public java.lang.String getText() {
		return getStr("text");
	}

	public void setEditMode(java.lang.String editMode) {
		set("edit_mode", editMode);
	}
	
	public java.lang.String getEditMode() {
		return getStr("edit_mode");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}
	
	public java.lang.String getSummary() {
		return getStr("summary");
	}

	public void setLinkTo(java.lang.String linkTo) {
		set("link_to", linkTo);
	}
	
	public java.lang.String getLinkTo() {
		return getStr("link_to");
	}

	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}
	
	public java.lang.String getThumbnail() {
		return getStr("thumbnail");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}
	
	public java.lang.String getStyle() {
		return getStr("style");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setOrderNumber(java.lang.Long orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Long getOrderNumber() {
		return getLong("order_number");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}
	
	public java.lang.Long getVoteUp() {
		return getLong("vote_up");
	}

	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}
	
	public java.lang.Long getVoteDown() {
		return getLong("vote_down");
	}

	public void setRate(java.lang.Integer rate) {
		set("rate", rate);
	}
	
	public java.lang.Integer getRate() {
		return getInt("rate");
	}

	public void setRateCount(java.lang.Long rateCount) {
		set("rate_count", rateCount);
	}
	
	public java.lang.Long getRateCount() {
		return getLong("rate_count");
	}

	public void setCommentStatus(java.lang.Boolean commentStatus) {
		set("comment_status", commentStatus);
	}
	
	public java.lang.Boolean getCommentStatus() {
		return get("comment_status");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}
	
	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

	public void setCommentTime(java.util.Date commentTime) {
		set("comment_time", commentTime);
	}
	
	public java.util.Date getCommentTime() {
		return get("comment_time");
	}

	public void setViewCount(java.lang.Long viewCount) {
		set("view_count", viewCount);
	}
	
	public java.lang.Long getViewCount() {
		return getLong("view_count");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}
	
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}
	
	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}
	
	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

}
