// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class DeblockResponse {
    /**
     * Enable deblocker. The default is `false`.
     * 
     */
    private final Boolean enabled;
    /**
     * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
     */
    private final Double strength;

    @OutputCustomType.Constructor({"enabled","strength"})
    private DeblockResponse(
        Boolean enabled,
        Double strength) {
        this.enabled = Objects.requireNonNull(enabled);
        this.strength = Objects.requireNonNull(strength);
    }

    /**
     * Enable deblocker. The default is `false`.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
    */
    public Double getStrength() {
        return this.strength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeblockResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Double strength;

        public Builder() {
    	      // Empty
        }

        public Builder(DeblockResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.strength = defaults.strength;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setStrength(Double strength) {
            this.strength = Objects.requireNonNull(strength);
            return this;
        }
        public DeblockResponse build() {
            return new DeblockResponse(enabled, strength);
        }
    }
}