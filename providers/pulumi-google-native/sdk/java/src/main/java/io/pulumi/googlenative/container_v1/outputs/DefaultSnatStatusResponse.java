// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class DefaultSnatStatusResponse {
    /**
     * Disables cluster default sNAT rules.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor({"disabled"})
    private DefaultSnatStatusResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled);
    }

    /**
     * Disables cluster default sNAT rules.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSnatStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSnatStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public DefaultSnatStatusResponse build() {
            return new DefaultSnatStatusResponse(disabled);
        }
    }
}