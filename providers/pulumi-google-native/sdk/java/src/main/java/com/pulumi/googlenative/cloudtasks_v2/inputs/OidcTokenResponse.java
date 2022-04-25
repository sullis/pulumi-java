// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect). This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
 * 
 */
public final class OidcTokenResponse extends com.pulumi.resources.InvokeArgs {

    public static final OidcTokenResponse Empty = new OidcTokenResponse();

    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    @Import(name="audience", required=true)
    private String audience;

    /**
     * @return Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    public String audience() {
        return this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private String serviceAccountEmail;

    /**
     * @return [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    private OidcTokenResponse() {}

    private OidcTokenResponse(OidcTokenResponse $) {
        this.audience = $.audience;
        this.serviceAccountEmail = $.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OidcTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OidcTokenResponse $;

        public Builder() {
            $ = new OidcTokenResponse();
        }

        public Builder(OidcTokenResponse defaults) {
            $ = new OidcTokenResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param audience Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
         * 
         * @return builder
         * 
         */
        public Builder audience(String audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param serviceAccountEmail [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public OidcTokenResponse build() {
            $.audience = Objects.requireNonNull($.audience, "expected parameter 'audience' to be non-null");
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
