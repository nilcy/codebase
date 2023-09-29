package mvp.domain

import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLogin(login: String): Customer?
}
