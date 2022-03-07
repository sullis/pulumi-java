// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceRegistryInstanceResponse {
    /**
     * Name of the Service Registry instance
     * 
     */
    private final String name;
    /**
     * Status of the Service Registry instance
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"name","status"})
    private ServiceRegistryInstanceResponse(
        String name,
        String status) {
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Name of the Service Registry instance
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Status of the Service Registry instance
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ServiceRegistryInstanceResponse build() {
            return new ServiceRegistryInstanceResponse(name, status);
        }
    }
}