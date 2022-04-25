// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Multichannel setting. Applies to Premium FileStorage only.
 * 
 */
public final class MultichannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultichannelArgs Empty = new MultichannelArgs();

    /**
     * Indicates whether multichannel is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether multichannel is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private MultichannelArgs() {}

    private MultichannelArgs(MultichannelArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultichannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultichannelArgs $;

        public Builder() {
            $ = new MultichannelArgs();
        }

        public Builder(MultichannelArgs defaults) {
            $ = new MultichannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether multichannel is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether multichannel is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public MultichannelArgs build() {
            return $;
        }
    }

}
