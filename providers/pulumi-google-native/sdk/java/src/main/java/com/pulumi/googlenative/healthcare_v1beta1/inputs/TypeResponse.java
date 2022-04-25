// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1beta1.inputs.FieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A type definition for some HL7v2 type (incl. Segments and Datatypes).
 * 
 */
public final class TypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final TypeResponse Empty = new TypeResponse();

    /**
     * The (sub) fields this type has (if not primitive).
     * 
     */
    @Import(name="fields", required=true)
    private List<FieldResponse> fields;

    /**
     * @return The (sub) fields this type has (if not primitive).
     * 
     */
    public List<FieldResponse> fields() {
        return this.fields;
    }

    /**
     * The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    @Import(name="primitive", required=true)
    private String primitive;

    /**
     * @return If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    public String primitive() {
        return this.primitive;
    }

    private TypeResponse() {}

    private TypeResponse(TypeResponse $) {
        this.fields = $.fields;
        this.name = $.name;
        this.primitive = $.primitive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeResponse $;

        public Builder() {
            $ = new TypeResponse();
        }

        public Builder(TypeResponse defaults) {
            $ = new TypeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fields The (sub) fields this type has (if not primitive).
         * 
         * @return builder
         * 
         */
        public Builder fields(List<FieldResponse> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields The (sub) fields this type has (if not primitive).
         * 
         * @return builder
         * 
         */
        public Builder fields(FieldResponse... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param name The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param primitive If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
         * 
         * @return builder
         * 
         */
        public Builder primitive(String primitive) {
            $.primitive = primitive;
            return this;
        }

        public TypeResponse build() {
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.primitive = Objects.requireNonNull($.primitive, "expected parameter 'primitive' to be non-null");
            return $;
        }
    }

}
