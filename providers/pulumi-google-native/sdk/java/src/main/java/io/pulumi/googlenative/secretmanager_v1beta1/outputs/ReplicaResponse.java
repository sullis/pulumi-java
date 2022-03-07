// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicaResponse {
    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
     */
    private final String location;

    @OutputCustomType.Constructor({"location"})
    private ReplicaResponse(String location) {
        this.location = Objects.requireNonNull(location);
    }

    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
    */
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public ReplicaResponse build() {
            return new ReplicaResponse(location);
        }
    }
}