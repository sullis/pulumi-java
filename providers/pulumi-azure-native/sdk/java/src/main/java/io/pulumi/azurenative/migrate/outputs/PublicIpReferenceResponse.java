// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PublicIpReferenceResponse {
    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    private final String sourceArmResourceId;

    @OutputCustomType.Constructor({"sourceArmResourceId"})
    private PublicIpReferenceResponse(String sourceArmResourceId) {
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
    }

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
    */
    public String getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIpReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIpReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder setSourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }
        public PublicIpReferenceResponse build() {
            return new PublicIpReferenceResponse(sourceArmResourceId);
        }
    }
}