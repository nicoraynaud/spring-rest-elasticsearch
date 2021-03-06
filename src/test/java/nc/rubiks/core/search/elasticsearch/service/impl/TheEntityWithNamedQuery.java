package nc.rubiks.core.search.elasticsearch.service.impl;

import nc.rubiks.core.search.elasticsearch.annotation.ElasticsearchDocument;

import java.util.Objects;

/**
 * Created by 2617ray on 03/05/2017.
 */
@ElasticsearchDocument(synced = true, namedQuery = "theNamedQuery")
public class TheEntityWithNamedQuery {

    private Long id;
    private String prop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TheEntityWithNamedQuery id(Long id) {
        this.id = id;
        return this;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public TheEntityWithNamedQuery prop(String prop) {
        this.prop = prop;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheEntityWithNamedQuery theEntity = (TheEntityWithNamedQuery) o;
        return Objects.equals(id, theEntity.id) &&
            Objects.equals(prop, theEntity.prop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prop);
    }
}
