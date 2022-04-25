// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.SiteConfigResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppSlotResult {
    /**
     * @return Configuration of the app.
     * 
     */
    private final @Nullable SiteConfigResponse siteConfig;

    @CustomType.Constructor
    private GetWebAppSlotResult(@CustomType.Parameter("siteConfig") @Nullable SiteConfigResponse siteConfig) {
        this.siteConfig = siteConfig;
    }

    /**
     * @return Configuration of the app.
     * 
     */
    public Optional<SiteConfigResponse> siteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SiteConfigResponse siteConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteConfig = defaults.siteConfig;
        }

        public Builder siteConfig(@Nullable SiteConfigResponse siteConfig) {
            this.siteConfig = siteConfig;
            return this;
        }        public GetWebAppSlotResult build() {
            return new GetWebAppSlotResult(siteConfig);
        }
    }
}
