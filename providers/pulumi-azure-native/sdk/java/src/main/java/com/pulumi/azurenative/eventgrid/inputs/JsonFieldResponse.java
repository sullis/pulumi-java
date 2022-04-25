// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is used to express the source of an input schema mapping for a single target field in the Event Grid Event schema. This is currently used in the mappings for the &#39;id&#39;, &#39;topic&#39; and &#39;eventtime&#39; properties. This represents a field in the input event schema.
 * 
 */
public final class JsonFieldResponse extends com.pulumi.resources.InvokeArgs {

    public static final JsonFieldResponse Empty = new JsonFieldResponse();

    /**
     * Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
     * 
     */
    @Import(name="sourceField")
    private @Nullable String sourceField;

    /**
     * @return Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
     * 
     */
    public Optional<String> sourceField() {
        return Optional.ofNullable(this.sourceField);
    }

    private JsonFieldResponse() {}

    private JsonFieldResponse(JsonFieldResponse $) {
        this.sourceField = $.sourceField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonFieldResponse $;

        public Builder() {
            $ = new JsonFieldResponse();
        }

        public Builder(JsonFieldResponse defaults) {
            $ = new JsonFieldResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceField Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
         * 
         * @return builder
         * 
         */
        public Builder sourceField(@Nullable String sourceField) {
            $.sourceField = sourceField;
            return this;
        }

        public JsonFieldResponse build() {
            return $;
        }
    }

}
