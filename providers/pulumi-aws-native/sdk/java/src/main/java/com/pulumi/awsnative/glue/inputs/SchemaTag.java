// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SchemaTag extends com.pulumi.resources.InvokeArgs {

    public static final SchemaTag Empty = new SchemaTag();

    /**
     * A key to identify the tag.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return A key to identify the tag.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Corresponding tag value for the key.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Corresponding tag value for the key.
     * 
     */
    public String value() {
        return this.value;
    }

    private SchemaTag() {}

    private SchemaTag(SchemaTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaTag $;

        public Builder() {
            $ = new SchemaTag();
        }

        public Builder(SchemaTag defaults) {
            $ = new SchemaTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A key to identify the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value Corresponding tag value for the key.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public SchemaTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
