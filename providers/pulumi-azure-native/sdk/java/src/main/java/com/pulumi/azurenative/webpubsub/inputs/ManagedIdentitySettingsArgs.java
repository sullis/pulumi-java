// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity settings for upstream.
 * 
 */
public final class ManagedIdentitySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedIdentitySettingsArgs Empty = new ManagedIdentitySettingsArgs();

    /**
     * The Resource indicating the App ID URI of the target resource.
     * It also appears in the aud (audience) claim of the issued token.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The Resource indicating the App ID URI of the target resource.
     * It also appears in the aud (audience) claim of the issued token.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private ManagedIdentitySettingsArgs() {}

    private ManagedIdentitySettingsArgs(ManagedIdentitySettingsArgs $) {
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedIdentitySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedIdentitySettingsArgs $;

        public Builder() {
            $ = new ManagedIdentitySettingsArgs();
        }

        public Builder(ManagedIdentitySettingsArgs defaults) {
            $ = new ManagedIdentitySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resource The Resource indicating the App ID URI of the target resource.
         * It also appears in the aud (audience) claim of the issued token.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The Resource indicating the App ID URI of the target resource.
         * It also appears in the aud (audience) claim of the issued token.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public ManagedIdentitySettingsArgs build() {
            return $;
        }
    }

}
