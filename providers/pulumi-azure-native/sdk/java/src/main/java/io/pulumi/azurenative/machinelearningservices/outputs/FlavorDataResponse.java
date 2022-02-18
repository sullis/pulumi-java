// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlavorDataResponse {
    /**
     * Model flavor-specific data.
     * 
     */
    private final @Nullable Map<String,String> data;

    @OutputCustomType.Constructor({"data"})
    private FlavorDataResponse(@Nullable Map<String,String> data) {
        this.data = data;
    }

    /**
     * Model flavor-specific data.
     * 
     */
    public Map<String,String> getData() {
        return this.data == null ? Map.of() : this.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlavorDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> data;

        public Builder() {
    	      // Empty
        }

        public Builder(FlavorDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder setData(@Nullable Map<String,String> data) {
            this.data = data;
            return this;
        }

        public FlavorDataResponse build() {
            return new FlavorDataResponse(data);
        }
    }
}
