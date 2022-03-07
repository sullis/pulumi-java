// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ActivationPropertiesResponse {
    /**
     * The activation status of the connected registry.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"status"})
    private ActivationPropertiesResponse(String status) {
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The activation status of the connected registry.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ActivationPropertiesResponse build() {
            return new ActivationPropertiesResponse(status);
        }
    }
}