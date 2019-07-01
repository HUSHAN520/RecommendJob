package com.example.project.services;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;


@Service
public class DoWork {
    public void work() {
        SparkConf conf = new SparkConf().setMaster("local[2]").setAppName("test");
        JavaSparkContext sc = new JavaSparkContext(conf);
        List data = Arrays.asList("JAVA", "Scala");
        JavaRDD<String> lines = sc.parallelize(data);
//        JavaRDD<String> lines = sc.makeRDD(data);
//        JavaRDD<String> text = sc.textFile("input/input.txt");
        System.out.println(lines.count());

    }
}