// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DicomServiceAuthenticationConfigurationResponse {
    /**
     * The audiences for the service
     * 
     */
    private final List<String> audiences;
    /**
     * The authority url for the service
     * 
     */
    private final String authority;

    @OutputCustomType.Constructor({"audiences","authority"})
    private DicomServiceAuthenticationConfigurationResponse(
        List<String> audiences,
        String authority) {
        this.audiences = Objects.requireNonNull(audiences);
        this.authority = Objects.requireNonNull(authority);
    }

    /**
     * The audiences for the service
     * 
     */
    public List<String> getAudiences() {
        return this.audiences;
    }
    /**
     * The authority url for the service
     * 
     */
    public String getAuthority() {
        return this.authority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceAuthenticationConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> audiences;
        private String authority;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomServiceAuthenticationConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authority = defaults.authority;
        }

        public Builder setAudiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setAuthority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }

        public DicomServiceAuthenticationConfigurationResponse build() {
            return new DicomServiceAuthenticationConfigurationResponse(audiences, authority);
        }
    }
}
