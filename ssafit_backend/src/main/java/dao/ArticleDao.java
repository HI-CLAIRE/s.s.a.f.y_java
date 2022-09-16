package dao;

import java.util.List;

import dto.Article;

public interface ArticleDao{
	public void writeArticle(String videoId, int articleNum, String title, String content, String writer, int viewCnt, String timeStamp);
	public void updateArticle(int articleNum, String title, String content);
	public List<Article> articleList(String videoId);
	public void deleteArticle(int articleNum);

}
