/**
 *
 * 日    期：12-2-27
 */
package com.rop.marshaller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.rop.RopException;
import com.rop.RopMarshaller;


import java.io.IOException;
import java.io.OutputStream;

/**
 * <pre>
 *    将响应对象流化成JSON。 {@link ObjectMapper}是线程安全的。
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public class JacksonJsonRopMarshaller implements RopMarshaller {

//    private static ObjectMapper objectMapper;

    public void marshaller(Object object, OutputStream outputStream) {
        try {
//            JsonGenerator jsonGenerator =
//                    getObjectMapper().getJsonFactory()
//                    .createJsonGenerator(outputStream, JsonEncoding.UTF8);
//            getObjectMapper().writeValue(jsonGenerator,object);

            outputStream.write(JSON.toJSONBytes(object,new SerializerFeature[]{
                    SerializerFeature.WriteNullStringAsEmpty,
                    SerializerFeature.WriteNullBooleanAsFalse,
                    SerializerFeature.WriteNullListAsEmpty,
                    SerializerFeature.WriteNullNumberAsZero
            }));

        } catch (IOException e) {
            throw new RopException(e);
        }
    }

//    private ObjectMapper getObjectMapper() throws IOException {
//        if (this.objectMapper == null) {
//            ObjectMapper objectMapper = new ObjectMapper();
////            AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
//            SerializationConfig serializationConfig = objectMapper.getSerializationConfig();
//            serializationConfig = serializationConfig
////                    .without(Feature.WRAP_ROOT_VALUE)
////                    .with(SerializationConfig.Feature.INDENT_OUTPUT)
//                    .withSerializationInclusion(JsonInclude.Include.NON_NULL)
//                    .withSerializationInclusion(JsonInclude.Include.NON_EMPTY);
//
//            objectMapper.setConfig(serializationConfig);
//            this.objectMapper = objectMapper;
//        }
//        return this.objectMapper;
//    }
}

