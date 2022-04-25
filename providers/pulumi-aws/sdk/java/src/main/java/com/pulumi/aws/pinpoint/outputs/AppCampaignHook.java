// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppCampaignHook {
    /**
     * @return Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    private final @Nullable String lambdaFunctionName;
    /**
     * @return What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    private final @Nullable String mode;
    /**
     * @return Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    private final @Nullable String webUrl;

    @CustomType.Constructor
    private AppCampaignHook(
        @CustomType.Parameter("lambdaFunctionName") @Nullable String lambdaFunctionName,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("webUrl") @Nullable String webUrl) {
        this.lambdaFunctionName = lambdaFunctionName;
        this.mode = mode;
        this.webUrl = webUrl;
    }

    /**
     * @return Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    public Optional<String> lambdaFunctionName() {
        return Optional.ofNullable(this.lambdaFunctionName);
    }
    /**
     * @return What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    public Optional<String> webUrl() {
        return Optional.ofNullable(this.webUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCampaignHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lambdaFunctionName;
        private @Nullable String mode;
        private @Nullable String webUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCampaignHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaFunctionName = defaults.lambdaFunctionName;
    	      this.mode = defaults.mode;
    	      this.webUrl = defaults.webUrl;
        }

        public Builder lambdaFunctionName(@Nullable String lambdaFunctionName) {
            this.lambdaFunctionName = lambdaFunctionName;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder webUrl(@Nullable String webUrl) {
            this.webUrl = webUrl;
            return this;
        }        public AppCampaignHook build() {
            return new AppCampaignHook(lambdaFunctionName, mode, webUrl);
        }
    }
}
