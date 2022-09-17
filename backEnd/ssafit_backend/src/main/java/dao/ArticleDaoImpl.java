package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Article;

public class ArticleDaoImpl implements ArticleDao {
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	private List<Article> articles;
	private ArticleDaoImpl() {
		articles = new ArrayList<Article>();
	}
	
	public static ArticleDaoImpl getInstance() {
		return instance;
	}

	@Override
	public void writeArticle(String videoId, int articleNum, String title, String content, String writer, int viewCnt, String timeStamp) {
		Article tmp = new Article(videoId, articleNum, title, content, writer, viewCnt, timeStamp);
		articles.add(tmp);
	}

	private List<Article> articleList;
	@Override
	public List<Article> articleList(String videoId) {
		articleList = new ArrayList<>();
		for(int i=0; i<articles.size(); i++) {
			Article tmp = articles.get(i);
			if(tmp.getVideoId().equals(videoId)) articleList.add(tmp);
		}
		return articleList;
	}

	@Override
	public void updateArticle(int articleNum, String title, String content) {
		for(int i=0; i<articles.size(); i++) {
			Article tmp = articles.get(i);
			if(tmp.getArticleNum() == articleNum) {
				tmp.setContent(title);
				tmp.setContent(content);
			}
		}
	}
	
	public void deleteArticle(int articleNum) {
	    articles.set(articleNum, null);
	}
	
}
