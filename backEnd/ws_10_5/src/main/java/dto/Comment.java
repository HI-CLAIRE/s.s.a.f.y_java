package dto;

public class Comment {
	private int commentId;
	private int articleId;
	private int userSeq;
	private String content;
	private String userName;
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Comment() {
		super();
	}


	public Comment( int articleId, int userSeq, String content) {
		super();
		this.articleId = articleId;
		this.userSeq = userSeq;
		this.content = content;
	}



	public int getCommentId() {
		return commentId;
	}



	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}



	public int getArticleId() {
		return articleId;
	}



	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}



	public int getUserSeq() {
		return userSeq;
	}



	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}




	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", articleId=" + articleId + ", userSeq=" + userSeq + ", content="
				+ content + "]";
	}
	
	
	
	
}
