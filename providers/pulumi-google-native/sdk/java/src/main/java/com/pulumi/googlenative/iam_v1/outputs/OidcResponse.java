// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OidcResponse {
    /**
     * @return Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange requests are rejected if the token audience does not match one of the configured values. Each audience may be at most 256 characters. A maximum of 10 audiences may be configured. If this list is empty, the OIDC token audience must be equal to the full canonical resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix. For example: ```//iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ https://iam.googleapis.com/projects//locations//workloadIdentityPools//providers/```
     * 
     */
    private final List<String> allowedAudiences;
    /**
     * @return The OIDC issuer URL. Must be an HTTPS endpoint.
     * 
     */
    private final String issuerUri;

    @CustomType.Constructor
    private OidcResponse(
        @CustomType.Parameter("allowedAudiences") List<String> allowedAudiences,
        @CustomType.Parameter("issuerUri") String issuerUri) {
        this.allowedAudiences = allowedAudiences;
        this.issuerUri = issuerUri;
    }

    /**
     * @return Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange requests are rejected if the token audience does not match one of the configured values. Each audience may be at most 256 characters. A maximum of 10 audiences may be configured. If this list is empty, the OIDC token audience must be equal to the full canonical resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix. For example: ```//iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ https://iam.googleapis.com/projects//locations//workloadIdentityPools//providers/```
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }
    /**
     * @return The OIDC issuer URL. Must be an HTTPS endpoint.
     * 
     */
    public String issuerUri() {
        return this.issuerUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;
        private String issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        public Builder issuerUri(String issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }        public OidcResponse build() {
            return new OidcResponse(allowedAudiences, issuerUri);
        }
    }
}
