package net.atos.model;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PartenaireAcad.class, name = "partenaireacad"),
        @JsonSubTypes.Type(value = PartenaireIndus.class, name = "partenaireindus")
})
public abstract class Partenaire {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;

        @Column(name = "name", nullable = false)
        String name;

        @Column(name = "description", nullable = false)
        String description;

        @Column(name = "year", nullable = false)
        String year;

        @Column(name = "url", nullable = false)
        String url;

        @Column(name = "image_url", nullable = false)
        String image_url;

        @Column(name = "sector")
        @ManyToMany(cascade = CascadeType.ALL)
        List<Sector> listSector;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getYear() {
            return year;
        }

        public String getUrl() {
            return url;
        }

        public String getImage_url() {
            return image_url;
        }


        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public List<Sector> getListSector() {
            return listSector;
        }

        public void setListSector(List<Sector> listSector) {
            this.listSector = listSector;
        }
}
