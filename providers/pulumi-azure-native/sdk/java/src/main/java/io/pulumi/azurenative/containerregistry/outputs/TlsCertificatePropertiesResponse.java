// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TlsCertificatePropertiesResponse {
    /**
     * Indicates the location of the certificates.
     * 
     */
    private final String location;
    /**
     * The type of certificate location.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TlsCertificatePropertiesResponse(
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("type") String type) {
        this.location = location;
        this.type = type;
    }

    /**
     * Indicates the location of the certificates.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The type of certificate location.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.type = defaults.type;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TlsCertificatePropertiesResponse build() {
            return new TlsCertificatePropertiesResponse(location, type);
        }
    }
}
