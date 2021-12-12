/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Fruit;
import org.openapitools.client.model.NullableShape;
import org.openapitools.client.model.Shape;
import org.openapitools.client.model.ShapeOrNull;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Drawing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Drawing extends HashMap<String, Fruit> {
  public static final String SERIALIZED_NAME_MAIN_SHAPE = "mainShape";
  @SerializedName(SERIALIZED_NAME_MAIN_SHAPE)
  private Shape mainShape;

  public static final String SERIALIZED_NAME_SHAPE_OR_NULL = "shapeOrNull";
  @SerializedName(SERIALIZED_NAME_SHAPE_OR_NULL)
  private ShapeOrNull shapeOrNull;

  public static final String SERIALIZED_NAME_NULLABLE_SHAPE = "nullableShape";
  @SerializedName(SERIALIZED_NAME_NULLABLE_SHAPE)
  private NullableShape nullableShape;

  public static final String SERIALIZED_NAME_SHAPES = "shapes";
  @SerializedName(SERIALIZED_NAME_SHAPES)
  private List<Shape> shapes = null;

  public Drawing() { 
  }

  public Drawing mainShape(Shape mainShape) {
    
    this.mainShape = mainShape;
    return this;
  }

   /**
   * Get mainShape
   * @return mainShape
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Shape getMainShape() {
    return mainShape;
  }


  public void setMainShape(Shape mainShape) {
    this.mainShape = mainShape;
  }


  public Drawing shapeOrNull(ShapeOrNull shapeOrNull) {
    
    this.shapeOrNull = shapeOrNull;
    return this;
  }

   /**
   * Get shapeOrNull
   * @return shapeOrNull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShapeOrNull getShapeOrNull() {
    return shapeOrNull;
  }


  public void setShapeOrNull(ShapeOrNull shapeOrNull) {
    this.shapeOrNull = shapeOrNull;
  }


  public Drawing nullableShape(NullableShape nullableShape) {
    
    this.nullableShape = nullableShape;
    return this;
  }

   /**
   * Get nullableShape
   * @return nullableShape
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NullableShape getNullableShape() {
    return nullableShape;
  }


  public void setNullableShape(NullableShape nullableShape) {
    this.nullableShape = nullableShape;
  }


  public Drawing shapes(List<Shape> shapes) {
    
    this.shapes = shapes;
    return this;
  }

  public Drawing addShapesItem(Shape shapesItem) {
    if (this.shapes == null) {
      this.shapes = new ArrayList<Shape>();
    }
    this.shapes.add(shapesItem);
    return this;
  }

   /**
   * Get shapes
   * @return shapes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Shape> getShapes() {
    return shapes;
  }


  public void setShapes(List<Shape> shapes) {
    this.shapes = shapes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drawing drawing = (Drawing) o;
    return Objects.equals(this.mainShape, drawing.mainShape) &&
        Objects.equals(this.shapeOrNull, drawing.shapeOrNull) &&
        Objects.equals(this.nullableShape, drawing.nullableShape) &&
        Objects.equals(this.shapes, drawing.shapes) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainShape, shapeOrNull, nullableShape, shapes, super.hashCode());
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mainShape: ").append(toIndentedString(mainShape)).append("\n");
    sb.append("    shapeOrNull: ").append(toIndentedString(shapeOrNull)).append("\n");
    sb.append("    nullableShape: ").append(toIndentedString(nullableShape)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("mainShape");
    openapiFields.add("shapeOrNull");
    openapiFields.add("nullableShape");
    openapiFields.add("shapes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Drawing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Drawing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Drawing is not found in the empty JSON string", Drawing.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Drawing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Drawing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `mainShape`
      if (jsonObj.getAsJsonObject("mainShape") != null) {
        Shape.validateJsonObject(jsonObj.getAsJsonObject("mainShape"));
      }
      // validate the optional field `shapeOrNull`
      if (jsonObj.getAsJsonObject("shapeOrNull") != null) {
        ShapeOrNull.validateJsonObject(jsonObj.getAsJsonObject("shapeOrNull"));
      }
      // validate the optional field `nullableShape`
      if (jsonObj.getAsJsonObject("nullableShape") != null) {
        NullableShape.validateJsonObject(jsonObj.getAsJsonObject("nullableShape"));
      }
      JsonArray jsonArrayshapes = jsonObj.getAsJsonArray("shapes");
      // validate the optional field `shapes` (array)
      if (jsonArrayshapes != null) {
        for (int i = 0; i < jsonArrayshapes.size(); i++) {
          Shape.validateJsonObject(jsonArrayshapes.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Drawing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Drawing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Drawing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Drawing.class));

       return (TypeAdapter<T>) new TypeAdapter<Drawing>() {
           @Override
           public void write(JsonWriter out, Drawing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Drawing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

