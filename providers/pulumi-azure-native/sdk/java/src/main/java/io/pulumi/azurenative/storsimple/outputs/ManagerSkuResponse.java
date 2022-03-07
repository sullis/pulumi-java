// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagerSkuResponse {
    /**
     * Refers to the sku name which should be "Standard"
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private ManagerSkuResponse(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Refers to the sku name which should be "Standard"
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ManagerSkuResponse build() {
            return new ManagerSkuResponse(name);
        }
    }
}