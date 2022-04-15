// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLocationResult {
    /**
     * The available port speeds for the location.
     * 
     */
    private final List<String> availablePortSpeeds;
    /**
     * The names of the service providers for the location.
     * 
     */
    private final List<String> availableProviders;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String locationCode;
    /**
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * 
     */
    private final String locationName;

    @CustomType.Constructor
    private GetLocationResult(
        @CustomType.Parameter("availablePortSpeeds") List<String> availablePortSpeeds,
        @CustomType.Parameter("availableProviders") List<String> availableProviders,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("locationCode") String locationCode,
        @CustomType.Parameter("locationName") String locationName) {
        this.availablePortSpeeds = availablePortSpeeds;
        this.availableProviders = availableProviders;
        this.id = id;
        this.locationCode = locationCode;
        this.locationName = locationName;
    }

    /**
     * The available port speeds for the location.
     * 
    */
    public List<String> availablePortSpeeds() {
        return this.availablePortSpeeds;
    }
    /**
     * The names of the service providers for the location.
     * 
    */
    public List<String> availableProviders() {
        return this.availableProviders;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String locationCode() {
        return this.locationCode;
    }
    /**
     * The name of the location. This includes the name of the colocation partner and the physical site of the building.
     * 
    */
    public String locationName() {
        return this.locationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availablePortSpeeds;
        private List<String> availableProviders;
        private String id;
        private String locationCode;
        private String locationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availablePortSpeeds = defaults.availablePortSpeeds;
    	      this.availableProviders = defaults.availableProviders;
    	      this.id = defaults.id;
    	      this.locationCode = defaults.locationCode;
    	      this.locationName = defaults.locationName;
        }

        public Builder availablePortSpeeds(List<String> availablePortSpeeds) {
            this.availablePortSpeeds = Objects.requireNonNull(availablePortSpeeds);
            return this;
        }
        public Builder availablePortSpeeds(String... availablePortSpeeds) {
            return availablePortSpeeds(List.of(availablePortSpeeds));
        }
        public Builder availableProviders(List<String> availableProviders) {
            this.availableProviders = Objects.requireNonNull(availableProviders);
            return this;
        }
        public Builder availableProviders(String... availableProviders) {
            return availableProviders(List.of(availableProviders));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locationCode(String locationCode) {
            this.locationCode = Objects.requireNonNull(locationCode);
            return this;
        }
        public Builder locationName(String locationName) {
            this.locationName = Objects.requireNonNull(locationName);
            return this;
        }        public GetLocationResult build() {
            return new GetLocationResult(availablePortSpeeds, availableProviders, id, locationCode, locationName);
        }
    }
}
