// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
 * 
 */
public final class IapTestServiceAccountInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final IapTestServiceAccountInfoResponse Empty = new IapTestServiceAccountInfoResponse();

    /**
     * Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
     */
    @Import(name="targetAudienceClientId", required=true)
    private String targetAudienceClientId;

    /**
     * @return Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
     */
    public String targetAudienceClientId() {
        return this.targetAudienceClientId;
    }

    private IapTestServiceAccountInfoResponse() {}

    private IapTestServiceAccountInfoResponse(IapTestServiceAccountInfoResponse $) {
        this.targetAudienceClientId = $.targetAudienceClientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IapTestServiceAccountInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IapTestServiceAccountInfoResponse $;

        public Builder() {
            $ = new IapTestServiceAccountInfoResponse();
        }

        public Builder(IapTestServiceAccountInfoResponse defaults) {
            $ = new IapTestServiceAccountInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetAudienceClientId Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
         * 
         * @return builder
         * 
         */
        public Builder targetAudienceClientId(String targetAudienceClientId) {
            $.targetAudienceClientId = targetAudienceClientId;
            return this;
        }

        public IapTestServiceAccountInfoResponse build() {
            $.targetAudienceClientId = Objects.requireNonNull($.targetAudienceClientId, "expected parameter 'targetAudienceClientId' to be non-null");
            return $;
        }
    }

}
