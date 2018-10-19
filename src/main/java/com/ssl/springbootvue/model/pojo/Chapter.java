package com.ssl.springbootvue.model.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * chapter
 * @author 
 */
public class Chapter implements Serializable {
    /**
     * 章节id
     */
    private String id;

    /**
     * 书籍id
     */
    private String bookId;

    /**
     * 第几章【数字1、2、3...】
     */
    private Integer chapterSortId;

    /**
     * 章节名
     */
    private String name;

    /**
     * 章节简介
     */
    private String description;

    /**
     * 章节内容地址
     */
    private String contentUrl;

    /**
     * 作者id
     */
    private String authorId;

    /**
     * 上个章节id
     */
    private String previousChapter;

    /**
     * 状态【0：删除；1：存在】
     */
    private String status;

    /**
     * 阅读次数
     */
    private Integer lookTimes;

    /**
     * 举报次数
     */
    private Integer report;

    /**
     * 创建 时间
     */
    private Date createTime;

    /**
     * 创建用户
     */
    private String createUserId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新用户
     */
    private String updateUserId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getChapterSortId() {
        return chapterSortId;
    }

    public void setChapterSortId(Integer chapterSortId) {
        this.chapterSortId = chapterSortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getPreviousChapter() {
        return previousChapter;
    }

    public void setPreviousChapter(String previousChapter) {
        this.previousChapter = previousChapter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLookTimes() {
        return lookTimes;
    }

    public void setLookTimes(Integer lookTimes) {
        this.lookTimes = lookTimes;
    }

    public Integer getReport() {
        return report;
    }

    public void setReport(Integer report) {
        this.report = report;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Chapter other = (Chapter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getChapterSortId() == null ? other.getChapterSortId() == null : this.getChapterSortId().equals(other.getChapterSortId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getContentUrl() == null ? other.getContentUrl() == null : this.getContentUrl().equals(other.getContentUrl()))
            && (this.getAuthorId() == null ? other.getAuthorId() == null : this.getAuthorId().equals(other.getAuthorId()))
            && (this.getPreviousChapter() == null ? other.getPreviousChapter() == null : this.getPreviousChapter().equals(other.getPreviousChapter()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLookTimes() == null ? other.getLookTimes() == null : this.getLookTimes().equals(other.getLookTimes()))
            && (this.getReport() == null ? other.getReport() == null : this.getReport().equals(other.getReport()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getChapterSortId() == null) ? 0 : getChapterSortId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getContentUrl() == null) ? 0 : getContentUrl().hashCode());
        result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
        result = prime * result + ((getPreviousChapter() == null) ? 0 : getPreviousChapter().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLookTimes() == null) ? 0 : getLookTimes().hashCode());
        result = prime * result + ((getReport() == null) ? 0 : getReport().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookId=").append(bookId);
        sb.append(", chapterSortId=").append(chapterSortId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append(", authorId=").append(authorId);
        sb.append(", previousChapter=").append(previousChapter);
        sb.append(", status=").append(status);
        sb.append(", lookTimes=").append(lookTimes);
        sb.append(", report=").append(report);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}