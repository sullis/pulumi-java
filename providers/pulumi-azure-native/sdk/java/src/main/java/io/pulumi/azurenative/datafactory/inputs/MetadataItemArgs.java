// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify the name and value of custom metadata item.
 * 
 */
public final class MetadataItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataItemArgs Empty = new MetadataItemArgs();

    /**
     * Metadata item key name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<Object> name;

    public Input<Object> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Metadata item value. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public MetadataItemArgs(
        @Nullable Input<Object> name,
        @Nullable Input<Object> value) {
        this.name = name;
        this.value = value;
    }

    private MetadataItemArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> name;
        private @Nullable Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<Object> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Object name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValue(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public MetadataItemArgs build() {
            return new MetadataItemArgs(name, value);
        }
    }
}