package com.example.bmjwhere.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResturantImage is a Querydsl query type for ResturantImage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResturantImage extends EntityPathBase<ResturantImage> {

    private static final long serialVersionUID = 598244635L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResturantImage resturantImage = new QResturantImage("resturantImage");

    public final StringPath imgName = createString("imgName");

    public final NumberPath<Long> inum = createNumber("inum", Long.class);

    public final StringPath path = createString("path");

    public final QResturant resturant;

    public final StringPath uuid = createString("uuid");

    public QResturantImage(String variable) {
        this(ResturantImage.class, forVariable(variable), INITS);
    }

    public QResturantImage(Path<? extends ResturantImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResturantImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResturantImage(PathMetadata metadata, PathInits inits) {
        this(ResturantImage.class, metadata, inits);
    }

    public QResturantImage(Class<? extends ResturantImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.resturant = inits.isInitialized("resturant") ? new QResturant(forProperty("resturant")) : null;
    }

}

