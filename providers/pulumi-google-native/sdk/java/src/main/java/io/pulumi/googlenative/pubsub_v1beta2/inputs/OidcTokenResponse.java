// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect).
 * 
 */
public final class OidcTokenResponse extends io.pulumi.resources.InvokeArgs {

    public static final OidcTokenResponse Empty = new OidcTokenResponse();

    /**
     * Audience to be used when generating OIDC token. The audience claim identifies the recipients that the JWT is intended for. The audience value is a single case-sensitive string. Having multiple values (array) for the audience field is not supported. More info about the OIDC JWT token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3 Note: if not specified, the Push endpoint URL will be used.
     * 
     */
    @InputImport(name="audience", required=true)
      private final String audience;

    public String getAudience() {
        return this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating the OIDC token. The caller (for CreateSubscription, UpdateSubscription, and ModifyPushConfig RPCs) must have the iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
      private final String serviceAccountEmail;

    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public OidcTokenResponse(
        String audience,
        String serviceAccountEmail) {
        this.audience = Objects.requireNonNull(audience, "expected parameter 'audience' to be non-null");
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private OidcTokenResponse() {
        this.audience = null;
        this.serviceAccountEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setAudience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public OidcTokenResponse build() {
            return new OidcTokenResponse(audience, serviceAccountEmail);
        }
    }
}