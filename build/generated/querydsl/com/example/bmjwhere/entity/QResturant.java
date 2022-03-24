package com.example.bmjwhere.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QResturant is a Querydsl query type for Resturant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResturant extends EntityPathBase<Resturant> {

    private static final long serialVersionUID = -195276768L;

    public static final QResturant resturant = new QResturant("resturant");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final StringPath operatingTime = createString("operatingTime");

    public final StringPath phoneNumber = createString("phoneNumber");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final NumberPath<Long> rno = createNumber("rno", Long.class);

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QResturant(String variable) {
        super(Resturant.class, forVariable(variable));
    }

    public QResturant(Path<? extends Resturant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResturant(PathMetadata metadata) {
        super(Resturant.class, metadata);
    }

}

