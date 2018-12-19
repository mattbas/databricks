// Databricks notebook source
import org.apache.spark.sql.types(StructField,StructType,StringType,LongType)
import org.apacke.spark.sql.types.Metadata

val mySchema = StructType(Array(StructField("CODE",StringType,true)
                         ,StructField("A",LongType),true)
                         ,StructField("B",LongType,true)
                          )