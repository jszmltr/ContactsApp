// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.jsz.contactsapp.`data`.user.api

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ApiUsersResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ApiUsersResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("results")

  private val listOfApiUserAdapter: JsonAdapter<List<ApiUser>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, ApiUser::class.java), emptySet(),
      "results")

  public override fun toString(): String = buildString(38) {
      append("GeneratedJsonAdapter(").append("ApiUsersResponse").append(')') }

  public override fun fromJson(reader: JsonReader): ApiUsersResponse {
    var results: List<ApiUser>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> results = listOfApiUserAdapter.fromJson(reader) ?: throw Util.unexpectedNull("results",
            "results", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ApiUsersResponse(
        results = results ?: throw Util.missingProperty("results", "results", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ApiUsersResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("results")
    listOfApiUserAdapter.toJson(writer, value_.results)
    writer.endObject()
  }
}
