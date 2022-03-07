// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataTransferRegionalServiceResourceResponse {
    /**
     * The location name.
     * 
     */
    private final String location;
    /**
     * The regional service name.
     * 
     */
    private final String name;
    /**
     * Describes the status of a service.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"location","name","status"})
    private DataTransferRegionalServiceResourceResponse(
        String location,
        String name,
        String status) {
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The location name.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The regional service name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes the status of a service.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferRegionalServiceResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferRegionalServiceResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DataTransferRegionalServiceResourceResponse build() {
            return new DataTransferRegionalServiceResourceResponse(location, name, status);
        }
    }
}