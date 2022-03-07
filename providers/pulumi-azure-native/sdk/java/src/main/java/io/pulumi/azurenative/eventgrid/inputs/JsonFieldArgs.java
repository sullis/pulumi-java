// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is used to express the source of an input schema mapping for a single target field in the Event Grid Event schema. This is currently used in the mappings for the 'id', 'topic' and 'eventtime' properties. This represents a field in the input event schema.
 * 
 */
public final class JsonFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonFieldArgs Empty = new JsonFieldArgs();

    /**
     * Name of a field in the input event schema that's to be used as the source of a mapping.
     * 
     */
    @InputImport(name="sourceField")
      private final @Nullable Input<String> sourceField;

    public Input<String> getSourceField() {
        return this.sourceField == null ? Input.empty() : this.sourceField;
    }

    public JsonFieldArgs(@Nullable Input<String> sourceField) {
        this.sourceField = sourceField;
    }

    private JsonFieldArgs() {
        this.sourceField = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sourceField;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceField = defaults.sourceField;
        }

        public Builder setSourceField(@Nullable Input<String> sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        public Builder setSourceField(@Nullable String sourceField) {
            this.sourceField = Input.ofNullable(sourceField);
            return this;
        }
        public JsonFieldArgs build() {
            return new JsonFieldArgs(sourceField);
        }
    }
}