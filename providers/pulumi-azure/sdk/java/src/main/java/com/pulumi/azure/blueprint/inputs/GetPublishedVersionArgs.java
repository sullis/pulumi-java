// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.blueprint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublishedVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublishedVersionArgs Empty = new GetPublishedVersionArgs();

    /**
     * The name of the Blueprint Definition
     * 
     */
    @Import(name="blueprintName", required=true)
    private Output<String> blueprintName;

    /**
     * @return The name of the Blueprint Definition
     * 
     */
    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     * 
     */
    @Import(name="scopeId", required=true)
    private Output<String> scopeId;

    /**
     * @return The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     * 
     */
    public Output<String> scopeId() {
        return this.scopeId;
    }

    /**
     * The Version name of the Published Version of the Blueprint Definition
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The Version name of the Published Version of the Blueprint Definition
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private GetPublishedVersionArgs() {}

    private GetPublishedVersionArgs(GetPublishedVersionArgs $) {
        this.blueprintName = $.blueprintName;
        this.scopeId = $.scopeId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublishedVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublishedVersionArgs $;

        public Builder() {
            $ = new GetPublishedVersionArgs();
        }

        public Builder(GetPublishedVersionArgs defaults) {
            $ = new GetPublishedVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprintName The name of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(Output<String> blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param blueprintName The name of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            return blueprintName(Output.of(blueprintName));
        }

        /**
         * @param scopeId The ID of the Management Group / Subscription where this Blueprint Definition is stored.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(Output<String> scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        /**
         * @param scopeId The ID of the Management Group / Subscription where this Blueprint Definition is stored.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(String scopeId) {
            return scopeId(Output.of(scopeId));
        }

        /**
         * @param version The Version name of the Published Version of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Version name of the Published Version of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetPublishedVersionArgs build() {
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.scopeId = Objects.requireNonNull($.scopeId, "expected parameter 'scopeId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
