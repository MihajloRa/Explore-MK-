package com.example.tech_prototype.Model;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.locationtech.jts.geom.Geometry;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "Points")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "geom")
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    private Geometry geom;

    @Column(name = "full_id", length = 254)
    private String fullId;

    @Column(name = "osm_id", length = 254)
    private String osmId;

    @Column(name = "osm_type", length = 254)
    private String osmType;

    @Column(name = "tourism", length = 254)
    private String tourism;

    @Column(name = "amenity", length = 254)
    private String amenity;

    @Column(name = "highway", length = 254)
    private String highway;

    @Column(name = "food", length = 254)
    private String food;

    @Column(name = "cocktails", length = 254)
    private String cocktails;

    @Column(name = "memorial", length = 254)
    private String memorial;

    @Column(name = "artwork_ty", length = 254)
    private String artworkTy;

    @Column(name = "artist_nam", length = 254)
    private String artistNam;

    @Column(name = "direction", length = 254)
    private String direction;

    @Column(name = "name_mk", length = 254)
    private String nameMk;

    @Column(name = "place", length = 254)
    private String place;

    @Column(name = "alt_name", length = 254)
    private String altName;

}