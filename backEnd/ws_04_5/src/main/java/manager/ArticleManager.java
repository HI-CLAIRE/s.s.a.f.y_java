package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.Article;
import dto.Comment;

public class ArticleManager {
	private static ArticleManager instance = new ArticleManager();
	private List<Article> articles;
	private Map<Integer, List<Comment>> comments;
	private int articleId;
	
	private ArticleManager() {
		articles = new ArrayList<Article>();
		comments = new HashMap<>();
	}
	
	public static ArticleManager getInstance() {
		return instance;
	}
	
	public Article getArticle(int articleId) {
		for(int i=0; i<articles.size(); i++) {
			if(articles.get(i).getArticleId() == articleId) {
				return articles.get(articleId);
			}
		}
		return null;
	}
	
	public void addArticle(Article article) {
		article.setArticled(++articleId);
		articles.add(article);
	}
	
	public List<Article> getAllArticle() {
		return articles;
	}
}
