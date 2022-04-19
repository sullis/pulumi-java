// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Duration based custom options to copy
 * 
 */
public final class CustomCopyOptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomCopyOptionResponse Empty = new CustomCopyOptionResponse();

    /**
     * Data copied after given timespan
     * 
     */
    @Import(name="duration")
      private final @Nullable String duration;

    public Optional<String> duration() {
        return this.duration == null ? Optional.empty() : Optional.ofNullable(this.duration);
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'CustomCopyOption'.
     * 
     */
    @Import(name="objectType", required=true)
      private final String objectType;

    public String objectType() {
        return this.objectType;
    }

    public CustomCopyOptionResponse(
        @Nullable String duration,
        String objectType) {
        this.duration = duration;
        this.objectType = Codegen.stringProp("objectType").arg(objectType).require();
    }

    private CustomCopyOptionResponse() {
        this.duration = null;
        this.objectType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomCopyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String duration;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomCopyOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }        public CustomCopyOptionResponse build() {
            return new CustomCopyOptionResponse(duration, objectType);
        }
    }
}
