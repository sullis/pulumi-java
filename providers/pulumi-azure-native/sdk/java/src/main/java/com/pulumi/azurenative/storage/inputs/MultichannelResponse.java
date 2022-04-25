// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Multichannel setting. Applies to Premium FileStorage only.
 * 
 */
public final class MultichannelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MultichannelResponse Empty = new MultichannelResponse();

    /**
     * Indicates whether multichannel is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Indicates whether multichannel is enabled
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private MultichannelResponse() {}

    private MultichannelResponse(MultichannelResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultichannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultichannelResponse $;

        public Builder() {
            $ = new MultichannelResponse();
        }

        public Builder(MultichannelResponse defaults) {
            $ = new MultichannelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether multichannel is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public MultichannelResponse build() {
            return $;
        }
    }

}
