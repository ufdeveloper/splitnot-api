package com.megshan.splitnot.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import lombok.Data;

import static com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType.S;

/**
 * Created by shantanu on 6/28/18.
 *
 * This is the user domain object for the user using the splitnot app.
 *
 */

@Data
//@DynamoDBTable(tableName = "users")
public class User {

    @DynamoDBHashKey
    @DynamoDBTyped(S)
    private Long userKey;

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String lastName;
}
