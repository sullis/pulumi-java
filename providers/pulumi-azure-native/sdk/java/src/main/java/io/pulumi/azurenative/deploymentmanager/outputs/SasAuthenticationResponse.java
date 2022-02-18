// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SasAuthenticationResponse {
    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    private final String sasUri;
    /**
     * The authentication type
     * Expected value is 'Sas'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"sasUri","type"})
    private SasAuthenticationResponse(
        String sasUri,
        String type) {
        this.sasUri = Objects.requireNonNull(sasUri);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    public String getSasUri() {
        return this.sasUri;
    }
    /**
     * The authentication type
     * Expected value is 'Sas'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SasAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder setSasUri(String sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SasAuthenticationResponse build() {
            return new SasAuthenticationResponse(sasUri, type);
        }
    }
}
