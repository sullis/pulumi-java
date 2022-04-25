// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NsgReferenceResponse {
    /**
     * @return Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    private final String sourceArmResourceId;

    @CustomType.Constructor
    private NsgReferenceResponse(@CustomType.Parameter("sourceArmResourceId") String sourceArmResourceId) {
        this.sourceArmResourceId = sourceArmResourceId;
    }

    /**
     * @return Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    public String sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsgReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NsgReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder sourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }        public NsgReferenceResponse build() {
            return new NsgReferenceResponse(sourceArmResourceId);
        }
    }
}
