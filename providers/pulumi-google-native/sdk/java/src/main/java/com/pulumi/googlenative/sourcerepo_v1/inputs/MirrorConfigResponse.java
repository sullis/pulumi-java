// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sourcerepo_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration to automatically mirror a repository from another hosting service, for example GitHub or Bitbucket.
 * 
 */
public final class MirrorConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final MirrorConfigResponse Empty = new MirrorConfigResponse();

    /**
     * ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    @Import(name="deployKeyId", required=true)
    private String deployKeyId;

    /**
     * @return ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    public String deployKeyId() {
        return this.deployKeyId;
    }

    /**
     * URL of the main repository at the other hosting service.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    /**
     * @return URL of the main repository at the other hosting service.
     * 
     */
    public String url() {
        return this.url;
    }

    /**
     * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    @Import(name="webhookId", required=true)
    private String webhookId;

    /**
     * @return ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    public String webhookId() {
        return this.webhookId;
    }

    private MirrorConfigResponse() {}

    private MirrorConfigResponse(MirrorConfigResponse $) {
        this.deployKeyId = $.deployKeyId;
        this.url = $.url;
        this.webhookId = $.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MirrorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MirrorConfigResponse $;

        public Builder() {
            $ = new MirrorConfigResponse();
        }

        public Builder(MirrorConfigResponse defaults) {
            $ = new MirrorConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployKeyId ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
         * 
         * @return builder
         * 
         */
        public Builder deployKeyId(String deployKeyId) {
            $.deployKeyId = deployKeyId;
            return this;
        }

        /**
         * @param url URL of the main repository at the other hosting service.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            $.url = url;
            return this;
        }

        /**
         * @param webhookId ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
         * 
         * @return builder
         * 
         */
        public Builder webhookId(String webhookId) {
            $.webhookId = webhookId;
            return this;
        }

        public MirrorConfigResponse build() {
            $.deployKeyId = Objects.requireNonNull($.deployKeyId, "expected parameter 'deployKeyId' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            $.webhookId = Objects.requireNonNull($.webhookId, "expected parameter 'webhookId' to be non-null");
            return $;
        }
    }

}
