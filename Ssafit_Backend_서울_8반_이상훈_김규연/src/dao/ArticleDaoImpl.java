package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Article;

public class ArticleDaoImpl implements ArticleDao {
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	private List<Article> articles;
	private static int count;

	private ArticleDaoImpl() {
		articles = new ArrayList<Article>();
	}

	public static ArticleDaoImpl getInstance() {
		return instance;
	}

	@Override
	public void writeArticle(String videoId, String title, String content, String writer, int viewCnt,
			String timeStamp) {
		int articleNum = count++;
		Article tmp = new Article(videoId, articleNum, title, content, writer, viewCnt, timeStamp);
		articles.add(tmp);
	}

	private List<Article> articleList;

	@Override
	public List<Article> articleList(String videoId) {
		articleList = new ArrayList<>();
		for (int i = 0; i < articles.size(); i++) {
			Article tmp = articles.get(i);
			if (tmp.getVideoId().equals(videoId))
				articleList.add(tmp);
		}
		return articleList;
	}

	public void deleteArticle(int articleNum) {
		for (int i = 0; i < articles.size(); i++) {
			Article tmp = articles.get(i);
			if (tmp.getArticleNum() == articleNum) {
				articles.remove(i);
				return;
			}
		}
	}

	@Override
	public void updateArticle(int articleNum, String title, String content) {
		for (int i = 0; i < articles.size(); i++) {
			Article tmp = articles.get(i);
			if (tmp.getArticleNum() == articleNum) {
				tmp.setTitle(title);
				tmp.setContent(content);
			}
		}
	}

	@Override
	public void viewCnt(int articleNum) {
		for (int i = 0; i < articles.size(); i++) {
			Article tmp = articles.get(i);
			if (tmp.getArticleNum() == articleNum) {
				tmp.setViewCnt(tmp.getViewCnt() + 1);
			}
		}

	}

	@Override
	public Article getArticle(int articleNum) {
		for (int i = 0; i < articles.size(); i++) {
			Article tmp = articles.get(i);
			if (tmp.getArticleNum() == articleNum) {
				return tmp;
			}
		}
		return null;
	}
}
